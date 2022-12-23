package p009by.saygames;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLProtocolException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.CertificatePinner;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* renamed from: by.saygames.SayEndpoint */
public class SayEndpoint {
    private static final MediaType JSON = MediaType.get("application/json; charset=utf-8");
    private static final String TAG = "SayKit";
    private static volatile Handler _globalHandler;
    /* access modifiers changed from: private */
    public SayEndpointCache _cache;
    private MediaType _contentType = JSON;
    /* access modifiers changed from: private */
    public final Context _context;
    /* access modifiers changed from: private */
    public IDeliveryStrategy _delivery = new IgnoreReadErrorWithStrictServerResponseDelivery("ok");
    /* access modifiers changed from: private */
    public final Handler _handler;
    private final Callback _httpCallback = new Callback() {
        public void onFailure(Call call, IOException iOException) {
            SayEndpoint.this.handleError(iOException);
        }

        public void onResponse(Call call, Response response) {
            SayEndpoint.this.handleResponse(response);
        }
    };
    private OkHttpClient _httpPinnedClient;
    /* access modifiers changed from: private */
    public boolean _isAutoFlushing = false;
    private boolean _isOpened = false;
    /* access modifiers changed from: private */
    public volatile RequestWriteStatus _latestRequestWriteStatus = RequestWriteStatus.SENDING;
    private int _maxBatchSize = 100;
    /* access modifiers changed from: private */
    public final String _name;
    private IStringRequest _pendingRequest = null;
    /* access modifiers changed from: private */
    public final CertificatePinner.Builder _pinner = new CertificatePinner.Builder();
    /* access modifiers changed from: private */
    public final StringRequestQueue _queue = new StringRequestQueue();
    /* access modifiers changed from: private */
    public boolean _rebuildClient = false;
    private int _retryDelay = 5000;
    private String _url = null;
    private final Runnable flushRequestsOp = new Runnable() {
        public void run() {
            SayEndpoint.this.doFlushRequests();
        }
    };
    private final Runnable openOp = new Runnable() {
        public void run() {
            if (SayEndpoint.this._cache == null) {
                SayEndpointCache unused = SayEndpoint.this._cache = new SayEndpointCache(SayEndpoint.this._context, SayEndpoint.this._name);
                new Thread(new Runnable() {
                    public void run() {
                        final List<StringRequestData> open = SayEndpoint.this._cache.open();
                        SayEndpoint.this._handler.post(new Runnable() {
                            public void run() {
                                SayEndpoint.this.onCacheOpened(open);
                            }
                        });
                    }
                }).start();
            }
        }
    };

    /* renamed from: by.saygames.SayEndpoint$IBatching */
    public interface IBatching {
        IStringRequest combine(List<StringRequestData> list);
    }

    /* renamed from: by.saygames.SayEndpoint$IDeliveryStrategy */
    public interface IDeliveryStrategy {
        boolean canIgnoreError(Exception exc, RequestWriteStatus requestWriteStatus);

        boolean canSendNow();

        boolean isGoodResponse(Response response);
    }

    /* renamed from: by.saygames.SayEndpoint$IStringRequest */
    interface IStringRequest {
        IBatching getBatching();

        String getBody();

        int getOrder();
    }

    /* renamed from: by.saygames.SayEndpoint$RequestWriteStatus */
    public enum RequestWriteStatus {
        SENDING,
        FLUSHED
    }

    /* renamed from: by.saygames.SayEndpoint$batch */
    public static class batch {
        public static final AppendWithNewLineBatching appendWithNewLine = new AppendWithNewLineBatching();
    }

    public static Handler getDefaultHandler() {
        if (_globalHandler == null) {
            synchronized (SayEndpoint.class) {
                if (_globalHandler == null) {
                    HandlerThread handlerThread = new HandlerThread("SayEndpoint Default");
                    handlerThread.start();
                    _globalHandler = new Handler(handlerThread.getLooper());
                }
            }
        }
        return _globalHandler;
    }

    public SayEndpoint(Context context, String str, Handler handler) {
        this._context = context.getApplicationContext();
        this._name = str;
        this._handler = handler;
    }

    public void open() {
        this._handler.post(this.openOp);
    }

    public void addSslPin(final String str, final String str2) {
        this._handler.post(new Runnable() {
            public void run() {
                SayEndpoint.this._pinner.add(str, str2);
                boolean unused = SayEndpoint.this._rebuildClient = true;
            }
        });
    }

    public void setUrl(String str) {
        this._url = str;
    }

    public void setContentType(String str) {
        this._contentType = MediaType.get(str);
    }

    public void setDeliveryStrategy(IDeliveryStrategy iDeliveryStrategy) {
        this._delivery = iDeliveryStrategy;
    }

    public void setAutoRetryMillis(int i) {
        this._retryDelay = i;
    }

    public void setMaxBatchSize(int i) {
        this._maxBatchSize = i;
    }

    public void setMaxRequestsCount(final int i) {
        this._handler.post(new Runnable() {
            public void run() {
                SayEndpoint.this._queue.setMaxRequestsCount(i);
            }
        });
    }

    public void autoFlush(final int i) {
        this._handler.post(new Runnable() {
            public void run() {
                if (!SayEndpoint.this._isAutoFlushing) {
                    boolean unused = SayEndpoint.this._isAutoFlushing = true;
                    new Runnable() {
                        public void run() {
                            SayEndpoint.this.doFlushRequests();
                            SayEndpoint.this._handler.postDelayed(this, (long) i);
                        }
                    }.run();
                }
            }
        });
    }

    public void addRequest(final String str) {
        this._handler.post(new Runnable() {
            public void run() {
                StringRequestData unused = SayEndpoint.this.doAddRequest(str, (IBatching) null, false);
            }
        });
    }

    public void addRequest(final String str, final boolean z) {
        this._handler.post(new Runnable() {
            public void run() {
                StringRequestData unused = SayEndpoint.this.doAddRequest(str, (IBatching) null, z);
            }
        });
    }

    public void addBatchRequest(final String str, final IBatching iBatching) {
        this._handler.post(new Runnable() {
            public void run() {
                StringRequestData unused = SayEndpoint.this.doAddRequest(str, iBatching, false);
            }
        });
    }

    public void addBatchRequest(final String str, final IBatching iBatching, final boolean z) {
        this._handler.post(new Runnable() {
            public void run() {
                StringRequestData unused = SayEndpoint.this.doAddRequest(str, iBatching, z);
            }
        });
    }

    public void sendRequest(final String str) {
        this._handler.post(new Runnable() {
            public void run() {
                StringRequestData unused = SayEndpoint.this.doAddRequest(str, (IBatching) null, false);
                SayEndpoint.this.doFlushRequests();
            }
        });
    }

    public void sendRequest(final String str, final boolean z) {
        this._handler.post(new Runnable() {
            public void run() {
                StringRequestData unused = SayEndpoint.this.doAddRequest(str, (IBatching) null, z);
                SayEndpoint.this.doFlushRequests();
            }
        });
    }

    public void sendRequest(final String str, final IBatching iBatching) {
        this._handler.post(new Runnable() {
            public void run() {
                StringRequestData unused = SayEndpoint.this.doAddRequest(str, iBatching, false);
                SayEndpoint.this.doFlushRequests();
            }
        });
    }

    public void sendRequest(final String str, final IBatching iBatching, final boolean z) {
        this._handler.post(new Runnable() {
            public void run() {
                StringRequestData unused = SayEndpoint.this.doAddRequest(str, iBatching, z);
                SayEndpoint.this.doFlushRequests();
            }
        });
    }

    public void flushRequests() {
        this._handler.post(this.flushRequestsOp);
    }

    /* renamed from: by.saygames.SayEndpoint$AppendWithNewLineBatching */
    public static class AppendWithNewLineBatching implements IBatching {
        public IStringRequest combine(List<StringRequestData> list) {
            StringBuilder sb = new StringBuilder();
            for (IStringRequest next : list) {
                if (sb.length() > 0) {
                    sb.append(10);
                }
                sb.append(next.getBody());
            }
            return new BatchStringRequest(list, this, sb.toString());
        }
    }

    /* renamed from: by.saygames.SayEndpoint$StrictServerResponseDelivery */
    public static class StrictServerResponseDelivery implements IDeliveryStrategy {
        protected final String _response;

        public boolean canIgnoreError(Exception exc, RequestWriteStatus requestWriteStatus) {
            return false;
        }

        public boolean canSendNow() {
            return true;
        }

        public StrictServerResponseDelivery(String str) {
            this._response = str;
        }

        public boolean isGoodResponse(Response response) {
            try {
                if (response.body() == null) {
                    return false;
                }
                return this._response.equalsIgnoreCase(response.peekBody(Long.MAX_VALUE).string());
            } catch (Exception e) {
                Log.e(SayEndpoint.TAG, "Can't parse server response body", e);
                FirebaseCrashlytics.getInstance().recordException(e);
                return false;
            }
        }
    }

    /* renamed from: by.saygames.SayEndpoint$IgnoreReadErrorWithStrictServerResponseDelivery */
    public static class IgnoreReadErrorWithStrictServerResponseDelivery extends StrictServerResponseDelivery {
        public IgnoreReadErrorWithStrictServerResponseDelivery(String str) {
            super(str);
        }

        public boolean canIgnoreError(Exception exc, RequestWriteStatus requestWriteStatus) {
            return requestWriteStatus == RequestWriteStatus.FLUSHED && !(exc instanceof SSLProtocolException);
        }
    }

    /* renamed from: by.saygames.SayEndpoint$StringRequestData */
    static class StringRequestData implements IStringRequest {
        private final IBatching _batching;
        private final String _body;
        private final boolean _isPriority;
        private int _order;

        public StringRequestData(String str, IBatching iBatching, int i, boolean z) {
            this._body = str;
            this._batching = iBatching;
            this._order = i;
            this._isPriority = z;
        }

        public String getBody() {
            return this._body;
        }

        public IBatching getBatching() {
            return this._batching;
        }

        public int getOrder() {
            return this._order;
        }

        public void setOrder(int i) {
            this._order = i;
        }

        public boolean isPriority() {
            return this._isPriority;
        }
    }

    /* renamed from: by.saygames.SayEndpoint$BatchStringRequest */
    private static class BatchStringRequest implements IStringRequest {
        private final List<StringRequestData> _batch;
        private final IBatching _batching;
        private final String _body;

        public BatchStringRequest(List<StringRequestData> list, IBatching iBatching, String str) {
            this._batch = list;
            this._batching = iBatching;
            this._body = str;
        }

        public String getBody() {
            return this._body;
        }

        public int getOrder() {
            List<StringRequestData> list = this._batch;
            return list.get(list.size() - 1).getOrder();
        }

        public IBatching getBatching() {
            return this._batching;
        }
    }

    /* access modifiers changed from: private */
    public void onCacheOpened(List<StringRequestData> list) {
        this._isOpened = true;
        try {
            ArrayList<StringRequestData> requests = this._queue.getRequests(this._queue.size());
            this._queue.clear();
            this._queue.addAll(list);
            int requestingOrder = this._cache.getRequestingOrder();
            if (requestingOrder >= 0) {
                this._cache.removeRequestsLessOrEqual(requestingOrder);
                this._cache.removeRequestingOrder();
                this._queue.removeRequestsLessOrEqual(requestingOrder);
            }
            int latestRequestOrder = this._queue.getLatestRequestOrder();
            for (int i = 0; i < requests.size(); i++) {
                StringRequestData stringRequestData = requests.get(i);
                stringRequestData.setOrder(latestRequestOrder + i + 1);
                this._cache.cacheRequest(stringRequestData);
            }
            doFlushRequests();
            this._queue.addAll(requests);
        } catch (Exception e) {
            Log.e(TAG, "Error while opening endpoint cache", e);
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    /* access modifiers changed from: private */
    public StringRequestData doAddRequest(String str, IBatching iBatching, boolean z) {
        StringRequestData stringRequestData = new StringRequestData(str, iBatching, this._queue.getLatestRequestOrder() + 1, z);
        StringRequestData addRequest = this._queue.addRequest(stringRequestData);
        if (addRequest != stringRequestData) {
            tryCacheRequest(stringRequestData);
        }
        if (addRequest != null) {
            tryRemoveRequest(addRequest);
        }
        return stringRequestData;
    }

    private void tryRemoveRequest(StringRequestData stringRequestData) {
        if (this._isOpened) {
            this._cache.removeRequest(stringRequestData);
        }
    }

    private void tryCacheRequest(StringRequestData stringRequestData) {
        if (this._isOpened) {
            this._cache.cacheRequest(stringRequestData);
        }
    }

    /* access modifiers changed from: private */
    public void doFlushRequests() {
        if (this._pendingRequest != null) {
            Log.w(TAG, "Skipping flush due to pending request");
        } else if (!this._isOpened) {
            Log.w(TAG, "Skipping flush. Endpoint cache is not opened");
            tryScheduleRetry();
        } else {
            String str = this._url;
            if (str == null || str.isEmpty()) {
                Log.w(TAG, "Skipping flush due to url is not set");
                tryScheduleRetry();
            } else if (!this._delivery.canSendNow()) {
                Log.w(TAG, "Skipping flush due to _delivery forbids sending");
                tryScheduleRetry();
            } else {
                try {
                    this._pendingRequest = createPendingRequest();
                } catch (Exception e) {
                    Log.e(TAG, "Can't create endpoint request", e);
                    FirebaseCrashlytics.getInstance().recordException(e);
                }
                if (this._pendingRequest == null) {
                    Log.d(TAG, "Nothing to send");
                    return;
                }
                try {
                    Request build = new Request.Builder().url(str).post(RequestBody.create(this._contentType, this._pendingRequest.getBody())).build();
                    initPinnedClient();
                    this._httpPinnedClient.newCall(build).enqueue(this._httpCallback);
                    this._cache.setRequestingOrder(this._pendingRequest.getOrder());
                } catch (Throwable th) {
                    Log.e(TAG, "Error while sending request", th);
                    handleFailure();
                    FirebaseCrashlytics.getInstance().recordException(th);
                }
            }
        }
    }

    private void initPinnedClient() {
        if (this._rebuildClient) {
            this._httpPinnedClient = null;
            this._rebuildClient = false;
        }
        if (this._httpPinnedClient == null) {
            this._httpPinnedClient = clientBuilder().certificatePinner(this._pinner.build()).build();
        }
    }

    private void tryScheduleRetry() {
        if (!this._isAutoFlushing) {
            this._handler.postDelayed(this.flushRequestsOp, (long) this._retryDelay);
        }
    }

    private IStringRequest createPendingRequest() {
        ArrayList<StringRequestData> requests = this._queue.getRequests(this._maxBatchSize);
        if (requests.isEmpty()) {
            return null;
        }
        StringRequestData stringRequestData = requests.get(0);
        IBatching batching = stringRequestData.getBatching();
        if (batching == null) {
            return stringRequestData;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(stringRequestData);
        for (int i = 1; i < requests.size(); i++) {
            StringRequestData stringRequestData2 = requests.get(i);
            if (!isSameBatching(stringRequestData2.getBatching(), batching)) {
                break;
            }
            arrayList.add(stringRequestData2);
        }
        if (arrayList.size() == 1) {
            return (IStringRequest) arrayList.get(0);
        }
        return batching.combine(arrayList);
    }

    private boolean isSameBatching(IBatching iBatching, IBatching iBatching2) {
        return iBatching == iBatching2 || !(iBatching == null || iBatching2 == null || iBatching.getClass() != iBatching2.getClass());
    }

    /* access modifiers changed from: private */
    public void handleResponse(final Response response) {
        this._handler.post(new Runnable() {
            public void run() {
                try {
                    if (SayEndpoint.this._delivery.isGoodResponse(response)) {
                        SayEndpoint.this.finishPendingRequest();
                    } else {
                        SayEndpoint.this.handleFailure();
                    }
                } catch (Exception e) {
                    FirebaseCrashlytics.getInstance().recordException(e);
                    SayEndpoint.this.finishPendingRequest();
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void handleError(final IOException iOException) {
        this._handler.post(new Runnable() {
            public void run() {
                try {
                    if (SayEndpoint.this._delivery.canIgnoreError(iOException, SayEndpoint.this._latestRequestWriteStatus)) {
                        SayEndpoint.this.finishPendingRequest();
                    } else {
                        SayEndpoint.this.handleFailure();
                    }
                } catch (Exception e) {
                    FirebaseCrashlytics.getInstance().recordException(e);
                    SayEndpoint.this.finishPendingRequest();
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void finishPendingRequest() {
        try {
            int order = this._pendingRequest.getOrder();
            this._cache.removeRequestsLessOrEqual(order);
            this._cache.removeRequestingOrder();
            this._queue.removeRequestsLessOrEqual(order);
        } catch (Exception e) {
            Log.e(TAG, "Error while finishing pending request", e);
            FirebaseCrashlytics.getInstance().recordException(e);
        }
        this._pendingRequest = null;
        doFlushRequests();
    }

    /* access modifiers changed from: private */
    public void handleFailure() {
        this._cache.removeRequestingOrder();
        this._pendingRequest = null;
        tryScheduleRetry();
    }

    private OkHttpClient.Builder clientBuilder() {
        return new OkHttpClient.Builder().protocols(Collections.singletonList(Protocol.HTTP_1_1)).retryOnConnectionFailure(false).eventListener(new EventListener() {
            public void callStart(Call call) {
                RequestWriteStatus unused = SayEndpoint.this._latestRequestWriteStatus = RequestWriteStatus.SENDING;
            }

            public void connectionAcquired(Call call, Connection connection) {
                RequestWriteStatus unused = SayEndpoint.this._latestRequestWriteStatus = RequestWriteStatus.SENDING;
            }

            public void requestHeadersStart(Call call) {
                RequestWriteStatus unused = SayEndpoint.this._latestRequestWriteStatus = RequestWriteStatus.SENDING;
            }

            public void responseHeadersStart(Call call) {
                RequestWriteStatus unused = SayEndpoint.this._latestRequestWriteStatus = RequestWriteStatus.FLUSHED;
            }
        });
    }

    /* renamed from: by.saygames.SayEndpoint$StringRequestQueue */
    private static class StringRequestQueue {
        private CircularBuffer _buffer;
        private int _maxRequestsCount;
        private CircularBuffer _priorityBuffer;

        private StringRequestQueue() {
            this._buffer = new CircularBuffer();
            this._priorityBuffer = new CircularBuffer();
            this._maxRequestsCount = 13000;
        }

        public void setMaxRequestsCount(int i) {
            this._maxRequestsCount = i;
        }

        public int getLatestRequestOrder() {
            return Math.max(this._buffer.getLatestRequestOrder(), this._priorityBuffer.getLatestRequestOrder());
        }

        public void removeRequestsLessOrEqual(int i) {
            this._buffer.removeRequestLessOrEqual(i);
            this._priorityBuffer.removeRequestLessOrEqual(i);
        }

        public StringRequestData addRequest(StringRequestData stringRequestData) {
            StringRequestData stringRequestData2;
            if (size() < this._maxRequestsCount) {
                stringRequestData2 = null;
            } else if (!this._buffer.isEmpty()) {
                stringRequestData2 = this._buffer.pop();
            } else if (!stringRequestData.isPriority()) {
                return stringRequestData;
            } else {
                stringRequestData2 = this._priorityBuffer.pop();
            }
            if (stringRequestData.isPriority()) {
                this._priorityBuffer.add(stringRequestData, this._maxRequestsCount);
            } else {
                this._buffer.add(stringRequestData, this._maxRequestsCount);
            }
            return stringRequestData2;
        }

        public ArrayList<StringRequestData> getRequests(int i) {
            ArrayList<StringRequestData> arrayList = new ArrayList<>();
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < i; i4++) {
                StringRequestData stringRequestData = null;
                StringRequestData stringRequestData2 = i2 < this._buffer.size() ? this._buffer.get(i2) : null;
                if (i3 < this._priorityBuffer.size()) {
                    stringRequestData = this._priorityBuffer.get(i3);
                }
                if (stringRequestData2 == null && stringRequestData == null) {
                    break;
                }
                if (stringRequestData2 == null) {
                    arrayList.add(stringRequestData);
                } else {
                    if (stringRequestData == null) {
                        arrayList.add(stringRequestData2);
                    } else if (stringRequestData2.getOrder() < stringRequestData.getOrder()) {
                        arrayList.add(stringRequestData2);
                    } else {
                        arrayList.add(stringRequestData);
                    }
                    i2++;
                }
                i3++;
            }
            return arrayList;
        }

        public int size() {
            return this._buffer.size() + this._priorityBuffer.size();
        }

        public void addAll(List<StringRequestData> list) {
            for (StringRequestData addRequest : list) {
                addRequest(addRequest);
            }
        }

        public void clear() {
            this._buffer.clearBuffer();
            this._priorityBuffer.clearBuffer();
        }
    }

    /* renamed from: by.saygames.SayEndpoint$CircularBuffer */
    private static class CircularBuffer {
        private static final int SMALL_BUFFER_SIZE = 100;
        private ArrayList<StringRequestData> _buffer;
        private int _first;
        private int _last;

        private CircularBuffer() {
            this._buffer = new ArrayList<>();
            this._first = -1;
            this._last = -1;
        }

        public int getLatestRequestOrder() {
            int i = this._last;
            if (i == -1) {
                return -1;
            }
            return this._buffer.get(i).getOrder();
        }

        public void removeRequestLessOrEqual(int i) {
            if (this._first != -1) {
                while (!isEmpty() && this._buffer.get(this._first).getOrder() <= i) {
                    doPop();
                }
                optimizeBuffer();
            }
        }

        public int size() {
            if (this._buffer.isEmpty()) {
                return 0;
            }
            int i = this._first;
            int i2 = this._last;
            if (i <= i2) {
                return (i2 - i) + 1;
            }
            return (this._buffer.size() - this._first) + this._last + 1;
        }

        public boolean isEmpty() {
            return this._buffer.isEmpty();
        }

        public StringRequestData pop() {
            StringRequestData doPop = doPop();
            optimizeBuffer();
            return doPop;
        }

        private void optimizeBuffer() {
            if (isEmpty()) {
                return;
            }
            if (!(this._first == 0 && this._last == this._buffer.size() - 1) && size() <= 100) {
                ArrayList<StringRequestData> arrayList = new ArrayList<>();
                for (int i = 0; i < size(); i++) {
                    arrayList.add(get(i));
                }
                this._buffer = arrayList;
                this._first = 0;
                this._last = arrayList.size() - 1;
            }
        }

        public StringRequestData doPop() {
            int i = this._first;
            if (i == -1) {
                return null;
            }
            StringRequestData stringRequestData = this._buffer.get(i);
            this._buffer.set(this._first, (Object) null);
            moveFirst();
            return stringRequestData;
        }

        private void moveFirst() {
            int i = this._first;
            if (i == this._last) {
                clearBuffer();
                return;
            }
            int i2 = i + 1;
            this._first = i2;
            if (i2 >= this._buffer.size()) {
                this._first = 0;
            }
        }

        public void clearBuffer() {
            if (!this._buffer.isEmpty()) {
                this._buffer = new ArrayList<>();
                this._first = -1;
                this._last = -1;
            }
        }

        public void add(StringRequestData stringRequestData, int i) {
            if (i <= 0) {
                Log.e(SayEndpoint.TAG, "SayEndpoint: maxRequestsCount <= 0");
            } else if (this._buffer.size() >= i || this._last != this._buffer.size() - 1) {
                int i2 = this._last + 1;
                this._last = i2;
                if (i2 >= this._buffer.size()) {
                    this._last = 0;
                }
                int i3 = this._last;
                int i4 = this._first;
                if (i3 == i4) {
                    int i5 = i4 + 1;
                    this._first = i5;
                    if (i5 >= this._buffer.size()) {
                        this._first = 0;
                    }
                }
                this._buffer.set(this._last, stringRequestData);
            } else {
                this._buffer.add(stringRequestData);
                this._last = this._buffer.size() - 1;
                if (this._first == -1) {
                    this._first = 0;
                }
            }
        }

        public StringRequestData get(int i) {
            int i2 = this._first + i;
            if (i2 >= this._buffer.size()) {
                i2 -= this._buffer.size();
            }
            return this._buffer.get(i2);
        }
    }
}

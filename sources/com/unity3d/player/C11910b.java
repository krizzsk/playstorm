package com.unity3d.player;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.room.RoomDatabase;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: com.unity3d.player.b */
public final class C11910b {

    /* renamed from: b */
    private static CameraManager f29156b;

    /* renamed from: c */
    private static String[] f29157c;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static Semaphore f29158e = new Semaphore(1);

    /* renamed from: A */
    private CameraCaptureSession.CaptureCallback f29159A = new CameraCaptureSession.CaptureCallback() {
        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            C11910b.this.m34506a(captureRequest.getTag());
        }

        public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            C11922g.Log(5, "Camera2: Capture session failed " + captureRequest.getTag() + " reason " + captureFailure.getReason());
            C11910b.this.m34506a(captureRequest.getTag());
        }

        public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        }

        public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
        }
    };

    /* renamed from: B */
    private final CameraDevice.StateCallback f29160B = new CameraDevice.StateCallback() {
        public final void onClosed(CameraDevice cameraDevice) {
            C11910b.f29158e.release();
        }

        public final void onDisconnected(CameraDevice cameraDevice) {
            C11922g.Log(5, "Camera2: CameraDevice disconnected.");
            C11910b.this.m34504a(cameraDevice);
            C11910b.f29158e.release();
        }

        public final void onError(CameraDevice cameraDevice, int i) {
            C11922g.Log(6, "Camera2: Error opeining CameraDevice " + i);
            C11910b.this.m34504a(cameraDevice);
            C11910b.f29158e.release();
        }

        public final void onOpened(CameraDevice cameraDevice) {
            CameraDevice unused = C11910b.this.f29164d = cameraDevice;
            C11910b.f29158e.release();
        }
    };

    /* renamed from: C */
    private final ImageReader.OnImageAvailableListener f29161C = new ImageReader.OnImageAvailableListener() {
        public final void onImageAvailable(ImageReader imageReader) {
            if (C11910b.f29158e.tryAcquire()) {
                Image acquireNextImage = imageReader.acquireNextImage();
                if (acquireNextImage != null) {
                    Image.Plane[] planes = acquireNextImage.getPlanes();
                    if (acquireNextImage.getFormat() == 35 && planes != null && planes.length == 3) {
                        C11919d h = C11910b.this.f29163a;
                        ByteBuffer buffer = planes[0].getBuffer();
                        ByteBuffer buffer2 = planes[1].getBuffer();
                        ByteBuffer buffer3 = planes[2].getBuffer();
                        h.mo72845a(buffer, buffer2, buffer3, planes[0].getRowStride(), planes[1].getRowStride(), planes[1].getPixelStride());
                    } else {
                        C11922g.Log(6, "Camera2: Wrong image format.");
                    }
                    if (C11910b.this.f29178s != null) {
                        C11910b.this.f29178s.close();
                    }
                    Image unused = C11910b.this.f29178s = acquireNextImage;
                }
                C11910b.f29158e.release();
            }
        }
    };

    /* renamed from: D */
    private final SurfaceTexture.OnFrameAvailableListener f29162D = new SurfaceTexture.OnFrameAvailableListener() {
        public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
            C11910b.this.f29163a.mo72844a(surfaceTexture);
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C11919d f29163a = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public CameraDevice f29164d;

    /* renamed from: f */
    private HandlerThread f29165f;

    /* renamed from: g */
    private Handler f29166g;

    /* renamed from: h */
    private Rect f29167h;

    /* renamed from: i */
    private Rect f29168i;

    /* renamed from: j */
    private int f29169j;

    /* renamed from: k */
    private int f29170k;

    /* renamed from: l */
    private float f29171l = -1.0f;

    /* renamed from: m */
    private float f29172m = -1.0f;

    /* renamed from: n */
    private int f29173n;

    /* renamed from: o */
    private int f29174o;

    /* renamed from: p */
    private boolean f29175p = false;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public Range f29176q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public ImageReader f29177r = null;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public Image f29178s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public CaptureRequest.Builder f29179t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public CameraCaptureSession f29180u = null;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public Object f29181v = new Object();

    /* renamed from: w */
    private int f29182w;

    /* renamed from: x */
    private SurfaceTexture f29183x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public Surface f29184y = null;

    /* renamed from: z */
    private int f29185z = C11916a.f29193c;

    /* renamed from: com.unity3d.player.b$a */
    private enum C11916a {
        ;

        static {
            f29194d = new int[]{1, 2, 3};
        }
    }

    protected C11910b(C11919d dVar) {
        this.f29163a = dVar;
        m34521g();
    }

    /* renamed from: a */
    public static int m34495a(Context context) {
        return m34515c(context).length;
    }

    /* renamed from: a */
    public static int m34496a(Context context, int i) {
        try {
            return ((Integer) m34508b(context).getCameraCharacteristics(m34515c(context)[i]).get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        } catch (CameraAccessException e) {
            C11922g.Log(6, "Camera2: CameraAccessException " + e);
            return 0;
        }
    }

    /* renamed from: a */
    private static int m34497a(Range[] rangeArr, int i) {
        int i2 = -1;
        double d = Double.MAX_VALUE;
        for (int i3 = 0; i3 < rangeArr.length; i3++) {
            int intValue = ((Integer) rangeArr[i3].getLower()).intValue();
            int intValue2 = ((Integer) rangeArr[i3].getUpper()).intValue();
            float f = (float) i;
            if (f + 0.1f > ((float) intValue) && f - 0.1f < ((float) intValue2)) {
                return i;
            }
            double min = (double) ((float) Math.min(Math.abs(i - intValue), Math.abs(i - intValue2)));
            if (min < d) {
                i2 = i3;
                d = min;
            }
        }
        return ((Integer) (i > ((Integer) rangeArr[i2].getUpper()).intValue() ? rangeArr[i2].getUpper() : rangeArr[i2].getLower())).intValue();
    }

    /* renamed from: a */
    private static Rect m34498a(Size[] sizeArr, double d, double d2) {
        Size[] sizeArr2 = sizeArr;
        double d3 = Double.MAX_VALUE;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < sizeArr2.length; i3++) {
            int width = sizeArr2[i3].getWidth();
            int height = sizeArr2[i3].getHeight();
            double abs = Math.abs(Math.log(d / ((double) width))) + Math.abs(Math.log(d2 / ((double) height)));
            if (abs < d3) {
                i = width;
                i2 = height;
                d3 = abs;
            }
        }
        return new Rect(0, 0, i, i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m34504a(CameraDevice cameraDevice) {
        synchronized (this.f29181v) {
            this.f29180u = null;
        }
        cameraDevice.close();
        this.f29164d = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m34506a(Object obj) {
        if (obj == "Focus") {
            this.f29175p = false;
            synchronized (this.f29181v) {
                if (this.f29180u != null) {
                    try {
                        this.f29179t.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                        this.f29179t.setTag("Regular");
                        this.f29180u.setRepeatingRequest(this.f29179t.build(), this.f29159A, this.f29166g);
                    } catch (CameraAccessException e) {
                        C11922g.Log(6, "Camera2: CameraAccessException " + e);
                    }
                }
            }
        } else if (obj == "Cancel focus") {
            synchronized (this.f29181v) {
                if (this.f29180u != null) {
                    m34527j();
                }
            }
        }
    }

    /* renamed from: a */
    private static Size[] m34507a(CameraCharacteristics cameraCharacteristics) {
        String str;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null) {
            str = "Camera2: configuration map is not available.";
        } else {
            Size[] outputSizes = streamConfigurationMap.getOutputSizes(35);
            if (outputSizes != null && outputSizes.length != 0) {
                return outputSizes;
            }
            str = "Camera2: output sizes for YUV_420_888 format are not avialable.";
        }
        C11922g.Log(6, str);
        return null;
    }

    /* renamed from: b */
    private static CameraManager m34508b(Context context) {
        if (f29156b == null) {
            f29156b = (CameraManager) context.getSystemService("camera");
        }
        return f29156b;
    }

    /* renamed from: b */
    private void m34510b(CameraCharacteristics cameraCharacteristics) {
        int intValue = ((Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue();
        this.f29170k = intValue;
        if (intValue > 0) {
            Rect rect = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            this.f29168i = rect;
            float width = ((float) rect.width()) / ((float) this.f29168i.height());
            float width2 = ((float) this.f29167h.width()) / ((float) this.f29167h.height());
            if (width2 > width) {
                this.f29173n = 0;
                this.f29174o = (int) ((((float) this.f29168i.height()) - (((float) this.f29168i.width()) / width2)) / 2.0f);
            } else {
                this.f29174o = 0;
                this.f29173n = (int) ((((float) this.f29168i.width()) - (((float) this.f29168i.height()) * width2)) / 2.0f);
            }
            this.f29169j = Math.min(this.f29168i.width(), this.f29168i.height()) / 20;
        }
    }

    /* renamed from: b */
    public static boolean m34512b(Context context, int i) {
        try {
            return ((Integer) m34508b(context).getCameraCharacteristics(m34515c(context)[i]).get(CameraCharacteristics.LENS_FACING)).intValue() == 0;
        } catch (CameraAccessException e) {
            C11922g.Log(6, "Camera2: CameraAccessException " + e);
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m34514c(Context context, int i) {
        try {
            return ((Integer) m34508b(context).getCameraCharacteristics(m34515c(context)[i]).get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() > 0;
        } catch (CameraAccessException e) {
            C11922g.Log(6, "Camera2: CameraAccessException " + e);
            return false;
        }
    }

    /* renamed from: c */
    private static String[] m34515c(Context context) {
        if (f29157c == null) {
            try {
                f29157c = m34508b(context).getCameraIdList();
            } catch (CameraAccessException e) {
                C11922g.Log(6, "Camera2: CameraAccessException " + e);
                f29157c = new String[0];
            }
        }
        return f29157c;
    }

    /* renamed from: d */
    public static int[] m34517d(Context context, int i) {
        try {
            Size[] a = m34507a(m34508b(context).getCameraCharacteristics(m34515c(context)[i]));
            if (a == null) {
                return null;
            }
            int[] iArr = new int[(a.length * 2)];
            for (int i2 = 0; i2 < a.length; i2++) {
                int i3 = i2 * 2;
                iArr[i3] = a[i2].getWidth();
                iArr[i3 + 1] = a[i2].getHeight();
            }
            return iArr;
        } catch (CameraAccessException e) {
            C11922g.Log(6, "Camera2: CameraAccessException " + e);
            return null;
        }
    }

    /* renamed from: g */
    private void m34521g() {
        HandlerThread handlerThread = new HandlerThread("CameraBackground");
        this.f29165f = handlerThread;
        handlerThread.start();
        this.f29166g = new Handler(this.f29165f.getLooper());
    }

    /* renamed from: h */
    private void m34524h() {
        this.f29165f.quit();
        try {
            this.f29165f.join(4000);
            this.f29165f = null;
            this.f29166g = null;
        } catch (InterruptedException e) {
            this.f29165f.interrupt();
            C11922g.Log(6, "Camera2: Interrupted while waiting for the background thread to finish " + e);
        }
    }

    /* renamed from: i */
    private void m34526i() {
        try {
            if (!f29158e.tryAcquire(4, TimeUnit.SECONDS)) {
                C11922g.Log(5, "Camera2: Timeout waiting to lock camera for closing.");
                return;
            }
            this.f29164d.close();
            try {
                if (!f29158e.tryAcquire(4, TimeUnit.SECONDS)) {
                    C11922g.Log(5, "Camera2: Timeout waiting to close camera.");
                }
            } catch (InterruptedException e) {
                C11922g.Log(6, "Camera2: Interrupted while waiting to close camera " + e);
            }
            this.f29164d = null;
            f29158e.release();
        } catch (InterruptedException e2) {
            C11922g.Log(6, "Camera2: Interrupted while trying to lock camera for closing " + e2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m34527j() {
        try {
            if (this.f29170k != 0 && this.f29171l >= 0.0f && this.f29171l <= 1.0f && this.f29172m >= 0.0f) {
                if (this.f29172m <= 1.0f) {
                    this.f29175p = true;
                    int max = Math.max(this.f29169j + 1, Math.min((int) ((((float) (this.f29168i.width() - (this.f29173n * 2))) * this.f29171l) + ((float) this.f29173n)), (this.f29168i.width() - this.f29169j) - 1));
                    int max2 = Math.max(this.f29169j + 1, Math.min((int) ((((double) (this.f29168i.height() - (this.f29174o * 2))) * (1.0d - ((double) this.f29172m))) + ((double) this.f29174o)), (this.f29168i.height() - this.f29169j) - 1));
                    this.f29179t.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(max - this.f29169j, max2 - this.f29169j, this.f29169j * 2, this.f29169j * 2, RoomDatabase.MAX_BIND_PARAMETER_CNT)});
                    this.f29179t.set(CaptureRequest.CONTROL_AF_MODE, 1);
                    this.f29179t.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                    this.f29179t.setTag("Focus");
                    this.f29180u.capture(this.f29179t.build(), this.f29159A, this.f29166g);
                    return;
                }
            }
            this.f29179t.set(CaptureRequest.CONTROL_AF_MODE, 4);
            this.f29179t.setTag("Regular");
            if (this.f29180u != null) {
                this.f29180u.setRepeatingRequest(this.f29179t.build(), this.f29159A, this.f29166g);
            }
        } catch (CameraAccessException e) {
            C11922g.Log(6, "Camera2: CameraAccessException " + e);
        }
    }

    /* renamed from: k */
    private void m34528k() {
        try {
            if (this.f29180u != null) {
                this.f29180u.stopRepeating();
                this.f29179t.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                this.f29179t.set(CaptureRequest.CONTROL_AF_MODE, 0);
                this.f29179t.setTag("Cancel focus");
                this.f29180u.capture(this.f29179t.build(), this.f29159A, this.f29166g);
            }
        } catch (CameraAccessException e) {
            C11922g.Log(6, "Camera2: CameraAccessException " + e);
        }
    }

    /* renamed from: a */
    public final Rect mo73021a() {
        return this.f29167h;
    }

    /* renamed from: a */
    public final boolean mo73022a(float f, float f2) {
        if (this.f29170k <= 0) {
            return false;
        }
        if (!this.f29175p) {
            this.f29171l = f;
            this.f29172m = f2;
            synchronized (this.f29181v) {
                if (!(this.f29180u == null || this.f29185z == C11916a.f29192b)) {
                    m34528k();
                }
            }
            return true;
        }
        C11922g.Log(5, "Camera2: Setting manual focus point already started.");
        return false;
    }

    /* renamed from: a */
    public final boolean mo73023a(Context context, int i, int i2, int i3, int i4, int i5) {
        try {
            CameraCharacteristics cameraCharacteristics = f29156b.getCameraCharacteristics(m34515c(context)[i]);
            if (((Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue() == 2) {
                C11922g.Log(5, "Camera2: only LEGACY hardware level is supported.");
                return false;
            }
            Size[] a = m34507a(cameraCharacteristics);
            if (!(a == null || a.length == 0)) {
                this.f29167h = m34498a(a, (double) i2, (double) i3);
                Range[] rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                if (rangeArr == null || rangeArr.length == 0) {
                    C11922g.Log(6, "Camera2: target FPS ranges are not avialable.");
                } else {
                    int a2 = m34497a(rangeArr, i4);
                    this.f29176q = new Range(Integer.valueOf(a2), Integer.valueOf(a2));
                    try {
                        if (!f29158e.tryAcquire(4, TimeUnit.SECONDS)) {
                            C11922g.Log(5, "Camera2: Timeout waiting to lock camera for opening.");
                            return false;
                        }
                        try {
                            f29156b.openCamera(m34515c(context)[i], this.f29160B, this.f29166g);
                            try {
                                if (!f29158e.tryAcquire(4, TimeUnit.SECONDS)) {
                                    C11922g.Log(5, "Camera2: Timeout waiting to open camera.");
                                    return false;
                                }
                                f29158e.release();
                                this.f29182w = i5;
                                m34510b(cameraCharacteristics);
                                return this.f29164d != null;
                            } catch (InterruptedException e) {
                                C11922g.Log(6, "Camera2: Interrupted while waiting to open camera " + e);
                            }
                        } catch (CameraAccessException e2) {
                            C11922g.Log(6, "Camera2: CameraAccessException " + e2);
                            f29158e.release();
                            return false;
                        }
                    } catch (InterruptedException e3) {
                        C11922g.Log(6, "Camera2: Interrupted while trying to lock camera for opening " + e3);
                        return false;
                    }
                }
            }
            return false;
        } catch (CameraAccessException e4) {
            C11922g.Log(6, "Camera2: CameraAccessException " + e4);
            return false;
        }
    }

    /* renamed from: b */
    public final void mo73024b() {
        if (this.f29164d != null) {
            mo73027e();
            m34526i();
            this.f29159A = null;
            this.f29184y = null;
            this.f29183x = null;
            Image image = this.f29178s;
            if (image != null) {
                image.close();
                this.f29178s = null;
            }
            ImageReader imageReader = this.f29177r;
            if (imageReader != null) {
                imageReader.close();
                this.f29177r = null;
            }
        }
        m34524h();
    }

    /* renamed from: c */
    public final void mo73025c() {
        List list;
        if (this.f29177r == null) {
            ImageReader newInstance = ImageReader.newInstance(this.f29167h.width(), this.f29167h.height(), 35, 2);
            this.f29177r = newInstance;
            newInstance.setOnImageAvailableListener(this.f29161C, this.f29166g);
            this.f29178s = null;
            if (this.f29182w != 0) {
                SurfaceTexture surfaceTexture = new SurfaceTexture(this.f29182w);
                this.f29183x = surfaceTexture;
                surfaceTexture.setDefaultBufferSize(this.f29167h.width(), this.f29167h.height());
                this.f29183x.setOnFrameAvailableListener(this.f29162D, this.f29166g);
                this.f29184y = new Surface(this.f29183x);
            }
        }
        try {
            if (this.f29180u == null) {
                CameraDevice cameraDevice = this.f29164d;
                if (this.f29184y != null) {
                    list = Arrays.asList(new Surface[]{this.f29184y, this.f29177r.getSurface()});
                } else {
                    list = Arrays.asList(new Surface[]{this.f29177r.getSurface()});
                }
                cameraDevice.createCaptureSession(list, new CameraCaptureSession.StateCallback() {
                    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
                        C11922g.Log(6, "Camera2: CaptureSession configuration failed.");
                    }

                    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
                        if (C11910b.this.f29164d != null) {
                            synchronized (C11910b.this.f29181v) {
                                CameraCaptureSession unused = C11910b.this.f29180u = cameraCaptureSession;
                                try {
                                    CaptureRequest.Builder unused2 = C11910b.this.f29179t = C11910b.this.f29164d.createCaptureRequest(1);
                                    if (C11910b.this.f29184y != null) {
                                        C11910b.this.f29179t.addTarget(C11910b.this.f29184y);
                                    }
                                    C11910b.this.f29179t.addTarget(C11910b.this.f29177r.getSurface());
                                    C11910b.this.f29179t.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, C11910b.this.f29176q);
                                    C11910b.this.m34527j();
                                } catch (CameraAccessException e) {
                                    C11922g.Log(6, "Camera2: CameraAccessException " + e);
                                }
                            }
                        }
                    }
                }, this.f29166g);
            } else if (this.f29185z == C11916a.f29192b) {
                this.f29180u.setRepeatingRequest(this.f29179t.build(), this.f29159A, this.f29166g);
            }
            this.f29185z = C11916a.f29191a;
        } catch (CameraAccessException e) {
            C11922g.Log(6, "Camera2: CameraAccessException " + e);
        }
    }

    /* renamed from: d */
    public final void mo73026d() {
        synchronized (this.f29181v) {
            if (this.f29180u != null) {
                try {
                    this.f29180u.stopRepeating();
                    this.f29185z = C11916a.f29192b;
                } catch (CameraAccessException e) {
                    C11922g.Log(6, "Camera2: CameraAccessException " + e);
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo73027e() {
        synchronized (this.f29181v) {
            if (this.f29180u != null) {
                try {
                    this.f29180u.abortCaptures();
                } catch (CameraAccessException e) {
                    C11922g.Log(6, "Camera2: CameraAccessException " + e);
                }
                this.f29180u.close();
                this.f29180u = null;
                this.f29185z = C11916a.f29193c;
            }
        }
    }
}

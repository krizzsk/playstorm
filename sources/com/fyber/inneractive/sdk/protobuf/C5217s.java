package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C5137f;
import com.fyber.inneractive.sdk.protobuf.C5205q;
import com.fyber.inneractive.sdk.protobuf.C5227t1;
import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.protobuf.s */
public final class C5217s extends C5210r<GeneratedMessageLite.C5110c> {
    /* renamed from: a */
    public boolean mo26227a(C5207q0 q0Var) {
        return q0Var instanceof GeneratedMessageLite.ExtendableMessage;
    }

    /* renamed from: b */
    public C5239u<GeneratedMessageLite.C5110c> mo26228b(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).ensureExtensionsAreMutable();
    }

    /* renamed from: c */
    public void mo26229c(Object obj) {
        ((GeneratedMessageLite.ExtendableMessage) obj).extensions.mo26289g();
    }

    /* renamed from: a */
    public C5239u<GeneratedMessageLite.C5110c> mo26221a(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).extensions;
    }

    /* renamed from: a */
    public <UT, UB> UB mo26222a(C5136e1 e1Var, Object obj, C5205q qVar, C5239u<GeneratedMessageLite.C5110c> uVar, UB ub, C5193m1<UT, UB> m1Var) throws IOException {
        Object a;
        Object obj2;
        ArrayList arrayList;
        GeneratedMessageLite.C5111d dVar = (GeneratedMessageLite.C5111d) obj;
        GeneratedMessageLite.C5110c cVar = dVar.f13699d;
        int i = cVar.f13692b;
        if (!cVar.f13694d || !cVar.f13695e) {
            Object obj3 = null;
            C5227t1.C5229b bVar = cVar.f13693c;
            if (bVar != C5227t1.C5229b.ENUM) {
                switch (bVar.ordinal()) {
                    case 0:
                        obj2 = Double.valueOf(e1Var.mo25901h());
                        break;
                    case 1:
                        obj2 = Float.valueOf(e1Var.mo25907k());
                        break;
                    case 2:
                        obj2 = Long.valueOf(e1Var.mo25915o());
                        break;
                    case 3:
                        obj2 = Long.valueOf(e1Var.mo25897f());
                        break;
                    case 4:
                        obj2 = Integer.valueOf(e1Var.mo25893d());
                        break;
                    case 5:
                        obj2 = Long.valueOf(e1Var.mo25899g());
                        break;
                    case 6:
                        obj2 = Integer.valueOf(e1Var.mo25919q());
                        break;
                    case 7:
                        obj2 = Boolean.valueOf(e1Var.mo25921r());
                        break;
                    case 8:
                        obj2 = e1Var.mo25913n();
                        break;
                    case 9:
                        obj2 = e1Var.mo25882a(dVar.f13698c.getClass(), qVar);
                        break;
                    case 10:
                        obj2 = e1Var.mo25888b(dVar.f13698c.getClass(), qVar);
                        break;
                    case 11:
                        obj2 = e1Var.mo25880a();
                        break;
                    case 12:
                        obj2 = Integer.valueOf(e1Var.mo25891c());
                        break;
                    case 13:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 14:
                        obj2 = Integer.valueOf(e1Var.mo25911m());
                        break;
                    case 15:
                        obj2 = Long.valueOf(e1Var.mo25923t());
                        break;
                    case 16:
                        obj2 = Integer.valueOf(e1Var.mo25905j());
                        break;
                    case 17:
                        obj2 = Long.valueOf(e1Var.mo25909l());
                        break;
                }
            } else {
                int d = e1Var.mo25893d();
                if (dVar.f13699d.f13691a.mo26316a(d) == null) {
                    Class<?> cls = C5150h1.f13762a;
                    if (ub == null) {
                        ub = m1Var.mo26164a();
                    }
                    m1Var.mo26175b(ub, i, (long) d);
                    return ub;
                }
                obj2 = Integer.valueOf(d);
            }
            obj3 = obj2;
            GeneratedMessageLite.C5110c cVar2 = dVar.f13699d;
            if (cVar2.f13694d) {
                uVar.mo26278a(cVar2, (Object) obj3);
            } else {
                int ordinal = cVar2.f13693c.ordinal();
                if ((ordinal == 9 || ordinal == 10) && (a = uVar.mo26277a(dVar.f13699d)) != null) {
                    obj3 = C5252z.m16434a(a, (Object) obj3);
                }
                uVar.mo26281c(dVar.f13699d, obj3);
            }
        } else {
            switch (cVar.f13693c.ordinal()) {
                case 0:
                    arrayList = new ArrayList();
                    e1Var.mo25906j(arrayList);
                    break;
                case 1:
                    arrayList = new ArrayList();
                    e1Var.mo25894d(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    e1Var.mo25908k(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    e1Var.mo25883a(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    e1Var.mo25916o(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    e1Var.mo25914n(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    e1Var.mo25896e(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    e1Var.mo25910l(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    e1Var.mo25903i(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    e1Var.mo25918p(arrayList);
                    ub = C5150h1.m15726a(i, (List<Integer>) arrayList, dVar.f13699d.f13691a, ub, m1Var);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    e1Var.mo25898f(arrayList);
                    break;
                case 15:
                    arrayList = new ArrayList();
                    e1Var.mo25912m(arrayList);
                    break;
                case 16:
                    arrayList = new ArrayList();
                    e1Var.mo25892c(arrayList);
                    break;
                case 17:
                    arrayList = new ArrayList();
                    e1Var.mo25900g(arrayList);
                    break;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Type cannot be packed: ");
                    sb.append(dVar.f13699d.f13693c);
                    throw new IllegalStateException(sb.toString());
            }
            uVar.mo26281c(dVar.f13699d, arrayList);
        }
        return ub;
    }

    /* renamed from: a */
    public Object mo26223a(C5205q qVar, C5207q0 q0Var, int i) {
        return qVar.f13859a.get(new C5205q.C5206a(q0Var, i));
    }

    /* renamed from: a */
    public int mo26220a(Map.Entry<?, ?> entry) {
        return ((GeneratedMessageLite.C5110c) entry.getKey()).f13692b;
    }

    /* renamed from: a */
    public void mo26226a(C5242u1 u1Var, Map.Entry<?, ?> entry) throws IOException {
        GeneratedMessageLite.C5110c cVar = (GeneratedMessageLite.C5110c) entry.getKey();
        if (cVar.f13694d) {
            switch (cVar.f13693c.ordinal()) {
                case 0:
                    C5150h1.m15738b(cVar.f13692b, (List<Double>) (List) entry.getValue(), u1Var, cVar.f13695e);
                    return;
                case 1:
                    C5150h1.m15750f(cVar.f13692b, (List) entry.getValue(), u1Var, cVar.f13695e);
                    return;
                case 2:
                    C5150h1.m15756h(cVar.f13692b, (List) entry.getValue(), u1Var, cVar.f13695e);
                    return;
                case 3:
                    C5150h1.m15765n(cVar.f13692b, (List) entry.getValue(), u1Var, cVar.f13695e);
                    return;
                case 4:
                    C5150h1.m15753g(cVar.f13692b, (List) entry.getValue(), u1Var, cVar.f13695e);
                    return;
                case 5:
                    C5150h1.m15747e(cVar.f13692b, (List) entry.getValue(), u1Var, cVar.f13695e);
                    return;
                case 6:
                    C5150h1.m15744d(cVar.f13692b, (List) entry.getValue(), u1Var, cVar.f13695e);
                    return;
                case 7:
                    C5150h1.m15730a(cVar.f13692b, (List<Boolean>) (List) entry.getValue(), u1Var, cVar.f13695e);
                    return;
                case 8:
                    C5150h1.m15736b(cVar.f13692b, (List<String>) (List) entry.getValue(), u1Var);
                    return;
                case 9:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        C5150h1.m15729a(cVar.f13692b, (List<?>) (List) entry.getValue(), u1Var, (C5141f1) C5124b1.f13725c.mo25837a(list.get(0).getClass()));
                        return;
                    }
                    return;
                case 10:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        C5150h1.m15737b(cVar.f13692b, (List<?>) (List) entry.getValue(), u1Var, (C5141f1) C5124b1.f13725c.mo25837a(list2.get(0).getClass()));
                        return;
                    }
                    return;
                case 11:
                    C5150h1.m15728a(cVar.f13692b, (List<C5151i>) (List) entry.getValue(), u1Var);
                    return;
                case 12:
                    C5150h1.m15764m(cVar.f13692b, (List) entry.getValue(), u1Var, cVar.f13695e);
                    return;
                case 13:
                    C5150h1.m15753g(cVar.f13692b, (List) entry.getValue(), u1Var, cVar.f13695e);
                    return;
                case 14:
                    C5150h1.m15759i(cVar.f13692b, (List) entry.getValue(), u1Var, cVar.f13695e);
                    return;
                case 15:
                    C5150h1.m15761j(cVar.f13692b, (List) entry.getValue(), u1Var, cVar.f13695e);
                    return;
                case 16:
                    C5150h1.m15762k(cVar.f13692b, (List) entry.getValue(), u1Var, cVar.f13695e);
                    return;
                case 17:
                    C5150h1.m15763l(cVar.f13692b, (List) entry.getValue(), u1Var, cVar.f13695e);
                    return;
                default:
                    return;
            }
        } else {
            switch (cVar.f13693c.ordinal()) {
                case 0:
                    ((C5191m) u1Var).mo26157a(cVar.f13692b, ((Double) entry.getValue()).doubleValue());
                    return;
                case 1:
                    ((C5191m) u1Var).mo26158a(cVar.f13692b, ((Float) entry.getValue()).floatValue());
                    return;
                case 2:
                    ((C5191m) u1Var).f13841a.mo26132g(cVar.f13692b, ((Long) entry.getValue()).longValue());
                    return;
                case 3:
                    ((C5191m) u1Var).f13841a.mo26132g(cVar.f13692b, ((Long) entry.getValue()).longValue());
                    return;
                case 4:
                    ((C5191m) u1Var).f13841a.mo26133h(cVar.f13692b, ((Integer) entry.getValue()).intValue());
                    return;
                case 5:
                    ((C5191m) u1Var).f13841a.mo26129f(cVar.f13692b, ((Long) entry.getValue()).longValue());
                    return;
                case 6:
                    ((C5191m) u1Var).f13841a.mo26131g(cVar.f13692b, ((Integer) entry.getValue()).intValue());
                    return;
                case 7:
                    ((C5191m) u1Var).f13841a.mo26123b(cVar.f13692b, ((Boolean) entry.getValue()).booleanValue());
                    return;
                case 8:
                    ((C5191m) u1Var).f13841a.mo26122b(cVar.f13692b, (String) entry.getValue());
                    return;
                case 9:
                    ((C5191m) u1Var).mo26162a(cVar.f13692b, entry.getValue(), C5124b1.f13725c.mo25837a(entry.getValue().getClass()));
                    return;
                case 10:
                    ((C5191m) u1Var).mo26163b(cVar.f13692b, entry.getValue(), C5124b1.f13725c.mo25837a(entry.getValue().getClass()));
                    return;
                case 11:
                    ((C5191m) u1Var).f13841a.mo26120b(cVar.f13692b, (C5151i) entry.getValue());
                    return;
                case 12:
                    ((C5191m) u1Var).f13841a.mo26135j(cVar.f13692b, ((Integer) entry.getValue()).intValue());
                    return;
                case 13:
                    ((C5191m) u1Var).f13841a.mo26133h(cVar.f13692b, ((Integer) entry.getValue()).intValue());
                    return;
                case 14:
                    ((C5191m) u1Var).f13841a.mo26131g(cVar.f13692b, ((Integer) entry.getValue()).intValue());
                    return;
                case 15:
                    ((C5191m) u1Var).f13841a.mo26129f(cVar.f13692b, ((Long) entry.getValue()).longValue());
                    return;
                case 16:
                    ((C5191m) u1Var).mo26159a(cVar.f13692b, ((Integer) entry.getValue()).intValue());
                    return;
                case 17:
                    ((C5191m) u1Var).mo26160a(cVar.f13692b, ((Long) entry.getValue()).longValue());
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: a */
    public void mo26224a(C5136e1 e1Var, Object obj, C5205q qVar, C5239u<GeneratedMessageLite.C5110c> uVar) throws IOException {
        GeneratedMessageLite.C5111d dVar = (GeneratedMessageLite.C5111d) obj;
        uVar.mo26281c(dVar.f13699d, e1Var.mo25888b(dVar.f13698c.getClass(), qVar));
    }

    /* renamed from: a */
    public void mo26225a(C5151i iVar, Object obj, C5205q qVar, C5239u<GeneratedMessageLite.C5110c> uVar) throws IOException {
        GeneratedMessageLite.C5111d dVar = (GeneratedMessageLite.C5111d) obj;
        GeneratedMessageLite b = ((GeneratedMessageLite.C5108a) dVar.f13698c.newBuilderForType()).mo25811b();
        ByteBuffer wrap = ByteBuffer.wrap(iVar.mo25991h());
        if (wrap.hasArray()) {
            C5137f.C5139b bVar = new C5137f.C5139b(wrap, true);
            C5124b1 b1Var = C5124b1.f13725c;
            b1Var.getClass();
            b1Var.mo25837a(b.getClass()).mo25944a(b, bVar, qVar);
            uVar.mo26281c(dVar.f13699d, b);
            if (bVar.mo25922s() != Integer.MAX_VALUE) {
                throw C5119a0.m15524a();
            }
            return;
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }
}

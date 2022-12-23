package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C5252z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.fyber.inneractive.sdk.protobuf.e0 */
public class C5135e0 extends C5125c<String> implements C5140f0, RandomAccess {

    /* renamed from: b */
    public final List<Object> f13746b;

    static {
        new C5135e0(10).f13728a = false;
    }

    public C5135e0(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    /* renamed from: a */
    public C5140f0 mo25872a() {
        return this.f13728a ? new C5202p1(this) : this;
    }

    public void add(int i, Object obj) {
        mo25844e();
        this.f13746b.add(i, (String) obj);
        this.modCount++;
    }

    public boolean addAll(Collection<? extends String> collection) {
        return addAll(this.f13746b.size(), collection);
    }

    /* renamed from: b */
    public C5252z.C5263j mo25861b(int i) {
        if (i >= this.f13746b.size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f13746b);
            return new C5135e0((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    public List<?> mo25876c() {
        return Collections.unmodifiableList(this.f13746b);
    }

    public void clear() {
        mo25844e();
        this.f13746b.clear();
        this.modCount++;
    }

    public Object get(int i) {
        String str;
        Object obj = this.f13746b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C5151i) {
            C5151i iVar = (C5151i) obj;
            str = iVar.mo25993i();
            if (iVar.mo25987e()) {
                this.f13746b.set(i, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, C5252z.f13963a);
            if (C5219s1.m16301a(bArr)) {
                this.f13746b.set(i, str);
            }
        }
        return str;
    }

    public Object remove(int i) {
        mo25844e();
        Object remove = this.f13746b.remove(i);
        this.modCount++;
        return m15570a(remove);
    }

    public Object set(int i, Object obj) {
        mo25844e();
        return m15570a(this.f13746b.set(i, (String) obj));
    }

    public int size() {
        return this.f13746b.size();
    }

    public C5135e0(ArrayList<Object> arrayList) {
        this.f13746b = arrayList;
    }

    /* renamed from: a */
    public void mo25874a(C5151i iVar) {
        mo25844e();
        this.f13746b.add(iVar);
        this.modCount++;
    }

    public boolean addAll(int i, Collection<? extends String> collection) {
        mo25844e();
        if (collection instanceof C5140f0) {
            collection = ((C5140f0) collection).mo25876c();
        }
        boolean addAll = this.f13746b.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    /* renamed from: a */
    public Object mo25873a(int i) {
        return this.f13746b.get(i);
    }

    /* renamed from: a */
    public static String m15570a(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C5151i) {
            return ((C5151i) obj).mo25993i();
        }
        return new String((byte[]) obj, C5252z.f13963a);
    }
}

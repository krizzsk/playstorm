package com.fyber.inneractive.sdk.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.fyber.inneractive.sdk.protobuf.p1 */
public class C5202p1 extends AbstractList<String> implements C5140f0, RandomAccess {

    /* renamed from: a */
    public final C5140f0 f13854a;

    /* renamed from: com.fyber.inneractive.sdk.protobuf.p1$a */
    public class C5203a implements ListIterator<String> {

        /* renamed from: a */
        public ListIterator<String> f13855a;

        public C5203a(C5202p1 p1Var, int i) {
            this.f13855a = p1Var.f13854a.listIterator(i);
        }

        public void add(Object obj) {
            String str = (String) obj;
            throw new UnsupportedOperationException();
        }

        public boolean hasNext() {
            return this.f13855a.hasNext();
        }

        public boolean hasPrevious() {
            return this.f13855a.hasPrevious();
        }

        public Object next() {
            return this.f13855a.next();
        }

        public int nextIndex() {
            return this.f13855a.nextIndex();
        }

        public Object previous() {
            return this.f13855a.previous();
        }

        public int previousIndex() {
            return this.f13855a.previousIndex();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public void set(Object obj) {
            String str = (String) obj;
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.p1$b */
    public class C5204b implements Iterator<String> {

        /* renamed from: a */
        public Iterator<String> f13856a;

        public C5204b(C5202p1 p1Var) {
            this.f13856a = p1Var.f13854a.iterator();
        }

        public boolean hasNext() {
            return this.f13856a.hasNext();
        }

        public Object next() {
            return this.f13856a.next();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C5202p1(C5140f0 f0Var) {
        this.f13854a = f0Var;
    }

    /* renamed from: a */
    public C5140f0 mo25872a() {
        return this;
    }

    /* renamed from: c */
    public List<?> mo25876c() {
        return this.f13854a.mo25876c();
    }

    public Object get(int i) {
        return (String) this.f13854a.get(i);
    }

    public Iterator<String> iterator() {
        return new C5204b(this);
    }

    public ListIterator<String> listIterator(int i) {
        return new C5203a(this, i);
    }

    public int size() {
        return this.f13854a.size();
    }

    /* renamed from: a */
    public Object mo25873a(int i) {
        return this.f13854a.mo25873a(i);
    }

    /* renamed from: a */
    public void mo25874a(C5151i iVar) {
        throw new UnsupportedOperationException();
    }
}

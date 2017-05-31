package name.alatushkin.shared.tuple;


public class T2<L, R> {
    public final L l;
    public final R r;

    public T2(L l, R r) {
        this.l = l;
        this.r = r;
    }

    public static <L, R> T2<L, R> T2(L l, R r) {
        return new T2<L, R>(l, r);
    }

    public T2<R, L> reverse() {
        return T2(r, l);
    }

    public T2<L, R> setL(L newL) {
        return T2(newL, r);
    }

    public T2<L, R> setR(R newR) {
        return T2(l, newR);
    }

    public <M> T3<L, R, M> append(M m) {
        return T3.T3(l, r, m);
    }

    public <M> T3<M, L, R> prepend(M m) {
        return T3.T3(m, l, r);
    }

    public <M> T3<L, M, R> insert(M m) {
        return T3.T3(l, m, r);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        T2<?, ?> t2 = (T2<?, ?>) o;

        if (l != null ? !l.equals(t2.l) : t2.l != null) return false;
        return !(r != null ? !r.equals(t2.r) : t2.r != null);

    }

    @Override
    public int hashCode() {
        int result = l != null ? l.hashCode() : 0;
        result = 31 * result + (r != null ? r.hashCode() : 0);
        return result;
    }
}

package name.alatushkin.shared.tuple;


public class T3<L, M, R> {
    public final L l;
    public final M m;
    public final R r;

    public T3(L l, M m, R r) {
        this.l = l;
        this.m = m;
        this.r = r;
    }

    public static <L, M, R> T3<L, M, R> T3(L l, M m, R r) {
        return new T3<L, M, R>(l, m, r);
    }

    public T3<R, M, L> rev() {
        return T3(r, m, l);
    }

    public T3<R, L, M> shiftR() {
        return T3(r, l, m);
    }

    public T3<M, R, L> shiftL() {
        return T3(m, r, l);
    }

    public T2<L, M> begin() {
        return T2.T2(l, m);
    }

    public T2<M, R> end() {
        return T2.T2(m, r);
    }

    public T3<L, M, R> setL(L newL) {
        return T3(newL, m, r);
    }

    public T3<L, M, R> setM(M newM) {
        return T3(l, newM, r);
    }

    public T3<L, M, R> setR(R newR) {
        return T3(l, m, r);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        T3<?, ?, ?> t3 = (T3<?, ?, ?>) o;

        if (l != null ? !l.equals(t3.l) : t3.l != null) return false;
        if (m != null ? !m.equals(t3.m) : t3.m != null) return false;
        return !(r != null ? !r.equals(t3.r) : t3.r != null);

    }

    @Override
    public int hashCode() {
        int result = l != null ? l.hashCode() : 0;
        result = 31 * result + (m != null ? m.hashCode() : 0);
        result = 31 * result + (r != null ? r.hashCode() : 0);
        return result;
    }
}

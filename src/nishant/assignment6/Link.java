package nishant.assignment6;

public class Link<T> {

    T data;
    Link next;
    public Link(T n) {
        data = n;
        next = null;
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }
}

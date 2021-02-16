package stack;

public interface Stack<T> {
    public void flip();
    public T replaceTop(T x);
    public T top();
}
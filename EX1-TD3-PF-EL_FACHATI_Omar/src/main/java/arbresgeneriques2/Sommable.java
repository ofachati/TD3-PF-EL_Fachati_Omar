package arbresgeneriques2;

public interface Sommable<T> {
    T sommer(final T autre);
    T zero();
}
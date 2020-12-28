package lesson24.functional;

@FunctionalInterface
public interface ConsumerInterface<T> {
    void accept(T t);
}

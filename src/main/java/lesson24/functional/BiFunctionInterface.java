package lesson24.functional;

@FunctionalInterface
public interface BiFunctionInterface<T, U, R> {
    R apply(T t, U u);
}

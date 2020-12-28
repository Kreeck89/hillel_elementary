package lesson24.functional;

@FunctionalInterface
public interface FunctionInterface<T, U> {
    U apply(T t);
}

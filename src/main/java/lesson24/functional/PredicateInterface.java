package lesson24.functional;

@FunctionalInterface
public interface PredicateInterface<T> {
    boolean test(T t);
}

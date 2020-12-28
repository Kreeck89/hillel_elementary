package lesson24.functional;

@FunctionalInterface
public interface SupplierInterface<T> {
    T get();
}

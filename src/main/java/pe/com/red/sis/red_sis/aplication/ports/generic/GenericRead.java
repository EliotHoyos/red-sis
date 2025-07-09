package pe.com.red.sis.red_sis.aplication.ports.generic;

public interface GenericRead<T> {
    T getDomain(Long id);
}

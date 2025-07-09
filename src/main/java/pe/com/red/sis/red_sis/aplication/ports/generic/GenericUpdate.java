package pe.com.red.sis.red_sis.aplication.ports.generic;

public interface GenericUpdate<R>{
    void update(R request, Long id);
}

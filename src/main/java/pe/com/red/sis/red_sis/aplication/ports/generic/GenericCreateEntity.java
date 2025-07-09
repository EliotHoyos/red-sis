package pe.com.red.sis.red_sis.aplication.ports.generic;

public interface GenericCreateEntity<R>{
    Object saveEntity(R request);
}

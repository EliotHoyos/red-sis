package pe.com.red.sis.red_sis.aplication.ports.generic;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface GenericPaginate<T>{
    Page<T> getPagination(String search, Pageable pageable);
}

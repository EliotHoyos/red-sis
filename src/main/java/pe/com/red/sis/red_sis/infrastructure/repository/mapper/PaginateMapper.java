package pe.com.red.sis.red_sis.infrastructure.repository.mapper;


import org.mapstruct.Mapper;
import org.springframework.data.domain.Page;
import pe.com.red.sis.red_sis.domian.models.response.Paginate;

@Mapper(componentModel = "spring")
public interface PaginateMapper {

    default Paginate toPaginate(Page<?> page) {
        return Paginate.builder()
                .currentPage(page.getNumber())
                .totalPages(page.getTotalPages())
                .totalElements(page.getTotalElements())
                .build();
    }

}

package pe.com.red.sis.red_sis.domian.models.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Builder
public class Paginate {

    private int currentPage;
    private long totalPages;
    private long totalElements;

}

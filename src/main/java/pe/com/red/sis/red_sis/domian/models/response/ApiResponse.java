package pe.com.red.sis.red_sis.domian.models.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiResponse<T> {

    @JsonProperty("data")
    private T data;

    @JsonProperty("paginate")
    private Object paginate;

    @JsonProperty("errors")
    private Object errors;

    public ApiResponse(T data){
        this.data = data;
    }

    public ApiResponse(T data, Object paginate){
        this.data = data;
        this.paginate = paginate;

    }

    public ApiResponse(T data, Object paginate, Object errors){
        this.data = data;
        this.paginate = paginate;
        this.errors = errors;
    }

    public ApiResponse(T data, Paginate paginate){
        this.data = data;
        this.paginate = paginate;

    }

    public ApiResponse(Paginate paginate){
        this.paginate = paginate;
    }

}

package pe.com.red.sis.red_sis.domian.models.response;

import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ApiResponse<T> {
    private T data;
    private Paginate paginate;
    private List<String> errors;

    public static <T> ApiResponse<T> of(T data) {
        return ApiResponse.<T>builder().data(data).build();
    }

    public static <T> ApiResponse<T> of(T data, Paginate paginate) {
        return ApiResponse.<T>builder().data(data).paginate(paginate).build();
    }

    public static <T> ApiResponse<T> error(List<String> errors) {
        return ApiResponse.<T>builder().errors(errors).build();
    }
}
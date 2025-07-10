package pe.com.red.sis.red_sis.domian.models.response;

import lombok.Getter;
import lombok.Builder;

import java.time.Instant;

@Getter
@Builder
public class ApiResponse<T> {
    private final boolean success;
    private final Instant timestamp;
    private final T        data;

    public static <T> ApiResponse<T> of(T data) {
        return ApiResponse.<T>builder()
                .success(true)
                .timestamp(Instant.now())
                .data(data)
                .build();
    }

    public static <T> ApiResponse<T> ofError(T error) {
        return ApiResponse.<T>builder()
                .success(false)
                .timestamp(Instant.now())
                .data(error)
                .build();
    }
}
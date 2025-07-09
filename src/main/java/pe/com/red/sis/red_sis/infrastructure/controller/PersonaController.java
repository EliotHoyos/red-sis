package pe.com.red.sis.red_sis.infrastructure.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pe.com.red.sis.red_sis.aplication.ports.input.PersonaUseCase;
import pe.com.red.sis.red_sis.domian.models.response.ApiResponse;
import pe.com.red.sis.red_sis.domian.models.response.Paginate;
import pe.com.red.sis.red_sis.domian.models.response.PersonaResponse;

import java.util.List;

@RestController
@RequestMapping("/api/personas")
@RequiredArgsConstructor
public class PersonaController {

    private final PersonaUseCase personaUseCase;

    @GetMapping
    public ApiResponse<List<PersonaResponse>> listAll() {
        List<PersonaResponse> data = personaUseCase.getList();
        return ApiResponse.of(data);
    }

    @GetMapping("/paginate")
    public ApiResponse<List<PersonaResponse>> paginate(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size
    ) {
        Pageable pageable = PageRequest.of(page, size);
        Paginate meta = (Paginate) personaUseCase.getPagination("", pageable);
        List<PersonaResponse> data = personaUseCase.getList();
        return ApiResponse.of(data, meta);
    }

}

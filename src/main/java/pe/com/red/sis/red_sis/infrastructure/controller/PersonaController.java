package pe.com.red.sis.red_sis.infrastructure.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
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

    @GetMapping("/paginate")
    public ResponseEntity<ApiResponse<Page<PersonaResponse>>> paginate(
            @RequestParam(defaultValue = "") String search,
            Pageable pageable) {
        Page<PersonaResponse> page = personaUseCase.getPagination(search, pageable);
        return ResponseEntity.ok(ApiResponse.of(page));
    }

}

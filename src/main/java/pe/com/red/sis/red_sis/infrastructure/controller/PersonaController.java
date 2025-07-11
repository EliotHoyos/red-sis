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
import pe.com.red.sis.red_sis.domian.models.response.PersonaResponse;

import java.util.List;

@RestController
@RequestMapping("/api/personas")
@RequiredArgsConstructor
public class PersonaController {

    private final PersonaUseCase personaUseCase;

    @GetMapping
    public ResponseEntity<ApiResponse<List<PersonaResponse>>> listPersonas() {
        List<PersonaResponse> page = personaUseCase.getList();
        return ResponseEntity.ok(ApiResponse.of(page));
    }

    @GetMapping("/paginated")
    public ResponseEntity<ApiResponse<Page<PersonaResponse>>> listPersonasPaginated(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(required = false) String search) {
        
        Pageable pageable = PageRequest.of(page, size);
        Page<PersonaResponse> result = personaUseCase.getPagination(search, pageable);
        return ResponseEntity.ok(ApiResponse.of(result));
    }

}

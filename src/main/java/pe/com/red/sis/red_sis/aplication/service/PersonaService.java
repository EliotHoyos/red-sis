package pe.com.red.sis.red_sis.aplication.service;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import pe.com.red.sis.red_sis.aplication.ports.input.PersonaUseCase;
import pe.com.red.sis.red_sis.aplication.ports.output.PersonaRepositoryPort;
import pe.com.red.sis.red_sis.domian.models.response.PersonaResponse;

import java.util.List;

@RequiredArgsConstructor
public class PersonaService implements PersonaUseCase {

    private final PersonaRepositoryPort personaRepositoryPort;

    @Override
    public List<PersonaResponse> getList() {
        return personaRepositoryPort.getList();
    }

    @Override
    public Page<PersonaResponse> getPagination(String search, Pageable pageable) {
        return personaRepositoryPort.getPagination(search, pageable);
    }
}

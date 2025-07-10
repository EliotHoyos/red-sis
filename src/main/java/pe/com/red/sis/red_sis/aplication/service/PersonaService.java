package pe.com.red.sis.red_sis.aplication.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import pe.com.red.sis.red_sis.aplication.ports.input.PersonaUseCase;
import pe.com.red.sis.red_sis.aplication.ports.output.PersonaRepositoryPort;
import pe.com.red.sis.red_sis.domian.models.response.PersonaResponse;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonaService implements PersonaUseCase {

    private final PersonaRepositoryPort repository;

    @Override
    public List<PersonaResponse> getList() {
        return repository.getList();
    }

    @Override
    public Page<PersonaResponse> getPagination(String search, Pageable pageable) {
        return repository.getPagination(search, pageable);
    }
}

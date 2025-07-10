package pe.com.red.sis.red_sis.infrastructure.repository.adapter;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import pe.com.red.sis.red_sis.aplication.ports.output.PersonaRepositoryPort;
import pe.com.red.sis.red_sis.domian.models.response.PersonaResponse;
import pe.com.red.sis.red_sis.infrastructure.repository.entities.PersonaEntity;
import pe.com.red.sis.red_sis.infrastructure.repository.jpa.PersonaJpaRepository;
import pe.com.red.sis.red_sis.infrastructure.repository.mapper.PaginateMapper;
import pe.com.red.sis.red_sis.infrastructure.repository.mapper.PersonaMapper;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class PersonaRepositoryAdapter implements PersonaRepositoryPort {

    private final PersonaJpaRepository personaJpaRepository;
    private final PersonaMapper personaMapper;
    private final PaginateMapper paginateMapper;


    @Override
    public List<PersonaResponse> getList() {
        return personaJpaRepository.findAll().stream()
                .map(personaMapper::toResponse)
                .collect(Collectors.toList());
    }

    @Override
    public Page<PersonaResponse> getPagination(String search, Pageable pageable) {
        return personaJpaRepository
                .findAll(pageable)
                .map(personaMapper::toResponse);
    }
}

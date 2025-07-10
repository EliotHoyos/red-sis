package pe.com.red.sis.red_sis.infrastructure.repository.adapter;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import pe.com.red.sis.red_sis.aplication.ports.output.PersonaRepositoryPort;
import pe.com.red.sis.red_sis.domian.models.response.Paginate;
import pe.com.red.sis.red_sis.domian.models.response.PersonaResponse;
import pe.com.red.sis.red_sis.infrastructure.repository.entities.PersonaEntity;
import pe.com.red.sis.red_sis.infrastructure.repository.jpa.PersonaJpaRepository;
import pe.com.red.sis.red_sis.infrastructure.repository.mapper.PaginateMapper;
import pe.com.red.sis.red_sis.infrastructure.repository.mapper.PersonaMapper;

import java.util.List;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
public class PersonaRepositoryAdapter implements PersonaRepositoryPort {

    private final PersonaJpaRepository jpaRepository;
    private final PersonaMapper mapper;


    @Override
    public List<PersonaResponse> getList() {
        return jpaRepository.findAll().stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public Page<PersonaResponse> getPagination(String search, Pageable pageable) {
        Page<PersonaEntity> page = jpaRepository.findByNombreContainingIgnoreCase(search, pageable);
        return page.map(mapper::toDto);
    }
}

package pe.com.red.sis.red_sis.aplication.service;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import pe.com.red.sis.red_sis.aplication.ports.input.PersonaUseCase;
import pe.com.red.sis.red_sis.aplication.ports.output.PersonaRepositoryPort;
import pe.com.red.sis.red_sis.domian.models.request.PersonaRequest;
import pe.com.red.sis.red_sis.domian.models.response.PersonaResponse;

import java.util.List;

@AllArgsConstructor
@RequiredArgsConstructor
public class PersonaService implements PersonaUseCase {

    private final PersonaRepositoryPort personaRepositoryPort;


    @Override
    public void save(PersonaRequest request) {
        personaRepositoryPort.save(request);
    }

    @Override
    public void delete(Long id) {
        personaRepositoryPort.delete(id);
    }

    @Override
    public List<PersonaRequest> getList() {
        return personaRepositoryPort.getList();
    }

    @Override
    public Page<PersonaRequest> getPagination(String search, Pageable pageable) {
        return personaRepositoryPort.getPagination(search, pageable);
    }

    @Override
    public PersonaRequest getDomain(Long id) {
        return personaRepositoryPort.getDomain(id);
    }

    @Override
    public void update(PersonaRequest request, Long id) {
        personaRepositoryPort.update(request, id);
    }
}

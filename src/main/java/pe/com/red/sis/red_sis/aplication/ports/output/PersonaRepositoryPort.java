package pe.com.red.sis.red_sis.aplication.ports.output;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import pe.com.red.sis.red_sis.aplication.ports.generic.GenericList;
import pe.com.red.sis.red_sis.aplication.ports.generic.GenericPaginate;
import pe.com.red.sis.red_sis.domian.models.response.PersonaResponse;

@Component
@Repository
public interface PersonaRepositoryPort
        extends GenericList<PersonaResponse>, GenericPaginate<PersonaResponse> {}

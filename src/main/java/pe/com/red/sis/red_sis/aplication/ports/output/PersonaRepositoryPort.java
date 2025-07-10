package pe.com.red.sis.red_sis.aplication.ports.output;

import pe.com.red.sis.red_sis.aplication.ports.generic.GenericList;
import pe.com.red.sis.red_sis.aplication.ports.generic.GenericPaginate;
import pe.com.red.sis.red_sis.domian.models.response.PersonaResponse;


public interface PersonaRepositoryPort
        extends GenericList<PersonaResponse>, GenericPaginate<PersonaResponse> {}

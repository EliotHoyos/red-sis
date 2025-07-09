package pe.com.red.sis.red_sis.aplication.ports.input;

import pe.com.red.sis.red_sis.aplication.ports.generic.GenericList;
import pe.com.red.sis.red_sis.aplication.ports.generic.GenericPaginate;
import pe.com.red.sis.red_sis.domian.models.response.PersonaResponse;

public interface PersonaUseCase
        extends GenericList<PersonaResponse>, GenericPaginate<PersonaResponse> {}

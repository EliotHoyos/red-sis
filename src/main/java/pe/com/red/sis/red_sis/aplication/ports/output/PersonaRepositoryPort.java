package pe.com.red.sis.red_sis.aplication.ports.output;

import pe.com.red.sis.red_sis.aplication.ports.generic.GenericCreate;
import pe.com.red.sis.red_sis.aplication.ports.generic.GenericDelete;
import pe.com.red.sis.red_sis.aplication.ports.generic.GenericList;
import pe.com.red.sis.red_sis.aplication.ports.generic.GenericPaginate;
import pe.com.red.sis.red_sis.aplication.ports.generic.GenericRead;
import pe.com.red.sis.red_sis.aplication.ports.generic.GenericUpdate;
import pe.com.red.sis.red_sis.domian.models.request.PersonaRequest;

public interface PersonaRepositoryPort
    extends GenericCreate<PersonaRequest>,
        GenericRead<PersonaRequest>,
        GenericUpdate<PersonaRequest>,
        GenericDelete,
        GenericPaginate<PersonaRequest>,
        GenericList<PersonaRequest> {}

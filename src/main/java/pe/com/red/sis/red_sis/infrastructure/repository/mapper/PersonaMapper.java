package pe.com.red.sis.red_sis.infrastructure.repository.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import pe.com.red.sis.red_sis.domian.models.response.PersonaResponse;
import pe.com.red.sis.red_sis.infrastructure.repository.entities.PersonaEntity;


@Mapper(componentModel = "spring")
public interface PersonaMapper {

    @Mapping(source = "fechaNacimientoPersona", target = "fechaNacimientoPersona")
    PersonaResponse toResponse(PersonaEntity entity);

}

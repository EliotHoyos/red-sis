package pe.com.red.sis.red_sis.infrastructure.repository.mapper;

import org.mapstruct.Mapper;
import pe.com.red.sis.red_sis.domian.models.request.PersonaRequest;
import pe.com.red.sis.red_sis.domian.models.response.PersonaResponse;
import pe.com.red.sis.red_sis.infrastructure.repository.entities.PersonaEntity;


@Mapper(componentModel = "spring")
public interface PersonaMapper {

    PersonaResponse toDto(PersonaEntity entity);
    PersonaEntity   toEntity(PersonaRequest dto);

}

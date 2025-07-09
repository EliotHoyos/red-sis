package pe.com.red.sis.red_sis.domian.models.response;

import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;


@SuperBuilder
@Getter
@ToString
public class PersonaResponse {

    private String idPersona;
    private Integer idTipoDocumentoPersona;
    private String numeroDocumentoPersona;
    private String nombresPersona;
    private String apellidoPaternoPersona;
    private String apellidoMaternoPersona;
    private String fechaNacimientoPersona;

}

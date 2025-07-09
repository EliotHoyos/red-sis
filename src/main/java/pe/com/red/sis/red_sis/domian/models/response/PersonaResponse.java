package pe.com.red.sis.red_sis.domian.models.response;

import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;


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
    private LocalDate fechaNacimientoPersona;

}

package pe.com.red.sis.red_sis.domian.models.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serial;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Getter
@ToString
public class PersonaRequest implements Serializable {

    @Serial private static final long serialVersionUID = 1L;

    private String idPersona;
    private Integer idTipoDocumentoPersona;
    private String numeroDocumentoPersona;
    private String nombresPersona;
    private String apellidoPaternoPersona;
    private String apellidoMaternoPersona;
    private String fechaNacimientoPersona;

}

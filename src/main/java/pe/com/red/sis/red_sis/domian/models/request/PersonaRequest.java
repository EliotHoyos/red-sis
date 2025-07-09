package pe.com.red.sis.red_sis.domian.models.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

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
    @NotNull(message = "El nombre de la persona no debe estar en blanco")
    private String nombresPersona;
    @NotNull(message = "El apellido paterno de la persona no debe estar en blanco")
    private String apellidoPaternoPersona;
    @NotNull(message = "El apellido materno de la persona no debe estar en blanco")
    private String apellidoMaternoPersona;
    @NotNull
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaNacimientoPersona;

}

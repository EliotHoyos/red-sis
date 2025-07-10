package pe.com.red.sis.red_sis.infrastructure.repository.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "api_persona", schema = "dbo")
public class PersonaEntity {

    @Id
    @Column(name = "Id_Persona", length = 13)
    private String idPersona;  // PK: varchar(13)

    @Column(name = "Id_Tipo_Documento_Persona")
    private Integer idTipoDocumentoPersona;

    @Column(name = "Numero_Documento_Persona", length = 12)
    private String numeroDocumentoPersona;

    @Column(name = "Nombres_Persona", length = 100)
    private String nombresPersona;

    @Column(name = "Apellido_Paterno_Persona", length = 100)
    private String apellidoPaternoPersona;

    @Column(name = "Apellido_Materno_Persona", length = 100)
    private String apellidoMaternoPersona;

    @Column(name = "Fecha_Nacimiento_Persona")
    private LocalDate fechaNacimientoPersona;

}
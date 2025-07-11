package pe.com.red.sis.red_sis.infrastructure.repository.jpa;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.com.red.sis.red_sis.infrastructure.repository.entities.PersonaEntity;

import java.util.List;

@Repository
public interface PersonaJpaRepository extends JpaRepository<PersonaEntity, String> {
    
    @Query(value = "SELECT TOP 1000 * FROM dbo.ApiPersona ORDER BY Id_Persona", nativeQuery = true)
    List<PersonaEntity> findTop100();
    
    @Query(value = "SELECT * FROM dbo.ApiPersona WHERE " +
            "(:search IS NULL OR " +
            "Id_Persona LIKE %:search% OR " +
            "Nombres_Persona LIKE %:search% OR " +
            "Apellido_Paterno_Persona LIKE %:search% OR " +
            "Apellido_Materno_Persona LIKE %:search% OR " +
            "Numero_Documento_Persona LIKE %:search%) " +
            "ORDER BY Id_Persona", 
            countQuery = "SELECT COUNT(*) FROM dbo.ApiPersona WHERE " +
            "(:search IS NULL OR " +
            "Id_Persona LIKE %:search% OR " +
            "Nombres_Persona LIKE %:search% OR " +
            "Apellido_Paterno_Persona LIKE %:search% OR " +
            "Apellido_Materno_Persona LIKE %:search% OR " +
            "Numero_Documento_Persona LIKE %:search%)",
            nativeQuery = true)
    Page<PersonaEntity> findAllWithPagination(@Param("search") String search, Pageable pageable);
}

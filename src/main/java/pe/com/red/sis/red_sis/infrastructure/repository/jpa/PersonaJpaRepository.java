package pe.com.red.sis.red_sis.infrastructure.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.com.red.sis.red_sis.infrastructure.repository.entities.PersonaEntity;

@Repository
public interface PersonaJpaRepository extends JpaRepository<PersonaEntity, String> {

}

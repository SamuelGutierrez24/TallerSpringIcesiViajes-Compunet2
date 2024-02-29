package co.edu.icesi.viajes.icesiviajes.repository;

import co.edu.icesi.viajes.icesiviajes.domain.DetallePlan;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetallePlanRepository extends JpaRepository<DetallePlan, Integer> {

}

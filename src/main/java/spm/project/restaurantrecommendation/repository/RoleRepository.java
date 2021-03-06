package spm.project.restaurantrecommendation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spm.project.restaurantrecommendation.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{
}

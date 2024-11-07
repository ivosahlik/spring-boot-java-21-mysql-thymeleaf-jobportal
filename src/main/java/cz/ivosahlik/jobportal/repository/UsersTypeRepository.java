package cz.ivosahlik.jobportal.repository;

import cz.ivosahlik.jobportal.entity.UsersType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersTypeRepository extends JpaRepository<UsersType, Integer> {
}

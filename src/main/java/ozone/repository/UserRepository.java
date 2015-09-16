package ozone.repository;

import org.springframework.data.repository.CrudRepository;
import ozone.domain.User;

/**
 *
 * @author DAMONSLU
 */
public interface UserRepository extends CrudRepository<User,Long> {
}
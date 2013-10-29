package de.gridsolut.spring.test.repository;

import de.gridsolut.spring.test.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created with IntelliJ IDEA.
 * User: ungerts
 * Date: 29.10.13
 * Time: 11:26
 * To change this template use File | Settings | File Templates.
 */
public interface UserCrudRepository extends CrudRepository<User, String> {
}

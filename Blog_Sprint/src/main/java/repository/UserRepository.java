package repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import user.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

	
}


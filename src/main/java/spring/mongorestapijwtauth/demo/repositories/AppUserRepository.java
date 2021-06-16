package spring.mongorestapijwtauth.demo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import spring.mongorestapijwtauth.demo.entities.AppUser;
import spring.mongorestapijwtauth.demo.entities.Gender;


@Repository
public interface AppUserRepository extends MongoRepository<AppUser, String> {

    Optional<AppUser> findAppUserByUname(String uname);

}

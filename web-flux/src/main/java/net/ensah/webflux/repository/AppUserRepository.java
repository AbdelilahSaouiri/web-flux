package net.ensah.webflux.repository;

import net.ensah.webflux.entity.AppUser;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepository extends ReactiveCrudRepository<AppUser,String> {
}

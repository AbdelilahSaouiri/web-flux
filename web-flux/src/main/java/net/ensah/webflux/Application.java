package net.ensah.webflux;

import net.ensah.webflux.entity.AppUser;
import net.ensah.webflux.repository.AppUserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(AppUserRepository userRepository) {
        return args -> {
            AppUser user1 = AppUser.builder()
                    .userId(UUID.randomUUID().toString())
                    .firstName("abdelilah")
                    .lastName("saouir")
                    .email("abdelilah@gmail.com")
                    .password("1234")
                    .build();
            AppUser user2 = AppUser.builder()
                    .userId(UUID.randomUUID().toString())
                    .firstName("mohamed")
                    .lastName("khan")
                    .email("mohamed@gmail.com")
                    .password("1234")
                    .build();

            userRepository.save(user1).doOnTerminate(() -> System.out.println("User 1 saved"))
                    .then(userRepository.save(user2).doOnTerminate(() -> System.out.println("User 2 saved")))
                    .subscribe();
        };
    }

}

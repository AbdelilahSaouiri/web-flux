package net.ensah.webflux.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("users")
@AllArgsConstructor @NoArgsConstructor @Getter @Setter @Builder
public class AppUser {
    @Id
    private Long id;
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}

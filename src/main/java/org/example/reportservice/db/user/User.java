package org.example.reportservice.db.user;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
@Entity(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "userSeq")
    private long id;
    @Setter
    private String username;
    @Setter
    private String password;
    @Setter
    private String role;
//    @Setter
//    private Document[] documents;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        role = "user";
    }

    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }
}

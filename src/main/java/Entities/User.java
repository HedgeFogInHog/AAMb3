package Entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Entity
@Data
@Table(name = "user")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Login")
    private String Login;
    @Column(name = "Password")
    private String Password;

    public User(String login, String password) {
        Login = login;
        Password = password;
    }
}

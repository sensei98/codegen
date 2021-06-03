package io.swagger.model;

import lombok.*;
import lombok.extern.java.Log;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@Table(name = "DB_USER")
public class dbUser {
    @Id
    @GeneratedValue
    private long id;
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String phone;
    private String password;

    public dbUser(String firstName, String lastName, String username, String email, String phone, String password, List<UserRole> roles, double transactionLimit) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.roles = roles;
        this.transactionLimit = transactionLimit;
    }

    @ElementCollection(fetch = FetchType.EAGER)
    List<UserRole> roles;
    private double transactionLimit;


    @OneToMany(cascade = CascadeType.ALL,mappedBy="user")
    private Set<dbAccount> accounts = new HashSet<>();


}

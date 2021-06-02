package io.swagger.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@Table(name="Account")
public class dbAccount {
    @Id
    @GeneratedValue
    private long id;
    @ElementCollection(fetch = FetchType.EAGER)
    private List<AccountType> accountTypes;
    private double balance;
    private String iban;

//    //TODO
//    @ManyToOne
//    private dbUser user;

}
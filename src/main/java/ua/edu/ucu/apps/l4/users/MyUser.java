package ua.edu.ucu.apps.l4.users;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;


@Entity
@Table
@NoArgsConstructor
@Getter
@Setter
public class MyUser {
    @Id
    @GeneratedValue
    private int id;
    private String email;
    private LocalDate dob;
    @Transient
    private int age;
    public int getAge(){
        return Period.between(dob, LocalDate.now()).getYears();
    }


}

package com.springboot_practice.restfulwebservice.User;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "table1")
@NoArgsConstructor
public class User {
    @Id
    @Getter
    private int id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    @Column(name = "weird")
    private String custom;
}

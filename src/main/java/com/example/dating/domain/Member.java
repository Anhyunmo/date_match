package com.example.dating.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private String phone;

    @Column
    @Enumerated(EnumType.STRING)
    private Gender gender;

    enum Gender{
        Man,
        Woman
    }

    @Column(length = 3)
    private int age;

    @Column(length = 3)
    private int tall;

    @Column
    private String img;

    @Column
    private String description;

}

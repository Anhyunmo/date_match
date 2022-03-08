package com.example.dating.domain;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler"})
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
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

    @Column(length = 3)
    private int age;

    @Column(length = 3)
    private int tall;

    @Column
    private String img;

    @Column
    private String description;

    @OneToMany(mappedBy = "member", cascade = CascadeType.REMOVE)
    private List<Search> searches;

//    @OneToMany(mappedBy = "fromMember")
//    private List<Match> matches;

    enum Gender{
        Man,
        Woman
    }


//    @OneToMany(fetch = FetchType.EAGER, mappedBy = "fromMember")
//    private List<Match> match;
//
//    @OneToMany(fetch = FetchType.EAGER, mappedBy = "toMember")
//    private List<Match> matches;

}

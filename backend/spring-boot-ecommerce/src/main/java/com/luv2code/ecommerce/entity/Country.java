package com.luv2code.ecommerce.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="country")
@Getter
@Setter
public class Country {

    // GenereatedValue: provides the specification of generatoin strategies for the primary keys
    // IDENTITY: In this case database is responsible for determining and assigning the next primary key.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="code")
    private String code;

    @Column(name="name")
    private String name;

    // the value of mappedBy is the name of the association-mapping attribute on the owning side
    @OneToMany(mappedBy = "country")
    @JsonIgnore
    private List<State> states;
}

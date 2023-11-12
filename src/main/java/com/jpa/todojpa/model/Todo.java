package com.jpa.todojpa.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "todojpa")
public class Todo {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    private String todoname;

    private String todoCategory;

    @ManyToOne
    @JoinColumn(name = "userId",referencedColumnName = "id")
    private AppUser appUser;

}

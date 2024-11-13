package com.shyloostyle.userservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Customer {
    @Id
    @Column(name = "ID")
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String about;
    @Transient
    private List<Ratings> ratings = new ArrayList<>();
}

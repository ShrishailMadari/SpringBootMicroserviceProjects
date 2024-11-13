package com.shyloostyle.HotelService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Hotel {
    @Id
    private String id;
    private String name;
    private String location;
    private String about;
}

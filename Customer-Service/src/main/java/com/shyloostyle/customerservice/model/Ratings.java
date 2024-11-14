package com.shyloostyle.customerservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Ratings {
    @Id
    private String ratingId;
    private String customerId;
    private int rating;
    private String review;
}

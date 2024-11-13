package com.shyloostyle.ratings.model;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document("ratings_reviews")
public class Ratings {
    @Id
    private String ratingId;
    private String hotelId;
    private String customerId;
    private int rating;
    private String review;
}

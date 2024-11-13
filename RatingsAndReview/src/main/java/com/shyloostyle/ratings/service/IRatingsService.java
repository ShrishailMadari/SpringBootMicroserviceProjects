package com.shyloostyle.ratings.service;

import com.shyloostyle.ratings.model.Ratings;

import java.util.List;

public interface IRatingsService {
    // create Ratings
    Ratings createRatings(Ratings ratings);
    //get All Ratings
    List<Ratings> getAllRatings();
    //get All by CustomerId Ratings
    List<Ratings> getAllRatingsByCustomerId(String id);
    //get all by hotel
    List<Ratings> getRatingsByHotelId(String id);


}

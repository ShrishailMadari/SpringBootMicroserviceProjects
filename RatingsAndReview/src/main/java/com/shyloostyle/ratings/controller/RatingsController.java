package com.shyloostyle.ratings.controller;

import com.shyloostyle.ratings.model.Ratings;
import com.shyloostyle.ratings.service.IRatingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ratings")
public class RatingsController {
    @Autowired
    IRatingsService ratingsService;

    @PostMapping
    public ResponseEntity<Ratings> createRatings(@RequestBody Ratings ratings){
        Ratings createdRatings = ratingsService.createRatings(ratings);
        if (createdRatings != null){
            return new ResponseEntity<>(createdRatings, HttpStatus.CREATED);
        }else
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/allRatings")
    public ResponseEntity<List<Ratings>> getAllRatings(){
        List<Ratings> allRatings = ratingsService.getAllRatings();
        if (allRatings != null){
            return new ResponseEntity<>(allRatings,HttpStatus.OK);
        }else
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/customer/{customerId}")
    public ResponseEntity<List<Ratings>> ratingByCustomerId(@PathVariable String customerId){
        List<Ratings> allRatingsByCustomerId = ratingsService.getAllRatingsByCustomerId(customerId);
        if (allRatingsByCustomerId != null){
            return new ResponseEntity<>(allRatingsByCustomerId,HttpStatus.OK);
        }else
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<Ratings>> getAllRatingsByHotelId(@PathVariable String hotelId){
        List<Ratings> ratingsByHotelId = ratingsService.getRatingsByHotelId(hotelId);
        if (ratingsByHotelId != null){
            return new ResponseEntity<>(ratingsByHotelId,HttpStatus.OK);
        }else
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }


}

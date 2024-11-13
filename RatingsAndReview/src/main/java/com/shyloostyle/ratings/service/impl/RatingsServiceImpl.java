package com.shyloostyle.ratings.service.impl;

import com.shyloostyle.ratings.model.Ratings;
import com.shyloostyle.ratings.repository.IRatingsRepository;
import com.shyloostyle.ratings.service.IRatingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingsServiceImpl implements IRatingsService {

    @Autowired
    IRatingsRepository ratingsRepository;

    @Override
    public Ratings createRatings(Ratings ratings) {
        if (ratings == null) {
            throw new IllegalArgumentException("Ratings cannot be null");
        }
        return ratingsRepository.save(ratings);
    }


    @Override
    public List<Ratings> getAllRatings() {
        return ratingsRepository.findAll();
    }

    @Override
    public List<Ratings> getAllRatingsByCustomerId(String customerId) {
        if (customerId == null) {
            throw new IllegalArgumentException("id cant be null");
        }
        return ratingsRepository.findByCustomerId(customerId);
    }

    @Override
    public List<Ratings> getRatingsByHotelId(String hotelId) {
        if (hotelId == null) {
            throw new IllegalArgumentException("id cant be null");
        }
        return ratingsRepository.findByHotelId(hotelId);
    }
}

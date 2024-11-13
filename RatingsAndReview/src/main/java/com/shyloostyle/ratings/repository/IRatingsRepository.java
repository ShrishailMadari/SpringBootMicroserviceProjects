package com.shyloostyle.ratings.repository;

import com.shyloostyle.ratings.model.Ratings;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRatingsRepository extends MongoRepository<Ratings,String> {
    //customized methods
    List<Ratings> findByCustomerId(String id);
    List<Ratings> findByHotelId(String id);

}

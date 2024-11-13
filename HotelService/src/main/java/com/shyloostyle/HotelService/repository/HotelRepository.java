package com.shyloostyle.HotelService.repository;

import com.shyloostyle.HotelService.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<Hotel,String> {
}

package com.shyloostyle.HotelService.service;

import com.shyloostyle.HotelService.model.Hotel;

import java.util.List;

public interface IHotelService {
    //create hotel
    Hotel createHotel(Hotel hotel);
    //get hotel
    Hotel getHotelById(String id);
    //get All hotel
    List<Hotel> getAllHotels();
    //update hotel
    void updateHotel();
}

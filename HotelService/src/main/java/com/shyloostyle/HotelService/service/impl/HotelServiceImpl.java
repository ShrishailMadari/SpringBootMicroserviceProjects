package com.shyloostyle.HotelService.service.impl;

import com.shyloostyle.HotelService.exception.ResourceNotFoundException;
import com.shyloostyle.HotelService.model.Hotel;
import com.shyloostyle.HotelService.repository.HotelRepository;
import com.shyloostyle.HotelService.service.IHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements IHotelService {
    @Autowired
    private HotelRepository hotelRepository;
    @Override
    public Hotel createHotel(Hotel hotel) {
            String stringId = UUID.randomUUID().toString();
            hotel.setId(stringId);
            return hotelRepository.save(hotel);

    }

    @Override
    public Hotel getHotelById(String id) {
        return hotelRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("hotel with given id not found"));
    }

    @Override
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }

    @Override
    public void updateHotel() {

    }
}

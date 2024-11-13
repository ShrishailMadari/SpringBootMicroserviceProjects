package com.shyloostyle.HotelService.controller;

import com.shyloostyle.HotelService.model.Hotel;
import com.shyloostyle.HotelService.service.IHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hotel")
public class HotelController {
    @Autowired
    private IHotelService hotelService;

    @PostMapping
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel) {
        Hotel createdHotel = hotelService.createHotel(hotel);
        if (createdHotel != null) {
            return new ResponseEntity<>(createdHotel, HttpStatus.CREATED);
        } else return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Hotel>> getAllHotels(){
        List<Hotel> allHotels = hotelService.getAllHotels();
        if (allHotels != null){
            return new ResponseEntity<>(allHotels,HttpStatus.OK);
        }else
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Hotel> getHotelById(@PathVariable String id){
        Hotel hotelById = hotelService.getHotelById(id);
        if (hotelById != null){
            return new ResponseEntity<>(hotelById,HttpStatus.OK);
        }else
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

}

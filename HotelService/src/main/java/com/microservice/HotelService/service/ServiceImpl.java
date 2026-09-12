package com.microservice.HotelService.service;

import com.microservice.HotelService.entity.Hotel;
import com.microservice.HotelService.exceptions.ResourceNotFoundException;
import com.microservice.HotelService.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.UUID;

@Service
public class ServiceImpl implements HotelService{

    @Autowired
    HotelRepository hotelRepository;

    @Override
    public Hotel saveHotels(Hotel hotel) {
       String randomId = UUID.randomUUID().toString();
       hotel.setHotelId(randomId);
       return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel getHotelById(String hotel_id) {
        return hotelRepository.findById(hotel_id).orElseThrow(()-> new ResourceNotFoundException("Resource not found exception "));
    }
}

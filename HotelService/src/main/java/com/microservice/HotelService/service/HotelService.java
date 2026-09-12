package com.microservice.HotelService.service;

import com.microservice.HotelService.entity.Hotel;
import org.hibernate.annotations.SecondaryRow;
import org.springframework.stereotype.Service;

import java.util.List;

public interface HotelService {

    public Hotel saveHotels(Hotel hotel);

    public List<Hotel> getAllHotels();

    public Hotel getHotelById(String hotel_id);
}

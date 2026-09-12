package com.microservice.RatingsService.service;

import com.microservice.RatingsService.entity.Rating;

import java.util.List;

public interface RatingService {

    //create
    Rating saveRating(Rating rating);

    //get all ratings
    List<Rating> getAllRatings();

    List<Rating> getRatingByHotelId(String hotelId);

    List<Rating> getUserById(String userId);
}

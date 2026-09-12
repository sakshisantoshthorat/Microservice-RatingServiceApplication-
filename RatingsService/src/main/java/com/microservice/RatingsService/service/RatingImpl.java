package com.microservice.RatingsService.service;


import com.microservice.RatingsService.entity.Rating;
import com.microservice.RatingsService.repository.RatingRepository;
//import com.microservice.UserService.entity.User;
import com.microservice.RatingsService.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class RatingImpl implements RatingService{

    @Autowired
    public RatingRepository ratingRepository;

    //RestTemplate restTemplate = new RestTemplate();
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Rating saveRating(Rating rating) {
        return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> getAllRatings() {
        return ratingRepository.findAll();
    }

    @Override
    public List<Rating> getRatingByHotelId(String hotelId) {
        return ratingRepository.findByHotelId(hotelId);
    }

    @Override
    public List<Rating> getUserById(String userId) {

        //User user = restTemplate.getForObject("http://localhost:8081/user/getUserById/" + userId, User.class);

        User user = restTemplate.getForObject(
                "http://localhost:8081/user/getUserById/" + userId,
                User.class
        );
        return ratingRepository.findByUserId(userId);
    }
}

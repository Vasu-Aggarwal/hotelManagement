package com.management.hotel.hotelManagement.repository.impl;

import com.management.hotel.hotelManagement.entity.Hotel;
import com.management.hotel.hotelManagement.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HotelRepositoryImpl implements HotelRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Hotel> findAll() {
        String query = "SELECT * FROM hotel";
        return jdbcTemplate.queryForList(query, Hotel.class);
    }

    @Override
    public Hotel findHotelById(Integer hotelId) {
        String query = "SELECT * FROM hotel WHERE hotel_id = :hotelId";
        return jdbcTemplate.queryForObject(query, Hotel.class);
    }

    @Override
    public void updateHotelDetails(Hotel hotelDetails) {

    }

    @Override
    public void addHotelDetails(Hotel hotelDetails) {

    }

    @Override
    public void deleteHotel(Integer hotelId) {

    }
}

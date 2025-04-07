package com.management.hotel.hotelManagement.repository;

import com.management.hotel.hotelManagement.entity.Hotel;

import java.util.List;

public interface HotelRepository {
    List<Hotel> findAll();
    Hotel findHotelById(Integer hotelId);
    void updateHotelDetails(Hotel hotelDetails);
    void addHotelDetails(Hotel hotelDetails);
    void deleteHotel(Integer hotelId);
}

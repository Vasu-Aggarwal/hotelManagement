package com.management.hotel.hotelManagement.repository;

import com.management.hotel.hotelManagement.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface HotelRepository extends JpaRepository<Hotel, Integer> {
    @Query(value = "Select * from Hotel where hotel_id = :hotelId", nativeQuery = true)
    Hotel findHotelByHotelId(Integer hotelId);
}

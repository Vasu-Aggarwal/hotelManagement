package com.management.hotel.hotelManagement.service;

import com.management.hotel.hotelManagement.dto.response.GetHotelDetailByIdResponse;

public interface HotelService {
    GetHotelDetailByIdResponse getHotelDetailsById(Integer hotelId);
}

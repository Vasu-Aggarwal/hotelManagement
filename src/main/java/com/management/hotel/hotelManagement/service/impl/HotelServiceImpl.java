package com.management.hotel.hotelManagement.service.impl;

import com.management.hotel.hotelManagement.dto.response.GetHotelDetailByIdResponse;
import com.management.hotel.hotelManagement.entity.Hotel;
import com.management.hotel.hotelManagement.repository.HotelRepository;
import com.management.hotel.hotelManagement.service.HotelService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public GetHotelDetailByIdResponse getHotelDetailsById(Integer hotelId) {
        Hotel hotel = hotelRepository.findHotelByHotelId(hotelId);
        return modelMapper.map(hotel,
                GetHotelDetailByIdResponse.class);
    }
}

package com.management.hotel.hotelManagement.controller;

import com.management.hotel.hotelManagement.dto.response.GetHotelDetailByIdResponse;
import com.management.hotel.hotelManagement.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/hotel")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @GetMapping("/getHotelDetailsById/{hotelId}")
    public ResponseEntity<GetHotelDetailByIdResponse> getHotelDetailByIdResponse(@PathVariable Integer hotelId){
        GetHotelDetailByIdResponse getHotelDetailByIdResponse = hotelService.getHotelDetailsById(hotelId);
        return new ResponseEntity<>(getHotelDetailByIdResponse, HttpStatus.OK);
    }

}

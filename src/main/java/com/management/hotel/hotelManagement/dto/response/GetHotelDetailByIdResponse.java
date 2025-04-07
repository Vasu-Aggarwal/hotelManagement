package com.management.hotel.hotelManagement.dto.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetHotelDetailByIdResponse {
    private Integer hotelId;
    private String hotelName;
}

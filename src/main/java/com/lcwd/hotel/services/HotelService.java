package com.lcwd.hotel.services;

import com.lcwd.hotel.entities.Hotel;

import java.util.List;

public interface HotelService {

    //create
    public Hotel create(Hotel hotel);

    //getall
    public List<Hotel> getAll();

    //get single
    public Hotel get(String id);

}

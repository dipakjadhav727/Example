package com.dj.service;

import java.util.List;

import com.dj.dto.HotelDto;

public interface HotelService {

	public List<HotelDto> searchHotel(String meun) throws Exception;
}

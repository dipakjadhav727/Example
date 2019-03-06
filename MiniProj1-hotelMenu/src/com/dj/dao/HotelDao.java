package com.dj.dao;

import java.util.List;

import com.dj.bo.HotelBo;


public interface HotelDao {

	public List<HotelBo> findHotel(String menu) throws Exception;
}

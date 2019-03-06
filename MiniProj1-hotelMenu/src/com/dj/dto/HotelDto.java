package com.dj.dto;

import java.io.Serializable;

public class HotelDto implements Serializable {
	private int	hotelid;                                           
	private String hotelname;
	private String hoteladd;
	private String hotelreting;
	private String menu;
	private int perperson;
	public int getHotelid() {
		return hotelid;
	}
	public void setHotelid(int hotelid) {
		this.hotelid = hotelid;
	}
	public String getHotelname() {
		return hotelname;
	}
	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}
	public String getHoteladd() {
		return hoteladd;
	}
	public void setHoteladd(String hoteladd) {
		this.hoteladd = hoteladd;
	}
	public String getHotelreting() {
		return hotelreting;
	}
	public void setHotelreting(String hotelreting) {
		this.hotelreting = hotelreting;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public int getPerperson() {
		return perperson;
	}
	public void setPerperson(int perperson) {
		this.perperson = perperson;
	}	                              

	
	
}

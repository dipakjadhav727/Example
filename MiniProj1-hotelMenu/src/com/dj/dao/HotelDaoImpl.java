package com.dj.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.dj.bo.HotelBo;

public class HotelDaoImpl implements HotelDao {

	public static final String SEARCH_HOTEL = "SELECT  HOTELID, 	HOTELNAME ,HOTELADD,HOTELRETING,MENU, PERPERSON FROM online_food WHERE MENU=?";

	private Connection GetPooledConnection() throws Exception {
System.out.println("HotelDaoImpl.getConnection(1)");
		Connection con = null;
		InitialContext ic = null;
		DataSource ds = null;
		// get Pool jdbc connection obj
		ic = new InitialContext();
		ds = (DataSource) ic.lookup("java:/comp/env/DsJndi");
		con = ds.getConnection();
		return con;
	}

	@Override
	public List<HotelBo> findHotel(String menu) throws Exception {


		System.out.println("15");
		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection con = null;
		List<HotelBo> listbo = null;
		HotelBo bo;
		// get pool jdbc connection
		con = GetPooledConnection();
		ps = con.prepareStatement(SEARCH_HOTEL);

		// set param value
		ps.setString(1, menu);

		// excute query
		rs = ps.executeQuery();
		System.out.println("16");
		// copy result set Object record ListBo
		
		listbo = new ArrayList<HotelBo>();
		while (rs.next()) {
			System.out.println("18");
		
			// copy rs obj to bo
			bo = new HotelBo();
			bo.setHotelid(rs.getInt(1));
			bo.setHotelname(rs.getString(2));
			bo.setHoteladd(rs.getString(3));
			bo.setHotelreting(rs.getString(4));
			bo.setMenu(rs.getString(5));
			bo.setPerperson(rs.getInt(6));
			// add bo object to listbo obj
			System.out.println("19");
		
			listbo.add(bo);
			System.out.println("20");
		} // whiloe
		return listbo;
	}// method
}// cls

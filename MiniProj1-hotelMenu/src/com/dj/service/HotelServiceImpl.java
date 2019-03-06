package com.dj.service;

import java.util.ArrayList;
import java.util.List;

import com.dj.bo.HotelBo;
import com.dj.dao.HotelDao;
import com.dj.dao.HotelDaoImpl;
import com.dj.dto.HotelDto;

public class HotelServiceImpl implements HotelService {
	
	List<HotelDto> listdto = null;
	List<HotelBo> listbo = null;
	HotelDao dao = null;
	HotelDto dto = null;

	@Override
	public List<HotelDto> searchHotel(String meun) throws Exception {
		// use Dao obj
		System.out.println("8");
		dao = new HotelDaoImpl();
		listbo = dao.findHotel(meun);
		// convert listbo to listdto
		listdto = new ArrayList();
		System.out.println("9");
		for (HotelBo bo : listbo) {
			// copy each bo to dto
			
			dto = new HotelDto();
			dto.setHotelid(bo.getHotelid());
			dto.setHotelname(bo.getHotelname());
			dto.setHoteladd(bo.getHoteladd());
			dto.setHotelreting(bo.getHotelreting());
			dto.setMenu(bo.getMenu());
			dto.setPerperson(bo.getPerperson());
			// add ListDto obj dto
			
			listdto.add(dto);
			
		}
		
		return listdto;
	}

}

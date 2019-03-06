package com.dj.controler;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dj.dto.HotelDto;
import com.dj.service.HotelService;
import com.dj.service.HotelServiceImpl;

@WebServlet("/OnlineFood")
public class controler extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		String menu = null;
		String source = null;
		HotelService service = null;
		List<HotelDto> listdto = null;
		RequestDispatcher rd = null;
		// read form data
		menu = req.getParameter("menu");
		source = req.getParameter("source");
		// use service cls
		service = new HotelServiceImpl();
		
		try {		
			listdto = service.searchHotel(menu);
			// keep Request in attribute
			req.setAttribute("Hotellist", listdto);
			System.out.println("try block");
			
		} catch (Exception e) {
			e.printStackTrace();
			rd = req.getRequestDispatcher("/err.jsp");
			rd.forward(req, res);
			
		
		}
		System.out.println("aftr catch");
		
		
		// Forward the req to the Destination page(view page) base on the button
		if (source.equalsIgnoreCase("html")) {
			
			rd = req.getRequestDispatcher("/Html_screen.jsp");
			rd.forward(req, res);
			System.out.println("forwarded");
		} else {
			rd = req.getRequestDispatcher("/excel_screen2.jsp");
			rd.forward(req, res);
		}
	
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
		
	}

}

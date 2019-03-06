<%@page import="com.dj.dto.HotelDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<script language="JavaScript">

function showPrint(){
	frames.focus();
	frames.print();
}
</script>

<%
List<HotelDto> listdto=null;

listdto=(List<HotelDto>)request.getAttribute("Hotellist");
//display database table having record

if(listdto.size()!=0){%>
<h1 style='text-align:center'>Onlinefood<%=request.getParameter("menu")%></h1>
<table border="1">

<tr>
<th>hotelid</th>
<th>hotelname</th>
<th>hoteladd</th>
<th>hotelreting</th>
<th>menu</th>
<th>preperson</th> 
</tr>
<%
for(HotelDto dto:listdto){%>
<tr>
<td><%=dto.getHotelid()%></td>
<td><%=dto.getHotelname()%></td>
<td><%=dto.getHoteladd()%></td>
<td><%=dto.getHotelreting()%></td>
<td><%=dto.getMenu()%></td>
<td><%=dto.getPerperson()%></td>
</tr>
<%}%>
</table>

<a href="javascript:showPrint()">print</a>
<%}
else {%>
	<h1 style="color: gray;text-align: center;">Not Hotel Fund</h1>
<%}%>
<a href="search.html">Home</a>






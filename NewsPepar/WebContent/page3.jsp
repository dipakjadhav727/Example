<%@ page language="java" contentType="text/html; charset=UTF-8"
	isELIgnored="false"%>
<table widht="100%" height="100">
	<tr height="30%">
		<td colspan="2"><jsp:include page="/header" /></td>
	<tr height="60%">
		<td width="30%"><%@include file="leftContent.html"%></td>
		<td width="70%"><jsp:include page="sport.jsp" /></td>
	</tr>
	<tr height="10%">
		<td colspan="2"><%@include file="footer.html"%></td>
	</tr>
</table>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


 <table class="table table-hover">
	
	<thread>
		<tr>
		<th>ID</th>
		<th>ID_Product</th>
		<th>ID_Bill</th>
		<th>Quantity</th>
		<th>Total-Price (EachProduct)</th>
		</tr>
	</thread>
	<tbody>
		<c:forEach var="billdetail" items="${ billdetail }">
			<tr>
				<td>${ billdetail.id }</td>
				<td>${ billdetail.id_product }</td>
				<td>${ billdetail.id_bills }</td>
				<td>${ billdetail.quanty }</td>
				<td>${ billdetail.total }</td>
				<td>
				</td>
			</tr>
		</c:forEach>
	</tbody>
	</table>


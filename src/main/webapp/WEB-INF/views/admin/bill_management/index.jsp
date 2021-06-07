<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<title>Quản lý sản phẩm</title>
<h1 class="alert alert-warning">Trang quản lý đơn hàng</h1>


<ul class="nav nav-tabs">
  <li class="active"><a data-toggle="tab" href="#tab1">Đơn hàng</a></li>
  <li><a data-toggle="tab" href="#tab2">Chi tiết đơn hàng</a></li>
</ul>

<div class="tab-content">
  <div id="tab1" class="tab-pane fade in active">
	<table class="table table-hover">
	
	<thread>
		<tr>
		<th>ID</th>
		<th>Email-User</th>
		<th>Phone</th>
		<th>Name</th>
		<th>Address</th>
		<th>Total-Price</th>
		<th>Quantity</th>
		<th>Note</th>
		</tr>
	</thread>
	<tbody>
		<c:forEach var="bill" items="${ bill }">
			<tr>
				<td>${ bill.id }</td>
				<td>${ bill.user }</td>
				<td>${ bill.phone }</td>
				<td>${ bill.display_name }</td>
				<td>${ bill.address }</td>
				<td>${ bill.total }</td>
				<td>${ bill.quanty }</td>
				<td>${ bill.note }</td>
				<td>
				<a class="btn btn-sm btn-info" href="/ClothesShop/admin/bill_management/edit/${ bill.id }">Select</a>
				</td>
			</tr>
		</c:forEach>
	</tbody>
	</table>
	  <a class="btn btn-default" href="/ClothesShop/admin/bill_management/index">Reset</a>
	  <br>
  		<br>
  		<a class="btn btn-default" href="/ClothesShop/admin">Trở lại Trang quản trị</a>
  </div>
  
   <div id="tab2" class="tab-pane fade">
   <%@include file="/WEB-INF/views/admin/bill_management/_form.jsp"%>
  </div>
  
</div>

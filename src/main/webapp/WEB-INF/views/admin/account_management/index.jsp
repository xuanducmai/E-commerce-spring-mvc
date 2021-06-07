<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<title>Quản lý tài khoản</title>
<h1 class="alert alert-warning">Trang quản lý tài khoản người dùng</h1>

<h3 class="label label-success">${message}${param.message}</h3>

<ul class="nav nav-tabs">
  <li class="active"><a data-toggle="tab" href="#tab1">Danh sách</a></li>
  <li><a data-toggle="tab" href="#tab2">Chỉnh sửa</a></li>
</ul>

<div class="tab-content">
  <div id="tab1" class="tab-pane fade in active">
	<table class="table table-hover">
	<thread>
	<tr>
		<th>ID</th>
		<th>Email-User</th>
		<th>Password</th>
		<th>Display_Name</th>
		<th>Address</th>
		<th>Role</th>
	</tr>
	</thread>
	<tbody>
		<c:forEach var="user" items="${ user }">
			<tr>
				<td>${ user.id }</td>
				<td>${ user.user }</td>
				<td>${ user.password }</td>
				<td>${ user.display_name }</td>
				<td>${ user.address }</td>
				<td>${ user.role }</td>
				<td>
				<a class="btn btn-sm btn-info" href="/ClothesShop/admin/account_management/edit/${ user.id }">Select</a>
				</td>
			</tr>
		</c:forEach>
	</tbody>
	</table>
	<a class="btn btn-default" href="/ClothesShop/admin/account_management/index">Reset</a>
  <br>
  <br>
  <a class="btn btn-default" href="/ClothesShop/admin">Trở lại Trang quản trị</a>
  </div>
  
   <div id="tab2" class="tab-pane fade">
   <%@include file="/WEB-INF/views/admin/account_management/_form.jsp"%>
  </div>
</div>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


 <form:form action="/admin/account_management/index" method="POST" modelAttribute="entity">

 <div class="form-group">
 	<label>ID</label>
 	<form:input type="number" path="id" class="form-control" />
 </div>
  <br>
 <div class="form-group">
 	<label>Email-User</label>
 	<form:input type="email" path="user" class="form-control" />
 </div>
  <br>
 <div class="form-group">
 	<label>Password</label>
 	<form:input type="text" path="password" class="form-control" />
 </div>
  <br>
 <div class="form-group">
 	<label>Display_Name</label>
 	<form:input type="text" path="display_name" class="form-control" />
 </div>
  <br>
 <div class="form-group">
 	<label>Address</label>
 	<form:input type="text" path="address" class="form-control" />
 </div>
  <br>
 <div class="form-group">
 	<label>Role</label>
 	<div class="form-control" >
 		<form:radiobutton path="role" value="ROLE_ADMIN" label="ROLE_ADMIN" /> 	
 		<form:radiobutton path="role" value="ROLE_USER" label="ROLE_USER" />
 	</div>
 </div>
  <br>
 
  <div class="form-group">
 	<button class="btn btn-primary" formaction="/ClothesShop/admin/account_management/create">Create</button>
 	<button class="btn btn-warning" formaction="/ClothesShop/admin/account_management/update">Update</button>
 	<button class="btn btn-danger" formaction="/ClothesShop/admin/account_management/delete">Delete</button>
 	<a class="btn btn-default" href="/ClothesShop/admin/account_management/index">Reset</a>
 </div>
 </form:form>


<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


 <form:form action="/admin/product_management/index" method="POST" modelAttribute="entity">

 <div class="form-group">
 	<label>ID</label>
 	<form:input type="number" path="id_product" class="form-control" />
 </div>
  <br>
 <div class="form-group">
 	<label>ID-Category</label>
 	<form:input type="number" path="id_catogory" class="form-control" />
 </div>
  <br>
 <div class="form-group">
 	<label>Size</label>
 	<form:input type="text" path="sizes" class="form-control" />
 </div>
  <br>
 <div class="form-group">
 	<label>Name</label>
 	<form:input type="text" path="name" class="form-control" />
 </div>
  <br>
 <div class="form-group">
 	<label>Price</label>
 	<form:input type="number" path="price" class="form-control" />
 </div>
  <br>
 <div class="form-group">
 	<label>Quantity</label>
 	<form:input type="number" path="sale" class="form-control" />
 </div>
  <br>
 <div class="form-group">
 	<label>Title</label>
 	<form:input type="text" path="title" class="form-control" />
 </div>
  <br>
 <div class="form-group">
 	<label>Highlight</label>
 	<div class="form-control" >
 		<form:radiobutton path="highlight" value='1' label="Yes" />
 		<form:radiobutton path="highlight" value='0' label="No" />
 	</div>
 </div>
  <br>
 <div class="form-group">
 	<label>New_Product</label>
 	<div class="form-control" >
 		<form:radiobutton path="new_product" value='1' label="Yes" /> 	
 		<form:radiobutton path="new_product" value='0' label="No" />
 	</div>
 </div>
  <br>
 <div class="form-group">
 	<label>Detail</label>
 	<form:input type="text" path="details" class="form-control" />
 </div>
  <br>
 
  <div class="form-group">
 	<button class="btn btn-primary" formaction="/ClothesShop/admin/product_management/create">Create</button>
 	<button class="btn btn-warning" formaction="/ClothesShop/admin/product_management/update">Update</button>
 	<button class="btn btn-danger" formaction="/ClothesShop/admin/product_management/delete">Delete</button>
 	<a class="btn btn-default" href="/ClothesShop/admin/product_management/index">Reset</a>
 </div>
 </form:form>


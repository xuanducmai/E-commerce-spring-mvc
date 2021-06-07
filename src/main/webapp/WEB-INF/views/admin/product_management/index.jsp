<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<title>Quản lý sản phẩm</title>
<h1 class="alert alert-warning">Trang quản lý sản phẩm</h1>

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
		<th>ID-Category</th>
		<th>Size</th>
		<th>Name</th>
		<th>Price</th>
		<th>Quantity</th>
		<th>Title</th>
		<th>Highlight</th>
		<th>New_Product</th>
		<th>Detail</th>
	</tr>
	</thread>
	<tbody>
		<c:forEach var="productAd" items="${ productAd }">
			<tr>
				<td>${ productAd.id_product }</td>
				<td>${ productAd.id_catogory }</td>
				<td>${ productAd.sizes }</td>
				<td>${ productAd.name }</td>
				<td>${ productAd.price }₫</td>
				<td>${ productAd.sale }</td>
				<td>${ productAd.title }</td>
				<td>${ productAd.highlight }</td>
				<td>${ productAd.new_product }</td>
				<td>${ productAd.details }</td>
				<td>
				<a class="btn btn-sm btn-info" href="/ClothesShop/admin/product_management/edit/${ productAd.id_product }">Select</a>
				</td>
			</tr>
		</c:forEach>
	</tbody>
	</table>
	  <a class="btn btn-default" href="/ClothesShop/admin/product_management/index">Reset</a>
	  <br>
  		<br>
  		<a class="btn btn-default" href="/ClothesShop/admin">Trở lại Trang quản trị</a>
  </div>
  
   <div id="tab2" class="tab-pane fade">
   <%@include file="/WEB-INF/views/admin/product_management/_form.jsp"%>
  </div>
  
</div>

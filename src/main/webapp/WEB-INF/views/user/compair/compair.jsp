<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<title>So sánh sản phẩm</title>


<div class="row">

	<div class="container">
		<ul class="breadcrumb">
			<li><a href="<c:url value="/"/>">Trang chủ</a> <span
				class="divider">/</span></li>
			<li class="active">So sánh sản phẩm</li>
		</ul>
		<div class="compare">
			<h3>So sánh sản phẩm</h3>
			<hr class="soft" />

			<table id="compairTbl" class="table table-bordered">

				<tr>
					<th style="text-align: center">Hình ảnh</th>
					<th style="text-align: center">Tên sản phẩm</th>
					<th style="text-align: center">Đơn giá</th>
					<th style="text-align: center">Số lượng</th>
					<th style="text-align: center">Size</th>
					<th style="text-align: center">Tiêu đề</th>
					<th style="text-align: center">Chi tiết sản phẩm</th>
					<th style="text-align: center">Thực hiện</th>
				</tr>
				<tbody>
					<c:forEach var="compair" items="${ compair }">
						<tr>
							<td><img src="<c:url value="/assets/user/img/${ compair.value.product.image }"/>"></td>
							<td>${ compair.value.product.name }</td>
							<td><fmt:formatNumber type="number"
									value="${ compair.value.product.price }" /> ₫</td>
							<td><fmt:formatNumber type="number"
									value="${ compair.value.product.sale }" /></td>
							<td>${ compair.value.product.sizes }</td>
							<td>${ compair.value.product.title }</td>
							<td>${ compair.value.product.details }</td>
							<td>
								<a href="<c:url value="/Delete-Compare/${ compair.key }"/>" class="btn" type="button"><span class="icon-remove"></span></a>
								<br><br>
								<form class="form-horizontal qtyFrm" method="get" action ="<c:url value="/AddCart/${ compair.value.product.id_product }"/>">
								<button type="submit" class="shopBtn"><span class="icon-shopping-cart"></span></button><br>
								</form>
							</td>
						</tr>
					</c:forEach>
				</tbody>

			</table>

			<div class="alignR">
				<a href="<c:url value="/tat-ca-san-pham"/>"
					class="shopBtn btn-large">Trở lại trang sản phẩm</a>
			</div>
		</div>
	</div>
</div>


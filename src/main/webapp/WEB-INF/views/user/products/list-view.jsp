<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>

<head>
<title>Tất cả sản phẩm</title>
<style>
.pagination {
	display: flex;
	justify-content: center;
}

.pagination a {
	color: black;
	float: left;
	padding: 8px 16px;
	text-decoration: none;
	transition: background-color .3s;
	border: 1px solid #ddd;
}

.pagination a.active {
	background-color: #4CAF50;
	color: white;
	border: 1px solid #4CAF50;
}

.pagination a:hover:not(.active) {
	background-color: #ddd;
}
</style>
</head>

<body>
	<div class="row">
		<div id="sidebar" class="span3">
			<div class="well well-small">
				<ul class="nav nav-list">

					<c:forEach var="item" items="${ categorys }">
						<li><a href='<c:url value ="/san-pham/${ item.id }"/>'><span
								class="icon-circle-blank"></span> ${ item.name }</a></li>
						<li>
					</c:forEach>

					<li><a class="totalInCart" href="/ClothesShop/gio-hang"><strong>Đã
								mua <span class="badge badge-warning pull-right"
								style="line-height: 18px;"><fmt:formatNumber
										type="number" groupingUsed="true" value="${ TotalPriceCart }" />
									đ</span>
						</strong></a></li>
				</ul>
			</div>

			<div class="well well-small alert alert-warning cntr">
				<h2>50% Discount</h2>
				<p>
					only valid for online order. <br> <br> <a
						class="defaultBtn" href="#">Click here </a>
				</p>
			</div>
			<div class="well well-small">
				<a href="#"><img
					src="<c:url value="/assets/user/img/paypal.png"/>"
					alt="payment method paypal"></a>
			</div>

			<a class="shopBtn btn-block" href="#">Upcoming products <br>
				<small>Click to view</small></a> <br> <br>
			
			<ul class="nav nav-list promowrapper">
			<c:forEach var="navbar" items="${ navbar }" varStatus="loop">
				<li>
					<div class="thumbnail">
						<a class="zoomTool"
										href="chi-tiet-san-pham/${ navbar.id_product }"
										title="add to cart"><span class="icon-search"></span>
										Chi tiết</a> <a href="chi-tiet-san-pham/${ navbar.id_product }"><img
										src="<c:url value="/assets/user/img/${ navbar.image }"/>" alt=""></a>
									<div class="caption">
										<h5>${ navbar.name }</h5>
										<h4>
											<a class="defaultBtn" href="chi-tiet-san-pham/${ navbar.id_product }"
												title="Click to view"><span class="icon-zoom-in"></span></a>
											<a class="shopBtn"
												href="<c:url value="/AddCart/${ navbar.id_product }"/>"
												title="add to cart"><span class="icon-plus"></span></a> <span
												class="pull-right"><fmt:formatNumber type="number"
													groupingUsed="true" value="${ navbar.price }" /> ₫</span>
										</h4>
									</div>
					</div>
				</li>
			</c:forEach>
				<li style="border: 0">&nbsp;</li>
			</ul>
		</div>

		<div class="span9">
			<c:if test="${ productsPaginate.size() > 0 }">
				<div class="well well-small">
					<c:forEach var="item" items="${ productsPaginate }"
						varStatus="loop">
						<div class="row-fluid">
							<div class="span2">
								<img src="<c:url value="/assets/user/img/${ item.image }"/>"
									alt="">
							</div>
							<div class="span6">
								<h5>${ item.name }</h5>
								<p>${ item.details }</p>
							</div>
							<div class="span4 alignR">
								<form class="form-horizontal qtyFrm">
									<h3>
										<strong> <fmt:formatNumber type="number"
												groupingUsed="true" value="${ item.price }" /> ₫
										</strong>
									</h3>
									<a href="<c:url value="/Add-Compare/${ item.id_product }"/>" class="btn" type="button">So sánh</a>
									<br> <br>
									<div class="btn-group">
										<a href="<c:url value="/AddCart/${ item.id_product }"/>" class="defaultBtn"><span
											class=" icon-shopping-cart"></span> Thêm giỏ hàng</a> <a
											href="<c:url value="/chi-tiet-san-pham/${ item.id_product }"/>" class="shopBtn">Chi tiết</a>
									</div>
								</form>
							</div>
							</div>
					</c:forEach>
				
				</div>
				
			</c:if>
		</div>
	</div>


	<div class="pagination">
		<c:forEach var="item" begin="1" end="${ paginateInfo.totalPage }"
			varStatus="loop">
			<c:if test="${ (loop.index) == paginateInfo.currentPage }">
				<a href="<c:url value="/list-view/${ loop.index }"/>" class="active">${ loop.index }</a>
			</c:if>
			<c:if test="${ (loop.index) != paginateInfo.currentPage }">
				<a href="<c:url value="/list-view/${ loop.index }"/>">${ loop.index }</a>
			</c:if>
		</c:forEach>
	</div>

</body>
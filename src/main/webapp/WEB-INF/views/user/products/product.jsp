<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<head>
<meta charset="UTF-8">
<title>Chi tiết sản phẩm</title>
<style>
.product-content {
	overflow-x: hidden;
}
</style>
</head>
<body>
	<!-- 
Body Section 
-->


	<div class="row product-content">
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
										href="<c:url value="/chi-tiet-san-pham/${ navbar.id_product }"/>"
										title="add to cart"><span class="icon-search"></span>
										Chi tiết</a> <a href="<c:url value="/chi-tiet-san-pham/${ navbar.id_product }"/>"><img
										src="<c:url value="/assets/user/img/${ navbar.image }"/>" alt=""></a>
									<div class="caption">
										<h5>${ navbar.name }</h5>
										<h4>
											<a class="defaultBtn" href="<c:url value="/chi-tiet-san-pham/${ navbar.id_product }"/>"
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
			<ul class="breadcrumb">
				<li><a href="/ClothesShop/">Trang chủ</a> <span class="divider">/</span></li>
				<li><a href="/ClothesShop/tat-ca-san-pham">Sản phẩm</a> <span class="divider">/</span></li>
				<li class="active">Chi tiết sản phẩm</li>
			</ul>
			<div class="well well-small">
				<div class="row-fluid">
					<div class="span5">
						<div id="myCarousel" class="carousel slide cntr">
							<div class="carousel-inner">
								<div class="item active">
									<a href="#"> <img src="<c:url value="/assets/user/img/${ product.image }"/>" alt=""
										style="width: 100%"></a>
								</div>
							</div>
						</div>
					</div>
					<div class="span7">
						<h3>${ product.name }</h3>
						<hr class="soft" />

						<form class="form-horizontal qtyFrm" method="get" action ="<c:url value="/AddCart/${ product.id_product }"/>">
							<div class="control-group">
								<label class="control-label"><span><fmt:formatNumber
													type="number" groupingUsed="true" value="${ product.price }" />₫</span></label>
								<div class="controls">
									<input type="number" min ="0" value="0" class="span6">
								</div>
							</div>

							<div class="control-group">
								<label class="control-label"><span>Color</span></label>
								<div class="controls">
									<select class="span11">
										<option>Red</option>
										<option>Purple</option>
										<option>Pink</option>
										<option>Red</option>
									</select>
								</div>
							</div>
							
							<h4></h4>
							<p>${ product.title }
							<p>
								<button type="submit" class="shopBtn"><span class="icon-shopping-cart"></span> Thêm giỏ hàng</button><br>
						</form>
						<a href="<c:url value="/Add-Compare/${ product.id_product }"/>" class="btn" type="button">So sánh</a>
					</div>
				</div>
				<hr class="softn clr" />


				<ul id="productDetail" class="nav nav-tabs">
					<li class="active"><a href="#home" data-toggle="tab">Chi tiết sản phẩm</a></li>
					<li class=""><a href="#profile" data-toggle="tab">Sản phẩm liên quan </a></li>
					
				</ul>
				<div id="myTabContent" class="tab-content tabWrapper">
					<div class="tab-pane fade active in" id="home">
							${ product.details }
						
					</div>
					<div class="tab-pane fade" id="profile">
					
					<c:set var="countList" value="${ productByIDCategory.size() }" />
						<c:if test="${ productByIDCategory.size() > 10 }">
								<c:set var="countList" value="10" />
							</c:if>
						<c:forEach var="item" items="${ productByIDCategory }" begin="1" end="${ countList }" varStatus="loop">
						
						<div class="row-fluid">
							<div class="span2">
								<img src="<c:url value="/assets/user/img/${ item.image }"/>" alt="">
							</div>
							<div class="span6">
								<h5>${ item.name }</h5>
								<p>${ item.title }</p>
							</div>
							<div class="span4 alignR">
								<form class="form-horizontal qtyFrm">
									<h3><fmt:formatNumber
													type="number" groupingUsed="true" value="${ product.price }" />₫</h3>
									<div class="btn-group">
										 <a href="<c:url value="/chi-tiet-san-pham/${ item.id_product }"/>" class="shopBtn">Xem</a>
									</div>
								</form>
							</div>
						</div>
						<hr class="soft" />
						
						</c:forEach>
						
					</div>
				
				</div>

			</div>
		</div>
	</div>
	<!-- Body wrapper -->
</body>

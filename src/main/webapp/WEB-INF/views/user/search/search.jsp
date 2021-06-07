<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<head>
<title>Tìm kiếm</title>
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
				<li>
					<div class="thumbnail">
						<a class="zoomTool" href="#" title="add to cart"><span
							class="icon-search"></span> Chi tiết</a> <img
							src="<c:url value="/assets/user/img/s.jpg"/>"
							alt="bootstrap ecommerce templates">
						<div class="caption">
							<h4>
								<a class="defaultBtn" href="#">VIEW</a> <span class="pull-right">200.000₫</span>
							</h4>
						</div>
					</div>
				</li>
				<li style="border: 0">&nbsp;</li>
				<li>
					<div class="thumbnail">
						<a class="zoomTool" href="#" title="add to cart"><span
							class="icon-search"></span> Chi tiết</a> <img
							src="<c:url value="/assets/user/img/18.jpg"/>"
							alt="shopping cart template">
						<div class="caption">
							<h4>
								<a class="defaultBtn" href="#">VIEW</a> <span class="pull-right">200.000₫</span>
							</h4>
						</div>
					</div>
				</li>
				<li style="border: 0">&nbsp;</li>
				<li>
					<div class="thumbnail">
						<a class="zoomTool" href="#" title="add to cart"><span
							class="icon-search"></span> Chi tiết</a> <img
							src="<c:url value="/assets/user/img/45.jpg"/>"
							alt="bootstrap template">
						<div class="caption">
							<h4>
								<a class="defaultBtn" href="#">VIEW</a> <span class="pull-right">200.000₫</span>
							</h4>
						</div>
					</div>
				</li>
			</ul>
		</div>

        
		<div class="span9">
		<h1><small class="pull-left"> ${ title }</small></h1><br><br>
			<c:if test="${ keyword.size() > 0 }">
					<c:forEach var="keyword" items="${ keyword }"
						varStatus="loop">
						<div class="row-fluid">
							<div class="span2">
								<img src="<c:url value="/assets/user/img/${ keyword.image }"/>"
									alt="">
							</div>
							<div class="span6">
								<h5>${ keyword.name }</h5>
								<p>${ keyword.details }</p>
							</div>
							<div class="span4 alignR">
								<form class="form-horizontal qtyFrm">
									<h3>
										<strong> <fmt:formatNumber type="number"
												groupingUsed="true" value="${ keyword.price }" /> ₫
										</strong>
									</h3>
									<a href="<c:url value="/Add-Compare/${ keyword.id_product }"/>" class="btn" type="button">So sánh</a>
									<br> <br>
									<div class="btn-group">
										<a href="<c:url value="/AddCart/${ keyword.id_product }"/>" class="defaultBtn"><span
											class=" icon-shopping-cart"></span> Thêm giỏ hàng</a> <a
											href="<c:url value="/chi-tiet-san-pham/${ keyword.id_product }"/>" class="shopBtn">Chi tiết</a>
									</div>
								</form>
							</div>
							</div>
					</c:forEach>

			</c:if>
		</div>
	</div>




</body>

				
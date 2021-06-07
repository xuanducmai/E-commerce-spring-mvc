<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<head>
<title>Đăng ký tài khoản</title>
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
			<ul class="breadcrumb">
				<li><a href="index.html">Trang chủ</a> <span class="divider">/</span></li>
				<li class="active">Người dùng</li>
			</ul>
			<h3>Người dùng</h3>
			<hr class="soft" />

			<div class="row">
				<div class="span4">
					<div class="well">
						<h5>Đăng ký tài khoản</h5>
						<br />
						<form:form action="dang-ky" method="POST" modelAttribute="user">
							<div class="control-group">
								<label class="control-label" for="inputEmail">Email</label>
								<div class="controls">
									<form:input type="email" class="span3"
										placeholder="Mời nhập email" path="user" />
								</div>
							</div>
							<div class="control-group">
								<label class="control-label" for="inputEmail">Mật khẩu</label>
								<div class="controls">
									<form:input type="password" class="span3"
										placeholder="Mời nhập mật khẩu" path="password" />

								</div>
							</div>
							<div class="control-group">
								<label class="control-label" for="inputEmail">Họ và tên</label>
								<div class="controls">
									<form:input type="text" class="span3"
										placeholder="Mời nhập họ và tên" path="display_name" />
								</div>
							</div>
							<div class="control-group">
								<label class="control-label" for="inputEmail">Địa chỉ</label>
								<div class="controls">
									<form:input type="text" class="span3"
										placeholder="Mời nhập địa chỉ" path="address" />
								</div>
							</div>
							<div class="controls">
								<button type="submit" class="btn block">Đăng ký thành
									viên</button>
							</div>
						</form:form>
					</div>
				</div>
				<div class="span1">&nbsp;</div>
				<div class="span4">
					<div class="well">
						<h5>Đăng nhập hệ thống</h5>
						
						<form:form action="dang-nhap" method="POST" modelAttribute="user">
							<div class="control-group">
								<label class="control-label" for="inputEmail">Email</label>
								<div class="controls">
									<form:input class="span3" type="email"
										placeholder="Mời nhập email" path="user" />
								</div>
							</div>
							<div class="control-group">
								<label class="control-label" for="inputPassword">Mật
									khẩu</label>
								<div class="controls">
									<form:input type="password" class="span3"
										placeholder="Mời nhập mật khẩu" path="password" />
								</div>
							</div>
							<div class="control-group">
								<div class="controls">
									<button type="submit" class="defaultBtn">Đăng nhập</button>
									<a href="#">Quên mật khẩu?</a>
								</div>
							</div>
						</form:form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>

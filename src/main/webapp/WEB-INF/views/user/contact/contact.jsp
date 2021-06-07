<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<head>
<title>Liên hệ</title>
</head>
<hr class="soften">
	<div class="well well-small">
	<h1>Địa chỉ</h1>
	<hr class="soften"/>	
	<div class="row-fluid">
		<div class="span8 relative">
		<iframe src="https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d12929.828298075674!2d106.68684690522313!3d10.827229415865105!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x317528f0b99ce875%3A0x1f806d9b226a083!2zVmluY29tIFBsYXphIEfDsiBW4bqlcA!5e0!3m2!1svi!2s!4v1620723076826!5m2!1svi!2s" width="600" height="450" style="border:0;" allowfullscreen="" loading="lazy"></iframe>
		<div class="absoluteBlk">
		<div class="well wellsmall">
		<h4>Chi tiết liên hệ</h4>
		<h5>
			12 Đ.Phan Văn Trị, p.5, Gò Vấp<br/>
			Tp.Hồ Chí Minh, Việt Nam<br/><br/>
			 
			Email: xdclothes@shop.com<br/>
			﻿Tel: 123-456-6780<br/>
			Fax: 123-456-5679<br/>
			Website: www.xdclothes.com
		</h5>
		</div>
		</div>
		</div>
		
		<div class="span4">
		<h4>Liên hệ chúng tôi</h4>
		<form:form action="contact" method="POST" modelAttribute="contact">
        <fieldset>
          <div class="control-group">
              <form:input type="text" path="name_user" placeholder="Họ và tên" class="input-xlarge"/>
          </div>
          
		   <div class="control-group">
              <form:input type="email" path="email" placeholder="Email" class="input-xlarge"/>
          </div>
          
		   <div class="control-group">
              <form:input type="text" path="subject" placeholder="Chủ đề" class="input-xlarge"/>
          </div>
          
          <div class="control-group">
              <form:textarea rows="3" id="textarea" path="content" class="input-xlarge"></form:textarea>
          </div>

            <button class="shopBtn" type="submit">Gửi phản hồi</button>

        </fieldset>
      </form:form>
		</div>
	</div>

	
</div>


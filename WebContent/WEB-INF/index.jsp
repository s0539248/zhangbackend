<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%><%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><%@ page contentType="text/html; charset=UTF-8" %><!DOCTYPE html><html>  <head>	<meta charset="utf-8">	<title>LEP-Tool</title>	<!-- styles -->	<spring:url var ="bootstrapcss" value="/resources/css/bootstrap.css" />	<link rel="stylesheet" href="${bootstrapcss}"/>	<spring:url var ="style" value="/resources/css/style2.css" />	<link rel="stylesheet" href="${style}">	<spring:url var ="signup" value="/resources/css/signup.css" />	<link rel="stylesheet" href="${signup}">	<!-- end of styles -->	<!-- libs -->	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>	<script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>	<script src="//ajax.googleapis.com/ajax/libs/angularjs/1.3.15/angular.js"></script>	<script src="//ajax.googleapis.com/ajax/libs/angularjs/1.2.0rc1/angular-route.min.js"></script>	<spring:url var ="courses" value="/resources/js/courses.js" />	<script type="text/javascript" src="${courses}"></script>	<spring:url var ="priorities" value="/resources/js/priorities.js" />	<script type="text/javascript" src="${priorities}"></script>	<spring:url var ="layout" value="/resources/js/layout.js" />	<script type="text/javascript" src="${layout}"></script>	<spring:url var ="bootstrap" value="/resources/js/bootstrap.js" />	<script type="text/javascript" src="${bootstrap}"></script>	<!-- libs end -->  </head>  <body>    <header>      <div class="container">				<div class="navbar-header">					<button class="navbar-toggle" type="button" data-toggle="collapse" data-target=".navbar-collapse">						<span class="sr-only">Toggle navigation</span>						<span class="icon-bar"></span>						<span class="icon-bar"></span>						<span class="icon-bar"></span>					</button>					<a href="" class="navbar-brand">HTW FB4 Lehreinsatzplanung</a>				</div>				<nav class="collapse navbar-collapse" role="navigation">					<ul class="nav navbar-nav pull-right">						<li><a href="/ZhangProjectBackend/logout.html" id="logout" >Logout</a></li>						<li><a href="/ZhangProjectBackend/signup.html" id="signup" >Signup</a></li>					</ul>				</nav>			</div>    </header>	<div class="container">		<div class="row">			<form action="#" th:action="@{/login}" th:object="${user}" method="post">				<h1>Log in</h1>				<fieldset>				<legend></legend>				<label for="name">Nachname:</label>				<input type="text" th:field="*{mail}" id="name" name="username">				<label for="password">Password:</label>				<input type="password" th:field="*{password}" id="password" name="password">				</fieldset>				<button type="submit" value="Submit">Log in</button>			</form>		</div>	</div>  </body></html>
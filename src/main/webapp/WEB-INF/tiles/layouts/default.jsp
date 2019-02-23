<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<html>

<head>
<meta charset="UTF-8">
<title>Thymeleaf Tiles</title>
</head>
<body>
<tiles:insertAttribute name="header" />
<div style="display:block; width:100%; min-height:100px;">
<div style="display:inline; width:30%; float:left; background-color:pink;">
<tiles:insertAttribute name="menu" />
</div>
<div style="display:inline; width:70%; float:right; packground-color:grey">
<tiles:insertAttribute name="body" />
</div>
</div>
<tiles:insertAttribute name="footer" />
</body>
</html>
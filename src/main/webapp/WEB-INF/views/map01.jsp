<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Simple Map</title>
<meta name="viewport" content="initial-scale=1.0">

<link href="<c:url value="/resources/css/map01.css" />" rel="stylesheet">

<script type="text/javascript"
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>

<script src="<c:url value="/resources/js/map01.js" />"></script>

<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">

<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

<script type="text/javascript"
	src="http://maps.google.com/maps/api/js?sensor=true"></script>

<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery-ui-map/3.0-rc1/jquery.ui.map.js"></script>

</head>
<div class="container">
	<h1>Look! Here you are</h1>
	<div class="row">
		<div class="btn-group">
			<button id="btnTerrain" class="btn btn-primary">Terrain</button>
			<button id="btnSatellite" class="btn btn-primary">Satellite</button>
			<button id="btnRoadmap" class="btn btn-primary">Roadmap</button>
			<button id="btnHybrid" class="btn btn-primary">Hybrid</button>
		</div>

		<div class="btn-group">
			<button id="btnRemovePolyline" class="btn btn-primary">Remove
				polyline</button>
			<button id="btnRestorePolyline" class="btn btn-primary">Restore
				polyline</button>
		</div>

		<!-- Create this div to hold the map -->
		<div id="map" class="col-md-12"></div>

		<div class="fb-like" data-share="true" data-width="450"
			data-show-faces="true"></div>
	</div>
</div>
</body>
</html>
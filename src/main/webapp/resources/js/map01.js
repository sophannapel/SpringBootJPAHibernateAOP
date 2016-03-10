$(function () {

    var mapOptions = {
        center: new google.maps.LatLng(55.772, -3.214),
        zoom: 10,
        disableDefaultUI: true,
        scaleControl: true,
        overviewMapControl: true,
        overviewMapControlOptions: {
            opened: true
        }
//        , //to hide all the control on map such as zoom in/out options
//        streetViewControl: true,
//        rotateControl: true,
//        mapTypeControl: false,
//        streetViewControlOptions: {
//            position: google.maps.ControlPosition.TOP_CENTER
//        },
//        fullscreenControl: false
    };
    //Make the selected element a Google map with Map option
    var myMap = new google.maps.Map($("#map")[0], mapOptions);

    //Assign the function to the four buttons about map type
    $("#btnTerrain").click(function () {
        myMap.setMapTypeId(google.maps.MapTypsetMapTypeIdeId.TERRAIN);
    });
    $("#btnSatellite").click(function () {
        myMap.setMapTypeId(google.maps.MapTypeId.SATELLITE);
    });
    $("#btnRoadmap").click(function () {
        myMap.setMapTypeId(google.maps.MapTypeId.ROADMAP);
    });
    $("#btnHybrid").click(function () {
        myMap.setMapTypeId(google.maps.MapTypeId.HYBRID);
    });

    //Draw the polylines
    var flightPlanCoordinates = [
        {lat: 37.772, lng: -122.214},
        {lat: 21.291, lng: -157.821},
        {lat: -18.142, lng: 178.431},
        {lat: -27.467, lng: 153.027}
    ];

    var polyline = new google.maps.Polyline({
        path: flightPlanCoordinates,
        geodesic: true,
        strokeColor: '#FF0000',
        strokeOpacity: 1.0,
        strokeWeight: 2
    });
    polyline.setMap(myMap);


    //Draw circle
    var circle = new google.maps.Circle({
        map: myMap,
        center: new google.maps.LatLng(55.772, -3.214),
        fillColor: "#FF33FF",
        fillOpacity: 0.6,
        strokeColor: 0.8,
        strokeWeight: 2,
        draggable: true
    });
    circle.setRadius(158.222737);

    //Add marker
    var marker = new google.maps.Marker({
        position: new google.maps.LatLng(55.772, -3.21),
        map: myMap,
        animation: google.maps.Animation.DROP,
        draggable: true,
        title: "Yoo-hoo"
    });

    //Add information window when marker is click
    var contentString = "hello";
    var infowindow = new google.maps.InfoWindow({
        content: contentString
    });

    //Add animation to marker when it is click
    marker.addListener('click', function () {
        if (marker.getAnimation() !== null) {
            marker.setAnimation(null);
        } else {
            marker.setAnimation(google.maps.Animation.BOUNCE);
        }
        //Show info window when marker is click
        infowindow.open(myMap, marker);
    });

    //Adding a GeoRSS Feed as KML
    //KmlLayer is a constructor
    var quakesLayer = new google.maps.KmlLayer(
            "http://www.bgs.ac.uk/feeds/SchoolSeismology.xml");
    quakesLayer.setMap(myMap);

    //Assign the function to the option to add and remove polyline from map
    $("#btnRemovePolyline").click(function () {
        polyline.setMap(null)
    });

    $("#btnRestorePolyline").click(function () {
        polyline.setMap(myMap)
    });

    window.fbAsyncInit = function () {
        FB.init({
            appId: '1536584436636011',
            xfbml: true,
            version: 'v2.5'
        });
    };

    (function (d, s, id) {
        var js, fjs = d.getElementsByTagName(s)[0];
        if (d.getElementById(id)) {
            return;
        }
        js = d.createElement(s);
        js.id = id;
        js.src = "//connect.facebook.net/en_US/sdk.js";
        fjs.parentNode.insertBefore(js, fjs);
    }(document, 'script', 'facebook-jssdk'));

});
        
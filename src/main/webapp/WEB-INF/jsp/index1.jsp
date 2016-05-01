<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css" />
<script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
<script
	src="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
<script src="http://maps.googleapis.com/maps/api/js"></script>
<meta content="width=device-width, initial-scale=1" name="viewport">
<script>
	function initialize() {
		var mapProp = {
			center : new google.maps.LatLng(51.508742, -0.120850),
			zoom : 5,
			mapTypeId : google.maps.MapTypeId.ROADMAP
		};
		var map = new google.maps.Map(document.getElementById("googleMap"),
				mapProp);

		map.style.width = screen.width;
		map.style.height = screen.height;
		alert(screen.height)
	}

	function readURL(input) {
		if (input.files && input.files[0]) {
			var reader = new FileReader();

			reader.onload = function(e) {
				$('#blah').attr('src', e.target.result);
			}

			reader.readAsDataURL(input.files[0]);
		}
	}

	$("#imgInp").change(function() {
		readURL(this);
	});

	function setElementsToScreenWidth() {

	}
	google.maps.event.addDomListener(window, 'load', initialize);
</script>
</head>

<body>
	<!-- <div style="width:100%;height:10%">
<input type="file" accept="image/*" style="width:100%">
</div> -->

	<!-- Start of first page -->
	<div data-role="page" id="start">

		<div data-role="header">
			<h1>Your App Name</h1>
		</div>
		<!-- /header -->

		<div data-role="content">
			<form action="#">
				<div data-role="fieldcontain" class="ui-hide-label">
					<label for="search">Search</label> 
					<input id="search" name="search"
						type="search" data-mini="true">
						
				</div>
			</form>
			<!-- <a href="index.html" data-role="button">Add Location</a> -->
			<!--  <div id="googleMap" style="height:50%;width:100%;position:absolute"> -->
			<div>
			<a href="#loc" data-role="button">Add Location</a>
			</div>
		</div>
		<!-- /content -->

		<div data-role="footer">
			<h4>Page Footer</h4>
		</div>
		<!-- /footer -->
	</div>
	<!-- /page -->

	<!-- Start of second page -->
	<div data-role="page" id="loc">

		<div data-role="header">
			<h1>Bar</h1>
		</div>
		<!-- /header -->

		<div data-role="content">
			<label for="basic">Text Input:</label> <input type="text" name="name"
				id="basic" value="" /> <label for="basic">Text Input:</label> <input
				type="text" name="name" id="basic" value="" /> <a href="#start">Back
				to foo</a>
			</p>
		</div>
		<!-- /content -->

		<div data-role="footer">
			<h4>Page Footer</h4>
		</div>
		<!-- /footer -->
	</div>
	<!-- /page -->
</body>

</html>

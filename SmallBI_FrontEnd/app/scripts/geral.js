
	$(function(){
		var windowWidth = $(window).width() / 2 + 125;
		$('h1').width(windowWidth);
		$(window).resize(function(){
			var windowWidth = $(window).width() / 2 + 125;
			$('h1').width(windowWidth);
		});

		$("#btnModalLogin").click(function(e){
			e.preventDefault();
			$("#modalLogin").css({"opacity": 1, "visibility":"visible"});
		});

		$("#btnModalContato").click(function(e){
			e.preventDefault();
			$("#modalContato").css({"opacity": 1, "visibility":"visible"});
		});

		$(".btnFecharModal").click(function(e){
			e.preventDefault();
			console.log('oi');
			$(".dialog").css({"opacity": 0, "visibility":"hidden"});
		});

	});

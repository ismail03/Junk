


// equalheight
$(document).ready(function(){
	
	// Child
	$('nav#main ul li:last-child').css('padding-right', 0);
	
	//Mob menu
	$('a.menu-trigger').click(function(){
		$('body, header, nav#main').toggleClass('open');
	});
	
	// scroll to top
	$('ul.campaign-list li a').click(function(){
		href = $(this).attr('href');
		$(href).find('.flexslider').addClass('lb-slider');
		
		/*var campaingOffset = $('#campaign').offset();
		var campaingOffsetTop = campaingOffset.top;
		$("html, body").animate({scrollTop:campaingOffsetTop}, 'fast');*/
	});
	
	var winW = $(window).width();
	if(winW>1024){
		$('a.todays-rate').hover(function(){
			var pareNt = $(this).parent();
			pareNt.find('#todaysRate').stop(true, true).slideDown(500);
			$(this).addClass('open');
			pareNt.hover(function(){
			}, function(){
				$('#todaysRate').slideUp();
				$('.td-rate').slideUp();
				$('#todaysRate ul li a').removeClass("clicked");
				$('a.todays-rate').removeClass('open');
			});
		});
	} else {
		$('a.todays-rate').click(function(){
			$('#todaysRate').stop(true, true).slideToggle();
		});
	}
	
	setMid();
	
	// Today Rate
	$('#todaysRate ul li a').click(function(){
		if(!$(this).hasClass("clicked")){
			$('.td-rate').slideUp();
			$("#todaysRate ul li a").removeClass("clicked");
			$(this).parent().find(".td-rate").slideDown();
			$(this).addClass("clicked");
		}
		//return false;
	});
});
function setMid(){
	var titleH = $('.heading h1').height();
	$('.heading').css('margin-top', -(titleH/2));
}
equalheight = function(container){

var currentTallest = 0,
     currentRowStart = 0,
     rowDivs = new Array(),
     $el,
     topPosition = 0;
 $(container).each(function() {

   $el = $(this);
   $($el).height('auto')
   topPostion = $el.position().top;

   if (currentRowStart != topPostion) {
     for (currentDiv = 0 ; currentDiv < rowDivs.length ; currentDiv++) {
       rowDivs[currentDiv].height(currentTallest);
     }
     rowDivs.length = 0; // empty the array
     currentRowStart = topPostion;
     currentTallest = $el.height();
     rowDivs.push($el);
   } else {
     rowDivs.push($el);
     currentTallest = (currentTallest < $el.height()) ? ($el.height()) : (currentTallest);
  }
   for (currentDiv = 0 ; currentDiv < rowDivs.length ; currentDiv++) {
     rowDivs[currentDiv].height(currentTallest);
   }
 });
}

$(window).load(function() {
  equalheight('.eq-column article > div, .footer-col');
  equalheight('.main-inner > .eqH');
  equalheight('ul.product-list li > div, ul.pro-list li > div');
  equalheight('ul.campaign-list li a');
});


$(window).resize(function(){
  equalheight('.eq-column article > div, .footer-col');
  equalheight('.main-inner > .eqH');
  equalheight('ul.product-list li > div , ul.pro-list li > div');
  equalheight('ul.campaign-list li a');
  setMid();
});




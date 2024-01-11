(function ($) {

  "use strict";

    // PRE LOADER
    $(window).load(function(){
      $('.preloader').fadeOut(1000); // set duration in brackets    
    });


    // MENU
    $('.navbar-collapse a').on('click',function(){
      $(".navbar-collapse").collapse('hide');
    });

    $(window).scroll(function() {
      if ($(".navbar").offset().top > 50) {
        $(".navbar-fixed-top").addClass("top-nav-collapse");
          } else {
            $(".navbar-fixed-top").removeClass("top-nav-collapse");
          }
    });


    // HOME SLIDER & COURSES & CLIENTS
    $('.home-slider').owlCarousel({
      animateOut: 'fadeOut',
      items:1,
      loop:true,
      dots:false,
      autoplayHoverPause: false,
      autoplay: true,
      smartSpeed: 1000,
    })

    $('.owl-courses').owlCarousel({
      animateOut: 'fadeOut',
      loop: true,
      autoplayHoverPause: false,
      autoplay: false,
      dots: false,
      nav:true,
      navText: [
          '<i class="fa fa-angle-left"></i>',
          '<i class="fa fa-angle-right"></i>'
      ],
      responsiveClass: true,
      responsive: {
        0: {
          items: 1,
        },
        1000: {
          items: 3,
        }
      }
    });

    $('.owl-client').owlCarousel({
      animateOut: 'fadeOut',
      loop: true,
      autoplayHoverPause: false,
      autoplay: true,
      smartSpeed: 1000,
      responsiveClass: true,
      responsive: {
        0: {
          items: 1,
        },
        1000: {
          items: 3,
        }
      }
    });


    // SMOOTHSCROLL
    $(function() {
      $('.custom-navbar a, #home a').on('click', function(event) {
        var $anchor = $(this);
          $('html, body').stop().animate({
            scrollTop: $($anchor.attr('href')).offset().top - 49
          }, 1000);
            event.preventDefault();
      });
    });




})(jQuery);

    function redirect_car3() {
      document.getElementById("redirect_car3").onclick = function () {
      location.href = 'details-car3.html';
      }
    }

    function redirect_car2() {
      document.getElementById("redirect_car2").onclick = function () {
      location.href = 'details-car2.html';
      }
    }

    function redirect_car1() {
      document.getElementById("redirect_car1").onclick = function () {
        location.href = 'details-car1.html';
      }
    }



  document.addEventListener("DOMContentLoaded", function () {
  // Function to handle filter changes
  function handleFilterChange() {
    const selectedFilters = {};

    // Loop through all checkboxes
    document.querySelectorAll('.filter-checkbox:checked').forEach(checkbox => {
      const category = checkbox.getAttribute('data-category');
      const value = checkbox.value;

      if (!selectedFilters[category]) {
        selectedFilters[category] = [];
      }

      selectedFilters[category].push(value);
    });

    // Filter cars based on selected filters
    filterCars(selectedFilters);
  }

  // Function to filter cars based on selected filters
  function filterCars(filters) {
  const carItems = document.querySelectorAll('.car-item');

  carItems.forEach(carItem => {
  const isBrandMatch = !filters.brand || filters.brand.includes(carItem.getAttribute('data-brand'));
  const isBodyTypeMatch = !filters.bodyType || filters.bodyType.includes(carItem.getAttribute('data-body-type'));
  const isTransmissionMatch = !filters.transmission || filters.transmission.includes(carItem.getAttribute('data-transmission'));

  if (isBrandMatch && isBodyTypeMatch && isTransmissionMatch) {
  carItem.style.display = 'block';
} else {
  carItem.style.display = 'none';
}
});
}

  // Attach event listener to checkboxes
  document.querySelectorAll('.filter-checkbox').forEach(checkbox => {
  checkbox.addEventListener('change', handleFilterChange);
});
});



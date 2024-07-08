$(document).ready(function(){
    $('.owl-carousel').owlCarousel({
        items: 1,
        loop: true,
        margin: 0,
        autoplay: true,
        autoplayTimeout: 3000,
        autoplayHoverPause: true,
        nav: true,
        navText: ["<i class='fa fa-chevron-left'></i>", "<i class='fa fa-chevron-right'></i>"],
        onInitialized: startSlideAnimation,
        onChanged: startSlideAnimation
    });

    function startSlideAnimation(event) {
        var currentItem = event.item.index;
        $('.owl-item .text').css('bottom', '-50%'); // Đặt lại vị trí ban đầu
        $('.owl-item').eq(currentItem).find('.text').css('bottom', '40%'); // Chuyển đổi hiệu ứng cho mục hiện tại
    }
});

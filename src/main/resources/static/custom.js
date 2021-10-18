var map;
var coords = {lat: 41.7658, lng: -72.6734};

      function initMap() {
        map = new google.maps.Map(document.getElementById('map'), {
          center: {lat: 41.7658, lng: -72.6734},
          zoom: 10,
          scrollwheel: false
        });

        var image = {
        url: 'turle.png',
        scaledSize: new google.maps.Size(50,50)
        }

        var marker = new google.maps.Marker({
        position: coords,
        map: map,
        icon: image,
        animation: google.maps.Animation.BOUNCE
        });


        var contentString = '<h2>Hartford, CT</h2> <p>Where your dreams true.<p>'



        var infowindow = new google.maps.InfoWindow({
        content: contentString,});


        google.maps.addEventListener(marker, 'click', function()
        {
        infowindow.open(map,marker);
        });
      }
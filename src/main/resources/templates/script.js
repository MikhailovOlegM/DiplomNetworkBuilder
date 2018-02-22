 $( function() {

    $( ".elem" ).draggable({
      helper: "clone",
      start: function(){
       var element = $(this);
      },
      drag: function(){
        var X = event.pageX;
        var Y = event.pageY;
        console.log("Y:" + Y + " | " + "X:" + X);
      },
      stop: function(e) {
        console.log("stop");

        //$(".elem").offset({top: Y, left: X});
      }

    });


    $(".border").droppable({
       accept: ".elem",
       drop: function (event, ui) {
           var droppable = $(this);
           var draggable = ui.draggable;
           var id = ui.draggable.attr("Id");
           console.log(id);
           console.log(droppable);
           console.log(draggable);
           var X = event.pageX;
           var Y = event.pageY
           console.log("Y:" + Y + " | " + "X:" + X);

           draggable.css({top: Y, left: X});
           draggable.attr("draggable", true);
           draggable.attr('Id', ++id);
           draggable.clone().appendTo(droppable);
       }
    });



  });




$(function(){

var
    $menuItem = $('.menu a.item, .menu .link.item'),
    $dropdown = $('.menu_cial .menu .dropdown'),

    // alias
    handler = {

      activate: function() {
        if(!$(this).hasClass('dropdown')) {
          $(this)
            .addClass('active')
            .closest('.ui.menu')
            .find('.item')
              .not($(this))
              .removeClass('active')
          ;
        }
      }

    }
  ;

  $dropdown
    .dropdown({
      on: 'hover'
    })
  ;

  $menuItem
    .on('click', handler.activate)
  ;

    $('.ui.dropdown.submenu.item').dropdown({
     on: 'click'
     });
});




rroperoApp.controller('main', function ($scope) {
	
	$.get("api/inventario/prenda/5").success(function(data, status){
		alert(data);
	});

});

rroperoApp.run(function(){
    console.log('run');

    // Initialize collapse button
    angular.element("#button-opciones").sideNav();
  
    angular.element('#button-opciones').sideNav({
        //menuWidth: 300, // Default is 240
        closeOnClick: true
    }
  );

});


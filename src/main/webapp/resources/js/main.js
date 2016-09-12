rroperoApp.controller('main', function ($scope) {
	
	$.get("api/inventario/prenda/5").success(function(data, status){
		alert(data);
	});

});
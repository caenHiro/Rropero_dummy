/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Controlador para actualizar los datos de un producto
 */

rroperoApp.controller('updateProduct', function($scope){
    console.log("controlador updateProduct");
    
    
    /*
     * Campos para actualizar la info del producto
     */
    
    $scope.nombre = "Jean Pierre";
    $scope.desc = "descripcion de mi producto";
    $scope.cat = "una categoria";
    $scope.subcat = "una subcategoria";
    $scope.subcat_art ="subcategoria de articulo";
    $scope.marca = "marca patito";
    $scope.talla = "XL";
    $scope.cliente = "un cliente";
    $scope.material = "un material";
    $scope.estado = "estado de la prenda";
    $scope.fecha_ent = "fecha de entrega";
    $scope.shopify = "aa";
    $scope.precio_final = "$1300";
    
    
    $scope.updateProduct = function(){
        
    }
});
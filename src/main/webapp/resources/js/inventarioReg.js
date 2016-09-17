/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Controlador para registrar un producto en el inventario
 */


rroperoApp.controller('registerProduct', function($scope){
    console.log('controllador registerProduct');
    

    $scope.getCatalogo = function(catalogo){
        switch(catalogo){
            case "categoria":

            /*
            $.get("api/inventario/prenda/5").success(function(data, status){
                    alert(data);
            });
            */                
                break;
            case "subcategoria":
                break;
            case "subcat_articulo":
                break;
            case "tallas":
                break;
            case "clientes":
                break;
            case "materiales":
                break;
            case "estados":
                break;
        }
    }
    
    
    /*
     * Catalogos
     * 
     * Primero CATEGORIAS
     * Luego SUBCATEGORIA {cat}
     * SUBCAT TIPO ARTICULO {cat, subcat}
     * TALLA {cat, subcat_tipo_art}
     * 
     * Indepenedientes LOS RECIBO EN UN SOLO JSON:
     * 
     * CLIENTE
     * MATERIAL
     * ESTADO_PRENDA
     * 
     * 
     * TODOS LOS CATALGOS TIENEN "OTRO"
     * necesito esta lista de tablas para asociar a los inputs
     * mando {tabla:"Tabla", descripcion:"desc"}
     * 
     * Para insertar POST con json
     * 
     * 
     */
    
    
    $scope.cats = getCatalogo('categoria');
    $scope.subcat = getCatalogo('subcategoria');
    $scope.subcat_art = getCatalogo('subcat_articulo');
    $scope.tallas = getCatalogo('tallas');
    $scope.clientes = getCatalogo('clientes');
    $scope.materiales = getCatalogo('materiales');
    $scope.estados = getCatalogo('estados');
    
    
    
    /*
     * Campos para el registro del producto
     */
    
    $scope.nombre;
    $scope.desc;
    $scope.cat;
    $scope.subcat;
    $scope.subcat_art;
    $scope.marca;
    $scope.talla;
    $scope.cliente;
    $scope.material;
    $scope.estado;
    $scope.fecha_ent;
    $scope.shopify;
    $scope.precio_final;
           
        
});
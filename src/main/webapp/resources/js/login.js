rroperoLogin.controller('login', function ($scope) {
    
    $scope.access = function(){
        
        if($scope.usuario && $scope.password){

            //Enviar peticion a servidor
            $.post(
                "api/login/",
                { 
                    "usuario" : $scope.usuario, 
                    "password" : $scope.password
                })
            .success(function(data, status){
               data = JSON.parse(data);
       
               if(data.success){
                  window.location = "inventario";
               } else {
                  $scope.error = data.message;
               }
                   
            });

        } else {
            $scope.error = "Usuario y/o Contraseña requeridos";
        }
    }
});
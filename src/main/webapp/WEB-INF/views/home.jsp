<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<?xml version='1.0' encoding='UTF-8' ?>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Rropero: Inventario</title>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

    <!--JQuery-->
    <script src="resources/js/lib/jquery.min.js"></script>
    
    <!--Bootstrap-->
    <link rel="stylesheet" href="resources/css/lib/bootstrap.css">
    <script src="resources/js/lib/bootstrap.js"></script>

    <!--Materialize-->
    <link rel="stylesheet" href="resources/css/lib/materialize.css">
    <script src="resources/js/lib/materialize.js"></script>

    <!--Font Awesome-->
    <link rel="stylesheet" href="resources/css/font-awesome.css">
    
    <!--Inventario CSS-->
    <link rel="stylesheet" href="resources/css/inventario.css">
    
    <!-- Rropero App-->
    <script src="resources/js/lib/angular.js"></script>
    <script src="resources/js/lib/angular-routes.js"></script>
    <script src="resources/js/app.js"></script>
    <script src="resources/js/main.js"></script>
    <script src="resources/js/inventarioVer.js"></script>
    <script src="resources/js/inventarioReg.js"></script>
    <script src="resources/js/inventarioAct.js"></script>
    
</head>
<body ng-app=rroperoApp>
    <!--Inicio Navegacion-->
    <ul id="opciones" class="side-nav">
        <li>
            <div class="userView">
                <img class="background" src="resources/img/fondoUser.jpg">
                <span class="user-name">Nombre del Usuario</span>
            </div>
        </li>
        <li>
            <a href="#/ver"> <i class="fa fa-eye" aria-hidden="true"></i> Ver inventario</a>
        </li>
        <li>
            <a href="#/registrar"> <i class="fa fa-pencil" aria-hidden="true"></i> Registrar prenda</a>
        </li>
        <li>
            <a href="#/actualizar"> <i class="fa fa-pencil-square" aria-hidden="true"></i> Actualizar registro</a>
        </li>
    </ul>
    <!--Fin Navegacion-->

    <!--Inicio Header-->
    <header>
        <div class="col-md-2 col-sm-3 col-xs-5">
            <img src="resources/img/logo.png" alt="Rropero Logo">
        </div>
        <div class="col-md-8 col-sm-8 col-xs-3">
            <h1>Inventario</h1>
        </div>
        <div class="col-md-2 col-sm-1 col-xs-4">
            <a href="#" data-activates="opciones" id="button-opciones"><i class="fa fa-bars" aria-hidden="true"></i></a>				
        </div>
    </header>
    <!--Fin Header-->

    <!--Inicio Seccion principal-->
    <section ng-view>
    </section>
    <!--Fin Seccion principal-->

</body>
</html>

<% 
    HttpSession httpsession=request.getSession(); 
    //httpsession.removeAttribute("ejemplo");
    if(httpsession == null || httpsession.getAttribute("rropero") != null){
        response.sendRedirect("inventario");
    }
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<?xml version='1.0' encoding='UTF-8' ?>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Rropero</title>
    
    <!--JQuery-->
    <script src="resources/js/lib/jquery.min.js"></script>
    
    <!--Bootstrap-->
    <link rel="stylesheet" href="resources/css/lib/bootstrap.css">
    
    <!--Font Awesome-->
    <link rel="stylesheet" href="resources/css/font-awesome.css">
    
     <!-- Rropero App-->
    <script src="resources/js/lib/angular.js"></script>
    <script src="resources/js/app.js"></script>
    <script src="resources/js/login.js"></script>

    <!--Login css-->
    <link rel="stylesheet" href="resources/css/login.css">
</head>
<body ng-app=rroperoLogin>
    <div ng-controller="login" class="col-lg-4 col-lg-offset-8 col-md-5 col-md-offset-7 col-sm-8 col-sm-offset-4 col-xs-10 col-xs-offset-2">
        <form id="login-form">
            <i class="fa fa-user fa-4x" aria-hidden="true"></i>
            <input 
                class="input-form" 
                type="text" 
                ng-model="usuario" 
                name="usuario" 
                placeholder="USUARIO">
            <i class="fa fa-unlock-alt fa-4x" aria-hidden="true"></i>
            <input 
                class="input-form" 
                type="password" 
                ng-model="password" 
                name="password" 
                placeholder="CONTRASEÑA">
            <button 
                type="submit" 
                ng-click="access()">
                Entrar
            </button>
            <div class="error">{{error}}</div>
        </form>
    </div>

    <img id="logo" src="resources/img/logo.png" alt="Rropero Logo">

</body>
</html>

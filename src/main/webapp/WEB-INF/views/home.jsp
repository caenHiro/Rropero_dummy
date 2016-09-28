<% 
    HttpSession httpsession=request.getSession(); 
    if(httpsession == null || httpsession.getAttribute("rropero") == null){
        response.sendRedirect("");
    }
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<?xml version='1.0' encoding='UTF-8' ?>
<!doctype html>
<html lang="en" class="no-js">
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">

	<link href='https://fonts.googleapis.com/css?family=Open+Sans:300,400,700' rel='stylesheet' type='text/css'>

	<link rel="stylesheet" href="resources/css/reset.css"> <!-- CSS reset -->
	<link rel="stylesheet" href="resources/css/dashboard.css"> <!-- Resource style -->
	<script src="resources/js/modernizr.js"></script> <!-- Modernizr -->
  	



    <!--JQuery-->
    <!--<script src="resources/js/lib/jquery.min.js"></script>-->
    <script src="resources/js/jquery-2.1.4.js"></script>
    
    <!--Bootstrap-->
    <!--<link rel="stylesheet" href="resources/css/lib/bootstrap.css">
    <script src="resources/js/lib/bootstrap.js"></script>-->

    <!--Materialize-->
    
    <!--<link rel="stylesheet" href="resources/css/lib/materialize.css">
    <script src="resources/js/lib/materialize.js"></script> -->

    <!--Font Awesome-->
    <link rel="stylesheet" href="resources/css/font-awesome.css">
    
    <!--Inventario CSS-->
    <!--<link rel="stylesheet" href="resources/css/inventario.css">
    <link rel="stylesheet" href="resources/css/verInventario.css">
    <link rel="stylesheet" href="resources/css/registrar.css">
    -->
    
    <!-- Rropero App-->
    <script src="resources/js/lib/angular.js"></script>
    <script src="resources/js/lib/angular-routes.js"></script>
    <script src="resources/js/app.js"></script>
    <!--
    <script src="resources/js/main.js"></script>
    <script src="resources/js/inventarioVer.js"></script>
    <script src="resources/js/inventarioReg.js"></script>
    <script src="resources/js/inventarioAct.js"></script>
-->






	<title>Rropero: Inventario</title>
</head>
<body ng-app=rroperoApp>
	<header class="cd-main-header">
		<a href="#0" class="cd-logo"><img src="resources/img/logo_.png" alt="Logo"></a>
		
		<div class="cd-search is-hidden">
			<form action="#0">
				<input type="search" placeholder="Search...">
			</form>
		</div> <!-- cd-search -->

		<a href="#0" class="cd-nav-trigger">Menu<span></span></a>

		<nav class="cd-nav">
			<ul class="cd-top-nav">
				<li><a href="#0">Tour</a></li>
				<li><a href="#0">Support</a></li>
				<li class="has-children account">
					<a href="#0">
						<img src="resources/img/cd-avatar.png" alt="avatar">
						Account
					</a>

					<ul>

						<li><a href="#0">My Account</a></li>
						<li><a href="#0">Edit Account</a></li>
						<li><a href="#0">Logout</a></li>
					</ul>
				</li>
			</ul>
		</nav>
	</header> <!-- .cd-main-header -->

	<main class="cd-main-content">
		<nav class="cd-side-nav">
			<ul>
				<li class="cd-label">Main</li>
				<li class="has-children overview">
					<a href="#0">Overview</a>
					
					<ul>
						<li><a href="#0">All Data</a></li>
						<li><a href="#0">Category 1</a></li>
						<li><a href="#0">Category 2</a></li>
					</ul>
				</li>
				<li class="has-children notifications active">
					<a href="#0">Notifications<span class="count">3</span></a>
					
					<ul>
						<li><a href="#0">All Notifications</a></li>
						<li><a href="#0">Friends</a></li>
						<li><a href="#0">Other</a></li>
					</ul>
				</li>

				<li class="has-children comments">
					<a href="#0">Comments</a>
					
					<ul>
						<li><a href="#0">All Comments</a></li>
						<li><a href="#0">Edit Comment</a></li>
						<li><a href="#0">Delete Comment</a></li>
					</ul>
				</li>
			</ul>

			<ul>
				<li class="cd-label">Secondary</li>
				<li class="has-children bookmarks">
					<a href="#0">Bookmarks</a>
					
					<ul>
						<li><a href="#0">All Bookmarks</a></li>
						<li><a href="#0">Edit Bookmark</a></li>
						<li><a href="#0">Import Bookmark</a></li>
					</ul>
				</li>
				<li class="has-children images">
					<a href="#0">Images</a>
					
					<ul>
						<li><a href="#0">All Images</a></li>
						<li><a href="#0">Edit Image</a></li>
					</ul>
				</li>

				<li class="has-children users">
					<a href="#0">Users</a>
					
					<ul>
						<li><a href="#0">All Users</a></li>
						<li><a href="#0">Edit User</a></li>
						<li><a href="#0">Add User</a></li>
					</ul>
				</li>
			</ul>

			<ul>
				<li class="cd-label">Action</li>
				<li class="action-btn"><a href="#0">+ Button</a></li>
			</ul>
		</nav>

		<div class="content-wrapper">
		    <!--Inicio Seccion principal-->
		    <section ng-view>
		    </section>
		    <!--Fin Seccion principal-->

		</div> <!-- .content-wrapper -->
	</main> <!-- .cd-main-content -->

<script src="resources/js/jquery.menu-aim.js"></script>
<script src="resources/js/dashboard.js"></script> <!-- Resource jQuery -->
</body>
</html>
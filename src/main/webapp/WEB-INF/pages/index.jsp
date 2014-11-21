<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<!--<!doctype>
<html>
<head>
<title>Home</title>
</head>
<body>
<div>
<h1>Home</h1>
<sec:authorize access="isAnonymous()">
    <p>
    <a href="/spring_security_login">Sign In</a>
    </p>
</sec:authorize>

<sec:authorize access="isAuthenticated()">
    <p>Hello, ${userDetails.username}! <a href="/j_spring_security_logout">Sign Out</a></p>
</sec:authorize>

<sec:authorize access="hasRole('admin')">
    <p>
    <a href="/admin">Admin page</a>
    </p>
</sec:authorize>
</div>
</body>
</html>-->
<!doctype html>
<html lang="en" ng-app="cialApp">
<head>
    <meta charset="UTF-8">
    <title>CIAL</title>
    <link rel="stylesheet" type="text/css" href="/assets/css/semantic.min.css">
    <!--    <link rel="stylesheet" type="text/css" href="css/semantic.css">-->
    <link rel="stylesheet" type="text/css" href="/assets/css/cial.css">
    <link rel="stylesheet" type="text/css" href="/assets/css/bootstrap-datetimepicker.min.css">
    <link rel="stylesheet" type="text/css" href="/assets/css/jquery.vegas.css">
    <link rel="stylesheet" type="text/css" href="/assets/css/immersive-slider.css">
</head>
<body id="example">
<div style="background-color: #ffffff">
    <div class="container" style="padding-top: 0px;">
        <div class="ui grid">
            <div class="row">
                <div class="three wide column">
                    <img class="ui medium image" src="/assets//img/logoCiva.png">
                </div>
                <div class="thirteen wide column" style="padding-top: 10px;">
                    <div class="menu_cial" style="padding-top: 24px;">
                        <div class="ui secondary menu">
                            <div class="right menu">
                                <div class="ui dropdown item">
                                    Idioma <i class="dropdown icon"></i>

                                    <div class="menu">
                                        <a class="item">English</a>
                                        <a class="item">Portugues</a>
                                        <a class="item">Español</a>
                                    </div>
                                </div>
                                <sec:authorize access="isAnonymous()">
                                    <div class="item">
                                        <div class="ui tiny buttons" style="font-size: 13px;">
                                            <a class="ui button purple" href="#/ingresar">Ingresar</a>

                                            <div class="or"></div>
                                            <a class="ui button tiny" href="#/registrarse">Registrarse</a>
                                        </div>
                                    </div>
                                </sec:authorize>
                                <sec:authorize access="isAuthenticated()">
                                    <div class="item">
                                        <div class="ui">
                                            <p>Hola, ${userDetails.username}! <i class="user icon"></i>
                                                <a href="/j_spring_security_logout" class="ui mini red button" style="width: 27px;padding-bottom: 4px;
                                                padding-top: 4px; padding-left: 5px;padding-right: 5px;"><i class="off icon"></i></a>
                                        </div>
                                    </div>
                                </sec:authorize>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<div style="display: none;">
    <input type="text" id="or"/>
    <input type="text" id="des"/>
    <input type="text" id="fec"/>
    <input type="text" id="codi_bus"/>
    <textarea id="asientos" cols="30" rows="10"></textarea>
</div>

<div class="ui purple inverted  menu" style="margin-bottom: 0px;margin-top: 0px;">
    <div class="centrado">
        <a class="active item" href="#/hello">
            <i class="home icon"></i> Inicio
        </a>

        <div class="ui dropdown item">
            Quienes Somos <i class="dropdown icon"></i>

            <div class="menu">
                <a class="item" href="#/historia"><i class="stackexchange icon"></i> Nuestra Historia</a>

                <div class="ui dropdown submenu item" id="">Nuestra Filosofia <i class="dropdown icon"></i>

                    <div class="menu">
                        <a class="item" href="#/mision"><i class="forward mail icon"></i> Mision</a>
                        <a class="item" href="#/vision"><i class="forward mail icon"></i> Vision</a>
                    </div>
                </div>
            </div>
        </div>
        <a class="item" href="#/agencias">
            <i class="map marker icon"></i> Agencias
        </a>
        <a class="item" href="#/compra_pasajes">
            <i class="cart icon"></i> Compra de Pasajes
        </a>
        <a class="item" href="#/terminos_condiciones">
            <i class="file outline icon"></i> Terminos Y Condiciones
        </a>
        <a class="item" href="#/ayuda">
            <i class="help icon"></i> Preguntas y Ayudas
        </a>

        <div class="right menu">
            <div class="item">
                <div class="ui mini icon input">
                    <input type="text" placeholder="Search...">
                    <i class="search link icon"></i>
                </div>
            </div>
        </div>
    </div>
</div>

<div class="ui purple vertical demo sidebar menu">
    <a class="item">
        <i class="home icon"></i>
        Home
    </a>
    <a class="active item">
        <i class="heart icon"></i>
        Current Section
    </a>
    <a class="item">
        <i class="facebook icon"></i>
        Like us on Facebook
    </a>

    <div class="item">
        <b>More</b>

        <div class="menu">
            <a class="item">About</a>
            <a class="item">Contact Us</a>
        </div>
    </div>
</div>

<div ng-view style="background-color: rgba(196, 190, 247, 0.26);height: 965px;">

</div>
<div class="pie">
    <div class="container" style="padding-bottom: 0px;">
        <div class="ui grid">
            <div class="row">
                <div class="ui four wide column">
                    <dl>
                        <dt>
                        <h4 class="ui header"><i class="map marker icon"></i> Terminales principales</h4></dt>
                        <br/>
                        <dd><a href="">Av. Paseo de la República Nro. 569 - La Victoria - PERÚ </a></dd>
                        <dd><a href="">Av. Javier Prado Este Nro. 1155 - La Victoria - PERÚ</a></dd>
                        <dd><a href="">Av. Javier Prado Este Nro. 1155 - La Victoria - PERÚ</a></dd>
                    </dl>
                </div>
                <div class="ui four wide column">
                    <dl>
                        <dt>
                        <h4 class="ui header"><i class="ui phone icon"></i> Central Telefónica</h4></dt>
                        <br/>
                        <dd><a href="">01 555 4879</a></dd>
                    </dl>
                </div>
                <div class="ui four wide column">
                    <dl>
                        <dt>
                        <h4 class="ui header"><i class="ui mail outline icon"></i> E-Mail</h4></dt>
                        <br/>
                        <dd><a href="">cial.contacto@cial.com.pe</a></dd>
                    </dl>
                </div>
                <div class="ui four wide column">
                    <dl>
                        <dt>
                        <h4 class="ui header"><i class="ui users icon"></i> Siguenos en</h4></dt>
                        <br/>
                        <dd><img class="facebook" src="/assets//img/facebook-gray.png" style="width: 12%;">
                            <img style="display:none;width: 12%;" class="facebook_hide" src="/assets//img/facebook.png">
                        </dd>
                        <dd><img class="twitter" src="/assets//img/twitter-gray.png" style="width: 12%;">
                            <img style="display:none;width: 12%;" class="twitter_hide" src="/assets//img/twitter.png">
                        </dd>
                        <dd><img class="youtube" src="/assets//img/youtube-gray.png" style="width: 12%;">
                            <img style="display:none;width: 12%;" class="youtube_hide" src="/assets//img/youtube.png">
                        </dd>
                        <dd><img class="googleplus" src="/assets//img/googleplus-gray.png" style="width: 12%;">
                            <img style="display:none;width: 12%;" class="googleplus_hide"
                                 src="/assets//img/googleplus.png"></dd>
                    </dl>
                </div>
            </div>
        </div>
    </div>
</div>


<script type="text/javascript" src="/assets/js/jquery.js"></script>
<script type="text/javascript" src="/assets/js/semantic.min.js"></script>
<script type="text/javascript" src="/assets/js/semantic.js"></script>
<script type="text/javascript" src="/assets/js/menu.js"></script>
<script type="text/javascript" src="/assets/js/tablesort.js"></script>
<script type="text/javascript" src="/assets/js/waypoints.js"></script>
<script type="text/javascript" src="/assets/js/principal.js"></script>
<script src="resources/components/requirejs/require.js" data-main="resources/scripts/main.js"></script>
</body>
</html>

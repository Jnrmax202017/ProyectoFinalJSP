<%-- 
    Document   : index
    Created on : 14 may 2022, 13:11:44
    Author     : giane
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <!--========== BOX ICONS ==========-->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/boxicons@latest/css/boxicons.min.css">

        <!--========== CSS ==========-->
        <link rel="stylesheet" href="css/styles.css">

        <title>INKARDEX</title>
    </head>
    <body>
        <!--========== HEADER ==========-->
        <header class="header">
            <div class="header__container">

                <a href="#" class="header__logo">INKARDEX</a>
                <div class="d-flex">
                    <span style="margin-right: 10px; margin-top: 5px">${usuario.getNom()}</span>
                    <span style="margin-right: 10px;margin-top: 5px">${usuario.getApe()}</span>
                    <img src="img/user.png" alt="" class="header__img">
                </div>
                <div class="header__toggle">
                    <i class='bx bx-menu' id="header-toggle"></i>
                </div>
            </div>
        </header>

        <!--========== NAV ==========-->
        <div class="nav" id="navbar">
            <nav class="nav__container">
                <div>
                    <a href="Controlador?menu=index" target="myFrame" class="nav__link nav__logo">
                        <i class='bx bxs-disc nav__icon' ></i>
                        <span class="nav__logo-name">INKARDEX</span>
                    </a>

                    <div class="nav__list">
                        <div class="nav__items">
                            <h3 class="nav__subtitle">Principal</h3>

                            <a href="Controlador?menu=DashBoard&accion=default" target="myFrame" class="nav__link active">
                                <i class='bx bxs-dashboard nav__icon' ></i>
                                <span class="nav__name">Dashboard</span>
                            </a>

                            <div class="nav__dropdown">
                                <a  class="nav__link">
                                    <i class='bx bx-package nav__icon' ></i>
                                    <span class="nav__name">Productos</span>
                                    <i class='bx bx-chevron-down nav__icon nav__dropdown-icon'></i>
                                </a>

                                <div class="nav__dropdown-collapse">
                                    <div class="nav__dropdown-content">
                                        <a href="Controlador?menu=Productos&accion=Listar" target="myFrame" class="nav__dropdown-item">Registro</a>
                                        <a href="Controlador?menu=Movimiento&accion=Listar" class="nav__dropdown-item" target="myFrame">Movimientos</a>

                                    </div>
                                </div>
                            </div>

                            <a href="Controlador?menu=Proveedor&accion=Listar" target="myFrame" class="nav__link">
                                <i class='bx bx-user-voice nav__icon' ></i>
                                <span class="nav__name">Proveedores</span>
                            </a>
                        </div>

                        <div class="nav__items">
                            <h3 class="nav__subtitle">---------------</h3>

                            <a href="Controlador?menu=RegOrdenCompra&accion=default" target="myFrame" class="nav__link">
                                <i class='bx bx-store-alt nav__icon' ></i>
                                <span class="nav__name">Orden de Compra</span>
                            </a>

                        </div>
                    </div>
                </div>

                <a href="login.jsp" class="nav__link nav__logout">
                    <i class='bx bx-log-out nav__icon' ></i>
                    <span class="nav__name">Salir</span>

                </a>
            </nav>

        </div>
        <div class="m-3" style="height: 900px">
            <iframe name="myFrame" style="height:100%; width: 100%; border: 0; "></iframe>
        </div>


        <!--========== MAIN JS ==========-->
        <script src="js/main.js"></script>
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
        <script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </body>
</html>
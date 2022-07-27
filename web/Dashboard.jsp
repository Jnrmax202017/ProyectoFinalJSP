<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!--========== BOX ICONS ==========-->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/boxicons@latest/css/boxicons.min.css">
        <link href="css/dash.css" rel="stylesheet" type="text/css"/>
        <link href="css/loader.css" rel="stylesheet" type="text/css"/>
        <!--========== CSS ==========-->
        <link rel="stylesheet" href="css/styles.css">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    </head>
    <body class="hidden">
        <div class="centrado" id="onload">
            <div class="lds-roller">
                <div></div>
                <div></div>
                <div></div>
                <div></div>
                <div></div>
                <div></div>
                <div></div>
                <div></div>
            </div>
        </div>
        <div class="container">
            <div class="d-flex">
                <h3 id="da">DASHBOARD</h3>
                <span style=" margin-left: 180px">
                    <img src="img/dash.png" height="60px" width="60px"/>
                </span>
            </div>

            <div class="container">
                <div class="row">
                    <div  
                        style="
                        background: linear-gradient(
                        45deg,
                        rgba(29, 236, 197, 0.5),
                        rgba(91, 14, 214, 0.5) 100%
                        );" class="mask col-sm p-3 mb-2 bg-success text-white" id="nav1">

                        <i class='bx bxs-user nav__icon'></i>
                        Cant. de Proveedores : ${dashboard.getCantProv()}

                    </div>
                    <div  style="
                          background: linear-gradient(
                          45deg,
                          rgba(0, 183, 74, 0.78),
                          rgba(91, 14, 214, 0.5) 100%
                          );" class="col-sm p-3 mb-2 bg-info text-white" id="nav2">

                        <i class='bx bx-cart nav__icon'></i>
                        Cant. de Productos : ${dashboard_cant_prod.getCantProd()}
                    </div>
                    <div style="
                         background: linear-gradient(
                         45deg,
                         rgba(29, 236, 197, 0.5),
                         rgba(91, 14, 214, 0.5) 100%
                         );"  class="col-sm p-3 mb-2 bg-primary text-white" id="nav3">
                        <i class='bx bx-file nav__icon'></i>
                        N° Ord. de Compras: ${dashboard_cant_ordcompra.getCantOrdCompras()}
                    </div>
                    <div style="
                         background: linear-gradient(
                         35deg,
                         rgba(29, 236, 197, 0.5),
                         rgba(249, 49, 84, 0.34)
                         60%
                         );"  class="col-sm p-3 mb-2 bg-danger text-white" id="nav4">
                        <i class='bx bx-bell nav__icon'></i>
                        Productos por agotarse: <br>
                        <button type="button" class="btn btn-light" data-bs-toggle="modal" data-bs-target="#exampleModal" id="btnn">
                            Ver Detalle
                        </button>
                    </div>
                </div>

                <div class="container">
                    <div class ="row">
                        <div class ="col-6">
                            <img style="margin-top: 100px;" src="img/img_grafico.jpg" width="350px" alt="" class="img1"/>
                        </div>
                        <div class ="col-6">
                            <img style="margin-top: 100px;" src="img/estadistica.png" width="350px" alt="" class="img2"/>
                        </div>
                    </div>


                </div>

                <!-- Modal -->
                <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h5 class="modal-title" id="exampleModalLabel">Productos que están por agotarse "Stock<15"</h5>
                                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                            </div>
                            <div class="modal-body">

                                <span>Nota: Si stock es inferior o igual a 5 se mostrará de rojo.</span>


                                <div class="col-sm-12">

                                    <table class="table table-hover">
                                        <thead class="thead-dark">
                                            <tr>

                                                <th>Codigo</th>
                                                <th>Producto</th>
                                                <th>Stock</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <c:forEach var="pro" items="${productos}">
                                                <tr>
                                                    <td>${pro.getCodPro()}</td>
                                                    <td>${pro.getNomPro()}</td>

                                                    <td>

                                                        <c:if test="${pro.getStockPro() <= 5}">

                                                            <label style="color:red;">${pro.getStockPro()}</label>    
                                                        </c:if>

                                                        <c:if test="${pro.getStockPro() > 5}">

                                                            <label>${pro.getStockPro()}</label>    
                                                        </c:if>  
                                                    </td>
                                                </tr>
                                            </c:forEach>

                                        </tbody>
                                    </table>

                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cerrar</button>

                                </div>
                            </div>
                        </div>
                    </div>




                </div>
            </div>

        </div>





        <!--========== MAIN JS ==========-->
        <script src="js/main.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
        <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
        <script src="js/codigo.js" type="text/javascript"></script>
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
        <script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </body>
</html>
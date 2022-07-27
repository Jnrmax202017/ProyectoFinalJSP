<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="DataTable/datatables.min.css"/>
        <link rel="stylesheet" type="text/css" href="Datatable/DataTables-1.12.1/css/dataTables.bootstrap5.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
        <!--========== BOX ICONS ==========-->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/boxicons@latest/css/boxicons.min.css">
        
        <!--========== CSS ==========-->
        <link rel="stylesheet" href="css/styles.css">
        <link rel="stylesheet" href="css/Epro.css">
        <link href="css/loader.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>

        <!-- Bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        
        <!-- Option 1: Bootstrap Bundle with Popper -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>   

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
        <div class="d-flex">
            <!-- Button trigger modal -->
            <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">Nuevo/Actualizar Producto</button>

            <!-- Modal -->
            <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                <div class="modal-dialog modal-lg">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title" id="exampleModalLabel">Registro de Productos</h5>
                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                        </div>
                        <div class="modal-body">
                            <div class="card-body" align="center">
                                <form action="Controlador?menu=Productos" method="POST">
                                    <div class="row">
                                        <div class="col-md-3 row justify-content-center align-items-center">
                                            <div class="form-group text-center">
                                                <label>Fecha de Ingreso</label>
                                            </div>
                                        </div>
                                        <div class="col-md-3">
                                            <div class="form-group">
                                                <input type="date" name="Fecha" value="${producto.getFech()}" class="form-control" required>
                                            </div>
                                        </div>
                                    </div>
                                    <br>
                                    <div class="row">
                                        <div class="col-md-3 row justify-content-center align-items-center">
                                            <div class="form-group text-center">
                                                <label>Cod Producto*</label>
                                            </div>
                                        </div>
                                        <div class="col-md-3">
                                            <div class="form-group">
                                                <input type="text" name="txtCodpro" value="${producto.getCod()}" class="form-control"required>
                                            </div>
                                        </div>
                                    </div>
                                    <br>
                                    <div class="row">
                                        <div class="col-md-3 row justify-content-center align-items-center">
                                            <div class="form-group text-center">
                                                <label>Nombre Producto*</label>
                                            </div>
                                        </div>
                                        <div class="col-md-3" align="left">
                                            <div class="form-group">
                                                <input type="text" name="txtpro" value="${producto.getNom()}" class="form-control" required>
                                            </div>
                                        </div>
                                        <div class="col-md-2 row justify-content-center align-items-center">
                                            <div class="form-group text-center">
                                                <label>Categoria*</label>
                                            </div>
                                        </div>
                                        <div class="col-md-4" align="left">
                                            <div class="form-group">
                                                <select class="form-select" name="select" value="${producto.getCat()}"                                                 <input type="text" name="txtpro" value="${producto.getNom()}" class="form-control" required>
>
                                                    <option>-- Escoge Categoria --</option>
                                                    <option>Sensores de movimiento</option>
                                                    <option>Camaras inteligentes</option>
                                                    <option>Alarmas de seguridad</option>
                                                </select>
                                            </div>
                                        </div>
                                    </div>
                                    <br>
                                    <div class="row">
                                        <div class="col-md-4">
                                            <div class="form-group" align="left" style="text-indent: 0.1em">
                                                <label>Marca </label>
                                            </div>
                                        </div>
                                        <div class="col-md-4" align="left" style="text-indent: 0.1em">
                                            <div class="form-group">
                                                <label>Precio </label>
                                            </div>
                                        </div>
                                        <div class="col-md-4" align="left" style="text-indent: 0.1em">
                                            <div class="form-group">
                                                <label>Stock </label>
                                            </div>
                                        </div>
                                    </div>
                                    <br>
                                    <div class="row">
                                        <div class="col-md-4" align="left">
                                            <div class="form-group">
                                                <input type="text" name="txtmarca" value="${producto.getMar()}" class="form-control" placeholder="Marca" required>
                                            </div>
                                        </div>
                                        <div class="col-md-4" align="left">
                                            <div class="form-group">
                                                <input type="number" min="25.00" value="0.00" step="5.00" name="pre" value="${producto.getPre()}" class="form-control">
                                            </div>
                                        </div>
                                        <div class="col-md-4" align="left">
                                            <div class="form-group">
                                                <input type="number" min="1" value="1" name="intnum" value="${producto.getStck()}" class="form-control" placeholder="Stock">
                                            </div>
                                        </div>
                                    </div>
                                    <br>
                                    <button type="submit" name="accion" value="Agregar" class="btn btn-info">Agregar<span style="margin-left: 5px">
                                            <img src="img/add.png" height="20px" width="20px"/>
                                        </span></button>
                                    <button type="submit" name="accion" value="Actualizar" class="btn btn-secondary">Actualizar<span style="margin-left: 5px">
                                            <img src="img/act.png" height="20px" width="20px"/>
                                        </span></button>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <br>
        <br>
        <div class="table-body" align="center">
            <div class="table-responsive lg">
                <div class="col-sm-12">
                    <table class="table table-dark table-hover" id="example" style="text-align: center;">
                        <thead class="thead-dark" align="center">
                            <tr>
                                <th>IdPro</th>
                                <th>Fecha de Registro</th>
                                <th>Codigo</th>
                                <th>Producto</th>
                                <th>Categoria</th>
                                <th>Marca</th>
                                <th>Precio</th>
                                <th>Stock</th>
                                <th>Accion</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="pro" items="${productos}">
                                <tr>
                                    <td>${pro.getId()}</td>
                                    <td>${pro.getFech()}</td>
                                    <td>${pro.getCod()}</td>
                                    <td>${pro.getNom()}</td>
                                    <td>${pro.getCat()}</td>
                                    <td>${pro.getMar()}</td>
                                    <td>${pro.getPre()}</td>
                                    <td>${pro.getStck()}</td>

                                    <td class="d-flex">
                                        <a class="btn btn-warning" href="Controlador?menu=Productos&accion=Editar&id=${pro.getId()}" >Editar</a>
                                        <a class="btn btn-danger" style="margin-left: 10px" href="Controlador?menu=Productos&accion=Borrar&id=${pro.getId()}">Eliminar</a>
                                    </td>
                                </tr>
                            </c:forEach>

                        </tbody>
                    </table>

                </div>
            </div>
        </div>


        <!--========== MAIN JS ==========-->
        <script src="js/main.js"></script>

        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
        <script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
        <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
        <script src="js/codigo.js" type="text/javascript"></script>
        <script src="DataTable/datatables.min.js" type="text/javascript"></script>
        <script src="js/main_1.js" type="text/javascript"></script>
    </body>
</html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <!--========== BOX ICONS ==========-->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/boxicons@latest/css/boxicons.min.css">

        <!--========== CSS ==========-->
        <link rel="stylesheet" href="css/styles.css">
        <link rel="stylesheet" href="css/Epro.css">
        <link href="css/loader.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" type="text/css" href="DataTable/datatables.min.css"/>
        <link rel="stylesheet" type="text/css" href="Datatable/DataTables-1.12.1/css/dataTables.bootstrap5.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
        <!-- Bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">


        <title>Clientes/Proveedores</title>


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
            <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">Nuevo/Actualizar Proveedor</button>
            <!-- Modal -->
            <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                <div class="modal-dialog modal-lg">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title" id="exampleModalLabel">Registro de Proveedor</h5>
                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                        </div>
                        <div class="modal-body">
                            <div class="card-body" align="center">
                                <form action="Controlador?menu=Proveedor" method="POST">
                                    <div class="row">
                                        <div class="col-md-2 row justify-content-center align-items-center">
                                            <div class="form-group text-center">
                                                <label>Fecha de Ingreso</label>
                                            </div>
                                        </div>
                                        <div class="col-md-3">
                                            <div class="form-group">
                                                <input type="date" name="FechRegis" value="${proveedor.getFe()}" class="form-control" required>
                                            </div>
                                        </div>
                                    </div>
                                    <br>
                                    <div class="row">
                                        <div class="col-md-2 row justify-content-center align-items-center">
                                            <div class="form-group text-center">
                                                <label>Codigo*</label>
                                            </div>
                                        </div>
                                        <div class="col-md-3">
                                            <div class="form-group">
                                                <input type="text" name="txtCodPro" value="${proveedor.getCod()}" class="form-control" required>
                                            </div>
                                        </div>
                                        <div class="col-md-2 row justify-content-center align-items-center">
                                            <div class="form-group text-center">
                                                <label>RUC*</label>
                                            </div>
                                        </div>
                                        <div class="col-md-3">
                                            <div class="form-group">
                                                <input type="text" name="txtRuc" value="${proveedor.getRuc()}" class="form-control" required>
                                            </div>
                                        </div>
                                    </div>
                                    <br>
                                    <div class="row">
                                        <div class="col-md-2 row justify-content-center align-items-center">
                                            <div class="form-group text-center">
                                                <label>Proveedor*</label>
                                            </div>
                                        </div>
                                        <div class="col-md-3" align="left">
                                            <div class="form-group">
                                                <input type="text" name="txtNomPro" value="${proveedor.getNom()}" class="form-control" placeholder="Nombre" required>
                                            </div>
                                        </div>
                                        <div class="col-md-3" align="left">
                                            <div class="form-group">
                                                <input type="text" name="txtApePro" value="${proveedor.getApe()}" class="form-control" placeholder="Apellido" required>
                                            </div>
                                        </div>
                                        <div class="col-md-3" align="left">
                                            <div class="form-group">
                                                <input type="text" name="txtTele" value="${proveedor.getTel()}" class="form-control" placeholder="Celular" required>
                                            </div>
                                        </div>
                                    </div>
                                    <br>
                                    <div class="row">
                                        <div class="col-md-2 row justify-content-center align-items-center">
                                            <div class="form-group text-center">
                                                <label>Correo*</label>
                                            </div>
                                        </div>
                                        <div class="col-md-8" align="left">
                                            <div class="form-group">
                                                <input type="text" name="txtCorreo" value="${proveedor.getCorreo()}" class="form-control" placeholder="Correo electronico" required>
                                            </div>
                                        </div>

                                    </div>
                                    <br>
                                    <div class="row">  
                                        <div class="col-md-2 row justify-content-center align-items-center">
                                            <div class="form-group text-center">
                                                <label>Empresa*</label>
                                            </div>
                                        </div>
                                        <div class="col-md-4" align="left">
                                            <div class="form-group">
                                                <input type="text" name="txtEmpre" value="${proveedor.getEmpre()}" class="form-control" placeholder="Empresa Nombre" required>
                                            </div>
                                        </div>
                                        <div class="col-md-2 row justify-content-center align-items-center">
                                            <div class="form-group text-center">
                                                <label>Telefono*</label>
                                            </div>
                                        </div>
                                        <div class="col-md-4" align="left">
                                            <div class="form-group">
                                                <input type="text" name="txtCel" value="${proveedor.getCel()}" class="form-control" required>
                                            </div>
                                        </div>
                                    </div>
                                    <br>

                                    <button type="submit" name="accion" value="Agregar" class="btn btn-danger"/>Agregar<span style="margin-left: 5px">
                                            <img src="img/add.png" height="20px" width="20px"/>
                                        </span></button>
                                    <button type="submit" name="accion" value="Actualizar" class="btn btn-secondary"/>Actualizar<span style="margin-left: 5px">
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
                    <table class="table table-dark table-hover" id="example">
                        <thead class="thead-dark" align="center">
                            <tr>
                                <th>IdProv</th>
                                <th>Fecha de Registro</th>
                                <th>Codigo</th>
                                <th>RUC</th>
                                <th>Nombre</th>
                                <th>Apellido</th>
                                <th>Telefono</th>
                                <th>Celular</th>
                                <th>Correo Electronico</th>
                                <th>Empresa</th>
                                <th>Accion</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="prov" items="${proveedores}">
                                <tr>
                                    <th scope="row">${prov.getId()}</th>
                                    <td>${prov.getFe()}</td>
                                    <td>${prov.getCod()}</td>
                                    <td>${prov.getRuc()}</td>
                                    <td>${prov.getNom()}</td>
                                    <td>${prov.getApe()}</td>
                                    <td>${prov.getTel()}</td>
                                    <td>${prov.getCel()}</td>
                                    <td>${prov.getCorreo()}</td>
                                    <td>${prov.getEmpre()}</td>

                                    <td class="d-flex">
                                        <a class="btn btn-warning btn-sm" href="Controlador?menu=Proveedor&accion=Editar&id=${prov.getId()}">Editar</a>
                                        <a class="btn btn-danger btn-sm" style="margin-left: 10px" href="Controlador?menu=Proveedor&accion=Borrar&id=${prov.getId()}">Eliminar</a>
                                    </td>
                                </tr>
                            </c:forEach>

                        </tbody>
                    </table>

                </div>
            </div>
        </div>

        <!--========== MAIN JS ==========-->
        <script src="assets/js/main.js"></script>
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

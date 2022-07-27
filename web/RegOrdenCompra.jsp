<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!--========== BOX ICONS ==========-->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/boxicons@latest/css/boxicons.min.css">

        <!--========== CSS ==========-->
        
        <title>JSP Page</title>
        <link  type="text/css"rel="stylesheet" href="Eprocss/Epro.css"/>
         <link href="css/loader.css" rel="stylesheet" type="text/css"/>
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
            <hr>
            <hr>
            <h1 class="title">ORDEN DE COMPRA DE PRODUCTOS</h1>
            <hr>
            <form action="Controlador?menu=RegOrdenCompra" method="POST">
            <div class="card">
                
                <div class="card-body" style="background: #F2D7D5;">
                        <div class="row">
                            <div class="col-xs-6 col-sm-6 col-md-6">
                                <div class="form-group row">
                                    <label class="col-form-label col-sm-4">Fecha de Orden :</label>
                                    <div class="col-sm-8">
                                        <input type="date" name="fechaO"  class="form-control" style="font-style:italic" ><br>
                                    </div>
                                </div>
                            </div>

                            <div class="col-xs-6 col-sm-6 col-md-6">
                                <div class="form-group row">
                                    <label  class="col-form-label col-sm-4">Orden de Compra :</label>
                                    <div class="col-sm-8">
                                        <input type="text" name="oc"  class="form-control " value="${nord}" placeholder="" style="font-style:italic" disabled>
                                    </div>
                                </div>
                            </div>
                        </div>


                        <div class="row">

                            <div class="col-xs-6 col-sm-6 col-md-6">
                                <div class="form-group row">
                                    <label  class="col-form-label col-sm-4">Fecha de Entrega :</label>
                                    <div class="col-sm-8"> 
                                        <input type="date" name="fechaE" class="form-control"  style=font-style:italic;  >
                                    </div>
                                </div>
                            </div>

                            <div class="col-xs-6 col-sm-6 col-md-6">
                                <div class="form-group row">
                                    <label  class="col-form-label col-sm-4">Proveedor :</label>
                                    <div class="col-sm-8">
                                        <select class="form-select" name="select" value="">
                                            <option>-- Elija Proveedor --</option>
                                            <option>SECURITY SAC</option>
                                            <option>PROTECTOR SA</option>
                                            <option>SECURITAS SAC</option>
                                        </select>

                                    </div>
                                </div>

                            </div>
                        </div><br>
                        <div class="row">

                            <div class="col-xs-6 col-sm-6 col-md-6">
                                <div class="form-group row">
                                    <label  class="col-form-label col-sm-4">Fecha de Pago :</label>
                                    <div class="col-sm-8"> 
                                        <input type="date" name="fechaP" class="form-control"  style=font-style:italic;  >
                                    </div>
                                </div>
                            </div>

                            <div class="col-xs-6 col-sm-6 col-md-6">
                                <div class="form-group row">
                                    <label  class="col-form-label col-sm-4">Ruc Empresa :</label>
                                    <div class="col-sm-8"> 
                                        <input type="text" name="ruc" class="form-control"  style=font-style:italic;  >
                                    </div>
                                </div>

                            </div>

                        </div><br>
                        <div class="row">

                            <div class="col-xs-6 col-sm-6 col-md-6">
                                <div class="form-group row">
                                    <label  class="col-form-label col-sm-4">Direccion de Entrega:</label>
                                    <div class="col-sm-8"> 
                                        <input type="text" name="dirE" class="form-control"  style=font-style:italic;  >
                                    </div>
                                </div>
                            </div>

                            <div class="col-xs-6 col-sm-6 col-md-6">
                                <div class="form-group row">
                                    <label  class="col-form-label col-sm-4">Autorizado Por :</label>
                                    <div class="col-sm-8"> 
                                        <input type="text" name="empl" class="form-control"  style=font-style:italic;  >
                                    </div>
                                </div>

                            </div>

                        </div>

                    </div>
                    <br>
                    <div class="card">

                        <div class="card-body" style="background: #F2D7D5;">
                            <div class="row">
                                <div class="col-xs-6 col-sm-6 col-md-6">
                                    <div class="form-group row">
                                        <label  class="col-form-label col-sm-4">COD Producto :</label>
                                        <div class=" hstack gap-3 col-sm-8">
                                            <input class="form-control " type="text" name="txtCodpro" value="${p.getCod()}"placeholder="Ingresa el codigo" style="font-style:italic; ">
                                            <button type="submit" name="accion" value="Buscar" class="btn btn-secondary" >Buscar</button>

                                        </div>
                                    </div>
                                </div>

                                <div class="col-xs-6 col-sm-6 col-md-6">
                                    <div class="form-group row">
                                        <label class="col-form-label col-sm-4">Categoria :</label>
                                        <div class="col-sm-8">
                                            <input class="form-control" type="text" placeholder=""value="${p.getCat()}" name="cat" >
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <br>

                            <div class="row">

                                <div class="col-xs-6 col-sm-6 col-md-6">
                                    <div class="form-group row">
                                        <label  class="col-form-label col-sm-4">Producto :</label>
                                        <div class="col-sm-8"> 
                                            <input class="form-control" type="text" placeholder=""value="${p.getNom()}" name="nompro" >
                                        </div>
                                    </div>
                                </div>

                                <div class="col-xs-6 col-sm-6 col-md-6">
                                    <div class="form-group row">
                                        <label  class="col-form-label col-sm-4">Stock Actual :</label>
                                        <div class="col-sm-8">
                                            <input class="form-control" type="text" placeholder="" value="${p.getStck()}" name="stac">
                                        </div>
                                    </div>
                                </div>


                            </div><br>
                            <div class="row">

                                <div class="col-xs-6 col-sm-6 col-md-6">
                                    <div class="form-group row">
                                        <label  class="col-form-label col-sm-4">Costo Unitario :</label>
                                        <div class="col-sm-8"> 
                                            <input class="form-control" type="text" value="${p.getPre()}" placeholder="$/0.00" name="precio" >
                                        </div>
                                    </div>
                                </div>

                                <div class="col-xs-6 col-sm-6 col-md-6">
                                    <div class="form-group row">
                                        <label  class="col-form-label col-sm-4">Cantidad :</label>
                                        <div class="col-sm-8">
                                            <input class="form-control"type="number"  name="cantidad" min="1" max="500" step="10" value="1">
                                        </div>
                                    </div>
                                </div>
                            </div><br>
                            <div class="btns">
                                <div class="form-group d-flex" style="justify-content:center; text-align: center;">
                                    <div class="d-grid gap-2 col-6 mx-auto">
                                        <button type="submit" class="btn btn-outline-dark" value="Adicionar" name="accion">Adicionar</button> 
                                    </div>
                                   
                                </div>
                            </div>
                        </div>
                    </div>
            </div>


            <div class="col-sm-10" style="margin: auto" >
                <table class="table table-striped table caption-top table table-bordered border-secondary">
                    <caption>Reporte de Orden</caption>
                    <thead style="text-align: center">
                        <tr>
                            <th>#</th>
                            <th>COD Producto</th>
                            <th>Producto</th>
                            <th>Costo Unitario</th>
                            <th>Cantidad</th>
                            <th>SubTotal</th>
                            <th>Acciones</th>
                        </tr>
                    </thead>
                    <tbody style="text-align: center">
                        <c:forEach var="list" items="${lista}">
                            <tr>
                                <td>${list.getItem()}</td>
                                <td>${list.getCod()}</td>
                                <td>${list.getNomp()}</td>
                                <td>${list.getPre()}</td>
                                <td>${list.getCant()}</td>
                                <td>${list.getSub()}</td>
                                <td class="d-flex">
                                    <a class="btn btn-info">Editar</a>
                                    <a class="btn btn-warning" style="margin-left: 10px">Eliminar</a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
            <div class="card-footer d-flex">
                <div class="col-sm-6">
                
                    <input type="submit" name="accion"  value="GenerarOrden" class="btn btn-danger">
                </div>
                <div class="col-sm-4 ml-auto">
                    <input type="text" name="txtTot" class="form-control" value="S/. ${total}0">
                </div>
            </div>
            </form>
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

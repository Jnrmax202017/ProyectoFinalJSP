
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Bungee&display=swap" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css2?family=Bungee+Shade&display=swap" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css2?family=Tourney:wght@300&display=swap" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://kit.fontawesome.com/1231a18d4a.js" crossorigin="anonymous"></script>
        <link href="css/login.css" rel="stylesheet" type="text/css"/>
        <link href="css/loader.css" rel="stylesheet" type="text/css"/>
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
        <div class="container mt-4 col-lg-4">
            <div class="card col-sm-10" >
                <div class="card-body" >
                    <form class="form-sign" action="Validar" method="POST">
                        <div class="form-group text-center">
                            <h2 class="ink">INKARDEX</h2>
                            <img src="img/LIDERMAN.png" width="170"/>

                        </div><br>
                        <h4 class="sis">Bienvenidos al Sistema</h4>
                        <div class="form-group">
                            <label>Usuario:</label>
                            <input type="text" name="txtusu" class="form-control" placeholder="Ingresa Usuario" style="border-radius: 15px 50px 15px 50px;font-style:italic; margin-top: 5px;" required>
                        </div><br>
                        <div class="form-group">
                            <label>Constraseña:</label>
                            <input type="password" name="txtcon" class="form-control" placeholder="************" style="border-radius: 15px 50px 15px 50px;font-style:italic; margin-top: 5px; " required>
                        </div><br>
               
                        <button type="button "name="accion" value="Ingresar" class="btn btn-secondary w-100" id="btn" style="border-radius: 15px 50px 15px 50px; font-family: 'Tourney', cursive;">Ingresar
                            <span style="margin-left: 5px">    
                                <img src="img/join.png" height="22px" width="22px"/>
                            </span></button>
                  
                       
                    </form>
                </div>
            </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
        <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
        <script src="js/codigo.js" type="text/javascript"></script>
    </body>
</html>


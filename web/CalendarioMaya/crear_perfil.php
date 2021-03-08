<?php
  session_start();

  //Comprobar que este logueado
  
  include './backend/database/conexion.php';  
  if ($conexion ->connect_error) {
    die("Connection failed: " . $conexion ->connect_error);
  }
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,700,700i|Poppins:300,400,500,700" rel="stylesheet">
    <link href="lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="lib/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <link href="lib/animate/animate.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
    <title>Crear Perfil</title>
</head>
<body>
    <style>
        .main-container{
            width: 35%;
            margin: 100px  auto;
            padding: 20px 20px 60px;
            -webkit-box-shadow: 13px 10px 5px -4px rgba(0,0,0,0.75);
            -moz-box-shadow: 13px 10px 5px -4px rgba(0,0,0,0.75);
            box-shadow: 13px 10px 5px -4px rgba(0,0,0,0.75);
            background: rgba(0, 0, 0, 0.3);
            color: black;
        }
        body{
        background: url("./img/fondo.jpg") ;
        background-size: cover;
        }
        .nav-menu > li > a:before {
        background-color: black;
        }
    </style>
    <div>
        <header id="header">
            <?php include 'BarradeNavegacion.php'; ?>
        </header>
    </div>

    <div class="main-container">
        <form method="POST" action="./backend/crear_perfil.php">
            <div class="form-group">
                <h1 style="text-align: center; color: black;">Crear Perfil</h1>
            </div>
            <div class="form-group">
              <label for="InputUser"><strong>Usuario</label>
              <br>
              <input type="text" name="user" class="form-control" id="InputUser" placeholder="Usuario" required aria-describedby="userlHelp" value = "<?php echo ($_POST['username']);?>">
              <br>
              <label for="InputEmail">E-mail</label>
              <br>
              <input type="email" name="email" class="form-control" id="InputEmail" placeholder="E-mail" required aria-describedby="emailHelp" value = "<?php echo ($_POST['email']);?>">
              <br>
              <label for="InputName">Nombre</label>
              <br>
              <input type="text" name="nombre" class="form-control" id="InputNombre" placeholder="Nombre" required aria-describedby="nombreHelp" value = "<?php echo ($_POST['nombre']);?>">
              <br>
              <label for="InputApellido">Apellido</label>
              <br>
              <input type="text" name="apellido" class="form-control" id="InputApellido" placeholder="Apellido" required aria-describedby="apellidoHelp" value = "<?php echo ($_POST['apellido']);?>">
              <br>
              <label for="InputContrasenia">Contraseña</label>
              <br>
              <input type="password" name="password" minlength="8" class="form-control" id="InputContrasenia" placeholder="Contraseña" required aria-describedby="passwordHelp" value = "<?php echo ($_POST['password']);?>">
              <br>
              <label for="InputNacimiento" style="color: white;">Fecha Nacimiento</label>
              <br>
              <input type="date" name="nacimiento" class="form-control" id="InputNacimiento" aria-describedby="nacimientoHelp"
                <?php if(isset($_POST['nacimiento'])) { ?>
                value = "<?php echo date('Y-m-d', strtotime($_POST['nacimiento']));?>"
                  <?php } else { ?>
                      value = ""
                         <?php } ?>
                >
              <br>
              <label for="InputTel" style="color: white;">Tel.</label>
              <br>
              <input type="tel" name="tel" class="form-control" id="InputTel" placeholder="Telefono" aria-describedby="telHelp" 
                <?php 
                  if(isset($_POST['telefono'])) { ?>
                  value = "<?php echo ($_POST['telefono']);?>"
                  <?php } else { ?>
                    value = ""
                 <?php } ?>
              >
            </div>
            <button type="submit" class="btn" style="text-align: center; color: black;  margin-left: auto; margin-right: auto;">Crear Perfil</button>
          </form>
    </div>

    <!-- Alerta  -->
    <?php if(isset($_SESSION['error'])){ ?>
      <div class="alert alert-danger alert-dismissible fade show" style="width: 50%; margin-left: auto; margin-right: auto;" role="alert">
        <strong>Error</strong> El usuario <?php echo ($usuario['username']);?> ya existe!
        <button type="button" class="close" data-dismiss="alert" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
    <?php $_SESSION['error'] = null; } ?>

  <script src="lib/jquery/jquery.min.js"></script>
  <script src="lib/jquery/jquery-migrate.min.js"></script>
  <script src="lib/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="lib/easing/easing.min.js"></script>
  <script src="lib/wow/wow.min.js"></script>
  <script src="lib/waypoints/waypoints.min.js"></script>
  <script src="lib/counterup/counterup.min.js"></script>
  <script src="lib/superfish/hoverIntent.js"></script>
  <script src="lib/superfish/superfish.min.js"></script>
</body>
</html>
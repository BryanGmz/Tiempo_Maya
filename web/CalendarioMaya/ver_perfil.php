<?php
  session_start();

  //Comprobar que este logueado
  
  if(!isset($_SESSION['nombre'])){
      header("Location: ./iniciarSesion.php");
  }
  include './backend/database/conexion.php';  
  if ($conexion ->connect_error) {
    die("Connection failed: " . $conexion ->connect_error);
  }

  $username = $_SESSION['nombre'];
  $result = mysqli_query($conexion, "SELECT * FROM usuario WHERE username = '$username'");
  $usuario = $result->fetch_array(MYSQLI_ASSOC);
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
    <title>Perfil</title>
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
        <form method="POST" action="./editar_perfil.php">
            <div class="form-group">
                <h1 style="text-align: center; color: black;">Perfil</h1>
            </div>
            <div class="form-group">
              <label for="InputUser">Usuario</label>
              <br>
              <label name="user" id="InputUser"><strong><?php echo ($usuario['username']);?></strong></label>
              <br>
              <label for="InputEmail">E-mail</label>
              <br>
              <label name="email" id="InputEmail"><strong><?php echo ($usuario['email']);?></strong></label>
              <br>
              <label for="InputName">Nombre</label>
              <br>
              <label name="name" id="InputName"><strong><?php echo ($usuario['nombre']);?></strong></label>
              <br>
              <label for="InputApellido">Apellido</label>
              <br>
              <label name="apellido" id="InputApellido"><strong><?php echo ($usuario['apellido']);?></strong></label>
              <br>
              <label for="InputNacimiento">Fecha Nacimiento</label>
              <br>
              <label name="nacimiento" id="InputNacimiento"><strong>
                <?php 
                  if(isset($usuario['nacimiento'])) {
                    echo date("Y/m/d", strtotime($usuario['nacimiento']));
                  }
                ?>
              </strong></label>
              <br>
              <label for="InputTel">Tel.</label>
              <br>
              <label name="nacimiento" id="InputTel"><strong>
                <?php 
                  if(isset($usuario['telefono'])) {
                    echo $usuario['telefono'];
                  }
                ?>
              </strong></label>
              <br>
            </div>
            <button type="submit" class="btn" style="text-align: center; color: black;  margin-left: auto; margin-right: auto;">Editar Perfil</button>
          </form>
          
           <!-- Alerta  -->
    <?php if(isset($_SESSION['echo'])){ ?>
      <br>
      <div class="alert alert-success alert-dismissible fade show" style="width: 50%; margin-left: auto; margin-right: auto;" role="alert">
        <strong>Perfil Editado!</strong>
        <button type="button" class="close" data-dismiss="alert" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
    <?php $_SESSION['echo'] = null; } ?>
    </div>

   

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
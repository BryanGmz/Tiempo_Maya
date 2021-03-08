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
$sql = "SELECT * FROM nahual";
$resultado = $conexion->query($sql);

?>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title>Nahuales</title>
  <meta content="width=device-width, initial-scale=1.0" name="viewport">
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,700,700i|Poppins:300,400,500,700" rel="stylesheet">
  <link href="lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="lib/font-awesome/css/font-awesome.min.css" rel="stylesheet">
  <link href="lib/animate/animate.min.css" rel="stylesheet">
  <link href="css/style.css" rel="stylesheet">
  <link href="css/estiloLineaTiempo.css" rel="stylesheet">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
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
        
<section>
<br><br><br>
  <div class="container" style="padding-top: 40px; height:100px">
  <!-- Encabezado -->
    <div style="background: rgba(0, 0, 0, 0.3);">
          <form method="POST" action="./backend/buscar_nahual.php">
            <div class="form-group">
              <br>
                <h1 style="text-align: center; color: black;">Nahual</h1>
            </div>
            <div class="form-group" style="margin: 0 auto; text-align: center;">
              <label for="InputNacimiento" style="color: white;">Fecha</label>
              <br>
              <input type="date" name="nacimiento" class="form-control" id="InputNacimiento"  style="width: 14%; margin-left: auto; margin-right: auto;" aria-describedby="dateHelp" required>
            </div>
            <div style="margin: 0 auto; text-align: center;">
              <br>
              <button type="submit" class="btn" style="color: black;">Buscar</button>
            </div>
          </form>
    </div>

    <!-- Carrusel -->
    <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
      <div class="carousel-inner" style="height: 915px; background: rgba(0, 0, 0, 0.3);">
        <?php 
        $contador = 1;
        foreach ($resultado as $nahual) : 
          if(isset($_SESSION['idNahual'])){
            if($contador == $_SESSION['idNahual']){ ?>
              <div class="carousel-item active">
              <?php 
              $_SESSION['idNahual'] = null;
            } else { ?>
              <div class="carousel-item">
            <?php
            $contador += 1; 
            }
          } else {
            if($contador == 1){ ?>
              <div class="carousel-item active">
              <?php 
              $contador += 1;  
            } else { ?>
              <div class="carousel-item">
            <?php
            }
          }
        ?>
          <!--Titulo del Nahual-->
          <div>
            <br>
            <h3 style="text-align: center; color: black;">Nahual - <?php echo $nahual['nombre'];?></h3>
          </div>
          <!-- Imagen -->
          <div style="padding-top: 5px; padding-left: 41%;">
            <img src="<?php echo "./img/nahuales_habb/".$nahual['idImagen'].".jpg"?>" width="200px" height="200px">
          </div>
          <!-- Significado -->
          <div id="transparencia" style="width: 75%; height: 125px; margin-left: auto; margin-right: auto;">
            <h4 class='titulo' style="margin-bottom: 10px; text-align: center; color:black">Significado</h4>
            <p style="text-align: justify; width: 75%; margin-left: auto; margin-right: auto;"><?php echo $nahual['significado'];?></p>
          </div>
          <!-- Descripcion -->
          <div style="height: 400px; width: 75%; margin-left: auto; margin-right: auto;">
            <div class="card" id="transparencia" style=" padding-top: 1%;">
              <div class="card-body" style="padding-left: 10%;padding-right:10%">
                <h4 class="card-title"><strong>Descripción</strong></h4>
                <p class="card-text" style="text-align: justify; "><?php echo $nahual['descripcion'];?></p>
              </div>    
            </div>
          </div>
        </div>
        <?php endforeach; ?>
      </div>
        <!-- Botones de atras y adelante -->
        <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
          <span class="carousel-control-prev-icon" aria-hidden="true"></span>
          <span class="sr-only">Previous</span>
        </a>
        <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
          <span class="carousel-control-next-icon" aria-hidden="true"></span>
          <span class="sr-only">Next</span>
          </a>
    </div>
  </div>
</section>

<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
  <footer id="footer">
    <div class="container">
      <div class="copyright">
        &copy; Copyright 2021 <strong>Calendario Maya</strong>. Todos los derechos reservados.
      </div>
    </div>
  </footer>
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

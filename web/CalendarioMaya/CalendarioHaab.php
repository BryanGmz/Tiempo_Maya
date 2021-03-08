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
  if(!isset($_SESSION['cargador_habb'])){
    header("Location: ./backend/calcular_fecha_habb.php");
  }
?>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title>Calendario Habb'</title>
  <meta content="width=device-width, initial-scale=1.0" name="viewport">
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,700,700i|Poppins:300,400,500,700" rel="stylesheet">
  <link href="lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://kit.fontawesome.com/e51fb510f5.js" crossorigin="anonymous"></script>
  <link href="lib/animate/animate.min.css" rel="stylesheet">
  <link href="css/Calendarios.css" rel="stylesheet">
  <link href="css/style.css" rel="stylesheet">
</head>
<?php include "BarradeNavegacion.php" ?>
<body>
<section id="inicio">

  <div class="inicio-container">
    <h1>Calendario Haab'</h1>
      <!---->
      <a href="#" class="btn-get-started" data-toggle="modal" data-target="#myModalInformacion">Descripción</a>
      <a href="#" class="btn-get-started" data-toggle="modal" data-target="#myModalInformacionKinal">Kinal (Día)</a>
      <a href="#" class="btn-get-started" data-toggle="modal" data-target="#myModalInformacionUinal">Winal (Mes)</a>
      <a href="#" class="btn-get-started" data-toggle="modal" data-target="#myModalInformacionUayeb">Uayeb</a>
      <a href="#calcular" class="btn-get-started">Fecha Habb'</a>
  </div>

</section>

  <!-- Modal -->
  <div class="modal" id="myModalInformacionKinal" tabindex="-1" role="dialog">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
            <div class="modal-header">
              <h3 class="modal-title" id="exampleModalLongTitle">Información</h3>
              <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                <span aria-hidden="true">&times;</span>
              </button>
            </div>
            <div class="modal-body">
                <h4 style="text-align: center;">Kinal (Día)</h4>
                <p><?php 
                    $sql = "SELECT * FROM informacion WHERE id = 2";
                    $resultado = $conexion->query($sql);
                    $informacionEncontrada = $resultado->fetch_array(MYSQLI_ASSOC); 
                    echo $informacionEncontrada['descripcionEscritorio'];
                ?></p>
            </div>
        </div>
    </div>
  </div>

  <!-- Modal -->
  <div class="modal" id="myModalInformacionUinal" tabindex="-1" role="dialog">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
            <div class="modal-header">
              <h3 class="modal-title" id="exampleModalLongTitle">Información</h3>
              <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                <span aria-hidden="true">&times;</span>
              </button>
            </div>
            <div class="modal-body">
                <h4 style="text-align: center;">Winal (Mes)</h4>
                <p><?php 
                    $sql = "SELECT * FROM informacion WHERE id = 3";
                    $resultado = $conexion->query($sql);
                    $informacionEncontrada = $resultado->fetch_array(MYSQLI_ASSOC); 
                    echo $informacionEncontrada['descripcionEscritorio'];
                ?></p>
            </div>
        </div>
    </div>
  </div>

  <!-- Modal -->
  <div class="modal" id="myModalInformacionUayeb" tabindex="-1" role="dialog">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
            <div class="modal-header">
              <h3 class="modal-title" id="exampleModalLongTitle">Información</h3>
              <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                <span aria-hidden="true">&times;</span>
              </button>
            </div>
            <div class="modal-body">
                <h4 style="text-align: center;">Uayeb</h4>
                <p><?php 
                    $sql = "SELECT * FROM informacion WHERE id = 12";
                    $resultado = $conexion->query($sql);
                    $informacionEncontrada = $resultado->fetch_array(MYSQLI_ASSOC); 
                    echo $informacionEncontrada['descripcionEscritorio'];
                ?></p>
            </div>
        </div>
    </div>
  </div>

  <!-- Modal -->
  <div class="modal" id="myModalInformacion" tabindex="-1" role="dialog">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
            <div class="modal-header">
              <h3 class="modal-title" id="exampleModalLongTitle">Información</h3>
              <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                <span aria-hidden="true">&times;</span>
              </button>
            </div>
            <div class="modal-body">
                <h4 style="text-align: center;">Calendario Habb'</h4>
                <!-- Imagen -->
                <div style="padding-top: 5px;">
                  <img src="<?php echo "./img/CalendarioHabb.png"?>" width="450px" height="325px">
                </div>
                <p><?php 
                    $sql = "SELECT * FROM informacion WHERE id = 1";
                    $resultado = $conexion->query($sql);
                    $informacionEncontrada = $resultado->fetch_array(MYSQLI_ASSOC); 
                    echo $informacionEncontrada['descripcionEscritorio'];
                ?></p>
            </div>
        </div>
    </div>
  </div>
<hr>

<section id="calcular">
  <div class="container">
        <br>
        <div class="section-header">
          <h3 class="section-title" style="  color: #2dc997;">Calendario Haab'</h3>
        </div>
    <div class="row about-container">
      <div class="col-lg-6 content order-lg-1 order-2">
        <br>
        <h3 class="section-title" style="  color: #2dc997;">Fecha Habb'</h3>
      </div>
    </div>

    <!-- Form fecha habb' -->
    <form method="POST" action="./backend/calcular_fecha_habb.php">
      <div class="form-group mb-2">
        <label for="staticEmail2" class="sr-only text-dark">Ingresar fecha: </label>
        <input type="date" class="form-control-plaintext text-dark border border-success" id="staticEmail2" name="fecha" required >
      </div>
      <div class="form-group mb-2">
        <button type="submit" class="btn btn-outline-success btn-lg btn-block mb-2">Buscar</button>
      </div>
    </form>
    
    <hr>

    <div class="row">
      <div class="col">
        <div class="section-header">
          <h1 class="section-title" style="  color: #2dc997;">Día</h1>
        </div>
        <!-- Imagen -->
        <div style="padding-top: 5px; padding-left: 31%;">
          <img src="<?php echo "./img/nahuales_habb/".$_SESSION['nahual_habb'].".jpg";?>" width="200px" height="200px">
        </div>
      </div>
      <div class="col">
        <div class="section-header">
          <h1 class="section-title" style="  color: #2dc997;">Mes</h1>
        </div>
        <!-- Imagen -->
        <div style="padding-top: 5px; padding-left: 32%;">
          <img src="<?php echo "./img/winales/".$_SESSION['winal_habb'].".png";?>" width="200px" height="200px">
        </div>
      </div>
    </div>
    <br>
    <div class="section-header">
      <h3 class="section-title" style="  color: #2dc997;">Cargador</h3>
    </div>
      <!-- Imagen -->
      <div style="padding-top: 5px; padding-left: 41%;">
        <img src="<?php echo "./img/nahuales_habb/".$_SESSION['cargador_habb'].".jpg";?>" width="200px" height="200px">
        </div>
    </div>

  <hr>
  

<footer id="footer">

  <div class="container">
    <div class="copyright">
      &copy; Copyright <strong>Teoria de Sistemas</strong>. Derechos Reservados
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
  <script src="js/main.js"></script>




</body>
</html>

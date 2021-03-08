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

  if(!isset($_SESSION['nahual_rc'])){
    header("Location: ./backend/calcular_fecha_rc.php");
  }

  if (isset($_POST['date'])) {
    $nivel;
    $query;
    include_once 'buscar/conseguir_nahual.php';
    include_once 'buscar/conseguir_energia.php';
    header("location: CalendarioCholqij.php"."?nahual=".$query."&nivel=".$nivel."#".$query);
  }
?>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title>Rueda Calendarica</title>
  <meta content="width=device-width, initial-scale=1.0" name="viewport">
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,700,700i|Poppins:300,400,500,700" rel="stylesheet">
  <link href="lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://kit.fontawesome.com/e51fb510f5.js" crossorigin="anonymous"></script>
  <link href="lib/animate/animate.min.css" rel="stylesheet">
  <link href="css/Calendarios.css" rel="stylesheet">
  <link href="css/style.css" rel="stylesheet">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>

<?php include "BarradeNavegacion.php" ?>
<body>
<section id="inicio">
  <div class="inicio-container">
    <h1>Rueda Calendarica</h1>
      <a href="#" class="btn-get-started" data-toggle="modal" data-target="#myModalInformacion">Descripción</a>
      <a href="#" class="btn-get-started" data-toggle="modal" data-target="#myModalMecanismo">Mecanismo</a>
      <a href="#" class="btn-get-started" data-toggle="modal" data-target="#myModalMexica">Correlación Mexica de los Años</a>
      <a href="#calcular" class="btn-get-started">Fecha Rueda Calendarica</a>
  </div>

</section>

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
                <h4 style="text-align: center;">Rueda Calendarica</h4>
                <p><?php 
                    $sql = "SELECT * FROM informacion WHERE id = 9";
                    $resultado = $conexion->query($sql);
                    $informacionEncontrada = $resultado->fetch_array(MYSQLI_ASSOC); 
                    echo $informacionEncontrada['descripcionEscritorio'];
                ?></p>
            </div>
        </div>
    </div>
  </div>

  <!-- Modal -->
  <div class="modal" id="myModalMecanismo" tabindex="-1" role="dialog">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
            <div class="modal-header">
              <h3 class="modal-title" id="exampleModalLongTitle">Información</h3>
              <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                <span aria-hidden="true">&times;</span>
              </button>
            </div>
            <div class="modal-body">
                <h4 style="text-align: center;">Mecanismo</h4>
                <p><?php 
                    $sql = "SELECT * FROM informacion WHERE id = 10";
                    $resultado = $conexion->query($sql);
                    $informacionEncontrada = $resultado->fetch_array(MYSQLI_ASSOC); 
                    echo $informacionEncontrada['descripcionWeb'];
                ?></p>
                <p> • 18 980 = 73 x 260 </p>
                <p> • 18 720 = 72 x 260 </p>
                <p> • 5 256 = 72 x 73 = 9 x 584.2​ </p>
                <p> También debe ser tomado en cuenta que 13 x 360 = 18 x 260 = 4 680. </p>
                <p> • Es decir, si los 5 días de Uayeb' son omitidos (como debe haber sido el caso en
                      los orígenes del calendario), los períodos de 360 y de 260 días coincidirían después
                      de, respectivamente, 13 y 18 ciclos (13 "años" de 360 días).</p>
              
                <p> • Cuatro de esos ciclos de 13 "años" abarcan 52 "años" de 360 días. </p>
              
                <p> • Ahora, 52 veces esos 5 adicionales días de Wayeb' resultan en exactamente uno más
                      de los ciclos de 260 días. </p>

                <p> El sistema de la rueda calendárica, sirve para interpretar una sucesión infinita de
                    períodos de 52 años. Se desconoce su nombre en lenguas mayenses, pero el nombre en
                    idioma náhuatl utilizado por los mexicas era "Xiuhnelpilli", aunque es más usual
                    encontrarlo escrito como Xiuhmolpilli, forma gramaticalmente incorrecta;3​ cuyo
                    significado es anudación de los años.

                <p> Cada 52 años las culturas mesomericanas realizaban importantes ceremonias. Para el
                    caso de los mexicas era la llamada "ceremonia del fuego nuevo".
                </p>
            </div>
        </div>
    </div>
  </div>

  <!-- Modal -->
  <div class="modal" id="myModalMexica" tabindex="-1" role="dialog">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
            <div class="modal-header">
              <h3 class="modal-title" id="exampleModalLongTitle">Información</h3>
              <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                <span aria-hidden="true">&times;</span>
              </button>
            </div>
            <div class="modal-body">
                <h4 style="text-align: center;">Correlación mexica de los años</h4>
                <p>La siguiente tabla muestra la correspondencia del ultimo periodo de 52 años, entre los años mexicas y nuestros años.</p>
                <table class="table table-hover">
                  <thead class="thead-dark">
                    <tr>
                      <th scope="col">Tlalpilli Tochtli</th>
                      <th scope="col">Tlalpilli Acatl</th>
                      <th scope="col">Tlalpilli Tecpatl</th>
                      <th scope="col">Tlalpilli Calli</th>
                    </tr>
                  </thead>
                  <tbody>
                    <tr>
                      <td>1 tochtli / 1974</td>
                      <td>1 acatl / 1987</td>
                      <td>1 tecpatl / 2000</td>
                      <td>1 calli / 2013</td>
                    </tr>
                    <tr>
                      <td>2 actal / 1975</td>
                      <td>2 tecpatl / 1988</td>
                      <td>2 calli / 2001</td>
                      <td>2 tochtli / 2014</td>
                    </tr>
                    <tr>
                      <td>3 tecpatl / 1976</td>
                      <td>3 calli / 1989</td>
                      <td>3 tochtli / 2002</td>
                      <td>3 acatl / 2015</td>
                    </tr>
                    <tr>
                      <td>4 calli / 1977</td>
                      <td>4 tochtli / 1990</td>
                      <td>4 acatl / 2003</td>
                      <td>4 tecpatl / 2016</td>
                    </tr>
                    <tr>
                      <td>5 tochtli / 1978</td>
                      <td>5 acatl / 1991</td>
                      <td>5 tecpatl / 2004</td>
                      <td>5 calli / 2017</td>
                    </tr>
                    <tr>
                      <td>6 acatl / 1979</td>
                      <td>6 tecpatl / 1992</td>
                      <td>6 calli / 2005</td>
                      <td>6 tochtli / 2018</td>
                    </tr>
                    <tr>
                      <td>7 tecpatl / 1980</td>
                      <td>7 calli / 1993</td>
                      <td>7 tochtli / 2006</td>
                      <td>7 acatl / 2019</td>
                    </tr>
                    <tr>
                      <td>8 calli / 1981</td>
                      <td>8 tochtli / 1994</td>
                      <td>8 acatl / 2007</td>
                      <td>8 tecpatl / 2020</td>
                    </tr>
                    <tr>
                      <td>9 tochtli / 1982</td>
                      <td>9 acatl / 1995</td>
                      <td>9 tecpatl / 2008</td>
                      <td>9 calli / 2021</td>
                    </tr>
                    <tr>
                      <td>10 acatl / 1983</td>
                      <td>10 tecpatl / 1996</td>
                      <td>10 calli / 2009</td>
                      <td>10 tochtli / 2022</td>
                    </tr>
                    <tr>
                      <td>11 tecpatl / 1984</td>
                      <td>11 calli / 1997</td>
                      <td>11 tochtli / 2010</td>
                      <td>11 acatl / 2023</td>
                    </tr>
                    <tr>
                      <td>12 calli / 1985</td>
                      <td>12 tochtli / 1998</td>
                      <td>12 acatl / 2011</td>
                      <td>12 tecpatl / 2024</td>
                    </tr>
                    <tr>
                      <td>13 tochtli / 1986</td>
                      <td>13 acatl / 1999</td>
                      <td>13 tecpatl / 2012</td>
                      <td>13 calli / 2025</td>
                    </tr>
                  </tbody>
                </table>
            </div>
        </div>
    </div>
  </div>

<hr>
<section id="calcular">
  <div class="container">
        <br>
        <div class="section-header">
          <h3 class="section-title" style="  color: #2dc997;">Rueda Calendarica</h3>
        </div>
    <div class="row about-container">
      <div class="col-lg-6 content order-lg-1 order-2">
        <br>
        <h3 class="section-title" style="  color: #2dc997;">Fecha Rueda Calendarica</h3>
      </div>
    </div>

    <!-- Form fecha cholquij' -->
    <form method="POST" action="./backend/calcular_fecha_rc.php">
      <div class="form-group mb-2">
        <label for="staticEmail2" class="sr-only text-dark">Ingresar fecha: </label>
        <input type="date" class="form-control-plaintext text-dark border border-success" id="staticEmail2" name="fecha" required>
      </div>
      <div class="form-group mb-2">
        <button type="submit" class="btn btn-outline-success btn-lg btn-block mb-2">Buscar</button>
      </div>
    </form>
    
    <hr>

    <div class="row">
      <div class="col">
        <div class="section-header">
          <h1 class="section-title" style="  color: #2dc997;">Nahual</h1>
        </div>
        <!-- Imagen -->
        <div style="padding-top: 5px; padding-left: 31%;">
          <img src="<?php echo "./img/nahual/n".$_SESSION['nahual_rcc'].".jpg";?>" width="200px" height="200px">
        </div>
      </div>
      <div class="col">
        <div class="section-header">
          <h1 class="section-title" style="  color: #2dc997;">Energía</h1>
        </div>
        <!-- Imagen -->
        <div style="padding-top: 5px; padding-left: 32%;">
          <img src="<?php echo "./img/numeros_mayas/numero".$_SESSION['energia_rc'].".jpg";?>" width="200px" height="200px">
        </div>
      </div>
    </div>
    <br>
    <div class="row">
      <div class="col">
        <div class="section-header">
          <h1 class="section-title" style="  color: #2dc997;">Día</h1>
        </div>
        <!-- Imagen -->
        <div style="padding-top: 5px; padding-left: 31%;">
          <img src="<?php echo "./img/nahuales_habb/".$_SESSION['nahual_rc'].".jpg";?>" width="200px" height="200px">
        </div>
      </div>
      <div class="col">
        <div class="section-header">
          <h1 class="section-title" style="  color: #2dc997;">Mes</h1>
        </div>
        <!-- Imagen -->
        <div style="padding-top: 5px; padding-left: 32%;">
          <img src="<?php echo "./img/winales/".$_SESSION['winal_rc'].".png";?>" width="200px" height="200px">
        </div>
      </div>
    </div>
    </div>
</section>
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

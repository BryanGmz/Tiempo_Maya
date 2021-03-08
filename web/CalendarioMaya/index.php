<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title>Tiempo Maya</title>
  <meta content="width=device-width, initial-scale=1.0" name="viewport">
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,700,700i|Poppins:300,400,500,700" rel="stylesheet">
  <link href="lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="lib/font-awesome/css/font-awesome.min.css" rel="stylesheet">
  <link href="lib/animate/animate.min.css" rel="stylesheet">
  <link href="css/style.css" rel="stylesheet">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>

<body>

  <?php include "BarradeNavegacion.php" ?>
    <?php 
      if(isset($_SESSION['acerca'])) {?>
        <script>
            $(document).ready(function()
            {
              $("#myModal").modal("show");
            });
        </script>
    <?php }
      
    ?>

  <!-- Modal -->
  <div class="modal" id="myModal" tabindex="-1" role="dialog">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
            <div class="modal-header">
              <h3 class="modal-title" id="exampleModalLongTitle">Acerca de...</h3>
              <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                <span aria-hidden="true">&times;</span>
              </button>
            </div>
            <div class="modal-body">
                <h4 style="text-align: center;">Tiempo Maya - Guatemala V1.1</h4>
                <p><?php echo $_SESSION['acerca']; $_SESSION['acerca'] = null; ?></p>
            </div>
            <div style="margin: 0 auto; text-align: center;">
              <h5>Copyright 2021</h5>
              <h5>Este software fue desarrollado por:</h5>
              <h5>(bryanrene-gomezgomez@cunoc.edu.gt) creado en:</h5>
              <h5>Visual Estudio Code</h5>
              <button type="button" class="btn btn-secondary" data-dismiss="modal">Cerrar</button>
              <br>
              <br>
          
            </div>
        </div>
    </div>
  </div>

  <section id="inicio">
    <div class="inicio-container">
      <h1>Bienvenido al Tiempo Maya</h1>
      <!-- Alerta  -->
      <?php if(isset($_SESSION['echo'])){ ?>
        <div class="alert alert-success alert-dismissible fade show" style="width: 50%; margin-left: auto; margin-right: auto;" role="alert">
          <strong>Felicidades, se a creado tu perfil bienvenido.</strong> 
          <button type="button" class="close" data-dismiss="alert" aria-label="Close">
            <span aria-hidden="true">&times;</span>
          </button>
        </div>
      <?php $_SESSION['echo'] = null; } ?>
    </div>
  </section>
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

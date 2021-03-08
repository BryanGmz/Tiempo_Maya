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
$sql = "SELECT * FROM hechohistorico;";
$resultado = $conexion->query($sql);

?>

<!DOCTYPE html>
<html lang="es" dir="ltr">

<head>
    <title>Linea de Tiempo</title>
    <meta charset="utf-8">
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <link href="css/style.css" rel="stylesheet">
    <link href="css/estiloLineaTiempo.css" rel="stylesheet">
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

    <!-- Modal -->
    <div class="modal" id="myModal" tabindex="-1" role="dialog">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
            <div class="modal-header">
                <h1 class="modal-title">Evento</h1>
            </div>
            <div class="modal-body">
                <form method="POST" action="./backend/insertar_hecho.php">
                    <div class="form-group">
                        <label for="InputIitulo" class="col-form-label">Título*:</label>
                        <input type="text" class="form-control" name="titulo" id="InputIitulo" required placeholder="Titulo">
                    </div>
                    <div class="form-group">
                        <label for="InputInicio" class="col-form-label">Año - Inicio*:</label>
                        <input type="number" class="form-control" name="inicio" id="InputInicio" required placeholder="Año Inicio">
                        <label for="InputFin" class="col-form-label">Año - Fin*:</label>
                        <input type="number" class="form-control" name="fin" id="InputFin" required placeholder="Año Fin">
                    </div>
                    <div class="form-group">
                        <label for="InputDescripcion" class="col-form-label">Descripción:</label>
                        <textarea class="form-control" name="descripcion" id="InputDescripcion" placeholder="Descripción" required></textarea>
                    </div>
                    <div class="modal-footer">
                        <button type="submit" class="btn btn-primary">Agregar</button>
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cerrar</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
    </div>

    <br><br><br><br><br>
    <?php 
    //<!-- Alerta  -->
    if(isset($_SESSION['agregado'])){ echo '
        <div class="alert alert-success" style="width: 50%; margin-left: auto; margin-right: auto;" role="alert">
          <strong>Felicidades</strong>. Se agrego correctamente el hecho historico. 
          <button type="button" class="close" data-dismiss="alert" aria-label="Close">
            <span aria-hidden="true">&times;</span>
          </button>
        </div>';
      $_SESSION['agregado'] = null; }
    ?>
     <?php 
    //<!-- Alerta  -->
    if(isset($_SESSION['eliminado'])){ echo '
        <div class="alert alert-success" style="width: 50%; margin-left: auto; margin-right: auto;" role="alert">
          <strong>Felicidades</strong>. Se elimino el hecho historico con exito. 
          <button type="button" class="close" data-dismiss="alert" aria-label="Close">
            <span aria-hidden="true">&times;</span>
          </button>
        </div>';
      $_SESSION['eliminado'] = null; }
    ?>

    <?php
    if (isset($_SESSION['rango']) && $_SESSION['rango'] == 'ADMIN') {
                    echo '
                <div class="container">
                <div class="padre">
                    <div style="color: black; padding-left: 5%;">
                        <div class="card-header">
                        <strong>
                        ¿Falta un hecho importante?
                        </strong>
                        </div>
                        <div>
                            <button class="btn btn-primary owl-slide-animated owl-slide-cta" data-toggle="modal" data-target="#myModal" style="margin-bottom: 20px; ">
                                <a style="color: black; "class="scrollNavigation">Agregar</a>
                            </button>
                        </div>
                    </div>
                </div>
            </div>';
            }
        ?>

    <section>
        <div class="container" style="padding-top: 40px; height:100px">
            <div id="myCarousel" class="carousel" data-ride="carousel">
                <div class="carousel-inner" style="height: 700px; background: rgba(0, 0, 0, 0.3);">
                    <?php
                    $num = 0;
                    foreach ($resultado as $hecho) : ?>
                        <?php
                        $sqlCat = "SELECT idHechoHistorico, nombre FROM Categorizar 
                            inner JOIN Categoria ON Categorizar.idCategoria = Categoria.id
                             WHERE Categorizar.idHechoHistorico= " . $hecho['id'];
                        $cat = $conexion->query($sqlCat);
                        $cat1;
                        foreach ($cat as $categoria1) :
                            $cat1 = $categoria1['nombre'];
                        endforeach;
                        if ($num == 0) {
                            echo '<div class="item active" style="height: 600px;">';
                            $num =  $num + 1;
                        } else {
                            $num = $num + 1;
                            echo '<div class="item " style="height: 600px;">';
                        }
                        ?>
                            <!--- CARRUSEL -->
                            <div class="carousel-caption" style=" padding-top: 25px;">
                                <div id="transparencia">
                                    <h1 class='titulo' style="margin-bottom: 10px; color:black"> <?php echo $hecho['titulo']; ?></h1>
                                    <p class='fecha' style=""> <?php echo date("Y", strtotime($hecho['fechaInicio']))?> A <?php echo date("Y", strtotime($hecho['fechaFinalizacion']))?></p>
                                </div>
                                <div style="height: 400px;">
                                    <div id="desc<?php echo $num ?>" >
                                        <div class="card" id="transparencia" style=" padding-top: 5%;">
                                            <div class="card-body" style="padding-left: 10%;padding-right:10%">
                                                <h4 class="card-title"><strong>Descripción</strong></h4>
                                                <p class="card-text" style="text-align: justify; "><?php echo $hecho['descripcion'] ?></p>
                                                <form action="./backend/eliminar_hecho.php" method="post">
                                                    <input  type="hidden"  name="idHecho" value="<?php echo $hecho['id'] ?>" >
                                                    <?php if($_SESSION['rango'] == "ADMIN") { ?>
                                                    <button type="submit" class="btn btn-primary">Eliminar</button>
                                                    <?php } ?>
                                                    <br></br>
                                                </form>
                                            </div>    
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    <?php endforeach; ?>
                </div>

                <!-- Controles izquierda-derecha -->
                <a class="left carousel-control" href="#myCarousel" data-slide="prev">
                    <span class="glyphicon glyphicon-chevron-left"></span>
                    <span class="sr-only">Anterior</span>
                </a>
                <a class="right carousel-control" href="#myCarousel" data-slide="next">
                    <span class="glyphicon glyphicon-chevron-right"></span>
                    <span class="sr-only">Siguiente</span>
                </a>
            </div>

        </div>
    </section>
    <section style="padding-top: 700px;">
    </section>
    <footer id="footer">
        <div class="container">
            <div class="copyright">
                &copy; Copyright <strong>Calendario Maya</strong>. Derechos Reservados
            </div>
        </div>
    </footer>
</body>
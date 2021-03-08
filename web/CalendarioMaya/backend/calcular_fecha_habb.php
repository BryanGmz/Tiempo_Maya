<?php
    session_start();
    include './database/conexion.php';  
    if ($conexion -> connect_error) {
      die("Connection failed: " . $conexion ->connect_error);
    }

    if(isset($_POST['fecha'])){
      $dia = date('d', strtotime($_POST['fecha']));
      $mes = date('m', strtotime($_POST['fecha']));
      $anio = date('Y', strtotime($_POST['fecha']));
    } else {
      $dia = date('d');
      $mes = date('m');
      $anio = date('Y');
    }
    
    $_SESSION['fecha_habb'] = $anio."-".$mes."-".$dia; 
    $fecha = "2020-".$mes."-".$dia;
    $sql = "SELECT * FROM calendariohaab WHERE fecha = '".$fecha."'";
    $resultado = $conexion->query($sql);
    $fechaEncontrada = $resultado->fetch_array(MYSQLI_ASSOC);

    $_SESSION['nahual_habb'] = $fechaEncontrada['nahual'];
    $_SESSION['winal_habb'] = $fechaEncontrada['winal'];

    //Cargador
    $cargador = 1;
    if($anio < 2020){
        for ($i = 0; $i < (2020 - $anio); $i++) {
            if($cargador == 1){
                $cargador = 4;
            } else{
                $cargador--;
            }
        }
    } else if($anio > 2020){
        for ($i = 0; $i < ($anio - 2020); $i++) {
            if($cargador == 4){
                $cargador = 1;
            } else {
                $cargador++;
            }
        }
    }
    

    $sql = "SELECT * FROM cargador WHERE id = '".$cargador."'";
    $resultado = $conexion->query($sql);
    $cargadorEncontrado = $resultado->fetch_array(MYSQLI_ASSOC);

    $_SESSION['cargador_habb'] = $cargadorEncontrado['numero_nahual']; 
  
    header("Location: ../CalendarioHaab.php"); 
?>
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
      $fechaActual = date('Y-m-d', strtotime($_POST['fecha']));
    } else {
      $dia = date('d');
      $mes = date('m');
      $anio = date('Y');
      $fechaActual = date('Y-m-d');
    }
    
    $_SESSION['fecha_rc'] = $anio."-".$mes."-".$dia; 
    $fecha = "2020-".$mes."-".$dia;
    $sql = "SELECT * FROM calendariohaab WHERE fecha = '".$fecha."'";
    $resultado = $conexion->query($sql);
    $fechaEncontrada = $resultado->fetch_array(MYSQLI_ASSOC);

    $_SESSION['nahual_rc'] = $fechaEncontrada['nahual'];
    $_SESSION['winal_rc'] = $fechaEncontrada['winal'];

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

    $_SESSION['cargador_rc'] = $cargadorEncontrado['numero_nahual']; 
  
    $formato = mktime(0, 0, 0, 11, 15, 2020)/(24*60*60);
	$fecha = date("U", strtotime($fechaActual))/(24*60*60);
	$diferencia = $formato - $fecha;

    //Calculando el Nahual
    $contador = $diferencia;
    $contadorNahual = 16;
    if ($contador < 0) {
        while ($contador != 0) {
            if ($contadorNahual == 20) {
                $contadorNahual = 1;
            } else {
                $contadorNahual++;
            }   $contador++;
        } 
    } else {
        while ($contador != 0) {
            if ($contadorNahual == 1) {
                $contadorNahual = 20;
            } else {
                $contadorNahual--;
            } $contador--;
        } 
    }
    
    $_SESSION['nahual_rcc'] = $contadorNahual;

    //Calculando el Nivel

    $contador = $diferencia;
    $contadorNahual = 4;
    if ($contador < 0) {
        while ($contador != 0) {
            if ($contadorNahual == 13) {
                $contadorNahual = 1;
            } else {
                $contadorNahual++;
            }   $contador++;
        } 
    } else {
        while ($contador != 0) {
            if ($contadorNahual == 1) {
                $contadorNahual = 13;
            } else {
                $contadorNahual--;
            }   $contador--;
        } 
    }
    
    $_SESSION['energia_rc'] = $contadorNahual;

    header("Location: ../rueda_calendarica.php"); 
?>
<?php
    session_start();
    include './database/conexion.php';  
    if ($conexion -> connect_error) {
      die("Connection failed: " . $conexion ->connect_error);
    }

    if(isset($_POST['fecha'])){
      $fechaActual = date('Y-m-d', strtotime($_POST['fecha']));
    } else {
      $fechaActual = date('Y-m-d');
    }
    
    $_SESSION['fecha_cholquij'] = $fechaActual;
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
    
    $_SESSION['nahual_cholquij'] = $contadorNahual;

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
    
    $_SESSION['energia_cholquij'] = $contadorNahual;

  
    header("Location: ../CalendarioCholqij.php"); 
?>
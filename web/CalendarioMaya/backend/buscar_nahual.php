<?php
session_start();
include './database/conexion.php';  
if ($conexion -> connect_error) {
  die("Connection failed: " . $conexion ->connect_error);
}
	$fechaActual = date('Y-m-d', strtotime($_POST['nacimiento']));
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

  $sql = "SELECT * FROM nahual WHERE id = '".$contadorNahual."'";
  echo $sql;
  
  $resultado = $conexion->query($sql);
  $nahualEncontrado = $resultado->fetch_array(MYSQLI_ASSOC);
  $_SESSION['idNahual'] = $nahualEncontrado['idImagen'];
  header("Location: ../nahual.php");
?>
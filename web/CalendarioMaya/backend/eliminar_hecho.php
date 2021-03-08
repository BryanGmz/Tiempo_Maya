<?php
session_start();

include './database/conexion.php';  

if ($conexion -> connect_error) {
  die("Connection failed: " . $conexion ->connect_error);
}

  echo $_POST['idHecho'];
  if(isset($_POST['idHecho'])) {
    $sql = "DELETE FROM hechohistorico WHERE id = '".$_POST['idHecho']."'";
    echo $sql;
    $resultado = $conexion->query($sql);
    $_SESSION['eliminado'] = 1;
    header("Location: ../LineaDeTiempo.php");
  } 
?>
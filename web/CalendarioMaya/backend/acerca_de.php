<?php
session_start();
include './database/conexion.php';  
if ($conexion -> connect_error) {
  die("Connection failed: " . $conexion ->connect_error);
}

    
    $sql = "SELECT * FROM informacion WHERE id = 8";
    echo $sql;
  
    $resultado = $conexion->query($sql);
    $informacionEncontrada = $resultado->fetch_array(MYSQLI_ASSOC);
    $_SESSION['acerca'] = $informacionEncontrada['descripcionWeb'];

    header("Location: ../index.php"); 
?>
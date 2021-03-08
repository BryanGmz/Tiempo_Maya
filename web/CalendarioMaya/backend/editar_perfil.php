<?php
  session_start();
  // Obtengo los datos cargados en el formulario de login.
  $user = $_POST['user'];

  include './database/conexion.php';  

  if ($conexion -> connect_error) {
    die("Connection failed: " . $conexion ->connect_error);
  }

  // Consulta segura para evitar inyecciones SQL.
     $result = mysqli_query($conexion, "SELECT * FROM usuario WHERE username = '$user'");
     $usuario = $result->fetch_array(MYSQLI_ASSOC);
     $email = $_POST['email'];
     $nombre = $_POST['nombre'];
     $apellido = $_POST['apellido'];
     $password = $_POST['password'];
     if(isset($_POST['nacimiento'])){
        $nacimiento = date('Y-m-d', strtotime($_POST['nacimiento']));
     }
     if(isset($_POST['tel'])){
        $tel = $_POST['tel'];
     }
     if(mysqli_num_rows($result) == 0 || strcasecmp($user , $_SESSION['nombre']) === 0){
        $sql = "UPDATE usuario SET username = '".$user."' WHERE username = '".$_SESSION['nombre']."'";
        
        $resultado = $conexion->query($sql);
        
        $sql = "UPDATE usuario SET email = '".$email."' WHERE username = '".$user."'";
        $resultado = $conexion->query($sql);
        
        $sql = "UPDATE usuario SET nombre = '".$nombre."' WHERE username = '".$user."'";
        $resultado = $conexion->query($sql);
        
        $sql = "UPDATE usuario SET apellido = '".$apellido."' WHERE username = '".$user."'";
        $resultado = $conexion->query($sql);
        echo $sql;
        $sql = "UPDATE usuario SET password = '".$password."' WHERE username = '".$user."'";
        $resultado = $conexion->query($sql);
        
        if(isset($_POST['nacimiento']) && $_POST['nacimiento'] != ""){
            $sql = "UPDATE usuario SET nacimiento = '".$nacimiento."' WHERE username = '".$user."'";
            $resultado = $conexion->query($sql);
        }
        
        if(isset($_POST['tel']) && $tel != ""){
            $sql = "UPDATE usuario SET telefono = '".$tel."' WHERE username = '".$user."'";
            $resultado = $conexion->query($sql);
        }
        $_SESSION['echo'] = 1;
        header("Location: ../ver_perfil.php"); 
      } else {
        $_SESSION['error'] = 1;
        header("Location: ../editar_perfil.php"); 
      }
?>
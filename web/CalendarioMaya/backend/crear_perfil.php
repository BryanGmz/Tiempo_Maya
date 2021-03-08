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
     echo $_POST['nacimiento'];
     if(isset($_POST['nacimiento'])){
        $nacimiento = date('Y-m-d', strtotime($_POST['nacimiento']));
     }
     if(isset($_POST['tel'])){
        $tel = $_POST['tel'];
     }
     if(mysqli_num_rows($result) == 0){
        $sql = "INSERT INTO usuario (username, password, email, nombre, apellido";
        if(isset($_POST['nacimiento']) && $_POST['nacimiento'] != ""){
            $sql .= ", nacimiento";
        }
        if(isset($_POST['tel']) && $tel != ""){
            $sql .= ", telefono";
        }
        $sql .= ", rol) VALUES ('".$user."', '".$password."', '".$email."', '".$nombre."', '".$apellido."'";
        if(isset($_POST['nacimiento']) && $_POST['nacimiento'] != ""){
            $sql .= ", '".$nacimiento."'";
        }
        if(isset($_POST['tel']) && $tel != ""){
            $sql .= ", '".$tel."'";
        }
        $sql .= ", 2)";

        $resultado = $conexion->query($sql);
        $_SESSION['nombre'] = $user;
        $_SESSION['rango'] = "GUEST";
        $_SESSION['echo'] = 1;
        header("Location: ../index.php"); 
      } else {
        $_SESSION['error'] = 1;
        header("Location: ../crear_perfil.php"); 
      }
?>
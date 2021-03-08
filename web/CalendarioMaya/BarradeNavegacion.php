<?php
    session_start();
?>

<header id="header">
  <div class="container">
    <nav id="nav-menu-container">
      <ul class="nav-menu">
        <li class="menu-active"> <a href="index.php" style="color: white;font-size: 15px;"><strong>TIEMPO</strong> MAYA</a></li>
        <li><a href="LineaDeTiempo.php">Linea de Tiempo</a></li>
        <li><a href="CalendarioHaab.php">Calendario Haab'</a></li>
        <li><a href="CalendarioCholqij.php">Calendario Cholq'ij</a></li>
        <li><a href="rueda_calendarica.php">Rueda Calendarica</a></li>
        <li><a href="nahual.php">Nahuales</a></li>
        <li><a href="./backend/acerca_de.php">Acerca de...</a></li>
        <?php 
        if (isset($_SESSION['nombre'])) { ?>
          <li><a href="ver_perfil.php"><?php echo($_SESSION['nombre']); ?></a></li>  
          <?php echo '<li><a href="cerrarSesion.php">Cerrar Sesion</a></li>';
        } else{
            echo '<li><a href="iniciarSesion.php">Iniciar Sesion</a></li>
            <li><a href="crear_perfil.php">Registrarse</a></li>';
        }
        ?>
      </ul>
    </nav>
  </div>
</header>

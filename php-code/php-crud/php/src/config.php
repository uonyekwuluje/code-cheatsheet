<?php
  $host = 'mysql-db';
  $user = 'sqluser';
  $pass = 'sqluserpassword';
  $dbase = 'poc_db';

  $conn = mysqli_connect($host, $user, $pass, $dbase);
  if ($conn === false) {
    die("Connection failed: " . mysqli_connect_error());
  }
?>

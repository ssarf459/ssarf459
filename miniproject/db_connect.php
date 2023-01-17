<?php

$sname = "localhost";
$uname = "root";
$password = "s@rfar&j346@#";
$db_name = "test";

$conn = mysqli_connect($sname, $uname, $password, $db_name, 3306);

if(!$conn){
    echo "Connection failed";
}

?>
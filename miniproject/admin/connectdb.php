<?php

$sname = "localhost";
$uname = "root";
$password = "s@rfar&j346@#";
$db_name = "feedback";

$con = mysqli_connect($sname, $uname, $password, $db_name, 3306);

if(!$con){
    echo "Connection failed";
}

?>
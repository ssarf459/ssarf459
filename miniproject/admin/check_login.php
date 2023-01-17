<?php
require('connectdb.php');

$username = $_POST['userName'];
$password = $_POST['userPassword'];

$sql = "SELECT * FROM user_table WHERE email = '$username' AND password = '$password'";
$result = mysqli_query($con, $sql);
$row = mysqli_fetch_array($result);
$count = mysqli_num_rows($result);

if ($count != 0) {
    header("Location: mainpage.php");
	exit();
} else {
    echo "<h1> Login failed. Invalid username or password.</h1>";
}

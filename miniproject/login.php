<?php
session_start();
include "db_connect.php";
if(isset($_POST['uname']) && isset($_POST['password'])){

    function validate($data){
        $data = trim($data);
        $data = stripslashes($data);
        $data = htmlspecialchars($data);
        return $data; 
    }
    $username = validate($_POST['uname']);
    $pass = validate($_POST['password']);

    if(empty($uname)){
        header ("Location: index.php?error=UserName is required");
        exit();
    }

    else if(empty($pass)){
        header("Location: index.php?errror=Password is required");
        exit();
    }
    else{
        $sql="SELECT * FROM users WHERE user_name='$uname' AND password='$pass'";
        $result=mysqli_query($conn,$sql);
        if(mysqli_num_rows($result)===1){
            $row=mysqli_fetch_assoc($result);
            if($row['user_name']===$uname && $row['password']===$pass){
                echo "Logged In!";
                $_SESSION['user_name']=$row['user_name'];
                $_SESSION['id']=$row['id'];
                header("Location: home.php");
                exit();
            }
            else{
                header("Location:index.php?error=Incorrect Username or Password");
                exit();
            }
        }
        else{
            header("Location:index.php?error=Incorrect Username or Password");
            exit();
        }
    }
}
else{
    header("Location: index.php");
    exit();
}
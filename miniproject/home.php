<?php
session_start();

if(isset($_SESSION['id']) && isset($_SESSION['user_name'])){
    ?>
    <!DOCTYPE html>
    <html>
    <head>
        <title>Document</title>
        <link rel="stylesheet" href="css/login.css">
    </head>
    <body>
        <h1>Hello, <?php echo $_SESSION['user_name']; ?></h1>
        <a href="logout.php">Log Out</a>
    </body>
    </html>
    <?php
}

else{
    header("Location: inedx.php");
    exit();
}
?>
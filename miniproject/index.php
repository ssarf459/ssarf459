<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="css/style.css">
    <title>Login</title>
</head>
<body>
    <form action="login.php" method="post">
        <h2>LOGIN</h2>
        <?php if(isset($_GET['error'])){?>
            <p class="error"> <?php echo $_GET['error']; ?></p>
        <?php } ?>
        <label>Username</label>
        <input type="text" name="uname" placeholder="User Name"><br>
        <label>Password</label>
        <input type="text" name="password" placeholder="Password"><br>
        <button type="submit">Login</button>
    </form>
</body>
</html>
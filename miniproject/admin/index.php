<!DOCTYPE html>
<html>
  <head>
    <title>Log In Page</title>
    <link rel="stylesheet" href="css/login.css">
  </head>
  <body>
    <div class="wrapper">
      <div class="inner-warpper text-center">
        <h2 class="title">Login to your account</h2>
        <form action="check_login.php" id="formvalidate" method="POST">
          <div class="input-group">
            <input
              name="userName"
              id="userName"
              type="text"
              placeholder="Enter your username"
            />
          </div>
          <div class="input-group">
            <input
              name="userPassword"
              id="userPassword"
              type="password"
              placeholder="Enter your password"
            />
          </div>

          <button type="submit" id="login">Login</button>
            
            <a class="forgot pull-right" href="#">Forgot Password?</a>
          </div>
        </form>
      </div>
    </div>
  </body>
</html>

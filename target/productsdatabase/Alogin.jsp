<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Home Page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="./Resources/images/icons/favicon.ico"/>
    <!--===============================================================================================-->
    	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <link rel="stylesheet" type="text/css" href="./Resources/css/util.css">
        <link rel="stylesheet" type="text/css" href="./Resources/css/main.css">
        <link rel="stylesheet" href="Resources/css/custom.css">
    <!--===============================================================================================-->
        <title>Login</title>
    </head>
    <body>
        <header>
            <div id="brand"><a href="/">MyCompany</a></div>
            <nav>
                <ul>
                    <li><a href="index.html">Home</a></li>
                </ul>
            </nav>
            <div id="hamburger-icon" onclick="toggleMobileMenu(this)">
                <div class="bar1"></div>
                <div class="bar2"></div>
                <div class="bar3"></div>
                <ul class="mobile-menu">
                  <li><a href="index.html">Home</a></li>
                </ul>
            </div>
        </header>        

        <div class="alert alert-danger d-flex align-items-center container mt-3 mb-3 alert-dismissible fade show" role="alert">
  			<svg class="bi flex-shrink-0 me-2" width="24" height="24" role="img" aria-label="Success:"><use xlink:href="#check-circle-fill"/></svg>
  			<div>
    		Username or Password Incorrect! Try Again.
    		<button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
  			</div>
		</div>
        
        <div class="limiter">
            <div class="container-login100">
                <div class="wrap-login100">
                    <div class="login100-pic js-tilt" data-tilt>
                        <img src="./Resources/images/img-01.png" alt="IMG">
                    </div>
                    
                    
                
    
                    <form action="Login" method="post" class="login100-form validate-form">
                        <span class="login100-form-title">
                            Member Login
                        </span>
                            
                        <div class="wrap-input100 validate-input" data-validate = "Valid email is required: ex@abc.xyz">
                            <input class="input100" type="text" name="email" placeholder="Username">
                            <span class="focus-input100"></span>
                            <span class="symbol-input100">
                                <i class="fa fa-envelope" aria-hidden="true"></i>
                            </span>
                        </div>
    
                        <div class="wrap-input100 validate-input" data-validate = "Password is required">
                            <input class="input100" type="password" name="password" placeholder="Password">
                            <span class="focus-input100"></span>
                            <span class="symbol-input100">
                                <i class="fa fa-lock" aria-hidden="true"></i>
                            </span>
                        </div>
                        <br>${message}
                        
                        <div class="container-login100-form-btn">
                            <button class="login100-form-btn" type="submit">
                                Login
                            </button>
                        </div>
                    </form>
                </div>
            </div>
        </div>

        <form></form>
        <script src="./Resources/js/main.js"></script>
        <script src="Resources/js/custom.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </body>
</html>


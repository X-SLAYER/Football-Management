<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="zxx">
    <!-- Head -->

    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
        <title>Football scores and Results</title>
        <!-- Meta-Tags -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta charset="utf-8">
        <meta name="keywords"
              content="Key Login Form a Responsive Web Template, Bootstrap Web Templates, Flat Web Templates, Android Compatible Web Template, Smartphone Compatible Web Template, Free Webdesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola Web Design">
        <script>
            addEventListener("load", function () {
                setTimeout(hideURLbar, 0);
            }, false);

            function hideURLbar() {
                window.scrollTo(0, 1);
            }
        </script>
        <!-- //Meta-Tags -->
        <!-- Index-Page-CSS -->
        <link rel="stylesheet" href="css/style.css" type="text/css" media="all">
        <!-- //Custom-Stylesheet-Links -->
        <!--fonts -->
        <!-- //fonts -->
        <link rel="stylesheet" href="css/font-awesome.min.css" type="text/css" media="all">
        <!-- //Font-Awesome-File-Links -->

        <!-- Google fonts -->
        <link href="//fonts.googleapis.com/css?family=Quattrocento+Sans:400,400i,700,700i" rel="stylesheet">
        <link href="//fonts.googleapis.com/css?family=Mukta:200,300,400,500,600,700,800" rel="stylesheet">
        <!-- Google fonts -->

    </head>
    <!-- //Head -->
    <!-- Body -->

    <body>

        <section class="main">
            <div class="layer">

                <div class="bottom-grid">
                    <div class="logo">
                        <h1> <a href="#"><span class="fa fa-futbol-o"></span> Football scores and Results</a></h1>
                    </div>
                    <div class="links">
                        <ul class="links-unordered-list">
                            <li class="active">
                                <a href="#" class="">Login</a>
                            </li>
                            <li class="">
                                <a href="#" class="">About Us</a>
                            </li>
                            <li class="">
                                <a href="register.jsp" class="">Register</a>
                            </li>
                            <li class="">
                                <a href="#" clZass="">Contact</a>
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="content-w3ls">
                    <div class="text-center icon">
                        <span class="fa fa-user-circle"></span>
                    </div>
                    <div class="content-bottom">
                        <form action="Login" method="POST">
                            <div class="alert alert-warning">
                                <strong>Warning! </strong> Username Or Password Incorrect.
                            </div>
                            <ul class="list-login-bottom">
                                <li class="">
                                    <a href="register.jsp" class="">Create Account</a>
                                </li>
                                <li class="">
                                    <a href="index.jsp" class="">Login Again</a>
                                </li>

                                <li class="clearfix"></li>
                            </ul>
                        </form>
                    </div>
                </div>

            </div>
        </section>

    </body>
    <!-- //Body -->

</html>
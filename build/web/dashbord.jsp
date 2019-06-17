<%@page import="com.login.user"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.actions.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%

    HttpSession ses = request.getSession(false);
    String user = (String)ses.getAttribute("user");
    user FullUser =(user)ses.getAttribute("FullUser");
    
if(FullUser.getUsername() == null)
{
    response.sendRedirect("index.jsp");
}

%>

<link rel="stylesheet" type="text/css" href="css/pitch.css">
<title><%= FullUser.getUsername() %></title>
<header role="banner">
    <h1>Welcome , <%=FullUser.getFirst()+" "+FullUser.getLast()%></h1>
    <ul class="utilities">
        <br>
        <li class="users"><a href="#">My Account(<%=FullUser.getUsername()%>)</a></li>
        <li class="logout warn"><a href="index.jsp">Log Out</a></li>
    </ul>
</header>

<nav role='navigation'>
    <ul class="main">
        <li class="dashboard"><a href="#">Home</a></li>
        <li class="edit"><a href="Standing">Voir Classment</a></li>
        <li class="write"><a href="GetMatches">Voir Matches</a></li>
        <li class="comments"><a href="GetFavourite">Mon Favourite Matches</a></li>
        <li class="ajouter"><a href="AddFavourite.jsp">Ajouter Favourites</a></li>
        <!--<li class="users"><a href="#">Manage Users</a></li>-->
    </ul>
</nav>

<main role="main">

<!---->
    <section class="panel important">
        <center><h2>Best Players Of The Season</h2></center>
       <div class="quiz wrapper">

<div class="container container--smoelen">

<div class="smoelen"><img src="images/playmakers.png" alt="smoelen" class="smoelen_image">
</div>

<div class="smoelen-links">

<div class="line clearfix">

<div class="width-1v5"><a href="#!" class="smoel-link"><img src="images/placeholder.png" class="placeholder" alt="">

<span>Moreno
</span></a>
</div>

<div class="width-1v5"><a href="#!" class="smoel-link"><img src="images/placeholder.png" class="placeholder" alt="">

<span>Schiaffino
</span></a>
</div>

<div class="width-1v5"><a href="#!" class="smoel-link"><img src="images/placeholder.png" class="placeholder" alt="">

<span>Didi
</span></a>
</div>

<div class="width-1v5"><a href="#!" class="smoel-link"><img src="images/placeholder.png" class="placeholder" alt="">

<span>Suarez
</span></a>
</div>

<div class="width-1v5"><a href="#!" class="smoel-link"><img src="images/placeholder.png" class="placeholder" alt="">

<span>Rivera
</span></a>
</div>
</div>

<div class="line clearfix">

<div class="width-1v5"><a href="#!" class="smoel-link"><img src="images/placeholder.png" class="placeholder" alt="">

<span>Netzer
</span></a>
</div>

<div class="width-1v5"><a href="#!" class="smoel-link"><img src="images/placeholder.png" class="placeholder" alt="">

<span>Rivelino
</span></a>
</div>

<div class="width-1v5"><a href="#!" class="smoel-link"><img src="images/placeholder.png" class="placeholder" alt="">

<span>Cruyff
</span></a>
</div>

<div class="width-1v5"><a href="#!" class="smoel-link"><img src="images/placeholder.png" class="placeholder" alt="">

<span>Zico
</span></a>
</div>

<div class="width-1v5"><a href="#!" class="smoel-link"><img src="images/placeholder.png" class="placeholder" alt="">

<span>Socrates
</span></a>
</div>
</div>

<div class="line clearfix">

<div class="width-1v5"><a href="#!" class="smoel-link"><img src="images/placeholder.png" class="placeholder" alt="">

<span>Platini
</span></a>
</div>

<div class="width-1v5"><a href="#!" class="smoel-link"><img src="images/placeholder.png" class="placeholder" alt="">

<span>Maradona
</span></a>
</div>

<div class="width-1v5"><a href="#!" class="smoel-link"><img src="images/placeholder.png" class="placeholder" alt="">

<span>Valderama
</span></a>
</div>

<div class="width-1v5"><a href="#!" class="smoel-link"><img src="images/placeholder.png" class="placeholder" alt="">

<span>Franscescoli
</span></a>
</div>

<div class="width-1v5"><a href="#!" class="smoel-link"><img src="images/placeholder.png" class="placeholder" alt="">

<span>Gullit
</span></a>
</div>
</div>

<div class="line clearfix">

<div class="width-1v5"><a href="#!" class="smoel-link"><img src="images/placeholder.png" class="placeholder" alt="">

<span>Laudrup
</span></a>
</div>

<div class="width-1v5"><a href="#!" class="smoel-link"><img src="images/placeholder.png" class="placeholder" alt="">

<span>Hagi
</span></a>
</div>

<div class="width-1v5"><a href="#!" class="smoel-link"><img src="images/placeholder.png" class="placeholder" alt="">

<span>Baggio
</span></a>
</div>

<div class="width-1v5"><a href="#!" class="smoel-link"><img src="images/placeholder.png" class="placeholder" alt="">

<span>Zidane
</span></a>
</div>

<div class="width-1v5"><a href="#!" class="smoel-link"><img src="images/placeholder.png" class="placeholder" alt="">

<span>Totti
</span></a>
</div>
</div>

<div class="line clearfix">

<div class="width-1v5"><a href="#!" class="smoel-link"><img src="images/placeholder.png" class="placeholder" alt="">

<span>Pirlo
</span></a>
</div>

<div class="width-1v5"><a href="#!" class="smoel-link"><img src="images/placeholder.png" class="placeholder" alt="">

<span>Xavi
</span></a>
</div>

<div class="width-1v5"><a href="#!" class="smoel-link"><img src="images/placeholder.png" class="placeholder" alt="">

<span>Ronaldinho
</span></a>
</div>

<div class="width-1v5"><a href="#!" class="smoel-link"><img src="images/placeholder.png" class="placeholder" alt="">

<span>Iniesta
</span></a>
</div>

<div class="width-1v5"><a href="#!" class="smoel-link"><img src="images/placeholder.png" class="placeholder" alt="">

<span>Messi
</span></a>
</div>
</div>
</div>
</div>
  <footer role="contentinfo" class="container contentinfo">Illustrations by&nbsp;<a href="http://iamdany.com/PLAYMAKERS">Daniel Nyari</a></footer><aside class="subfooter">


</div><!-- ./wrapper -->  

    </section>

</main>



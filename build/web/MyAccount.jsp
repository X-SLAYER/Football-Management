<%-- 
    Document   : MyAccount
    Created on : Jun 13, 2019, 3:51:14 PM
    Author     : X-SLAYER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet"  href="css/userUpdate.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My Account</title>
    </head>
    <div class="container">
  <div class="row justify-content-center">
    <div class="col-6 uxa-form-group mt-5">

      <h1 class="text-center mt-5 mb-2">First Name, Last Name</h1>
      <!-- single sentence description -->
      <p class="lead text-center">{{email-address}}</p>
      <!-- /single sentence description -->

      <div class="uxa-user-avatar">
        <img src="https://s-media-cache-ak0.pinimg.com/564x/07/3d/4c/073d4c881442c782d2cefed3e7e814f2.jpg" alt="User avatar">
      </div>
      
      
      <form class="mt-5 mb-5">

        <div class="form-group">
          <label for="exampleInputEmail1">Your Email Address<span>*</span></label>
          <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
          <small id="emailHelp" class="form-text text-muted">We'll never share or spam your email address.</small>
        </div>

        <div class="form-group">
          <label for="exampleInputName">First Name</label>
          <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter your First Name">
        </div>

        <div class="form-group">
          <label for="exampleInputName">Last Name</label>
          <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter your First Name">
        </div>
        
      </form>
      
      <button class="btn btn-success" (click)="save()"><i class="fa fa-save mr-2"></i> Update Account Details</button>

    </div>
  </div>
</div>
</html>

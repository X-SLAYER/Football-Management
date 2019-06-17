<%@page import="com.Functions.GetAll"%>
<%@page import="com.Functions.GetName"%>
<%@page import="com.actions.GetClubs"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%

    HttpSession ses = request.getSession(false);
    String user = (String) ses.getAttribute("user");

%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Favourites</title>
        <style>
            input[type=submit] {
                width: 35%;
                background-color: #4CAF50;
                color: white;
                padding: 14px 20px;
                margin: 8px 0;
                border: none;
                border-radius: 4px;
                cursor: pointer;
            }
            section {
                padding: 60px 0;
                min-height: 100vh;
            }
            .section_title {
                margin-bottom: 40px;
            }

            .section_title h2 {
                color: #333333;
                font-size: 25px;
                font-weight: 700;
                letter-spacing: 1.8px;
                text-transform: uppercase;
            }

            .brand_border .fa.fa-minus {
                color: #fff;
                font-size: 8px;
                height: 2px;
                background: #F8C01B none repeat scroll 0 0;
                width: 100px;
            }
            .brand_border .fas.fa-handshake {
                font-size: 14px;
                color:#000000;
            }


            .section_title p {
                color: #333333;
                font-size: 14px;
                line-height: 25px;
                padding: 14px 0;
            }


            .tables-page-section .table {
                text-align: center;
                margin-bottom: 40px;
            }
            .tables-page-section .table th {
                border-bottom: 1px solid #ffffff;
                border-right: 1px solid #ffffff;
                font-family: 'Montserrat', sans-serif;
                font-size: 15px;
                font-weight: 700;
                padding: 10px 20px;
                text-align: center;
            }
            .tables-page-section .table td {
                border-bottom: 1px solid #ffffff;
                border-right: 1px solid #ffffff;
                background: #f1f1f1;
                font-family: 'Lato', sans-serif;
                font-size: 13px;
                color: #666666;
                padding: 10px 20px;
            }
            .tables-page-section .table thead th {
                padding: 15px 20px;
                text-align: center;
                background: #ffba00 !important;
            }
            .tables-page-section .table tr th {
                background: #f1f1f1;
            }
        </style>
    </head>
    <body>
    <center><section class="tables-page-section" ="service">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="section_title text-center">
                            <h2>Ajouter Favourite</h2>
                            <div class="brand_border">
                                <i class="fa fa-minus" aria-hidden="true"></i> 
                                <i class="fas fa-handshake"></i>
                                <i class="fa fa-minus" aria-hidden="true"></i>
                            </div>
                        </div>
                        <form method="POST" action="Add">
                            <div class="row">
                                <div class="col-sm-12">
                                    <div class="table-responsive">
                                        <table class="table">
                                            <thead>
                                            <th>#</th>
                                            <th></th>
                                            <th>Club Name</th>
                                            <th>Points This Season</th>
                                            <th>Is Favourite<img alt="" src="images/fav.png" style='width:24px;height:24px'></th>
                                            </thead>
                                            <%  GetClubs clubs = new GetClubs(user);
                                                GetAll all = new GetAll();
                                                GetName returnPLZ = new GetName();
                                                for (String id : all.allClubs) {
                                            %>
                                            <tr>
                                                <th>
                                                    <%
                                                        if (clubs.clubs.contains(returnPLZ.returnName(id))) {

                                                            out.print("<input type=\"checkbox\" name=\"IsFav\" value=" + id + " checked >");
                                                        } else {
                                                            out.print("<input type=\"checkbox\" name=\"IsFav\" value=" + id + ">");
                                                        }
                                                    %>

                                                </th>
                                                <td><img alt="" src="logos/<%= returnPLZ.returnPath(id)%>" style='width:24px;height:24px'></td>
                                                <td><%= returnPLZ.returnName(id)%></td>
                                                <td><%= returnPLZ.returnPoints(id)%></td>
                                                <td>
                                                    <%
                                                        if (clubs.clubs.contains(returnPLZ.returnName(id))) {

                                                            out.print("<img alt=\"\" src=\"images/fav.png\" style='width:24px;height:24px'>");
                                                        }
                                                    %>
                                                </td>
                                            </tr>
                                            <%
                                                }
                                            %>
                                        </table>
                                        <input type="submit" value="Validate">
                                    </div>

                                </div>
                            </div>
                        </form>
                    </div>
                    </section></center>
                    </body>
                    </html>

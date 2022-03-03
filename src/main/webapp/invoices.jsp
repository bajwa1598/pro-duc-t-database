s<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <link rel="stylesheet" href="Resources/css/custom2.css">
    <title>Invoices</title>
</head>
    <body>
        <header>
        <div id="brand"><a href="/">MyCompany</a></div>
        <nav>
            <ul>
                <li><a href="addProduct.html">Home</a></li>
                <li><a href="invoices.html">Invoices</a></li>
<li><form action="Logout" method="get"><button id="logout">Logout</Button></form></li>            </ul>
        </nav>
        <div id="hamburger-icon" onclick="toggleMobileMenu(this)">
            <div class="bar1"></div>
            <div class="bar2"></div>
            <div class="bar3"></div>
            <ul class="mobile-menu">
              <li><a href="addProduct.html">Home</a></li>
              <li><a href="invoices.html">Invoices</a></li>
              <li><form action="Logout" method="get"><button id="logout">Logout</Button></form></li>
            </ul>
        </div>
        </header>
    
        <%
            String id = request.getParameter("serialNo");
            String driverName = "org.postgresql.Driver";
            String connectionUrl = "jdbc:postgresql://ec2-35-175-68-90.compute-1.amazonaws.com:5432/";
            String dbName = "d50oudr5stuh4v?sslmode=require";
            String userId = "tpavixpchiudcf";
            String password = "38d9424489afe824c0374811327c6e503bba844124a3e1255e397e84be160090";
            try {
            Class.forName(driverName);
            } catch (ClassNotFoundException e) {
            e.printStackTrace();
            }

            Connection connection = null;
            Statement statement = null;
            ResultSet resultSet = null;
        %>
    
        <h2 align="center" class="mt-3"><font><strong>Invoices Data</strong></font></h2>
    
        <table class="table">
            <thead class="thead-dark"> 
                <tr>
                    <th scope="col">Serial No</th>
                    <th scope="col">Invoice Time</th>
                    <th scope="col">Date of Purchase</th>
                    <th scope="col">Warranty Period</th>
                    <th scope="col">Brand Name</th>
                    <th scope="col">Product Name</th>
                    <th scope="col">Model No</th>
                    <th scope="col">Buyer Name</th>
                    <th scope="col">Buyer Address</th>
                    <th scope="col">Buyer C. Detail</th>
                    <th scope="col">Email Address</th>
                    <th scope="col">Phone No</th>
                </tr>
                <%
                    try{ 
                        connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
                        statement=connection.createStatement();
                        String sql ="SELECT * FROM product_records";

                        resultSet = statement.executeQuery(sql);
                        while(resultSet.next()){
                %>
            </thead>
            <tbody> 
                <tr>
                    <th scope="row"><%=resultSet.getString("serialNo") %></th>
                    <td><%=resultSet.getString("invoiceTime") %></td>
                    <td><%=resultSet.getString("dateOfPurchase") %></td>
                    <td><%=resultSet.getString("warrantyPeriod") %></td>
                    <td><%=resultSet.getString("brandName") %></td>
                    <td><%=resultSet.getString("productName") %></td>
                    <td><%=resultSet.getString("modelNo") %></td>
                    <td><%=resultSet.getString("buyerName") %></td>
                    <td><%=resultSet.getString("buyerAddress") %></td> 
                    <td><%=resultSet.getString("buyerContactDetail") %></td> 
                    <td><%=resultSet.getString("emailAddress") %></td>
                    <td><%=resultSet.getString("phoneNo") %></td>        
                </tr>
            </tbody>

            <% 
                }

                } catch (Exception e) {
                e.printStackTrace();
                }
            %>
        </table>
    </body>
</html>

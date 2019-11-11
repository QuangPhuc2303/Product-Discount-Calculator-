<%--
  Created by IntelliJ IDEA.
  User: MyPC
  Date: 11/11/2019
  Time: 5:11 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount Calculator</title>
  </head>
  <body>
  <h1>Product Discount Calculator</h1>
  <form method="post" action="/discount">
    <input type="text" name="Product Description" placeholder="Product Description"><br>
    <input type="text" name="List Price" placeholder="List Price"><br>
    <input type="text" name="Discount Percent" placeholder="Discount Percent">(%)<br>
    <input type="submit" id="submit" value="Calculate Discount"/>
  </form>
  </body>
</html>

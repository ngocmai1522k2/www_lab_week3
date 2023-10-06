<%@ page import="vn.edu.iuh.fit.backend.configs.services.ProductServices" %>
<%@ page import="vn.edu.iuh.fit.backend.configs.models.Product" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: lethi
  Date: 10/3/2023
  Time: 4:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Products Listing</title>
</head>
<body>
    <%
        ProductServices productServices = new ProductServices();
        List<Product> lst = productServices.getActiveProducts();
    %>
    <table width="70%" align="center" border="1">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Description</th>
            <th>Unit</th>
            <th>Manufacturer Name</th>
            <th>Status</th>
            <th colspan="2"><a href="insertProduct.jsp">Insert</a> </th>
        </tr>
        <%
            for(Product p: lst){
        %>
        <tr>
            <td><%=p.getProductID()%> </td>
            <td><%=p.getName()%> </td>
            <td><%=p.getDescription()%> </td>
            <td><%=p.getUnit()%> </td>
            <td><%=p.getManufacturer_name()%> </td>
            <td><%=p.getStatus()%> </td>
            <td><a href="">Update</a></td>
            <td><a href="">Delete</a> </td>
        </tr>
        <%
            }
        %>
    </table>
</body>
</html>

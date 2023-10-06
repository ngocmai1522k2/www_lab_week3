<%@ page import="vn.edu.iuh.fit.backend.configs.services.CustomerServices" %>
<%@ page import="java.util.List" %>
<%@ page import="vn.edu.iuh.fit.backend.configs.models.Customer" %><%--
  Created by IntelliJ IDEA.
  User: lethi
  Date: 10/6/2023
  Time: 10:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer List</title>
</head>
<body>
    <%
        CustomerServices services = new CustomerServices();
        List<Customer> lst = services.getAll();
    %>
    <table width="80%" align="center">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Address</th>
            <th>Phone</th>
            <th>Email</th>
            <th><a href="insertCustomer.jsp">Insert Customer</a></th>

        </tr>
            <%
                for(Customer c : lst){
            %>
        <tr>
            <td><%=c.getCus_id()%></td>
            <td><%=c.getCus_name()%></td>
            <td><%=c.getAddress()%></td>
            <td><%=c.getPhone()%></td>
            <td><%=c.getEmail()%></td>
            <td><a href="">Update</a></td>
            <td><a href="">Delete</a></td>
        </tr>
        <%}%>
    </table>
</body>
</html>

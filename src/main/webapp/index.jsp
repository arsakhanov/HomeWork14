<%@ page import="com.VariableImpl" %>
<%@ page import="java.util.Map" %>

<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP List Users Records</title>
<body>
<h2>Table of parameters</h2>
<table border="1" cellpadding="5">
    <caption><h2>List of users</h2></caption>
    <tr>
        <th>Name</th>
        <th>Value</th>
    </tr>
    <%
        VariableImpl variable = new VariableImpl();
         Map<String, String> map = variable.getSystemVariables();
        for (Map.Entry<String,String> entry : map.entrySet()) {
    %>

    <tr>
        <td><%=entry.getKey()%>
        </td>
        <td><%=entry.getValue()%>
        </td>
    </tr>
    <%}%>
</table>
</body>
</html>

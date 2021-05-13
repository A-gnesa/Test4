<%--
  Created by IntelliJ IDEA.
  User: 程子涵
  Date: 2021/5/12
  Time: 2:33 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table border="1">
        <tr>
            <th>编号</th>
            <th>名称</th>
            <th>职业</th>
            <th>电话</th>
        </tr>
        <tr>
            <th>
                ${customer.id}
            </th>
            <th>
                ${customer.username}
            </th>
            <th>
                ${customer.jobs}
            </th>
            <th>
                ${customer.phone}
            </th>
        </tr>
    </table>>
</body>
</html>

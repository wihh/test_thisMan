<%--
  Created by IntelliJ IDEA.
  User: 13673
  Date: 2021/12/25
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <div align="center">
            <form class="form-inline">
                <div style="text-align: center">
                    名称：<input name="name" value="${name}">
                    <input type="submit" value="查询">
                </div>
            </form>
        </div>
        <div>
            <form action="/list" style="text-align: center;" method="post">
                <table border="1px  solid gray" width="800px" align="center">
                    <tr>
                        <td>编号</td>
                        <td>社区名称</td>
                        <td>现存疫苗</td>
                        <td>已接种人数</td>
                        <td>操作</td>
                    </tr>
                    <c:forEach items="${communityList}" var="u">
                        <tr>
                            <td>${u.id}</td>
                            <td>${u.name}</td>
                            <td>${u.existing}</td>
                            <td>${u.completed}</td>
                            <td>
                                <a onclick="delID(${u.id})">删除</a>
                                <a href="${pageContext.request.contextPath}/addUI.action">新增</a>
                            </td>
                        </tr>
                    </c:forEach>
                </table>
                <form>
                    <tr>
                        <td>
                            共有${count}条数据
                        </td>
                    </tr>
        </div>

<script>
    function delID(id) {
        if (window.confirm("您确定删除吗？")){
            location.href="${pageContext.request.contextPath}/del.action?id=${u.id}"+id;
        }
    }
</script>
</body>
</html>

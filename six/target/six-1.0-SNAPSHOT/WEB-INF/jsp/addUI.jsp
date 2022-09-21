<%--
  Created by IntelliJ IDEA.
  User: 13673
  Date: 2021/12/25
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form name="form" method="post" align="center" action="${pageContext.request.contextPath}/add">
    <p>
        社区名称：<input type="text" name="name"  msg="社区名称">
    </p>
    <p>
        现存疫苗：<input type="text" name="existing"  msg="现存疫苗">
    </p>
    <p>
        已接种人数：<input type="text" name="completed" msg="已接种人数" >
    </p>
    <p>
        <input type="submit" value="提交">
        <input type="reset" value="重置">
    </p>

</form>

</body>
</html>

<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

    <title>用户详细信息</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">

</head>

<body>
    <table width="440" border="1">
        <tr>
            <td width="167">用户名：</td>
            <td width="257">
                ${userInfo1.username}
            </td>
        </tr>
        <tr>
            <td width="167">昵称：</td>
            <td width="257">
                ${userInfo1.nickname}
            </td>
        </tr>
        <tr>
            <td width="167">QQ：</td>
            <td width="257">
                ${userInfo1.QQ}
            </td>
        </tr>
        <tr>
            <td width="167">省份：</td>
            <td width="257">
                ${userInfo1.province}
            </td>
        </tr>
        <tr>
            <td width="167">城市：</td>
            <td width="257">
                ${userInfo1.city}
            </td>
        </tr>
        <tr>
            <td>性别：</td>
            <td>
                <c:if test="${userInfo1.sex ==1}">男</c:if>
                <c:if test="${userInfo1.sex ==2}">女</c:if>
            </td>
        </tr>
        <tr>
            <td>邮箱：</td>
            <td>
                ${userInfo1.email}</td>
        </tr>
        <tr>
            <td>电话/手机：</td>
            <td>${userInfo1.tel}
                </td>
        </tr>
        </tr>
    </table>
</body>
</html>
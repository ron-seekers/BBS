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
<form method="post" action=<%=request.getContextPath()%>/user/update/${userInfo1.id}.do>
     <input type="hidden" name="id" value="${userInfo1.id }" />
    <table width="440" border="1">
        <tr>
            <td width="167">用户名：</td>

            <td width="257">
               <input value="${userInfo1.username}" name="username" type="text"/>
            </td>
        </tr>
        <tr>
            <td width="167">昵称：</td>
            <td width="257">
                <input  value="${userInfo1.nickname}" name="nickname" type="text"/>
            </td>
        </tr>
        <tr>
            <td width="167">QQ：</td>
            <td width="257">
                <input   value="${userInfo1.QQ}"  name="QQ" type="text"  />
            </td>
        </tr>
        <tr>
            <td width="167">省份：</td>
            <td width="257">
                <input  value="${userInfo1.province}" name="province"  type="text"/>
            </td>
        </tr>
        <tr>
            <td width="167">城市：</td>
            <td width="257">
                    <input  value=" ${userInfo1.city}" name="city"  type="text"/>
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

                    <input  value="${userInfo1.email}" name="email"  type="text"/>
            </td>
        </tr>
        <tr>
            <td>电话/手机：</td>
            <td>
                <input  value="${userInfo1.tel}" name="tel"  type="text"/>
                </td>
        </tr>
        <td colspan="2">
            <input type="submit" name="button" id="button" value="提交"/>
            <label>
                <input type="reset" name="button2" id="button2" value="重置"/>
            </label>
        </td>
        </tr>
    </table>
    </form>
</body>
</html>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

    <title>用户修改</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">

</head>

<body>
<form method="post" action=<%=request.getContextPath()%>/user/update/${userInfo1.id}.do>
    <table width="440" border="1">
        <tr>
            <td width="167">用户名：</td>
            <td width="257">
                <label>
                    <input name="username" type="text"  size="20" maxlength="20"/>
                    <input type="hidden"   name="username" value="${userInfo1.username}"/>
                </label>
            </td>
        </tr>
        <tr>
            <td width="167">昵称：</td>
            <td width="257">
                <label>
                    <input name="nickname" type="text"   size="20" maxlength="20"/>
                    <input type="hidden"   name="nickname" value="${userInfo1.nickname}"/>
                </label>
            </td>
        </tr>
        <tr>
            <td width="167">QQ：</td>
            <td width="257">
                <label>
                    <input name="QQ" type="text"    size="20" maxlength="20"/>
                    <input type="hidden"   name="QQ" value="${userInfo1.QQ}"/>
                </label>
            </td>
        </tr>
        <tr>
            <td width="167">省份：</td>
            <td width="257">
                <label>
                    <input name="province" type="text"  size="20" maxlength="20"/>
                    <input type="hidden"   name="QQ" value="${userInfo1.id}"/>
                </label>
            </td>
        </tr>
        <tr>
            <td width="167">城市：</td>
            <td width="257">
                <label>
                    <input name="city" type="text"   size="20" maxlength="20"/>
                </label>
            </td>
        </tr>
        <tr>
            <td>邮箱：</td>
            <td><input name="email" type="text"  size="20" maxlength="20"/></td>
        </tr>
        <tr>
            <td>电话/手机：</td>
            <td><input name="tel" type="text" size="20" maxlength="20"/>
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
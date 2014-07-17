<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

    <title>修改密码</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">

</head>

<body>
<form method="post" action=<%=request.getContextPath()%>/user/updatePwd/${userInfo1.username}.do>
    <table width="440" border="1">
        <tr>
            <td width="167">用户名：</td>
            <td width="257">
                <label>
                    <input name="${userInfo1.username}" type="text"  size="20" maxlength="20"/>
                </label>
            </td>
        </tr>
        <tr>
            <td width="167">新密码：</td>
            <td width="257">
                <label>
                    <input name="password" type="text"   size="20" maxlength="20"/>
                </label>
            </td>
        </tr>
        <tr>
            <td width="167">确认密码：</td>
            <td width="257">
                <label>
                    <input name="repassword" type="text"    size="20" maxlength="20"/>
                </label>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
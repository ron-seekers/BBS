<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

    <title>注册用户</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">

</head>

<body>
<form method="post" action=<%=request.getContextPath()%>/user/register.do>
    <table width="440" border="1">
        <tr>
            <td width="167">用户名：</td>
            <td width="257">
                <label>
                    <input name="username" type="text"  size="20" maxlength="20"/>
                </label>
            </td>
        </tr>
        <tr>
            <td width="167">昵称：</td>
            <td width="257">
                <label>
                    <input name="nickname" type="text"  size="20" maxlength="20"/>
                </label>
            </td>
        </tr>
        <tr>
            <td width="167">QQ：</td>
            <td width="257">
                <label>
                    <input name="QQ" type="text"  size="20" maxlength="20"/>
                </label>
            </td>
        </tr>
        <tr>
            <td width="167">省份：</td>
            <td width="257">
                <label>
                    <input name="province" type="text"  size="20" maxlength="20"/>
                </label>
            </td>
        </tr>
        <tr>
            <td width="167">城市：</td>
            <td width="257">
                <label>
                    <input name="city" type="text"  size="20" maxlength="20"/>
                </label>
            </td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input name="password" type="text" id="textfield2" size="20" maxlength="20"/></td>
        </tr>
        <tr>
            <td>确认密码：</td>
            <td><input name="repassword" type="text" id="textfield3" size="20" maxlength="20"/></td>
        </tr>
        <tr>
            <td>性别：</td>
            <td><input type="radio" name="sex" value="1" checked="checked">男
                <input type="radio" name="sex" value="2">女
            </td>
        </tr>
        <tr>
            <td>邮箱：</td>
            <td><input name="email" type="text" id="textfield5" size="20" maxlength="20"/></td>
        </tr>
        <tr>
            <td>电话/手机：</td>
            <td><input name="tel" type="text" id="textfield6" size="20" maxlength="20"/></td>
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
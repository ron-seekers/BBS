<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<a href="./user/register.jsp">注册</a>
<a href="./user/update.jsp">修改</a>
<a href="./user/userAlllist.do"> 查询所有</a>
<br/>
<br/>
<br/>
<form method="post" action=<%=request.getContextPath()%>/index.do>
    <table width="416" height="122" border="1">
        <tr>
            <td width="134" height="37">用户名：</td>
            <td width="266">
                <label>
                    <input name="username" type="text" id="textfield" size="30" maxlength="30"  height="20px"/>
                </label>
            </td>
        </tr>
        <tr>
            <td height="42">密码：</td>
            <td>
                <input name="password" type="text" id="textfield2" size="30" maxlength="16"  height="20px"/>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" name="button" id="button" value="提交" />
                <input type="reset" name="button2" id="button2" value="重置" />

            </td>
        </tr>
    </table>
</form>
</body>
</html>
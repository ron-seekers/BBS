<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'userinfo-list.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
	<table align="center">
		<tr>
			<td>昵称</td>
			<td>用户名</td>
			<td>QQ</td>
			<td>省份</td>
			<td>城市</td>
			<td>性别</td>
            <td>邮箱</td>
            <td>电话/手机</td>
            <td>操作</td>
		</tr>
		<c:forEach items="${userInfoList}" var="userInfoList">
			<tr>
				<td>${userInfoList.nickname }</td>
				<td>${userInfoList.username }</td>
				<td>${userInfoList.QQ }</td>
				<td>${userInfoList.province }</td>
				<td>${userInfoList.city }</td>
                <td><c:if test="${userInfoList.sex ==1}">男</c:if>
                    <c:if test="${userInfoList.sex ==2}">女</c:if></td>
                <td>${userInfoList.email }</td>
                <td>${userInfoList.tel }</td>
				<td><a href="user/updateuser/${userInfoList.id}.do">修改</a>||
				<a href="user/delete/${userInfoList.nickname}.do">删除</a>||
                <a href="user/user/${userInfoList.id}.do">查看</a></td> ||
                <a href="user/updatepassword/${userInfoList.username}.do">修改密码</a></td>
			</tr>
		</c:forEach>
		
		<tr>
				<td>
					<a href="user/userAlllist.do?currentpage=1">首页</a>
				</td>
				<td>
					<c:choose>
						<c:when test="${page.currentpage>1}">
							<a href="user/userAlllist.do?currentpage=${page.currentpage-1 }">上一页</a>
						</c:when>
						<c:otherwise>
						上一页
					</c:otherwise>
					</c:choose>

					<c:choose>
						<c:when test="${page.currentpage<page.totalpage}">
							<a href="user/userAlllist.do?currentpage=${page.currentpage+1 }">下一页</a>
						</c:when>
						<c:otherwise>
						下一页
					</c:otherwise>
					</c:choose>
				</td>
				<td>
					<a href="user/userAlllist.do?currentpage=${page.totalpage }">尾页</a>
				</td>
			</tr>


	</table>
  </body>
</html>

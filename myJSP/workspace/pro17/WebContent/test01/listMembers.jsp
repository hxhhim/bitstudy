<%@ page language="java" contentType="text/html; charset=EUC-KR"
    import="java.util.*,sec01.ex01.*"
    isELIgnored="false"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% 
	request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ȸ�� ���� ���â</title>
	<style>
		.cls1{
			font-size:40px;
			text-align:center;
		}
		.cls2{
			font-size:20px;
			text-align:center;
		}
	</style>
</head>
<body>
	<p class="cls1">ȸ������</p>
		<table align="center" border="1">
			<tr align="center" bgcolor="lightgreen">
				<td width="7%"><b>���̵�</b></td>
				<td width="7%"><b>��й�ȣ</b></td>
				<td width="7%"><b>�̸�</b></td>
				<td width="7%"><b>�̸���</b></td>
				<td width="7%"><b>������</b></td>
			</tr>
		<c:choose>
			<c:when test="${empty membersList}">
				<tr>
					<td colspan=5 align="center">
						<b>��ϵ� ȸ���� �����ϴ�.</b>
					</td>
				</tr>
			</c:when>
			<c:when test="${!empty membersList}">
				<c:forEach var="mem" items="${membersList}">
					<tr align="center">
						<td>${mem.id }</td>
						<td>${mem.pwd }</td>
						<td>${mem.name }</td>
						<td>${mem.email }</td>
						<td>${mem.joinDate }</td>
					</tr>
				</c:forEach>
			</c:when>
		</c:choose>	
			</table>
			<a href="#"><p class="cls2">ȸ�� �����ϱ�</p></a>
</body>
</html>
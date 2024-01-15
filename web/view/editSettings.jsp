<%-- 
    Document   : editSettings
    Created on : Jan 15, 2024, 1:05:59 AM
    Author     : izayo
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Setting</title>
</head>
<body>

<h2>Edit Setting</h2>

<c:if test="${not empty setting}">
    <form action="UpdateSettingServlet" method="post">
        <label for="userId">User ID:</label>
        <input type="text" id="userId" name="userId" value="${setting.userId}" readonly><br>

        <label for="description">Description:</label>
        <input type="text" id="description" name="description" value="${setting.description}" required><br>

        <label for="name">Name:</label>
        <input type="text" id="name" name="name" value="${setting.name}" required><br>

        <label for="settingId">Setting ID:</label>
        <input type="text" id="settingId" name="settingId" value="${setting.settingId}" readonly><br>

        <label for="active">Active:</label>
        <input type="checkbox" id="active" name="active" ${setting.active ? 'checked' : ''}><br>

        <input type="submit" value="Update">
    </form>
</c:if>

</body>
</html>
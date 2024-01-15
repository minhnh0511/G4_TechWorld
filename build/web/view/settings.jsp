<%-- 
    Document   : settings
    Created on : Jan 15, 2024, 1:05:27 AM
    Author     : izayo
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Settings</title>
</head>
<body>

<h2>User Information</h2>
<c:if test="${not empty user}">
    <p>User ID: ${user.userId}</p>
    <p>Username: ${user.username}</p>
</c:if>

<h2>Settings</h2>
<c:if test="${not empty settingsList}">
    <table border="1">
        <thead>
            <tr>
                <th>User ID</th>
                <th>Description</th>
                <th>Name</th>
                <th>Setting ID</th>
                <th>Active</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="setting" items="${settingsList}">
                <tr>
                    <td>${setting.userId}</td>
                    <td>${setting.description}</td>
                    <td>${setting.name}</td>
                    <td>${setting.settingId}</td>
                    <td>${setting.active}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</c:if>

</body>
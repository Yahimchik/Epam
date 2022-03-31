<%@ page import="java.util.Set" %>
<%@ page import="by.yahimovich.task07.entity.SubscriptionSale" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8"/>
    <title>First JSP App</title>
    <link href="${pageContext.request.contextPath}/resources/style.css" rel="stylesheet">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<%
    @SuppressWarnings("unchecked")
    Set<SubscriptionSale> sales = (Set<SubscriptionSale>) request.getAttribute("sales");
    request.setAttribute("sales", sales);
%>
<table>
    <caption>List of sales</caption>
    <thead>
    <tr>
        <th>Card Number</th>
        <th>User ID</th>
        <th>Start date</th>
        <th>End date</th>
        <th>Service ID</th>
        <th>Client ID</th>
        <th>Client first name</th>
        <th>Client second name</th>
        <th>Client last name</th>
        <th>Client address</th>
        <th>Client phone number</th>
        <th>Subscription ID</th>
        <th>Subscription name</th>
        <th>Subscription price</th>
        <th>Subscription number of visits</th>
        <th>Subscription number of days</th>
        <th>Employee specialization ID</th>
        <th>Employee specialization note</th>
        <th>Employee Service ID</th>
        <th>Employee Service name</th>
        <th>Employee ID</th>
        <th>Employee first name</th>
        <th>Employee second name</th>
        <th>Employee last name</th>
        <th>Employee address</th>
        <th>Employee phone number</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="sale" items="${sales}">
        <tr>
            <td><c:out value="${sale.cardNumber}"/></td>
            <td><c:out value="${sale.userID}"/></td>
            <td><c:out value="${sale.startDate}"/></td>
            <td><c:out value="${sale.endDate}"/></td>
            <td><c:out value="${sale.employeeServiceID}"/></td>
            <td><c:out value="${sale.userProfile.id}"/></td>
            <td><c:out value="${sale.userProfile.firstName}"/></td>
            <td><c:out value="${sale.userProfile.secondName}"/></td>
            <td><c:out value="${sale.userProfile.lastName}"/></td>
            <td><c:out value="${sale.userProfile.address}"/></td>
            <td><c:out value="${sale.userProfile.phoneNumber}"/></td>
            <td><c:out value="${sale.subscription.id}"/></td>
            <td><c:out value="${sale.subscription.name}"/></td>
            <td><c:out value="${sale.subscription.price}"/></td>
            <td><c:out value="${sale.subscription.numberOfVisit}"/></td>
            <td><c:out value="${sale.subscription.numberOfDays}"/></td>
            <td><c:out value="${sale.specialization.id}"/></td>
            <td><c:out value="${sale.specialization.note}"/></td>
            <td><c:out value="${sale.specialization.service.id}"/></td>
            <td><c:out value="${sale.specialization.service.nameService}"/></td>
            <td><c:out value="${sale.specialization.employee.id}"/></td>
            <td><c:out value="${sale.specialization.employee.firstName}"/></td>
            <td><c:out value="${sale.specialization.employee.secondName}"/></td>
            <td><c:out value="${sale.specialization.employee.lastName}"/></td>
            <td><c:out value="${sale.specialization.employee.address}"/></td>
            <td><c:out value="${sale.specialization.employee.phoneNumber}"/></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
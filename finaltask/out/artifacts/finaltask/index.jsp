<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false" %>

<fmt:setLocale value="${sessionScope.lang}"/>
<fmt:setBundle basename="language"/>

<html lang="${sessionScope.lang}">
<head>
    <link rel="stylesheet" href="resources/style/main_page.css">
    <title>GYM24</title>
</head>
<body>

<header class="header">
    <div class="container">
        <div class="header_inner">
            <div class="header_logo">Title</div>
            <nav class="nav">
                <a class="nav_link active" href="#"><fmt:message key="about"/></a>
                <a class="nav_link" href="#"><fmt:message key="service"/></a>
                <a class="nav_link" href="#"><fmt:message key="contacts"/></a>
                <a class="nav_link" href="login.jsp"><fmt:message key="authorization"/></a>
                <div class="nav_link dropdown">
                    <button class="nav_link"><fmt:message key="language"/></button>
                    <div class="dropdown-content">
                        <a href="?sessionLocale=en"><fmt:message key="EN"/></a>
                        <a href="?sessionLocale=ru"><fmt:message key="RU"/></a>
                        <a href="?sessionLocale=by"><fmt:message key="BY"/></a>
                    </div>
                </div>
            </nav>
        </div>
    </div>
</header>


<div class="intro">
    <div class="container">
        <div class="intro_inner">
            <h2 class="intro_suptitle">Text</h2>
            <h1 class="intro_title">Some Text</h1>
            <a class="btn" href="#">Learn More</a>
        </div>
    </div>

    <div class="slider">
        <div class="container">
            <div class="slider_inner">
                <div class="slider_item active">
                    <span class="slider_num">01</span>
                    Intro
                </div>
                <div class="slider_item">
                    <span class="slider_num">02</span>
                    Work
                </div>
                <div class="slider_item">
                    <span class="slider_num">03</span>
                    About
                </div>
                <div class="slider_item">
                    <span class="slider_num">04</span>
                    Contacts
                </div>
            </div>
        </div>
    </div>
</div>


</body>
</html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<label>
    <form method="post" action="${pageContext.request.contextPath}/file-servlet" enctype="multipart/form-data">
        <tr>
            <select name="parser">
                <option value="dom">DOMParser</option>
                <option value="sax">SAXParser</option>
                <option value="stax">StAXParser</option>
            </select>
        </tr>
        <input type="file" name="file-name"/>
        <input type="submit" value="send"/>
    </form>
</label>
</body>
</html>

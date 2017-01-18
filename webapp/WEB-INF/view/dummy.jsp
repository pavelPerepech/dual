<%@ page language="java" %>
<%@ page import="java.lang.*" %>
<html>
<head>
    <title>Dummy Page</title>
</head>

<body>
  <h1>Dummy Page</h1><hr>

  <table border="1">
      <tr><td>Id</td><td>${dummyObject.getId()}</td></tr>
      <tr><td>Name</td><td>${dummyObject.getName()}</td></tr>
  </table>
</body>
</html>

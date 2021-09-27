<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Quiz</title>
</head>
<body>
<h2><%= "Answer following questions, please" %></h2>
<form action="${pageContext.request.contextPath}/count-servlet" method="POST">
    Enter your name: <input type="text" name="name"><br>
    Enter your surname: <input type="text" name="surname"><br>
    Enter your age: <input type="text" name ="age"><br>
    <p>Do you like penguins?</p>
    <div>
        <input type="radio" id ="q1choice1"
         name="quest1" value="0">
        <label for="q1choice1">yes</label>
        <input type="radio" id ="a1choice2"
               name="quest1" value="1">
        <label for="a1choice2">no</label>
    </div>
    <p>How many wings they have?</p>
    <div>
        <input type="radio" id ="q2choice1"
               name="quest2" value="2">
        <label for="q2choice1">1</label>
        <input type="radio" id ="q2choice2"
               name="quest2" value="3">
        <label for="q2choice2">2</label>
        <input type="radio" id="q2choice3"
               name="quest2" value="4">
        <label for="q2choice3">4</label>
    </div>
    <p>Who is taking care about egg?</p>
    <div>
        <input type="radio" id ="q3choice1"
               name="quest3" value="5">
        <label for="q3choice1">male</label>
        <input type="radio" id ="q3choice2"
               name="quest3" value="6">
        <label for="q3choice2">female</label>
        <input type="radio" id="q3choice3"
               name="quest3" value="7">
        <label for="q3choice3">both</label>
    </div>
        <br>
        <input type="submit">
</form>
<br>
<a href="${pageContext.request.contextPath}/count-servlet">Summarise answers</a>
<a href="${pageContext.request.contextPath}/">Exit</a>
</body>
</html>
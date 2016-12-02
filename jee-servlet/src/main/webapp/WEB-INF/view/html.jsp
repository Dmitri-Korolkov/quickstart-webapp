<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <script>
        var ws = new WebSocket("ws://" + location.host + "/api/ws/0");
        ws.onopen = function () {
            console.log("ws is open");
        };
        ws.onmessage = function (message) {
            document.getElementById("chatlog").textContent += message.data + "\n";
        };
        function postToServer() {
            ws.send(document.getElementById("msg").value);
            document.getElementById("msg").value = "";
        }
        function closeConnect() {
            console.log("ws is closed");
            ws.close();
        }

    </script>

</head>
<body>

<ul>
    <c:forEach items="${books}" var="item">
        <li>${item}</li>
    </c:forEach>
</ul>

<textarea id="chatlog" readonly></textarea><br/>
<input id="msg" type="text"/>
<button type="submit" id="sendButton2" onClick="postToServer()">Send!</button>
<button type="submit" id="sendButton3" onClick="closeConnect()">End</button>

</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: 马保生
  Date: 2017/6/26
  Time: 13:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page pageEncoding="utf-8" contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>登录页面</title>
  </head>
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/jquery-easyui-1.5.1/themes/icon.css"/>
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/jquery-easyui-1.5.1/themes/default/easyui.css"/>
  <script type="text/javascript"
          src="${pageContext.request.contextPath}/static/jquery-easyui-1.5.1/jquery.min.js"></script>
  <script type="text/javascript"
          src="${pageContext.request.contextPath}/static/jquery-easyui-1.5.1/jquery.easyui.min.js"></script>
  <script type="text/javascript"
          src="${pageContext.request.contextPath}/static/jquery-easyui-1.5.1/locale/easyui-lang-zh_CN.js"></script>

  <script type="text/javascript">
    function onLoad() {
        var msg = "${msg}"
        if(msg.length>0){
            alert(msg);
        }
    }
    function login() {
        $("#loginForm").submit();
    }

  </script>
  <body onload="onLoad()">

  <div id="loginWin" class="easyui-window" style="width: 300px;height: 200px" title="登陆" data-options="left:'40%',top:'30%'">
    <form id="loginForm" action="${pageContext.request.contextPath}/user/login.controller" method="post">
      <div style="text-align: center">
      <p>用户名：<input type="text" name="username"></p>
      <p>密&nbsp;&nbsp;&nbsp;码：<input type="password" name="password"></p>
      <a href="#" class="easyui-linkbutton" icon="icon-ok" onclick="login()">登录</a>
      </div>
    </form>
  </div>
  </body>
</html>

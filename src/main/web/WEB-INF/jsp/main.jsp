<%--
  Created by IntelliJ IDEA.
  User: 马保生
  Date: 2017/6/26
  Time: 16:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page pageEncoding="utf-8" contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页面</title>
</head>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/jquery-easyui-1.5.1/themes/icon.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/jquery-easyui-1.5.1/themes/default/easyui.css">
<script type="text/javascript"
        src="${pageContext.request.contextPath}/static/jquery-easyui-1.5.1/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/jquery-easyui-1.5.1/jquery.easyui.min.js"></script>
<script type="text/javascript"
        src="${pageContext.request.contextPath}/static/jquery-easyui-1.5.1/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript">
    function addTabs(title,url) {
        if($("#gg").tabs("exists",title)) {
            $("#gg").tabs("select",title);
        }else{

            var content = "<iframe src='"+url+"' style='height: 100%;width: 100%' frameborder='0'>"
            $("#gg").tabs('add',{
                content:content,
                title:title,
               closable:true

            });
        }

    }
</script>
<body class="easyui-layout">
<div region="north" style="height: 10%">
    欢迎 ${tcmp054.nickname}光临
</div>
<div region="west" style="width: 10%" title="菜单栏">
    <ul>
        <li>
            <a href="#" onclick="addTabs('班级管理','${pageContext.request.contextPath}/grade/gradeList.controller')">班级管理</a>
        </li>
    </ul>
    <ul>
        <li>
            <a href="#" onclick="addTabs('学生管理','login.controller')">学生管理</a>
        </li>
    </ul>
    <ul>
        <li>
            <a href="#" onclick="addTabs('爱好管理','login.controller')">爱好管理</a>
        </li>
    </ul>
    <ul>
        <li>
            <a href="#" onclick="addTabs('用户管理','login.controller')">用户管理</a>
        </li>
    </ul>
    <ul>
        <li>
            <a href="#" onclick="addTabs('退出系统','login.controller')">退出系统</a>
        </li>
    </ul>
</div>
<div region="center">
    <div class="easyui-tabs" id="gg" style="width: 100%;height: 100%">
        <div title="首页"></div>
    </div>
</div>
<div region="south" style="height: 10%">TCMP054</div>


</body>
</html>

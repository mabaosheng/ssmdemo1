<%--
  Created by IntelliJ IDEA.
  User: 马保生
  Date: 2017/6/26
  Time: 18:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page pageEncoding="utf-8" contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>班级列表页</title>
</head>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/jquery-easyui-1.5.1/themes/icon.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/jquery-easyui-1.5.1/themes/default/easyui.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/static/jquery-easyui-1.5.1/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/jquery-easyui-1.5.1/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/jquery-easyui-1.5.1/locale/easyui-lang-zh_CN.js"></script>

<script type="text/javascript">
   $(function () {
       initGradeData();
   });
   function initGradeData() {
       $(function () {
           initGradeData();
       });
       function initGradeData(){alert("jjjfj");
           $("#grade").datagrid({


               url:'${pageContext.request.contextPath}/grade/queryGrade.controller',
               method:'POST',
               //是否隔行变色
               striped:true,
               idField:'id',
               //是否显示行序号
               rownumbers:true,
               //标题
               title:'班级信息',
               queryParams:{},
               //是否分页
               pagination:true,
               pageSize:5,
               pageList:[2,5,10],
               columns:[[

                   {field:'gradeName',title:'班级名',width:100},
                   {field:'createDate',title:'创建时间',width:200,formatter:dataFormat},
                   {field:'id',title:'操作列',width:200,formatter:info}

               ]]
           });
       }
   function info(rowDate) {
       var editStr='<a href="#"></a>'
       var queryGradeByIdStr='<a href="#"></a>'
   }
   function dataFormat(rowDate) {
       var date = new Date(rowDate);
       var year=date.getFullYear();//年
       var month=date.getMonth()+1;//月
       var day=date.getDate();//日
       var str=year+'-'+month+'-'+day;
       return str;
   }
   }
</script>
<body>

<%--列表展示--%>
    <div>
        <table id="grade"></table>
    </div>
</body>
</html>

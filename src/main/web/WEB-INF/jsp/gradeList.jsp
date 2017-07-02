<%--
  Created by IntelliJ IDEA.
  User: thinkpad
  Date: 2017/6/26
  Time: 9:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page pageEncoding="utf-8" contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>班级管理</title>
    <jsp:include page="base.jsp"></jsp:include>
    <script type="text/javascript">
        $(function () {
            initGradeData();
        });
        function initGradeData(){
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
        //操作列
        function info(rowDate){
            var editStr='<a href="javascript:updateGrade(\''+rowDate+'\')">修改</a>';
            var queryGradeByIdStr='<a href="javascript:queryGradeById(\''+rowDate+'\')">详情</a>';
            return editStr+'-'+queryGradeByIdStr;
        }

        //格式化创建时间显示
        function dataFormat(rowDate) {
            var date =new Date(rowDate);
            var year=date.getFullYear();//年
            var month=date.getMonth()+1;//月
            var day=date.getDate();//日
            var str=year+'-'+month+'-'+day;
            return str;
        }

        //按班级名称查询
        function queryGrade(){

            var gradeName=$("#gradeName").val();
            var queryParams=$("#grade").datagrid('options').queryParams;
            queryParams.gradeName=gradeName;

            $("#grade").datagrid('load');
        }

        //展示修改window
        function updateGrade(rowDate){
            $.post("${pageContext.request.contextPath}/queryGradeById.controller",{"id":rowDate},function(data,status){
                if(status=="success"){
                    var gradeName=data.gradeName;
                    var details=data.details;
                    $("#updeateGradeName").textbox("setValue",gradeName);
                    $("#details").textbox("setValue",details);
                    $("#updeGradeWindow").window('open');
                }
            });

        }

        //修改班级
        function editGrade(){

        }


        //展示查询班级详情的window
        function queryGradeById(gradeId){
            //1. 调用controller查询班级详情
            $.post('${pageContext.request.contextPath}/queryGradeById.controller',{"id":gradeId},
                function (data,status) {
                    if(status="success"){
                        //2. 将controller返回的数据展示出来
                        var gradeNameStr=data.gradeName;
                        var gradeDetailsStr=data.details;
                        $("#selectGradeName").textbox("setValue",gradeNameStr);
                        $("#selectGradeDtails").textbox("setValue",gradeDetailsStr);
                        //3. 显示出班级详情的window
                        $("#queryGradeByIdWin").window('open');
                    }

                });


        }

    </script>
</head>
<body>
<!--按班级查询-->
<div>
    <form id="queryGradeForm" method="post">
        <div>
            <label>班级名称：</label>
            <input type="text" name="gradeName" id="gradeName"/>
            <a href="javascript:void(0)" onclick="queryGrade()" class="easyui-linkbutton" iconCls="icon-search">查询</a>
        </div>
    </form>
</div>
<!--数据展示-->
<div>
    <table id="grade"></table>
</div>

<div id="updeGradeWindow" class="easyui-window" title="修改班级" closed="true" style="top:30%;left: 30%;width: 500px;height: 300px">
    <form id="updateGradeForm" method="post">
        <table>
            <tr>
                <td>班级名称：</td>
                <td>
                    <input class="easyui-textbox" id="updeateGradeName" name="gradeName" value="" readonly/>
                </td>
            </tr>
            <tr>
                <td>班级描述：</td>
                <td>
                    <input class="easyui-textbox" data-options="multiline:true" id="details" name="details" value=""/>
                    <input type="hidden" id="id" name="id" value=""/>
                </td>
            </tr>
        </table>
    </form>
    <div>
        <a href="javascript:void(0)" class="easyui-linkbutton" onclick="editGrade()">提交</a>
    </div>
</div>

<%--班级详情的Window--%>
<div id="queryGradeByIdWin" class="easyui-window" title="班级详情" closed="true"
     style="left:30%;top:30%;width: 400px;height: 200px;padding:30px 60px 30px 60px " >
    <table cellpadding="5">
        <tr>
            <td>班级名称：</td>
            <td>
                <input  id="selectGradeName" class="easyui-textbox" readonly/>
            </td>
        </tr>
        <tr>
            <td>班级描述：</td>
            <td>
                <input id="selectGradeDtails" class="easyui-textbox"
                       data-options="multiline:true" readonly/>
            </td>
        </tr>

    </table>
</div>
</body>
</html>

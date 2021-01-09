<%--
  Created by IntelliJ IDEA.
  User: 75164
  Date: 2021/1/9
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
</head>
<body>
<a href="${pageContext.request.contextPath}/testlabel">测试springmvc label</a>
<input type="button" id="btn" value="发送ajax请求">
<hr>
<form id="myform">
    user:<input type="text" name="userName"><br>
    age:<input type="text" name="userAge"><br>
    爱好:<input type="checkbox" name="hobby" value="篮球"> 篮球
    <input type="checkbox" name="hobby" value="乒乓球"> 乒乓球
    <input type="checkbox" name="hobby" value="足球"> 足球
</form>
<input type="button" id="formbtn" value="发送form">

<script>
    $(function () {
        //序列化转json的插件
        (function($){
            $.fn.serializeJson=function(){
                var serializeObj={};
                var array=this.serializeArray();
                var str=this.serialize();
                $(array).each(function(){
                    if(serializeObj[this.name]){
                        if($.isArray(serializeObj[this.name])){
                            serializeObj[this.name].push(this.value);
                        }else{
                            serializeObj[this.name]=[serializeObj[this.name],this.value];
                        }
                    }else{
                        serializeObj[this.name]=this.value;
                    }
                });
                return serializeObj;
            };
        })(jQuery);

        $("#formbtn").click(function () {
            //序列化表单
            // var serialize = $("#myform").serialize();
            var serialize = $("#myform").serializeJson();
            console.log(serialize);

            //用于处理checkbox
            if(typeof serialize.hobby == "string"){
                serialize.hobby = new Array(serialize.hobby);
            }

            $.ajax({
                type:"post",
                url:"${pageContext.request.contextPath}/formJson",
                data:JSON.stringify(serialize),
                dataType:'json',
                contentType:'application/json',
                success:function (data) {
                    alert(data);
                },

                error:function (data) {
                    console.log(data);
                }
            });
        });

        $("#btn").click(function () {
            //alert("vvvv");
            $.post("${pageContext.request.contextPath}/testJson", function (data) {
                console.log(data);
            });
        });
    });
</script>

</body>
</html>

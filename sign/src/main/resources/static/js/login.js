function ShowLoginText(){
    layer.open({
        type:1,
        title:"修改信息",
        area:["395px","300px"],
        content:$("#loginBox"),
        });
    }
function Login(){
    var username=$.trim($("#InputUsername").val());//获取用户名trim是去掉空格
    var password=$.trim($("#InputUserPwd").val());//获取密码
    if(username==""||password==""){
        layer.alert("队长名字或者手机号不能为空!",{
            title:"提示",
            icon:5,
        });
    }
    else {
        $.ajax({
            type: "POST",
            url: "/sign/login",
            data: $('#box').serialize(),//序列化表单值
            success: function (result) {
                if (result.code !=null)//data即为后台返回的数据
                {
                    alert("队长名字或手机号填写错误");
                }
                else {
                    alert("登录成功");
                    $("#select2").val(result["school"]);
                    $("#team_name").val(result["team_name"]);
                    $("#team_leader").val(result["team_leader"]);
                    $("#fel1").val(result["fel1"]);
                    $("#fel2").val(result["fel2"]);
                    $("#tel").val(result["tel"]);
                    $("#leader_name").val(result["leader_name"]);
                    if(result["school"]!="武汉科技大学")
                    {
                        $("#select1").val("2");
                    }
                    layer.close(layer.index);
                }
                //window.location.href="跳转页面"
            }
        })
    }
}
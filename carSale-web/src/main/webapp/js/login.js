$(function () {
    /*获取工程名称*/
    var projectName = $('#projectName').attr('project');
    console.log(projectName);

    /*将公司名加载到下拉框*/
    $.getJSON(projectName+"/company/list",function (list) {
        $.each(list,function (index,company) {
            //创建HTML元素
            var option="<option value='"+company.companyId+"'>"+company.companyName+"</option>";
            //将JavaScript的HTML元素转化成jQuery的HTML元素
            $("#CompanyName_login").append($(option));
        })
    });

    /*将职称名加载到下拉框*/
    $.getJSON(projectName+"/position/list",function (list) {
        $.each(list,function (index,position) {
            //创建HTML元素
            var option="<option value='"+position.positionId+"'>"+position.positionName+"</option>";
            //将JavaScript的HTML元素转化成jQuery的HTML元素
            $("#PositionName_login").append($(option));
        })
    });

    var but_login = $('#but_login');//登录按钮
    var CompanyName_login = $('#CompanyName_login');//公司名称
    var PositionName_login = $('#PositionName_login');//职务名称
    var EmpName_login = $('#EmpName_login');//员工名称
    var PhoneNumber_login = $('#PhoneNumber_login');//员工电话
    var Password_login = $('#Password_login');//密码

    /*电话正则表达式*/
    var telphonePar = /^1[3|4|5|7|8][0-9]{9}$/;

    /*同步验证用户信息*/
    $('#but_login').click(function () {
        console.log("同步验证用户信息");
        //各种框是空的情况
        if (0==(CompanyName_login.val())
            || 0==(PositionName_login.val())
            || $.isEmptyObject(EmpName_login.val())
            || $.isEmptyObject(PhoneNumber_login.val())
            || $.isEmptyObject(Password_login.val())) {
            alert("输入框不能为空！");
        } else {
            var companyId = CompanyName_login.val();
            var positionId = PositionName_login.val();
            var empName = EmpName_login.val();
            var phoneNumber_login = PhoneNumber_login.val();
            var password_login = Password_login.val();

            /*var psw = $.md5(password_login);//md5加密*/

            //判断员工名是否存在
            $.getJSON(projectName+"/employee/isEmpExist?companyId="+companyId+"&positionId="+positionId+"&empName="+empName,function (result) {
                if (result==0){
                    alert("员工名不存在！");
                    return;
                }
                else {
                    //判断手机号是否存在
                    $.getJSON(projectName+"/employee/isEmpPhoneExist?companyId"+companyId+"&positionId="+positionId+"&empName="+empName+"&empPhone="+phoneNumber_login,function (result) {
                        if(result==0){
                            alert("手机号不正确！");
                            return;
                        }else {
                            //后台判断密码是否正确
                            $.post(projectName+"/employee/isPasswordTrue",
                                {"companyId":companyId,"positionId":positionId,"empPhone":phoneNumber_login,"empPassword":password_login},
                                function (result) {
                                    if(result==0){
                                        alert("密码校验失败！")
                                    }else {
                                        alert("登录成功!");
                                        location.href=projectName+"/login/goMain";
                                    }
                                })
                        }
                    })
                }
            })
        }
    });


});
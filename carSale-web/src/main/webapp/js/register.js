//注册思路：

// 异步校验密码是否正确

// 1、验证所有数据是否符合规则
// 2、如果公司存在获取公司id并且校验手机是否被注册

// 3、如果公司不存在则先插入公司再获取id
// 4、根据公司id插入员工
var companyId=0;
$(function () {

    /*获取工程名称*/
    var projectName = $('#projectName').attr('project');
    console.log(projectName);

    var btn_register = $('#btn_register');//注册按钮
    var authcode_button=$("#authcode_button");//获取验证码的按钮
    var CompanyName_register = $('#CompanyName_register');//公司名称
    var EmpName_register = $('#EmpName_register');//员工名称
    var PhoneNumber_register = $('#PhoneNumber_register');//员工电话
    var Password_register = $('#Password_register');//密码
    var authcode_input = $('#authcode_input');//验证码

    /**
     * 电话正则表达式：只能是11位数字
     * 密码正则表达式：只能是6-16位大小写字母和数字
     * */
    var telphoneVerify = /^1[3|4|5|7|8][0-9]{9}$/;
    var passwordVerify = /^[a-zA-Z0-9]{6,16}$/;

    /*同步验证用户注册信息*/
    $('#btn_register').click(function () {
        console.log("同步验证用户注册信息");
        //各种框是空的情况
        if ($.isEmptyObject(CompanyName_register.val())
            || $.isEmptyObject(EmpName_register.val())
            || $.isEmptyObject(PhoneNumber_register.val())
            || $.isEmptyObject(Password_register.val())
            || $.isEmptyObject(authcode_input.val())) {
            alert("输入框不能为空！");
        } else {
            var companyName_reg = CompanyName_register.val();
            var empName_reg = EmpName_register.val();
            var phoneNumber_reg = PhoneNumber_register.val();
            var password_reg = Password_register.val();
            var authcode_reg = authcode_input.val();

            /*var psw = $.md5(password_reg);//md5加密*/
            alert("注册条件符合，等待后台注册！");
            location.href=projectName+"/register/registerSuccess?companyId="+companyId+"&empName="+empName_reg+"&empPhone="+phoneNumber_reg+"&empPassword="+password_reg;
        }
    });

    //异步获取公司id
    $("#CompanyName_register").blur(function () {
        $.getJSON(projectName + "/company/getCompanyIdByName?companyName=" + CompanyName_register.val(),
            function (result) {
                console.log(result);
                companyId = result;
            })
    })

    /*异步确认验证码*/
    $('#authcode_input').blur(function () {
        var v = $(this).attr('v'); //后台发送过来的验证码
        var authcodeValue = $(this).val();//自己输入的验证码
        if (v == authcodeValue) {
            //如果是true代表验证码正确
            authcode_input.removeAttr("style");
            //解除按钮禁止
            btn_register.attr('class', 'btn btn-default submit');
        } else {
            //如果是false代表验证码不正确
            authcode_input.attr('style', 'border: red 2px solid');
            //禁止提交按钮点击
            btn_register.attr('class', 'btn btn-danger disabled');
        }
    });

    /*异步发送验证码*/
    $('#authcode_button').click(function () {
        var empPhoneNumber = PhoneNumber_register.val();
        console.log(empPhoneNumber);
        $.getJSON(
            projectName + '/register/sendPhoneMessage',
            {empPhoneNumber: empPhoneNumber,companyId:companyId},
            function (json) {
                var resultRegister = json.resultRegister;
                alert(resultRegister);
                console.log(resultRegister);
                authcode_input.attr('v',resultRegister);
            });
    });

    /*验证员工电话格式是否正确*/
    $('#PhoneNumber_register').blur(function () {
        var empPhone = $(this).val();
        console.log(empPhone);
        //判断是否为空
        if ($.isEmptyObject(empPhone)){
            alert("电话号码不能为空");
        } else{
            //按照手机号码正则测试
            if (telphoneVerify.test(empPhone)) {
                //如果是true代表手机号码格式正确
                PhoneNumber_register.removeAttr("style");
                //解除按钮禁止
                btn_register.attr('class', 'btn btn-default submit');
            } else {
                //如果是false代表手机号码格式不正确
                PhoneNumber_register.attr('style', 'border: red 2px solid');
                //禁止提交按钮点击
                btn_register.attr('class', 'btn btn-danger disabled');
            }
        }
    });
});
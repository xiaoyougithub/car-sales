$(function () {
    var projectName = $('#projectName').attr('project');
    console.log(projectName);

    var companyId = $('#saleCompany').val();

    //查询客户列表
    $.getJSON(
        projectName + '/car/customerList',
        {companyId: companyId},
        function(customers){
            for (var i = 0; i < customers.length; i++) {
                var customer = customers[i];
                console.log(customer);
                var option = "<option value='" + customer.customerId + "'>" +
                    customer.customerName+"("+customer.customerPhone+")" + "</option>";
                $("#saleCustomerId").append(option);
            }
        }
    )
    /*获取所有库存的车辆*/
    $.getJSON(
        projectName + '/car/repositoryCarList?companyId=' + companyId,
        function (cars) {
            //将所有库存的汽车展现在下拉框中
            for (var i = 0; i < cars.length; i++) {
                var repertoryCar = cars[i];
                console.log(repertoryCar);
                // var option = "<option value='" + repertoryCar.carId  +"' seriesId='" + repertoryCar.car.seriesId +
                //     "'purchasePrice='" + repertoryCar.purchasePrice + "'>" +
                //     repertoryCar.carId + "</option>";
                var option = "<option value='" + repertoryCar.carId + " '>" +
                    repertoryCar.carId + "</option>";
                $("#saleSelectBrand").append(option);
            }
        });
    /*汽车名称变动事件*/
    $('#saleSelectBrand').change(function () {
        var seriesId = $("#saleSelectBrand option:selected").attr('seriesId');
        var purchasePrice = $("#saleSelectBrand option:selected").attr('purchasePrice');
        console.log(seriesId);
        console.log(purchasePrice);
        //清空车系和品牌
        $('#saleCarSeries').val('');
        $('#saleCarBrand').val('');
        $('#saleCurPrice').val('');

        /*ajax获取汽车车系的json数据*/
        $.getJSON(
            projectName + '/sale/getCarSeriesById.action',
            {seriesId: seriesId},
            function (json) {
                var carseriesById = json.carseriesById;
                console.log(carseriesById);

                $('#saleCarSeries').val(carseriesById.seriesName);
                $('#saleCarBrand').val(carseriesById.carbrand.brandName);
                $('#saleCurPrice').val(purchasePrice);

            });

    });

    /*根据公司编号查询销售员工*/
    $.getJSON(
        projectName + '/car/salemenList?companyId=' + companyId + "&positionId=3",
        function (salemen) {
            // var employeeList = json.employeeList;
            // console.log(employeeList);
            //将所有销售人员展现在下拉框中
            for (var i = 0; i < salemen.length; i++) {
                var employee = salemen[i];
                console.log(employee);
                var option = "<option value='" + employee.empId + "'>" +
                    employee.empName + "</option>";
                $("#saleEmpId").append(option);
            }
        });
});
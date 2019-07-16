//DOM加载完再执行
$(function () {
    $("#selectCityId").change(function () {
        var cityId = $("#selectCityId").val();//获取select选择的vlaue
        var url = '/report/cityId' + cityId;
        window.location.href = url;

    });

});
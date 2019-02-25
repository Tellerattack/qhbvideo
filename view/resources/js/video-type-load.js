/**
 * 加载视频类型进行菜单导航显示
 */
$(function () {
    load_types();
});

function load_types() {
    $.ajax({
        type: "post",
        url: "",
//      data: "para="+para,  此处data可以为 a=1&b=2类型的字符串 或 json数据。
        data: {"para":1},
        cache: false,
        async : false,
        dataType: "json",
        success: function (data ,textStatus, jqXHR)
        {
            if("true"==data.flag){
                alert("合法！");
                return true;
            }else{
                alert("不合法！错误信息如下："+data.errorMsg);
                return false;
            }
        },
        error:function (XMLHttpRequest, textStatus, errorThrown) {
            alert("请求失败！");
        }
    });
}
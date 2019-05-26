function ajax(option) {
    //得到xmlHttp
    var xmlHttp = createXMLHttpRequest();
    //打开连接
    if (!option.method) {//默认为GET请求
        option.method = "GET";
    }
    if (option.asyn === undefined){//默认为异步
        option.asyn = true;
    }
    xmlHttp.open(option.method,option.url,option.asyn);
    /**
     * 判断是否为POST
     */
    if ("POST" === option.method){
        xmlHttp.setRequestHeader("Content-Type","application/x-www-form-urlencoded,application/json");
    }
    /**
     * 发送请求
     */
    xmlHttp.send(option.params);
    console.log(option.params);
    console.log(option.method);
    /**
     * 注册监听
     */
    xmlHttp.onreadystatechange = function () {
        if (xmlHttp.readyState == 4 && xmlHttp.status == 200){
            var data;
            //获取响应数据，进行转换
            if (!option.type){//type默认为文本
                data = xmlHttp.responseText;
            }
            else if (option.type == "xml"){
                data = xmlHttp.responseXML;
            }else if (option.type == "text") {
                data = xmlHttp.responseText;
            }else if (option.type == "json"){
                var text = xmlHttp.responseText;
                // data = eval("("+text+")");
                data = JSON.parse(text);
            }
            //调用回调方法
            option.callback && option.callback(data);
        }
    };
}
//创建XMLHttpRequest
function createXMLHttpRequest(){
    try {
        return new XMLHttpRequest();
    }catch (e) {
        try{
            return new ActiveXObject("Msxm12.XMLHTTP");
        }catch (e) {
            try{
                return new ActiveXObject("Microsoft.XMLHTTP");
            }catch (e) {
                alert("哥们，你用的什么浏览器");
                throw e;
            }
        }
    }
}
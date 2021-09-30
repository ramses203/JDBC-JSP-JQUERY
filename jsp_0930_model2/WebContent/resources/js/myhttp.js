var myXhr = null;
function testaa(){
	alert("test");
}
function getXMLHttpRequest() {
    if(window.ActiveXObject) {
        myXhr = new ActiveXObject("Microsoft.XMLHTTP");
    }else {
        myXhr = new XMLHttpRequest();
    }
}

function sendRequest(url, param, callback, method) {
	console.log("Test")
    getXMLHttpRequest();

    method = (method.toLowerCase() == 'get') ? 'GET' : 'POST';

    param = (param == null || param == '') ? null : param;

    if(method == 'GET' && param != null) {
        url = url + '?' + param;
    }

    myXhr.onreadystatechange = callback;

    myXhr.open(method, url, true);

    myXhr.setRequestHeader("Content-Type","application/x-www-form-urlencoded");

    myXhr.send(method == 'POST' ? param : null);
}
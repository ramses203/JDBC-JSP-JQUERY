var myXhr = null;
function testaa(){
	alert("test");
}
function getXMLHttpRequest() {
    if(window.ActiveXObject) {
        myXhr = new ActiveXObject("Microsoft.XMLHTTP");
    }else {
    	//동기식: 브라우저의 주소가 바뀌면서 서버의 응갑을 기다리는 원리
    	// 비동기식 : callback을 전달해서 서버의주소를 유지한 채로 필요한 부분만 응답을 받는 원리
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
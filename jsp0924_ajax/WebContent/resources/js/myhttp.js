/**
 * 
 */
var xhr = null;// 전역변수 
function myRequest(){ // 브라우저에 따른 XMLHTTPRequest 생성 (xml이 붙으면 비동기식이다.)
	var xhr = null;
	if(window.ActiveXObject){
		try{
			xhr = ActiveXObject("Msxml2.XMLHTTP");
		}catch(e){
			xhr = ActiveXObject("Microsoft.XMLHTTP");
		}
		console.log("ActiveXObject =>"+xhr);
	}else if(window.XMLHttpRequest){
		xhr = new window.XMLHttpRequest();
		console.log("window.XMLHttpRequest =>"+xhr);
	}else{
		xhr = new XMLHttpRequest();
		console.log("XMLHttpRequest =>"+xhr);
	}
	return xhr;
}
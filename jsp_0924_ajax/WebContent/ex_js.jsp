<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%--

�ڹٽ�ũ��Ʈ �⺻ ���� �ణ �Ұ� 
�ڹٽ�ũ��Ʈ : Ŭ���̾�Ʈ ��ũ��Ʈ ��� 
-�������� �ڹٽ�ũ��Ʈ ������ ž�� �Ǿ� �־ ����������
�ؼ��� ��
<script> ������ ������ ������ <head>�� ����Ǵ� ���� 
�Ϲ����̳� �ֱٿ��� �׻� ������ �� </body> �����ȿ��� 
���� �ϱ⵵ �Ѵ�. 
* ���� ���� : var , let �� �ִµ� ���̴� ���Ŀ� 
* console.log() �Լ��� ����ؼ� ������ ��忡�� 
�����͸� ��� �غ� �� �ִ�. System.out.println() ���� 
--%>
<%-- ���� ���� 
1. ���������� �������� ��ȯ �� 
2. ��� �ڹ��ڵ带 �����ؼ� ����������� �����.
3. ���������� response�� �����Ѵ�.
--------------------------------
1. Ŭ���̾�Ʈ�� ��û�� ���� �������� ���� ������ 
2. ������ ���� ���������� �����ϴٰ�
3. �ڹٽ�ũ��Ʈ�� ������ ������ ������� �� �ϰ� ����
4. dom(�±�) ��ü�� �����Ѵ�.
5. �Ʒ��� ���� ����
--%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script>
	//�Լ��� ���� - �ڹ��� �޼���� ����, ��ȯ��return �ִ�. 
	// �ڹ� �޼��� => public �ڷ��� or void method(�ڷ��� ������){ return }
	// �ڹ� script => function �Լ���(var ����) {return}
	// Boolean, Null, Underfined, Number, String
	function mytest() {
	// 1
	// �ڹٽ�ũ��Ʈ �ڷ��� �� ==, ===������ Ư¡ �˱�
	var msg1 = "�ڹٽ�ũ��Ʈ1";
	var msg2 = "�ڹٽ�ũ��Ʈ2";
	var num1 = 10.1;
	var num2 = 10;
	var numv2 = "10";
	var num3 = true;
	var num5;
	var num6 = null; //�˼����� ��ü��
	console.log("�ȳ��ϼ���. ����"+msg1);
	console.log("�ȳ��ϼ���. ����"+typeof(msg2));// typeof�� ������ ��ȯ���� ��ȯ���ش�.
	console.log(typeof(num1));
	console.log(typeof(num2));
	console.log(typeof(num3));
	console.log(typeof(num4));//������ �ȵ� ������ typeof�� �����غ��� undefined(������ ��������)�� ���´�.*****
	console.log(typeof(num5));// var�� ������ ���� �Է����� �ʰ� typeof�� ������Ѻ��� undefined(������ ��������)�� ���´�.*****
	console.log(typeof(num6));//objectfh ������ �ȴ�.null�� ��ü��°��� �����Ҽ��ְڴ�.
	console.log("== : " +(num2 == numv2));//���� �����ڷ� ���װ� ������ ���ؼ� ���� ���� ���ٸ� true �ٸ��ٸ� false�� �ȴ�.
	console.log("=== : " +(num2 == numv2));//��ġ���� �ڸ� ����ϰ� �Ǹ� ���װ� ���׿� ������ ���� �Ӹ� �ƴ϶�  
										  // ���� ���� ���� �� �� ���ƾ� true�� ��ȯ�Ѵ�  
											//������ ���� �����ڴ� ���װ� ������ ����  Ÿ���� �޶�
											//���������� ���� �ִ� ������ �����ϴٸ� , java script�� ���� ������ �������ִ� �����ڸ��������ش� 
	var n1 = "10";
	var n2 = "10";
	console.log(n1+n2);
	// id�Ӽ��� ���� �ڹٽ�ũ��Ʈ DOM��ü �ν� �� value�� �Ӽ��� �����ؼ� ����ڰ� �Է��� ���� �����ͼ�
	// ���� msg �� �����Ѵ�. 
	var msg = document.getElementById("msg").value;
	console.log(msg);
	// innerHTMl ����ؼ� div�ȿ� text�� ����
	document.getElementById("target").innerHTML="<p style=\"color:blue\">"+msg+"</p>";
	
	
	}
	
	
</script>
</head>
<body>
	<div id="target">����!</div>
	<input type="text" name="msg" id="msg" value="">
	<input type="button" value="Ŭ��" onclick="mytest()">
</body>
</html>
package practice;

public class KoreaCookModel {
private MyOrder order;

public void setOrder(MyOrder order) {
	this.order = order;
}

public String orderList(String menu) {
	String slist = "�ѱ����� " + menu;
	return order.OrderCook(slist);
}


}

package practice;

public class IndoCookModel {
private MyOrder order;

public void setOrder(MyOrder order) {
	this.order = order;
}

public String orderList(String menu) {
	String slist = "인도전통 " + menu;
	return order.OrderCook(slist);
}
}

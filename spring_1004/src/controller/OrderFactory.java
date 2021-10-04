package controller;

import model.OrderInter;

public class OrderFactory {

	private static OrderFactory factory;
	private OrderFactory() {}
	public OrderInter getBean(String cmd) {
		return null;
	}
	public static OrderFactory getFactory() {
		return null;
	}
}

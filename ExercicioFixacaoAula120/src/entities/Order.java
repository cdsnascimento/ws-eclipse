package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	private Date moment;
	private OrderStatus status;
	
	private Client client;
	
	private List<OrderItem> items = new ArrayList<OrderItem>();
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	public Order() {
		
	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
		
	public void addItem(OrderItem item) {
		
		items.add(item);
		
	}
	
	public void removeItem(OrderItem item) {
		
		items.remove(item);
	}
	
	public Double Total() {
		
		Double sum = 0.0;
		
		for (OrderItem oi : items) {
			
			sum += oi.subTotal();
			
		}
		
		return sum;
		
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("ORDER SUMMARY: \n");
		sb.append("Order moment: " + sdf.format(getMoment()) + "\n");
		sb.append("Order status: " +  this.getStatus() + "\n");
		sb.append("Client: " + this.client.getName() + " - " + this.client.getEmail() + "\n");
		sb.append("Order items: \n");
		for (OrderItem item : items) {
			sb.append(item + "\n");			
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", this.Total()));
		
		return sb.toString();
	}
}

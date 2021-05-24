package com.g7.oam.entities;

import java.time.LocalDate;
import java.util.List;

public class Order {

	private int orderId;
	private LocalDate orderDate;
	private List<Medicine> medicineList;
	private LocalDate dispatchDate;
	private float totalCost;
	private Customer customer;
	private String status;

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(int orderId, LocalDate orderDate, List<Medicine> medicineList, LocalDate dispatchDate, float totalCost,
			Customer customer, String status) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.medicineList = medicineList;
		this.dispatchDate = dispatchDate;
		this.totalCost = totalCost;
		this.customer = customer;
		this.status = status;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public List<Medicine> getMedicineList() {
		return medicineList;
	}

	public void setMedicineList(List<Medicine> medicineList) {
		this.medicineList = medicineList;
	}

	public LocalDate getDispatchDate() {
		return dispatchDate;
	}

	public void setDispatchDate(LocalDate dispatchDate) {
		this.dispatchDate = dispatchDate;
	}

	public float getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(float totalCost) {
		this.totalCost = totalCost;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + orderId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (orderId != other.orderId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderDate=" + orderDate + ", medicineList=" + medicineList
				+ ", dispatchDate=" + dispatchDate + ", totalCost=" + totalCost + ", customer=" + customer + ", status="
				+ status + "]";
	}

}

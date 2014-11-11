package br.com.victor.JavaDddExample.resources;

import java.math.BigDecimal;
import java.util.List;

public class Order {

	private boolean madeByTelephone;

	private BigDecimal discount;

	private Customer customer;

	private List<OrderDetail> details;

	public boolean isMadeByTelephone() {
		return madeByTelephone;
	}

	public void setMadeByTelephone(boolean isMadeByTelephone) {
		this.madeByTelephone = isMadeByTelephone;
	}

	public BigDecimal getDiscount() {
		return discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<OrderDetail> getDetails() {
		return details;
	}

	public void setDetails(List<OrderDetail> details) {
		this.details = details;
	}

}

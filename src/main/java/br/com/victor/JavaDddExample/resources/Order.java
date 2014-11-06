package br.com.victor.JavaDddExample.resources;

import java.math.BigDecimal;
import java.util.List;

public class Order {

	public class OrderDetail {
		private Medicine medicine;

		private Stock stock;

		private BigDecimal quantity;

		private BigDecimal discount;

		public Medicine getMedicine() {
			return medicine;
		}

		public void setMedicine(Medicine medicine) {
			this.medicine = medicine;
		}

		public Stock getStock() {
			return stock;
		}

		public void setStock(Stock stock) {
			this.stock = stock;
		}

		public BigDecimal getQuantity() {
			return quantity;
		}

		public void setQuantity(BigDecimal quantity) {
			this.quantity = quantity;
		}

		public BigDecimal getDiscount() {
			return discount;
		}

		public void setDiscount(BigDecimal discount) {
			this.discount = discount;
		}
	}

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

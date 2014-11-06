package br.com.victor.JavaDddExample.resources;

import java.math.BigDecimal;

public class MedicineStock {

	private Medicine medicine;

	private BigDecimal quantity;

	private Stock stock;

	public Medicine getMedicine() {
		return medicine;
	}

	public void setMedicine(Medicine medicine) {
		this.medicine = medicine;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

}

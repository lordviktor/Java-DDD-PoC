package br.com.victor.JavaDddExample.domain;

import java.math.BigDecimal;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.victor.JavaDddExample.domain.base.AbstractEntity;

@Entity
@Table(name = "ITEM_PEDIDO")
public class ItemPedido extends AbstractEntity {
	@Basic
	private BigDecimal quantidade;

	@Basic
	private BigDecimal desconto;

	@ManyToOne
	@JoinColumn
	private Pedido pedido;

	public BigDecimal getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(BigDecimal quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getDesconto() {
		return desconto;
	}

	public void setDesconto(BigDecimal desconto) {
		this.desconto = desconto;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

}

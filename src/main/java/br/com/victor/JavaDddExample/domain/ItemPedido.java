package br.com.victor.JavaDddExample.domain;

import java.math.BigDecimal;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Configurable;

import br.com.victor.JavaDddExample.domain.base.AbstractEntity;
import br.com.victor.JavaDddExample.repository.ItemPedidoRepository;

@Entity
@Table(name = "ITEM_PEDIDO")
@Configurable
public class ItemPedido extends AbstractEntity {
	
	private transient ItemPedidoRepository itemPedidoRepository;
	
	@Basic
	private BigDecimal quantidade;

	@Basic
	private BigDecimal desconto;

	@ManyToOne
	@JoinColumn
	private Estoque estoque;

	@ManyToOne
	@JoinColumn
	private Medicamento medicamento;

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

	public Estoque getEstoque() {
		return estoque;
	}

	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}

	public Medicamento getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}

	public void setItemPedidoRepository(ItemPedidoRepository itemPedidoRepository) {
		this.itemPedidoRepository = itemPedidoRepository;
	}

	public void save(){
		itemPedidoRepository.save(this);	
	}
	
}

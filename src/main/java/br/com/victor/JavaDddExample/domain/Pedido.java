package br.com.victor.JavaDddExample.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.victor.JavaDddExample.domain.base.AbstractTenancyEntity;

@Entity
@Table(name = "PEDIDO")
public class Pedido extends AbstractTenancyEntity {

	@Basic
	private Date data;
	@Basic
	private BigDecimal desconto;
	@Basic
	private boolean eTelefone;
	@ManyToOne
	@JoinColumn
	private Cliente cliente;

	@OneToMany(mappedBy = "pedido")
	private Set<ItemPedido> itens;

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public BigDecimal getDesconto() {
		return desconto;
	}

	public void setDesconto(BigDecimal desconto) {
		this.desconto = desconto;
	}

	public boolean iseTelefone() {
		return eTelefone;
	}

	public void seteTelefone(boolean eTelefone) {
		this.eTelefone = eTelefone;
	}

	public Set<ItemPedido> getItens() {
		return itens;
	}

	public void setItens(Set<ItemPedido> itens) {
		this.itens = itens;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}

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
import javax.persistence.Transient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

import br.com.victor.JavaDddExample.domain.base.AbstractTenancyEntity;
import br.com.victor.JavaDddExample.exception.NoStockException;
import br.com.victor.JavaDddExample.repository.ItemEstoqueRepository;
import br.com.victor.JavaDddExample.repository.ItemPedidoRepository;

@Entity
@Table(name = "PEDIDO")
@Configurable
public class Pedido extends AbstractTenancyEntity {

	@Autowired
	@Transient
	private ItemPedidoRepository itemPedidoRepository;

	@Autowired
	@Transient
	private ItemEstoqueRepository itemEstoqueRepository;

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

	public Pedido() {

	}

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

	public void setItens(Set<ItemPedido> itens) {
		this.itens = itens;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void adicionaItem(Medicamento medicamento, BigDecimal quantidade,
			BigDecimal discount, Estoque estoque) {

		ItemPedido itemPedido = new ItemPedido();

		ItemEstoque itemEstoque = itemEstoqueRepository
				.findByEstoqueIdAndMedicamentoId(estoque.getId(),
						medicamento.getId());

		if (itemEstoque == null
				|| !itemEstoque.temQuantidadeSuficiente(quantidade)) {
			throw new NoStockException();
		}

		itemEstoque.removerQuantidade(quantidade);

		itemPedido.setPedido(this);
		itemPedido.setDesconto(discount);
		itemPedido.setMedicamento(medicamento);
		itemPedido.setEstoque(estoque);
		itemPedido.setQuantidade(quantidade);
		itemPedido.save();
	}

}

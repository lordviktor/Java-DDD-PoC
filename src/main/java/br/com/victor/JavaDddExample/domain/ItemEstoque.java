package br.com.victor.JavaDddExample.domain;

import java.math.BigDecimal;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

import br.com.victor.JavaDddExample.domain.base.AbstractEntity;
import br.com.victor.JavaDddExample.repository.ItemEstoqueRepository;

@Entity
@Table(name = "ITEM_ESTOQUE")
@Configurable
public class ItemEstoque extends AbstractEntity {

	@Autowired
	@Transient
	private ItemEstoqueRepository itemEstoqueRepository;

	@Basic
	private BigDecimal quantidade;

	@ManyToOne
	@JoinColumn
	private Medicamento medicamento;

	@ManyToOne
	@JoinColumn
	private Estoque estoque;

	public BigDecimal getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(BigDecimal quantidade) {
		this.quantidade = quantidade;
	}

	public Medicamento getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}

	public Estoque getEstoque() {
		return estoque;
	}

	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}

	public void adicionarQuantidade(BigDecimal quantity) {
		this.quantidade.add(quantity);
		itemEstoqueRepository.save(this);
	}

	public void removerQuantidade(BigDecimal quantity) {
		this.quantidade.subtract(quantity);
		itemEstoqueRepository.save(this);
	}

	public boolean temQuantidadeSuficiente(BigDecimal quantidade) {
		return this.getQuantidade().compareTo(quantidade) > -1;
	}
	
}

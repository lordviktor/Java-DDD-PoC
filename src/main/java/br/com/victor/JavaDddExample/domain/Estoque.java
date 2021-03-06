package br.com.victor.JavaDddExample.domain;

import java.math.BigDecimal;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Configurable;

import br.com.victor.JavaDddExample.domain.base.AbstractTenancyEntity;
import br.com.victor.JavaDddExample.repository.ItemEstoqueRepository;

@Entity
@Table(name = "ESTOQUE")
@Configurable
public class Estoque extends AbstractTenancyEntity {

	private transient ItemEstoqueRepository itemEstoqueRepository;
	
	@Basic
	private String nome;
	@Basic
	private String endereco;
	@Basic
	private String telefone;

	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setItemEstoqueRepository(ItemEstoqueRepository itemEstoqueRepository) {
		this.itemEstoqueRepository = itemEstoqueRepository;
	}

	public void alteraEstoque(Medicamento medicamento, BigDecimal quantity) {
		ItemEstoque itemEstoque = itemEstoqueRepository
				.findByEstoqueIdAndMedicamentoId(this.getId(),
						medicamento.getId());
		if (itemEstoque == null) {
			itemEstoque = new ItemEstoque();
			itemEstoque.setMedicamento(medicamento);
			itemEstoque.setEstoque(this);
		}

		itemEstoque.setItemEstoqueRepository(itemEstoqueRepository);
		
		if (quantity.signum() == 1) {
			itemEstoque.adicionarQuantidade(quantity);
		} else {
			itemEstoque.removerQuantidade(quantity.abs());
		}
	}
}

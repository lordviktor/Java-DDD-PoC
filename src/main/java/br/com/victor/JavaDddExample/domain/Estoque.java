package br.com.victor.JavaDddExample.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Configurable;

import br.com.victor.JavaDddExample.domain.base.AbstractTenancyEntity;

@Entity
@Table(name = "ESTOQUE")
@Configurable
public class Estoque extends AbstractTenancyEntity {
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
}

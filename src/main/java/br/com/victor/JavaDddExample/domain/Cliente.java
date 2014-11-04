package br.com.victor.JavaDddExample.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.victor.JavaDddExample.domain.base.AbstractTenancyEntity;

@Entity
@Table(name = "CLIENTE")
public class Cliente extends AbstractTenancyEntity {

	@Basic
	private String nome;
	@Basic
	private String cpf;
	@Basic
	private String telefone;
	@Basic
	private String endereco;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}

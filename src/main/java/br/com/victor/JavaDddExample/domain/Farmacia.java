package br.com.victor.JavaDddExample.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

import br.com.victor.JavaDddExample.domain.base.AbstractEntity;
import br.com.victor.JavaDddExample.repository.FarmaciaRepository;

@Entity
@Table(name = "FARMACIA")
@Configurable
public class Farmacia extends AbstractEntity {

	@Transient
	@Autowired
	private FarmaciaRepository farmaciaRepository;

	@OneToMany(mappedBy = "farmacia")
	private Set<Cliente> clientes;

	@OneToMany(mappedBy = "farmacia")
	private Set<Pedido> pedidos;

	@OneToMany(mappedBy = "farmacia")
	private Set<Estoque> estoques;

	@OneToMany(mappedBy = "farmacia")
	private Set<Medicamento> medicamentos;

	@OneToMany(mappedBy = "farmacia")
	private Set<Funcionario> funcionarios;

	public Set<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Set<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(Set<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public Set<Estoque> getEstoques() {
		return estoques;
	}

	public void setEstoques(Set<Estoque> estoques) {
		this.estoques = estoques;
	}

	public Set<Medicamento> getMedicamentos() {
		return medicamentos;
	}

	public void setMedicamentos(Set<Medicamento> medicamentos) {
		this.medicamentos = medicamentos;
	}

	public Set<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(Set<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
}

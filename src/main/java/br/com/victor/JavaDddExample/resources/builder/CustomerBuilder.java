package br.com.victor.JavaDddExample.resources.builder;

import br.com.victor.JavaDddExample.domain.Cliente;
import br.com.victor.JavaDddExample.domain.Farmacia;
import br.com.victor.JavaDddExample.resources.Customer;
import br.com.victor.JavaDddExample.resources.builder.base.AbstractTenancyEntityBuilder;

public class CustomerBuilder extends
		AbstractTenancyEntityBuilder<Customer, Cliente> {

	public CustomerBuilder() {
		super(Customer.class, Cliente.class);
	}

	@Override
	public Customer toResource(Cliente entity) {
		Customer resource = super.toResource(entity);

		resource.setName(entity.getNome());
		resource.setCpf(entity.getCpf());
		resource.setTelephone(entity.getTelefone());
		resource.setAddress(entity.getEndereco());

		return resource;
	}

	@Override
	public Cliente toEntity(Customer resource, Farmacia farmacia) {
		Cliente entity = super.toEntity(resource, farmacia);

		entity.setNome(resource.getName());
		entity.setCpf(resource.getCpf());
		entity.setTelefone(resource.getTelephone());
		entity.setEndereco(resource.getAddress());

		return entity;
	}

}

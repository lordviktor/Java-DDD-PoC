package br.com.victor.JavaDddExample.resources;

import br.com.victor.JavaDddExample.resources.base.AbstractTenancyResource;

public class Customer extends AbstractTenancyResource {
	
	private String name;
	private String cpf;
	private String telephone;
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}

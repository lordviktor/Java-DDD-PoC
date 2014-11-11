package br.com.victor.JavaDddExample.resources;

import br.com.victor.JavaDddExample.resources.base.AbstractTenancyResource;

public class Stock extends AbstractTenancyResource {

	private String name;

	private String address;
	
	private String telephone;
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

package br.com.victor.JavaDddExample.resources;

import br.com.victor.JavaDddExample.resources.base.AbstractTenancyResource;

public class Stock extends AbstractTenancyResource {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

package br.com.victor.JavaDddExample.resources.base;

import br.com.victor.JavaDddExample.resources.DrugStore;

public class BaseTenancyResource {

	private DrugStore drugStore;

	public DrugStore getDrugStore() {
		return drugStore;
	}

	public void setDrugStore(DrugStore drugStore) {
		this.drugStore = drugStore;
	}
}

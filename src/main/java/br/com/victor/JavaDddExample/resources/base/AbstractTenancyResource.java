package br.com.victor.JavaDddExample.resources.base;

import br.com.victor.JavaDddExample.resources.DrugStore;

public class AbstractTenancyResource extends AbstractResource {

	private DrugStore drugStore;

	public DrugStore getDrugStore() {
		return drugStore;
	}

	public void setDrugStore(DrugStore drugStore) {
		this.drugStore = drugStore;
	}
}

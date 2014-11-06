package br.com.victor.JavaDddExample.resources.builder;

import br.com.victor.JavaDddExample.domain.Farmacia;
import br.com.victor.JavaDddExample.domain.Medicamento;
import br.com.victor.JavaDddExample.resources.Medicine;
import br.com.victor.JavaDddExample.resources.builder.base.AbstractTenancyEntityBuilder;

public class MedicineBuilder extends
		AbstractTenancyEntityBuilder<Medicine, Medicamento> {

	public MedicineBuilder() {
		super(Medicine.class, Medicamento.class);
	}

	@Override
	public Medicine toResource(Medicamento entity) {
		Medicine resource = super.toResource(entity);

		resource.setName(entity.getNome());
		resource.setQuantityType(entity.getTipoDeQuantidade());
		resource.setQuantity(entity.getQuantidade());
		resource.setActiveIngredient(entity.getPrincipioAtivo());
		resource.setManufacturer(entity.getFabricante());
		resource.setRisk(entity.getRisco());
		resource.setPrice(entity.getValorVenda());

		return resource;
	}

	@Override
	public Medicamento toEntity(Medicine resource, Farmacia farmacia) {
		Medicamento entity = super.toEntity(resource, farmacia);

		entity.setNome(resource.getName());
		entity.setTipoDeQuantidade(resource.getQuantityType());
		entity.setQuantidade(resource.getQuantity());
		entity.setPrincipioAtivo(resource.getActiveIngredient());
		entity.setFabricante(resource.getManufacturer());
		entity.setRisco(resource.getRisk());
		entity.setValorVenda(resource.getPrice());

		return entity;
	}

}

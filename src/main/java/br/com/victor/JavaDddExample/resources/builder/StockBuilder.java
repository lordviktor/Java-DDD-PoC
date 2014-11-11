package br.com.victor.JavaDddExample.resources.builder;

import br.com.victor.JavaDddExample.domain.Estoque;
import br.com.victor.JavaDddExample.domain.Farmacia;
import br.com.victor.JavaDddExample.resources.Stock;
import br.com.victor.JavaDddExample.resources.builder.base.AbstractTenancyEntityBuilder;

public class StockBuilder extends AbstractTenancyEntityBuilder<Stock, Estoque> {

	public StockBuilder() {
		super(Stock.class, Estoque.class);
	}

	@Override
	public Stock toResource(Estoque entity) {
		Stock stock = super.toResource(entity);
		stock.setName(entity.getNome());
		stock.setAddress(entity.getEndereco());
		stock.setTelephone(entity.getTelefone());
		return stock;
	}

	@Override
	public Estoque toEntity(Stock resource, Farmacia farmacia) {
		Estoque estoque = super.toEntity(resource, farmacia);
		estoque.setNome(resource.getName());
		estoque.setTelefone(resource.getTelephone());
		estoque.setEndereco(resource.getAddress());
		return estoque;
	}
}

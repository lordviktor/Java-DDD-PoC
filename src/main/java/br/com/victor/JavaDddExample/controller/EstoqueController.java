package br.com.victor.JavaDddExample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.victor.JavaDddExample.controller.base.AbstractCrudController;
import br.com.victor.JavaDddExample.domain.Estoque;
import br.com.victor.JavaDddExample.repository.EstoqueRepository;
import br.com.victor.JavaDddExample.resources.Stock;
import br.com.victor.JavaDddExample.resources.builder.StockBuilder;

@Controller
@RequestMapping("/farmacia/{farmaciaId}/estoque")
public class EstoqueController extends AbstractCrudController<Estoque, Stock> {

	@Autowired
	public EstoqueController(EstoqueRepository repository) {
		super(repository, new StockBuilder());
	}

}

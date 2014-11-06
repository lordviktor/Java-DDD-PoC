package br.com.victor.JavaDddExample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.victor.JavaDddExample.controller.base.AbstractCrudController;
import br.com.victor.JavaDddExample.domain.Estoque;
import br.com.victor.JavaDddExample.domain.Medicamento;
import br.com.victor.JavaDddExample.exception.NotFoundException;
import br.com.victor.JavaDddExample.repository.EstoqueRepository;
import br.com.victor.JavaDddExample.repository.MedicamentoRepository;
import br.com.victor.JavaDddExample.resources.MedicineStock;
import br.com.victor.JavaDddExample.resources.Stock;
import br.com.victor.JavaDddExample.resources.builder.StockBuilder;

@Controller
@RequestMapping("/farmacia/{farmaciaId}/estoque")
public class EstoqueController extends AbstractCrudController<Estoque, Stock> {

	private EstoqueRepository repository;

	@Autowired
	private MedicamentoRepository medicamentoRepository;

	@Autowired
	public EstoqueController(EstoqueRepository repository) {
		super(repository, new StockBuilder());
		this.repository = repository;
	}

	@RequestMapping(value = "/{estoqueId}/medicamento")
	public void adicionarMedicamentoAoEstoque(
			@PathVariable("estoqueId") long estoqueId,
			@RequestBody MedicineStock medicineStock) {
		Estoque estoque = repository.findOne(estoqueId);
		if (estoque == null) {
			throw new NotFoundException();
		}

		Medicamento medicamento = medicamentoRepository.findOne(medicineStock
				.getMedicine().getId());

		estoque.alteraEstoque(medicamento, medicineStock.getQuantity());
	}
}

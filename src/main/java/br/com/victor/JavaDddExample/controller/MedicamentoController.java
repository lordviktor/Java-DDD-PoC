package br.com.victor.JavaDddExample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.victor.JavaDddExample.controller.base.AbstractCrudController;
import br.com.victor.JavaDddExample.domain.Medicamento;
import br.com.victor.JavaDddExample.repository.MedicamentoRepository;
import br.com.victor.JavaDddExample.resources.Medicine;
import br.com.victor.JavaDddExample.resources.builder.MedicineBuilder;

@Controller
@RequestMapping("/farmacia/{farmaciaId}/medicamento")
public class MedicamentoController extends
		AbstractCrudController<Medicamento, Medicine> {

	public MedicamentoController(MedicamentoRepository repository) {
		super(repository, new MedicineBuilder());
	}

}

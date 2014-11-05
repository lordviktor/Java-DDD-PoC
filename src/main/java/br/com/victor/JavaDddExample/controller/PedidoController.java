package br.com.victor.JavaDddExample.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.victor.JavaDddExample.domain.Farmacia;
import br.com.victor.JavaDddExample.domain.Funcionario;
import br.com.victor.JavaDddExample.domain.Pedido;
import br.com.victor.JavaDddExample.repository.FarmaciaRepository;
import br.com.victor.JavaDddExample.resources.Order;

@Controller
@RequestMapping("/farmacia/{farmaciaId}/pedido")
public class PedidoController {

	@Autowired
	FarmaciaRepository farmaciaRepository;

	@RequestMapping(method = RequestMethod.POST)
	public void create(@PathVariable("farmaciaId") Long farmaciaId,
			@RequestBody Order novoPedido) {

		Farmacia farmacia = farmaciaRepository.findOne(farmaciaId);
		// /Pedido pedido = new Pedido();

		// pedido.setData(new Date());

	}

}

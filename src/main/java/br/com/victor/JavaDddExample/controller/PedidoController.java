package br.com.victor.JavaDddExample.controller;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import br.com.victor.JavaDddExample.domain.Cliente;
import br.com.victor.JavaDddExample.domain.Estoque;
import br.com.victor.JavaDddExample.domain.Farmacia;
import br.com.victor.JavaDddExample.domain.Medicamento;
import br.com.victor.JavaDddExample.domain.Pedido;
import br.com.victor.JavaDddExample.repository.ClienteRepository;
import br.com.victor.JavaDddExample.repository.EstoqueRepository;
import br.com.victor.JavaDddExample.repository.FarmaciaRepository;
import br.com.victor.JavaDddExample.repository.ItemEstoqueRepository;
import br.com.victor.JavaDddExample.repository.ItemPedidoRepository;
import br.com.victor.JavaDddExample.repository.MedicamentoRepository;
import br.com.victor.JavaDddExample.repository.PedidoRepository;
import br.com.victor.JavaDddExample.resources.Order;
import br.com.victor.JavaDddExample.resources.OrderDetail;

@Controller
@RequestMapping("/farmacia/{farmaciaId}/pedido")
public class PedidoController {

	@Autowired
	FarmaciaRepository farmaciaRepository;

	@Autowired
	PedidoRepository pedidoRepository;

	@Autowired
	ClienteRepository clienteRepository;

	@Autowired
	MedicamentoRepository medicamentoRepository;

	@Autowired
	EstoqueRepository estoqueRepository;

	@Autowired
	private ItemPedidoRepository itemPedidoRepository;

	@Autowired
	private ItemEstoqueRepository itemEstoqueRepository;

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@Transactional
	public void create(@PathVariable("farmaciaId") Long farmaciaId,
			@RequestBody Order newOrder) {

		Farmacia farmacia = farmaciaRepository.findOne(farmaciaId);
		Pedido pedido = new Pedido();
		pedido.setData(new Date());
		pedido.setFarmacia(farmacia);
		pedido.seteTelefone(newOrder.isMadeByTelephone());
		pedido.setDesconto(newOrder.getDiscount());

		if (newOrder.getCustomer() != null) {
			Cliente cliente = clienteRepository.findOne(newOrder.getCustomer()
					.getId());
			pedido.setCliente(cliente);
		}

		pedido.setItemEstoqueRepository(itemEstoqueRepository);
		pedido.setItemPedidoRepository(itemPedidoRepository);
		pedidoRepository.save(pedido);

		for (OrderDetail orderDetail : newOrder.getDetails()) {
			Medicamento medicamento = medicamentoRepository.findOne(orderDetail
					.getMedicine().getId());
			Estoque estoque = estoqueRepository.findOne(orderDetail.getStock()
					.getId());
			pedido.adicionaItem(medicamento, orderDetail.getQuantity(),
					orderDetail.getDiscount(), estoque);
		}

	}
}

package br.com.victor.JavaDddExample.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.victor.JavaDddExample.controller.base.AbstractCrudController;
import br.com.victor.JavaDddExample.domain.Cliente;
import br.com.victor.JavaDddExample.repository.ClienteRepository;
import br.com.victor.JavaDddExample.resources.Customer;
import br.com.victor.JavaDddExample.resources.builder.CustomerBuilder;

@Controller
@RequestMapping("/farmacia/{farmaciaId}/cliente")
public class CustomerController extends AbstractCrudController<Cliente, Customer> {

    @Inject
    public CustomerController(ClienteRepository repository) {
        super(repository, new CustomerBuilder());
    }
}

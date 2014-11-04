package br.com.victor.JavaDddExample.controller;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.victor.JavaDddExample.domain.Funcionario;
import br.com.victor.JavaDddExample.exception.InvalidArgumentException;
import br.com.victor.JavaDddExample.exception.UnauthorizedException;
import br.com.victor.JavaDddExample.repository.FuncionarioRepository;
import br.com.victor.JavaDddExample.resources.Login;

@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private FuncionarioRepository funcionarioRepository;

	public void login(@RequestBody Login loginData) {
		if (loginData == null) {
			throw new InvalidArgumentException();
		}

		if (StringUtils.isBlank(loginData.getUsername())
				|| StringUtils.isBlank(loginData.getPassword())) {
			throw new InvalidArgumentException();
		}

		Funcionario funcionario = funcionarioRepository.findByUsuarioAndSenha(
				loginData.getUsername(), loginData.getPassword());

		if (funcionario == null) {
			throw new UnauthorizedException();
		}
	}
}

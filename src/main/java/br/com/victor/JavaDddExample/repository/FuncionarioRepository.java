package br.com.victor.JavaDddExample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.victor.JavaDddExample.domain.Funcionario;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

	Funcionario findByUsuarioAndSenha(String username, String password);

}

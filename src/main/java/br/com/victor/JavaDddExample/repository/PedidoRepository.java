package br.com.victor.JavaDddExample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.victor.JavaDddExample.domain.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}

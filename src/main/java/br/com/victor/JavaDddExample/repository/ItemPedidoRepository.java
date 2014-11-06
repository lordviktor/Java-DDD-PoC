package br.com.victor.JavaDddExample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.victor.JavaDddExample.domain.ItemPedido;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Long> {

}

package br.com.victor.JavaDddExample.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.victor.JavaDddExample.domain.base.AbstractTenancyEntity;

@Entity
@Table(name = "PEDIDO")
public class Pedido extends AbstractTenancyEntity {

    @Basic
    private Date data;
    @Basic
    private BigDecimal desconto;
    @Basic
    private boolean eTelefone;
}

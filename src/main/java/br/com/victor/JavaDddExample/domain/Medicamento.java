package br.com.victor.JavaDddExample.domain;

import java.math.BigDecimal;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Configurable;

import br.com.victor.JavaDddExample.domain.base.AbstractTenancyEntity;

@Entity
@Table(name = "MEDICAMENTO")
@Configurable
public class Medicamento extends AbstractTenancyEntity {

    @Basic
    private String nome;
    @Basic
    private String tipoDeQuantidade;
    @Basic
    private BigDecimal quantidade;
    @Basic
    private String principioAtivo;
    @Basic
    private String fabricante;
    @Basic
    private String risco;
    @Basic
    private BigDecimal valorVenda;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoDeQuantidade() {
        return tipoDeQuantidade;
    }

    public void setTipoDeQuantidade(String tipoDeQuantidade) {
        this.tipoDeQuantidade = tipoDeQuantidade;
    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    public String getPrincipioAtivo() {
        return principioAtivo;
    }

    public void setPrincipioAtivo(String principioAtivo) {
        this.principioAtivo = principioAtivo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getRisco() {
        return risco;
    }

    public void setRisco(String risco) {
        this.risco = risco;
    }

    public BigDecimal getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(BigDecimal valorVenda) {
        this.valorVenda = valorVenda;
    }

}

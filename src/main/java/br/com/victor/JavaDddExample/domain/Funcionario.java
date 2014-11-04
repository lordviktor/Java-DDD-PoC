package br.com.victor.JavaDddExample.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.victor.JavaDddExample.domain.base.AbstractEntity;

@Entity
@Table(name = "FARMACIA")
public class Funcionario extends AbstractEntity {

    @Basic
    private String usuario;
    @Basic
    private String senha;
    @Basic
    private String nome;
    @Basic
    private String cpf;
    @Basic
    private String cargo;
    @Basic
    private String telefone;
    @Basic
    private String endereco;
    @Basic
    private String salario;
    @Basic
    private String registroFarmaceutico;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getRegistroFarmaceutico() {
        return registroFarmaceutico;
    }

    public void setRegistroFarmaceutico(String registroFarmaceutico) {
        this.registroFarmaceutico = registroFarmaceutico;
    }
}

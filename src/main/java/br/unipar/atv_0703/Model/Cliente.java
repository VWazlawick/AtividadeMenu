/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.atv_0703.Model;

/**
 *
 * @author victo
 */
public class Cliente {
    
    private int id;
    private String nmCliente;
    private String cpf;
    private String telefone;
    private String cep;
    private String endereco;
    private boolean stativo;

    public Cliente() {
    }

    public Cliente(int id, String nmCliente, String cpf, String telefone, String cep, String endereco, boolean stativo) {
        this.id = id;
        this.nmCliente = nmCliente;
        this.cpf = cpf;
        this.telefone = telefone;
        this.cep = cep;
        this.endereco = endereco;
        this.stativo = stativo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNmCliente() {
        return nmCliente;
    }

    public void setNmCliente(String nmCliente) {
        this.nmCliente = nmCliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean isStativo() {
        return stativo;
    }

    public void setStativo(boolean stativo) {
        this.stativo = stativo;
    }
     
    
}

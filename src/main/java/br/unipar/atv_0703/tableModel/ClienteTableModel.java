/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.atv_0703.tableModel;

import br.unipar.atv_0703.Model.Cliente;
import java.awt.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author victo
 */
public class ClienteTableModel extends DefaultTableModel{
    
    public ClienteTableModel(){
        this.addColumn("Nome");
        this.addColumn("Telefone");
        this.addColumn("Endereço");
        this.addColumn("Ativo");
    }
    
    public ClienteTableModel(List<Cliente> listCliente){
        this();
        
        for(Cliente cliente: listCliente){
            this.addRow(new String[]{
                cliente.getNmCliente(),
                cliente.getTelefone(),
                cliente.getEndereco(),
                cliente.isStativo() ? "Ativo" : "Inativo"
            });
        }
    }
    
    public Cliente getSelectedCliente(JTable table, List<Cliente> clientes){
        return null;
    }
}

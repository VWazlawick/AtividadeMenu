/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.atv_0703;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author vwaz
 */
public class Menu extends JFrame{
    private JPanel dinamicaIntrodutoria;
    private JPanel calcularMedia;
    private JPanel textDemo;
    
    public Menu(){
        setTitle("Menu");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        //panel1 = new Panel1();
        calcularMedia = new CalcularMedia();
        textDemo = new TextDemo();
        
        JMenuBar menuBar = new JMenuBar();
        
        JMenu menu1 = new JMenu("Atividades");

        
        JMenuItem menuItem1 = new JMenuItem("Inexistente");
        JMenuItem menuItem2 = new JMenuItem("Média");
        JMenuItem menuItem3 = new JMenuItem("Texto");
        
        menuItem2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirPanel(calcularMedia);
            }
        });
        
        menuItem3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirPanel(textDemo);
            }
        });
        
        menu1.add(menuItem1);
        menu1.add(menuItem2);
        menu1.add(menuItem3);
        
        menu1.setMnemonic(KeyEvent.VK_ALT);
        
        menuBar.add(menu1);

        JMenu menuMensagens = new JMenu("Mensagens");
        
        JMenuItem mensageWarning = new JMenuItem("Warning");
        JMenuItem mensageError = new JMenuItem("Error");
        JMenuItem mensageQuestion = new JMenuItem("Question");
        JMenuItem mensageInformation = new JMenuItem("Information");
        
        menuMensagens.add(mensageWarning);
        menuMensagens.add(mensageError);
        menuMensagens.add(mensageQuestion);
        menuMensagens.add(mensageInformation);
        
        menuBar.add(menuMensagens);
        
        JMenu menuCadastro = new JMenu("Cadastro");
        
        JMenu menuCliente = new JMenu("Cliente");
        
        JMenuItem cadastrarCliente = new JMenuItem("Cadastrar");
        JMenuItem listarCliente = new JMenuItem("Listar");
        
        menuCadastro.add(menuCliente);
        menuCliente.add(cadastrarCliente);
        menuCliente.add(listarCliente);
        
        menuBar.add(menuCadastro);
        
        setJMenuBar(menuBar);
    }
    
    public void abrirPanel(JPanel pane){
        getContentPane().removeAll();
        getContentPane().add(pane);
        revalidate();
        repaint();
    }
    
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Menu menu = new Menu();
                menu.setVisible(true);
            }
        });
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.atv_0703.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 *
 * @author victo
 */
public class EntityManagerUtil {
    
    private static EntityManagerFactory emf;
    private static EntityManager em;
    
    private EntityManagerFactory getEntityManagerFactory(){
    if(emf==null){
        emf = Persistence.createEntityManagerFactory("DesktotPU");
        System.out.println("conexão aberta");
    }
    return emf;
    }
}

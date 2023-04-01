/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author Gustavo
 */
import com.mycompany.model.Orcamento;
import java.math.BigDecimal;


public class TesteMain {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("1000.0"), "Icms_MG");
        com.mycompany.mavenproject1.IcmsFactory icmsFactory = new com.mycompany.mavenproject1.IcmsFactory();
        BigDecimal resultado = icmsFactory.getIcmsPorEstado("Icms_MG").calculoPorRegiao(orcamento);
        System.out.println(resultado);
    }   
    }
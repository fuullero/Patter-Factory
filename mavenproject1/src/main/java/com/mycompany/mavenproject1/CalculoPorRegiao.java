/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author galex
 */
import com.mycompany.model.Orcamento;
import java.math.BigDecimal;



public interface CalculoPorRegiao {
    public BigDecimal calculoPorRegiao(Orcamento orcamento);   
}
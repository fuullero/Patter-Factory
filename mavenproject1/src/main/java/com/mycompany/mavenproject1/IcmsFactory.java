/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author galex
 */
public class IcmsFactory {
    public CalculoPorRegiao getIcmsPorEstado(String nomeEstado){
        if(nomeEstado.equalsIgnoreCase("ICMS_MG")){
            return new IcmsMG();
        } else if (nomeEstado.equalsIgnoreCase("ICMS_SP")) {
            return (CalculoPorRegiao) new IcmsSP();
        }else{
            System.out.println("Valor inválido - ICMS não cadastrado");
            return null;
        }
    }
}

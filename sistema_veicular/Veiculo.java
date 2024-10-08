
package com.mycompany.java.oo.sistema_veicular;

import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;

public abstract class Veiculo {
    private String marca, modelo;
    private int ano;
    private double valorInicial;
    
    public Veiculo(String marca, String modelo, int ano, double valorInicial) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valorInicial = valorInicial;
        
    }
    
    public String getMarca() {
        return this.marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getModelo() {
        return this.modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public int getAno() {
        return this.ano;
    }
    
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public double getValorInicial() {
        return this.valorInicial;
    }
    
    public void setValorInicial(double valorInicial) {
        this.valorInicial = valorInicial;
    }
    
    
    // Método private para calcular valor de revenda do veículo
    private double calcularValorRevenda() {
        int anoAtual = LocalDate.now().getYear();
        int idadeVeiculo = anoAtual - this.ano;
        
        double valorRevenda = this.valorInicial;
        double valorMinimoDeRevenda = this.valorInicial * 0.2;
        
        // Aplicar depreciação de 20% por ano
        for (int i = 0; i < idadeVeiculo; i++) { 
            if (valorRevenda <= valorMinimoDeRevenda) {
                valorRevenda = valorMinimoDeRevenda;        
                break;
            } else {
                valorRevenda *= 0.8;
            } 
        }
        
        return valorRevenda;       
    } 
    
    // Método public para obter valor revenda
    public double getValorDeRevenda() {
        return calcularValorRevenda();   // Chama o método privado
    }
}

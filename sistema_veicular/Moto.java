
package com.mycompany.java.oo.sistema_veicular;

import java.time.LocalDate;

/**
 *
 * @author joaoleal
 */
public class Moto extends Veiculo{
    private int cilindrada;
    private String tipoGuidao;
    
    // Construtor vazio
    public Moto() {
        super("Indefinido", "Indefinido", 0000, 0.0);
        this.cilindrada = 0;
        this.tipoGuidao = "Indefinido"; // Valor padrão
    }
   
    // Construtor parametrizado
    public Moto(String marca, String modelo, int ano, int cilindrada, String tipoGuidao, double valorInicial) {
        super(marca, modelo, ano, valorInicial);
        this.cilindrada = cilindrada;
        this.tipoGuidao = tipoGuidao;
    }
    
    public int getCilindrada() {
        return this.cilindrada;
    }
    
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    public String getTipoGuidao() {
        return this.tipoGuidao;
    }
    
    public void setTipoGuidao(String tipoGuidao) {
        this.tipoGuidao = tipoGuidao;
    }
    
    @Override
    public String toString() {
        return String.format("""
                ========= Moto =========
                 • Marca: %s
                 • Modelo: %s
                 • Ano: %d
                 • Cilindradas: %d cc
                 • Guidão: %s
                 • Valor Inicial: R$ %.2f
                 • Valor de Revenda: R$ %.2f\n
                """, getMarca(), getModelo(), getAno(), getCilindrada(), getTipoGuidao(), getValorInicial(), getValorDeRevenda());       
    }
}

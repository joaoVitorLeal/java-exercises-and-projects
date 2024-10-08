
package com.mycompany.java.oo.sistema_veicular;


public class Carro extends Veiculo{
    private int numeroDePortas;
    private String combustivel;
    
    // Construtor vazio
    public Carro() {
        super("Indefinido", "Indefinido", 0000, 0.0);
        this.numeroDePortas = 0;
        this.combustivel = "Indefinido"; // Valor padrão
    }
   
    // Construtor parametrizado
    public Carro(String marca, String modelo, int ano, int numeroDePortas, String combustivel, double valorInicial) {
        super(marca, modelo, ano, valorInicial);
        this.numeroDePortas = numeroDePortas;
        this.combustivel = combustivel;
    }
    
    public int getNumeroDePortas() {
        return this.numeroDePortas;
    }
    
    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }
    
    public String getCombustivel() {
        return this.combustivel;
    }
    
    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
    
    @Override
    public String toString() {
        return String.format("""
                ======== Carro ========
                 • Marca: %s
                 • Modelo: %s
                 • Ano: %d
                 • Qnt. de portas: %d
                 • Tipo de Combustível: %s
                 • Valor Inicial: R$ %.2f
                 • Valor de Revenda: R$ %.2f\n
               """, getMarca(), getModelo(), getAno(), getNumeroDePortas(), getCombustivel(), getValorInicial(), getValorDeRevenda());
    }
}

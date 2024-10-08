
package com.mycompany.java.oo.sistema_veicular;

/**
 *
 * @author joaoleal
 */

public class VeiculoApp {
    public static void main(String[] args) {
        // Instâncias de Carro
        Carro carro1 = new Carro("Chevrolet", "Onix", 2013, 4, "Flex (Gasolina/Álcool)", 50000.00);
        Carro carro2 = new Carro("Toyota", "Corolla", 2018, 4, "Híbrido (Gasolina/Elétrico)", 160000.00);
        Carro carro3 = new Carro ();  // Instância inicializada com construtor vazio
        
        // Instâncias de Moto
        Moto moto1 = new Moto("Yamaha", "MT-03", 2023, 321, "Esportivo", 30000.00);
        Moto moto2 = new Moto("BMW", "R 1250 GS", 2014, 1254, "Adventure", 120000.00);
        Moto moto3 = new Moto ();  // Instância inicializada com construtor vazio        
        
        System.err.println(carro3);
        // Atribuindo valores aos atributos do carro3 e moto3 usando métodos setters
        // Setters carro
        carro3.setMarca("Fiat");
        carro3.setModelo("Argo");
        carro3.setAno(2024);
        carro3.setNumeroDePortas(4);
        carro3.setCombustivel("Gasolina");
        carro3.setValorInicial(80000.00);
        
        // Setters moto  
        moto3.setMarca("Honda");
        moto3.setModelo("CG 160 Titan");
        moto3.setAno(2021);
        moto3.setCilindrada(162);
        moto3.setTipoGuidao("Convencional");
        moto3.setValorInicial(14000.00);
                
        // Exibindo Informações dos veículos
        System.out.print(carro1);
        System.out.print(carro2);
        System.out.println(carro3);
        System.out.print(moto1);
        System.out.print(moto2);
        System.out.println(moto3);
    }
}

/*
 *  - Sistema Veicular
 * Este sistema gerencia informações sobre veículos, permitindo a 
 * criação de diferentes tipos de veículos. As classes principais incluem:
 *
 * Veiculo: Classe base que representa um veículo com atributos como:
 * - Marca
 * - Modelo
 * - Ano de fabricação
 *
 * Carro: Classe derivada de Veiculo que inclui atributos específicos como:
 * - Número de portas
 * - Tipo de combustível
 *
 * Moto: Classe derivada de Veiculo que adiciona atributos como:
 * - Cilindrada
 * - Tipo de guidão
 *
 *  - Funcionalidades
 * - Métodos para exibir informações detalhadas de cada veículo.
 * - Método para calcular o valor de revenda do veículo, 
 *   considerando uma taxa de depreciação média de 20% ao ano, conforme
 *   orientações da Receita Federal.
 *
 * Este sistema visa fornecer uma maneira eficiente de gerenciar e 
 * avaliar veículos, facilitando a visualização de informações e a 
 * determinação do valor de revenda.
 */

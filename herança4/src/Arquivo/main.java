package Arquivo;

import utilidades.FuncoesUteis; // Importa a classe FuncoesUteis do pacote utilidades

//Classe para formatação do resultado somado
public class main {
 public static void main(String[] args) {
     // Pede o método de soma da classe FuncoesUteis e atribui valores para as variáveis
     int resultadoFinalSoma = FuncoesUteis.somar(10, 12); 
     // Entrega o resultado somado
     System.out.println("A soma dos valores é: " + resultadoFinalSoma); 

     // Entrega o resultado somado do triângulo
     System.out.println("\nDesenho do Triângulo: ");
     // Pede o método do triângulo e define o valor da variável para montar o triângulo
     FuncoesUteis.desenharTriangulo(12); 

     // Entrega o resultado somado após a leitura do arquivo
     System.out.println("\nArquivo:");
     // Pede o método para mostrar o arquivo e mostra no resultado somado a leitura do arquivo procurado no pc
     FuncoesUteis.exibirArquivo("C:\\Users\\muril\\OneDrive\\Documentos\\believer.txt"); 
 }
}
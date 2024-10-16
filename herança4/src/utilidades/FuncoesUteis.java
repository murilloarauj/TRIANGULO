package utilidades;

import java.nio.file.Files; 
import java.nio.file.Paths;
import java.io.IOException; 
import java.util.List; 

// Classe FuncoesUteis para criar os métodos que realizarão as operações
public class FuncoesUteis {

    // Método para realizar soma
    public static int somar(int num1, int num2) {
    	// Soma num1 e num2
        int resultadoSoma = num1 + num2; 
        // Retorna o resultado da soma
        return resultadoSoma; 
    }

    // Método para dados de um triângulo
    public static void desenharTriangulo(int tamAltura) {
    	// For para a altura do triangulo
        for (int linha = 1; linha <= tamAltura; linha++) { 
            // For para o comprimento das linhas do triangulo
            for (int col = 1; col <= linha; col++) {
                System.out.print("x"); // Coloca os "x" para formar o triângulo sem pular linha
            }
            // Pula para a próxima linha depois do for para o triangulo
            System.out.println();
        }
    }

    // Método para ler arquivo especifico
    public static void exibirArquivo(String nomeArquivo) {
        try {
            // identifica todas as linhas do arquivo e coloca no código
            List<String> conteudoArquivo = Files.readAllLines(Paths.get(nomeArquivo));

            // Todas as linhas do arquivo no console
            for (String linhaAtual : conteudoArquivo) {
            	// Transcreve a linha do arquivo escolhido
                System.out.println(linhaAtual); 
            }
         // Tirando entrada e saida de linha
        } catch (IOException excecaoLeitura) { 
            // Se tiver erro, exibe mensagem
            System.out.println("Falha ao abrir o arquivo: " + excecaoLeitura.getMessage());
        }
    }
}
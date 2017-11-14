/**
 * 2º Trabalho Prático - Sistema de Arquivos
 * Implementação das funções básicas e criação de diretórios para melhor organização.
 * 
 * Karina Gomes Cruz
 * Lucas Dourado de Azevedo
 * Thomas Antonio Fernandes
 * Vitória Petito Taboada
 * 
 * Ciências da Computação
 * 
 * Sistemas Operacionais II
 * Prof. Marcio Piva
 * 
 * 24/11/2015
 */

package winpiva;

public class Winpiva {
    
    static int controle = 0;

    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }
}

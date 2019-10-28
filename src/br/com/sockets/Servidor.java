/*Faça uma atividade para que no cliente, seja informado
*nomes e, no
*servidor, somente apareça a quantidade de
*integrantes, após receber a palavra “sair”,
*conforme o número de mensagens
*enviadas.
*Exemplo de saída na máquina “servidor”: Total de mensagens recebidas: 3
*/

package br.com.sockets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor {

    public static void main(String[] args) throws IOException {
        System.out.println("SERVIDOR");
        int cont=0;
        ServerSocket servidor = new ServerSocket(54321);
        Socket cliente = servidor.accept();
        
        DataInputStream entrada = new DataInputStream(cliente.getInputStream());
        DataOutputStream saida = new DataOutputStream(cliente.getOutputStream());
        
        while(true){
            if(entrada.readUTF().equals("sair")){
                System.out.println("Total de mensagens recebidas: "+cont);
                break;
            }else{
                cont++;
            }
        }
    }
    
}

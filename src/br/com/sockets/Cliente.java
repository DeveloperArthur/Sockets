package br.com.sockets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) throws IOException {
        System.out.println("CLIENTE");
        
        Socket cliente = new Socket("localhost", 54321);
        
        DataInputStream entrada = new DataInputStream(cliente.getInputStream());
        DataOutputStream saida = new DataOutputStream(cliente.getOutputStream());
        
        while(true){
            //Envia para o Servidor
            saida.writeUTF(new Scanner(System.in).nextLine());
        }
    }
    
}

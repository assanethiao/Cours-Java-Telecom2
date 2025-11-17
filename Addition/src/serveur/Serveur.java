package serveur;

import java.io.*;
import java.net.*;

public class Serveur {
    public static void main(String[] args) {
        final int PORT = 5000;

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Serveur en attente sur le port " + PORT + "...");

            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connecté !");

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            // recevoir le nombre de valeurs
            int n = Integer.parseInt(in.readLine());
            int somme = 0;

            // recevoir chaque valeur
            for (int i = 0; i < n; i++) {
                int val = Integer.parseInt(in.readLine());
                somme += val;
            }

            // renvoyer la somme au client
            out.println(String.valueOf(somme));
            
           

            System.out.println("Somme envoyée au client : " + somme);

            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package client;



import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        final String SERVER = "localhost";
        final int PORT = 5000;

        try (Socket socket = new Socket(SERVER, PORT)) {
            System.out.println("Connecté au serveur ");

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            Scanner sc = new Scanner(System.in);

            // saisie du nombre de valeurs
            System.out.print("Combien de nombres voulez-vous additionner ? ");
            int n = sc.nextInt();

            // envoyer au serveur
            out.println(n);

            // saisie et envoi des n nombres
            for (int i = 0; i < n; i++) {
                System.out.print("Nombre " + (i + 1) + " : ");
                int val = sc.nextInt();
                out.println(val);
            }

            // recevoir le résultat
            String result = in.readLine();
            System.out.println("La somme reçue du serveur est : " + result);
            
            sc.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

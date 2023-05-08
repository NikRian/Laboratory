package libraries;

import libraries.clients.*;
import java.util.ArrayList;
import java.util.List;

public class clientLib {

    private List<client> clientLib;
    
    public clientLib() {
        clientLib = new ArrayList<>();
    }

    public void addClient(client client) {
        clientLib.add(client);
    }

    public void removeClient(client client) {
        clientLib.remove(client);
    }

    public client findCLient(int registry) {

        for (client client : clientLib) {

            if(client.getRegistry() == registry) {

                return client;
            }
        }
        return null;
    }

    public void listType(int type) {
        int num = 1;

        for(client client : clientLib) {

            if(client.getType() == type) {
                
                System.out.println(num+" "+client);
                num++;
            }

        }
    }

    public void listAll() {

        System.out.println("Clientes:");

        System.out.println("\nProfessores: ");        
        listType(1);
        
        System.out.println("\nEstudantes: ");
        listType(0);

        System.out.println("\nServidores: ");
        listType(2);
    }
}
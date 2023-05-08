package libraries;

import libraries.clients.client;
import libraries.publications.publication;

public class loam {

    private client client;
    private publication publication;
    private int loamExpire, registry;

    public loam(client client, publication publication) {

        if (client.getLoamLimit() == 0) {
            System.out.println("Você já pegou o número de livros limite");
            return;
        }

        this.client = client;
        this.publication = publication;
        this.loamExpire = client.getLoamExpire();
        this.registry = client.getRegistry();
        publication.borrow();
        client.borrow();

        if (client.getType() == 0) {
            client.addTps(publication.getType() == 0 ? 0.1 : (publication.getType() == 1 ? 0.5 : 0.01));
        } else {
            client.addTps();
        }
    }

    public int getRegistry() {
        return registry;
    }

    public String toString() {
        return client+" || "+publication.toString(0);
    }
}
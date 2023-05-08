package libraries;

import libraries.publications.*;
import java.util.ArrayList;
import java.util.List;

public class publiLib {

    private List<publication> publiLib;
    
    public publiLib() {
        publiLib = new ArrayList<>();
    }

    public void addPubli(publication publication) {
        publiLib.add(publication);
    }

    public void removePubli(publication publication) {
        publiLib.remove(publication);
    }

    public void listType(int type) {
        int num = 1;

        for(publication publication : publiLib) {

            if(publication.getType() == type) {
                
                System.out.println(num+" "+publication);
                num++;
            }

        }
    }

    public void listAll() {

        System.out.println("Publicações:");

        System.out.println("\nLivros: ");        
        listType(0);
        
        System.out.println("\nArtigos: ");
        listType(1);

        System.out.println("\nRevistas: ");
        listType(2);
    }

    public List<publication> getPubliLib() {
        return publiLib;
    }
}
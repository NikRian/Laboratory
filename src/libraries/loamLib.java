package libraries;

import java.util.ArrayList;
import java.util.List;

public class loamLib {

    private List<loam> loamLib;
    
    public loamLib() {
        loamLib = new ArrayList<>();
    }
    
    public void addClient(loam loam) {
        loamLib.add(loam);
    }

    public void removeClient(loam loam) {
        loamLib.remove(loam);
    }

    public void whichPubli(int registry) {

        boolean found = false;
        for(loam loam: loamLib) {

            if((loam.getRegistry()) == registry) {
                System.out.println(loam);
                found = true;
            }
        }
        if (!found) {
        System.out.println("Nada encontrado");
        }
    }

    public void listLoams() {
        for(loam loam : loamLib) {
            System.out.println(loam);
        }
    }
}
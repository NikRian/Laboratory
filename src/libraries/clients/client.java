package libraries.clients;

import libraries.loam;

public abstract class client {
    
    private String name;
    private int registry, type, loamExpire, loamLimit, loamTps;
    private double tps;

    public client(int registry, String name, int type, int loamExpire, int loamTps, int loamLimit) {

        this.registry = registry;
        this.name = name;
        this.type = type;
        this.loamExpire = loamExpire;
        this.loamLimit = loamLimit;
        
        this.tps = 0;

    }

    public void borrow() {
        loamLimit--;
    }

    public int getLoamLimit() {
        return loamLimit;
    }

    public void addTps() {
        tps +=  loamTps;
    }

    public void addTps(double value) {
        tps +=  loamTps * value;
    }

    public double getTps() {
        return tps;
    }

    public int getLoamExpire() {
        return loamExpire;
    }

    public int getType() {
        return type;
    }

    public int getRegistry() {
        return registry;
    }
    
    public String toString() {
        return registry+";"+name+";"+tps;
    }
}


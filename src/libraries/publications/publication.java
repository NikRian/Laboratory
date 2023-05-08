package libraries.publications;

public abstract class publication {
    
    private String title, author;
    private int publiYear, quantity, type, quantityLoam;

    public publication(int type ,String title, String author, int year, int quantity) {
        
        this.type = type;
        this.title = title;
        this.author = author;
        this.publiYear = year;
        this.quantity = 0;
        

        if (quantity > 0) {
            this.quantity = quantity;
        } else {this.quantityLoam = 0;}
    }

    public void borrow() {
        
        if (quantity > 0) {
            quantity--;
            
        }else {
            System.out.println("Não há mais desta publicação disponível");
        }
    }

    public int getQuantityLoam() {
        return quantityLoam;
    }

    public int getType() {
        return type;
    }

    public String toString() {
        return title+"; "+author+"; "+publiYear+"; "+quantity;
    }

    public String toString(int value) {
        return title+"; "+author+"; "+publiYear;
    }
}
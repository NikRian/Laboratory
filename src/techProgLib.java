import libraries.*;
import libraries.clients.*;
import libraries.publications.*;

public class techProgLib {
    
    public static void main(String[] args) {

        publiLib techProg = new publiLib();
        clientLib clientList = new clientLib();
        loamLib loamList = new loamLib();

        book publication1 = new book("The book of the jungle", "Rudyard Kipling", 1894,3);
        book publication2 = new book("O senhor dos anéis", "J.R.R. Tolkien", 1954,2);
        magazine publication3 = new magazine("Vough", "sei lá", 2022, 0);
        article publication4 = new article("por que pamonha é tão boa", "eu mesmo", 2077, 80000);

        techProg.addPubli(publication1);
        techProg.addPubli(publication2);
        techProg.addPubli(publication3);
        techProg.addPubli(publication4);

        clear();

        student student = new student(5555,"james");
        student student2 = new student(6666,"Luis");
        professor professor = new professor(9898, "Rui");
        attendant attendant = new attendant(4545, "Mrina");
        student student3 = new student(7777,"samanta");

        clientList.addClient(student);
        clientList.addClient(student2);
        clientList.addClient(student3);
        clientList.addClient(professor);
        clientList.addClient(attendant);

        loam loam2 = new loam(student, publication4);
        loamList.addClient(loam2);
        loam loam3 = new loam(student, publication4);
        loamList.addClient(loam3);
        loam loam4 = new loam(student, publication4);
        loamList.addClient(loam4);
        loam loam5 = new loam(student, publication4);
        loamList.addClient(loam5);
        loam loam6 = new loam(student, publication4);
        loamList.addClient(loam6);
        loam loam7 = new loam(student, publication4);
        loamList.addClient(loam7);

        loamList.listLoams();

        System.out.println(student.getLoamLimit());


    }

    static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

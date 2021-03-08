package tp09.Ex3;

import java.util.Scanner;

import static java.lang.System.exit;

public class TestBook {
    public static void main(String[] args) {
        Book book = new Book();
        Scanner sc = new Scanner(System.in);
        int key;
        System.out.print("***************************\n'" +
                "****************************************************\n" +
                "  1. Add Book." +"\n"+
                "  2. Display All of The Books"+ "\n"+
                "  3. Exit The Program......\n");

        while ( true){
            System.out.print("Input The number: ");
            key = sc.nextInt();
            switch (key){
                case 1: {
                    book.inputData();
                    break;

                }
                case 2:{
                    book.Display();
                    break;
                }
                case 3:{
                    System.out.print("The System was Exit.\n"+
                            "Thank You for join us");
                    System.exit(0);
                }

                default:
                    throw new IllegalStateException("Unexpected value: " + key);
            }
        }
    }
}

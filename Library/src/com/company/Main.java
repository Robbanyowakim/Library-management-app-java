package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Main myApp = new Main();
        LibraryLogic libraryLogic = new LibraryLogic();
        Transaction transaction = new Transaction();
        int loop = 0;
        do {

            myApp.menu();
            int a = input.nextInt();
            input.nextLine();
            switch (a) {
                case 1:
                    libraryLogic.addBook();
                    break;
                case 2:
                    libraryLogic.removeBook();
                    break;
                case 3:
                    libraryLogic.printBooks();
                    break;
                case 4:
                    libraryLogic.editBook(); //OBS INTE KLAR
                    break;
                case 6:
                    libraryLogic.addMember();
                    break;
                case 7:
                    libraryLogic.printMembers();
                    libraryLogic.removeMember();
                    break;
                case 8:
                    libraryLogic.printMembers();
                    break;
                case 9:
                    libraryLogic.editMember();
                    break;
                case 10:
                    transaction.issueBook();
                    break;
                case 11:
                    transaction.printTransactions();
                    break;
                case 12:
                    System.out.println("Exiting...");
                    System.exit(1);
                    break;
                default:
                    System.out.println("Please enter valid option.");
                    break;
            }

        } while (loop != 9);
    }
    private void menu (){
        System.out.println(" --- ---Books--- ---");
        System.out.println("| 1. Add Book       |");
        System.out.println("| 2. Remove Book    |");
        System.out.println("| 3. All Books      |");
        System.out.println("| 4. Edit Book      |");
        System.out.println("| 5. Search         |");
        System.out.println(" --- --Members-- ---");
        System.out.println("| 6. Add Member     |");
        System.out.println("| 7. Remove Member  |");
        System.out.println("| 8. All Members    |");
        System.out.println("| 9. Edit Member    |");
        System.out.println(" --- --- --- --- ---");
        System.out.println("| 10. Issue book    |");
        System.out.println("| 11. All Issues    |");
        System.out.println("  12. Exit");
    }
}

package com.company;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Main myApp = new Main();
        LibraryLogic libraryLogic = new LibraryLogic();

        int loop = 0;
        do {

            myApp.menu();
            int a = input.nextInt();
            input.nextLine();
            switch (a) {
                case 1://add book
                    libraryLogic.addBook();
                    break;
                case 2://remove book
                    libraryLogic.removeBook();
                    break;
                case 3://print list of books
                    libraryLogic.printBooks();
                    break;
                case 4://edit book
                    libraryLogic.editBook();
                    break;
                case 5://search for book
                    libraryLogic.searchBook();
                    break;
                case 6:
                    libraryLogic.showCategories();
                    break;
                case 7://add member
                    libraryLogic.addMember();
                    break;
                case 8://remove member
                    libraryLogic.printMembers();
                    libraryLogic.removeMember();
                    break;
                case 9://print list of members
                    libraryLogic.printMembers();
                    break;
                case 10://edit member
                    libraryLogic.editMember();
                    break;
                case 11://search for member
                    libraryLogic.lookupMember();
                    break;
                case 12://add issue
                    libraryLogic.addTransaction();
                    break;
                case 13:// return book
                    libraryLogic.returnBook();
                    break;
                case 14://print issues
                    libraryLogic.printTransactions();
                    break;
                case 15:// extend duedate
                    libraryLogic.extendBook();
                    break;
                case 16://save
                    libraryLogic.writeBook();
                    libraryLogic.writeMember();
                    libraryLogic.writeTransaction();
                    break;
                case 17://load
                    libraryLogic.readBook();
                    libraryLogic.readMember();
                    libraryLogic.readTransaction();
                    break;
                case 18://exit
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
        System.out.println("| 6. Show Categories|");
        System.out.println(" --- --Members-- ---");
        System.out.println("| 7. Add Member     |");
        System.out.println("| 8. Remove Member  |");
        System.out.println("| 9. All Members    |");
        System.out.println("| 10. Edit Member   |");
        System.out.println("| 11. Lookup Member |");
        System.out.println(" --- ---Issue--- ---");
        System.out.println("| 12. Issue Book    |");
        System.out.println("| 13. Return Book   |");
        System.out.println("| 14. All Issues    |");
        System.out.println("| 15. Extend        |");
        System.out.println(" --- --- --- --- ---");
        System.out.println("  16. Save          ");
        System.out.println("  17. Load          ");
        System.out.println("  18. Exit");
        System.out.print("Your choice: ");
    }
}

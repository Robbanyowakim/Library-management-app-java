package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Main myApp = new Main();
        LibraryLogic libraryLogic = new LibraryLogic();


        ArrayList <String> b1 = new ArrayList<>();
        b1.add("J.K Rowling");
        ArrayList <String> b2 = new ArrayList<>();
        b2.add("Suzanne Collins");
        ArrayList <String> b3 = new ArrayList<>();
        b3.add("Veronica Roth");
        ArrayList <String> b4 = new ArrayList<>();
        b4.add("Stephenie Meyer");


        libraryLogic.bookList.add( new Book ("0-2323-2434-7","Harry Potter and the order of the phoneix", 800,"English","Bloomsburgy",b1,"Fantasy"));
        libraryLogic.bookList.add(new Book ("0-4453-3412-6","The Hunger Games",578,"English","Scholastic Press",b2, "Science Fiction"));
        libraryLogic.bookList.add(new Book ("0-5846-6782-1","Divergent",757,"English","Katherine Tegen Books",b3,"Science Fiction"));
        libraryLogic.bookList.add(new Book ("0-2321-1231-4","Twilight",231,"English","Brown and Company",b4, "Fantasy"));

        libraryLogic.memberList.add(new Member("890821-6584","Bobby Svensson","Trävägen 25","0726378763"));
        libraryLogic.memberList.add(new Member("950103-9751","Fillip Sten","Motorvägen 67","0707999599"));
        libraryLogic.memberList.add(new Member("770417-5571","Olivia Persson","Kungensväg 1","0700272755"));
        libraryLogic.memberList.add(new Member("991212-9132","Sara von Ascheberg","Pajasvägen 1","0715717811"));

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
                    libraryLogic.editBook();
                    break;
                case 6:
                    libraryLogic.showCategories();
                    break;
                case 7:
                    libraryLogic.addMember();
                    break;
                case 5:
                    libraryLogic.searchBook();
                    break;
                case 8:
                    libraryLogic.printMembers();
                    libraryLogic.removeMember();
                    break;
                case 9:
                    libraryLogic.printMembers();
                    break;
                case 10:
                    libraryLogic.editMember();
                    break;
                case 11:
                    libraryLogic.lookupMember();
                    break;
                case 12:
                    libraryLogic.addTransaction();
                    break;
                case 13:
                    libraryLogic.returnBook();
                    break;
                case 14:
                    libraryLogic.printTransactions();
                    break;
                case 15:
                    libraryLogic.extendBook();
                    break;
                case 16:
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
        System.out.println("  16. Exit");
        System.out.print("Your choice: ");
    }
}

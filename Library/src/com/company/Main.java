package com.company;

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
                case 5:
                    libraryLogic.addMember();
                    break;
                case 6:
                    libraryLogic.printMembers();
                    libraryLogic.removeMember();
                    break;
                case 7:
                    libraryLogic.printMembers();
                    break;
                case 8:
                    libraryLogic.editMember();
                    break;
            }

        } while (loop == 0);
    }
    private void menu (){
        System.out.println(" --- ---Books--- ---");
        System.out.println("| 1. Add Book       |");
        System.out.println("| 2. Remove Book    |");
        System.out.println("| 3. All Books      |");
        System.out.println("| 4. Edit Book      |");
        System.out.println(" --- --Members-- ---");
        System.out.println("| 5. Add Member     |");
        System.out.println("| 6. Remove Member  |");
        System.out.println("| 7. All Members    |");
        System.out.println("| 8. Edit Member    |");
        System.out.println(" --- --- --- --- ---");
    }
}

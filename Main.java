package kiosk;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FoodKiosk foodKiosk = new FoodKiosk();
        System.out.println("FAST FOOD STORE 에 오신걸 환영합니다.\n" +
                           "아래 메뉴판을 보시고 메뉴를 골라 입력해주세요");
        System.out.println(" ");
        foodKiosk.MainMenu();
        System.out.println(" ");

        while (true) {

            System.out.print("번호를 고르세요 (1-5): ");
            System.out.println(" ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            if (choice == 1) {
                foodKiosk.processChoice(choice);
                break;
            } else if (choice == 2) {
                foodKiosk.processChoice(choice);
                break;
            } else if (choice == 3) {
                foodKiosk.processChoice(choice);
                break;
            } else if (choice == 4) {
                foodKiosk.processChoice(choice);
                break;
            } else if (choice == 5) {
                foodKiosk.processChoice(choice);
                break;
            } else if (choice == 0) {
                System.out.println("FAST FOOD STORE 를 이용해주셔서 감사합니다!");
                break;
            } else {
                foodKiosk.processChoice(choice);
            }
            scanner.close();
        }
    }
}


//  if (choice == 1) {
//          System.out.println("FAST FOOD STORE 를 이용해주셔서 감사합니다!");
//          break;
//          } else {
//          foodKiosk.processChoice(choice);


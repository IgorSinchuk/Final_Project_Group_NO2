
import java.util.InputMismatchException;
import java.util.Scanner;


public class MyStack {
    public static void main(String[] args) {

        boolean forStart = false;
        boolean rateApp = false;

        Stack mystack = new Stack(100);

        System.out.println("Hi! You now in Group #2 Final Project, and u see LIFO(Stack) realization");
        System.out.println("NOTICE: In the end pls rate this small but created with many love project :)");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Here u see detailed instruction, later it will be short variant. Pls read all description...");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Insert number for choose u need: ");
        System.out.println("Enter '1' for add new item (we use ony numbers)");
        System.out.println("Enter '2' for delete last added item (in LIFO first item)");
        System.out.println("Enter '3' if u want 2 see top item in Stack");
        System.out.println("Enter '4' to stop this madness");

        while (!forStart) {

            try {
                System.out.println("Choose: ");
                System.out.print("| '1'  add |");
                System.out.print(" '2'  delete |");
                System.out.print(" '3' top item |");
                System.out.println(" '4' stop |");

                Scanner scanner = new Scanner(System.in);
                int choose = scanner.nextInt();

                if (choose == 1) { // Добавляем элемент в начало
                    mystack.addElement();
                    System.out.println("Number '" + mystack.readTop() + "' added successful");
                }

                if (choose == 2) { // Удаляем первый элемент
                    int e = mystack.deleteElement();
                    System.out.println("Delete: " + e);
                    System.out.println("Now top item is: " + mystack.readTop());
                }
                if (choose == 3) { // Показ первого элемента
                    System.out.println("Top item is: " + mystack.readTop());
                }

                if (choose == 4) { // Выходим из цикла
                    forStart = true;
                }
            } catch (InputMismatchException inputException) {
                System.out.println("Error! Please enter an integer number");
            }

        }

        while (!rateApp) {

            try {
                System.out.println("Please rate our work, where 0 - the Worstest number and 10 - Bestest number");
                Scanner rated = new Scanner(System.in);
                int rate = rated.nextInt();
                System.out.println("Your rate is: " + rate);

                if (rate == 10) {
                    System.out.println("Thanks! It`s very big pleasure to have time with you! :)");
                    rateApp = true;
                }

                if (rate < 10) {
                    System.out.println("Pls leave a comment for u rate");
                    Scanner comment = new Scanner(System.in);
                    String comments = comment.nextLine();
                    System.out.println("Pls save the screenshot with your comment and send us in skype. GL! ");
                    System.out.println("Comment: " + comments);
                    rateApp = true;
                }

            }catch (InputMismatchException inputException) {
                System.out.println("Error! Please enter an integer number");
            }
        }
    }
}
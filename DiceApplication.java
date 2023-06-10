import java.util.Scanner;

class DiceApplication{
    public static void main(String[] args){
        System.out.println("What is your name?");
        System.out.print("> ");
        Scanner sc1 = new Scanner(System.in);
        String name = sc1.next();
        System.out.println("Hello, " + name + "!");
        System.out.println("Rolling dice...");
        System.out.print("Die 1:");
        Scanner sc2 = new Scanner(System.in);
        int n1 = sc2.nextInt();
        System.out.print("Die 2:");
        int n2 = sc2.nextInt();
        int sum = n1 + n2;
        System.out.println("Total value: " + sum);
        if(sum > 7){
            System.out.println("You won");
        }
        else System.out.println("You lost");
    }
}
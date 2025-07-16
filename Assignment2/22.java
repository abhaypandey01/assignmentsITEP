import java.util.Scanner;
class Main {
    public static void main(String args[]){
        int length, wide, deep;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length:");
        length = sc.nextInt();
        System.out.println("Enter wide:");
        wide = sc.nextInt();
        System.out.println("Enter deep:");
        deep = sc.nextInt();
        int capacity = length*wide*deep;
        System.out.println("The capacity of pond is "+capacity+" cubic meters");
    }
}
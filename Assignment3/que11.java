import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = sc.nextInt();
        System.out.println("Enter Sex( M or F):");
        String inputstr = sc.next().toUpperCase();
        char gender = inputstr.charAt(0);
        System.out.println("Enter marrital status (Y or N):");
        String inputstr2 = sc.next().toUpperCase();
        char status = inputstr2.charAt(0);

        if(gender == 'F'){
            System.out.println("You will work in urban areas.");
        } else{
            if((age >= 40) && (age < 60)){
                System.out.println("You will work in any location.");
            } else if((age >= 20) && (age < 40)){
                System.out.println("You will work in urban areas.");
            } else {
                System.out.println("");
            }
        }
    }
}
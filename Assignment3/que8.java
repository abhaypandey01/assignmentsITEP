import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Total classes held.");
        float held = sc.nextFloat();
        System.out.println("Total classes attended.");
        float attended = sc.nextFloat();
        System.out.println("State medical cause (Y or N):");
        String inputStr = sc.next().toUpperCase();
        char ch = inputStr.charAt(0);

        if(attended > held){
            System.out.println("Invalid input");
        } else {
            float percent = (attended/held)*100.0f;

            if(percent > 75){
                System.out.println("Allowed to attend exam.");
            } else {
                if(ch == 'Y'){
                    System.out.println("Allowed to attend exam.");
                } else {
                    System.out.println("Not allowed to attend exam.");
                }
            }

        }
    }
}
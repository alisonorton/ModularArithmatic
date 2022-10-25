import java.util.Scanner;

public class ModularArithmaticPt1 {
    public static void main(String[] args){

       Scanner s = new Scanner(System.in);

       String message = s.nextLine();
       int k = s.nextInt();
       s.close();

       String output = "";

       for(int i = 0; i < message.length(); i++){
        if(message.charAt(i) != ' '){
            char letter = message.charAt(i);
            int n = (int)letter - 65;
            System.out.println("Step 1: " + n);
            int newIndex = Math.floorMod((n + k), 26);
            System.out.println("Step 2: " + newIndex);
            output += (char)(newIndex + 65);
        }
        else{
            output += " ";
        }
            
       }
       System.out.println(output);
    }
}

import TerminalIO.*;
public class IfReview {

    public static void main(String[] args) {
        KeyboardReader k = new KeyboardReader();
        int num = k.readInt("Enter a number: ");
        
        if (num > 7){
            System.out.println("That's a high number, I will take it down");
            num-=2;
        }
            
        else if (num< 7){
            System.out.println("That's a low number, I will bring it up");
            num+=3;
        }
        
        else
            System.out.println("Number is just right");
        
        //////////////////////
        System.out.println("Your number is now: " + num);
        
        //computer picks number - we will see who wins
        int rnum= (int)(Math.random()*50) +1; //1 to 50
        System.out.format("Computer got:%d\n", rnum);
        
        //which is bigger? ways
        //way 1 -> if statement
        if(num > rnum) System.out.println("Ther bigger number is " + num);
        else System.out.println("The bigger number is " + rnum);
        
        //way2 -> Math Class
        int bigger = Math.max(num, rnum);
        System.out.println("The bigger number is: " + bigger);
        
        //way 3
        bigger = (num > rnum)? num:rnum;  // (question)? yes:no
        System.out.println("The bigger number is: " + bigger);
        
        int mark = 71;
        System.out.println("You did " + ((mark>70)? "Awesome":"Crappy"));
        
        
    }
    
}

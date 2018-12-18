import TerminalIO.*;
public class MovieTicket {

    
    public static void main(String[] args) {
        KeyboardReader k = new KeyboardReader();
        //matinee = 5, tuesday = $4, other -> 8 child, 10 adult
        
        int age;
        char day;
        double price;
        //force user to enter m, t, or o
        
        while (true){
            day=k.readChar("Enter \"m\" for matinee, \"t\" for Tuesday, or \"o\" for other > " );
            if (day == 'm' || day=='t' || day=='o') break;
            System.out.println("Error - try again, must be m, t, or o");
        }
        if(day=='m') price=5;
        else if (day=='t') price=4;
        else{
            do{
                age = k.readInt("Enter age from from 1 to 99 > ");
            }while(age<1 || age>99);
            price = (age < 18)? 8:10;
        }
        System.out.format("The price will be: $%.2f\n", price);
        
        
        
    }
    
}


public class LoopReview {

    
    public static void main(String[] args) {
        for (int i = 1; i <=10; i++) {
            System.out.println("Number is " + i);
        }
        for (double temp = 20; temp >= 10; temp-=0.5) {
            System.out.print("Temperature is " + temp);
            System.out.println("\tIt is " + ((temp>=15)? "Warm":"Cold") + " out.");
        }
        
        //while loop -> 3 versions
        //computer keeps going until they get a 7
        int tries=0;
        int cnum;
        while (true){
            cnum = (int)(Math.random() * 20) + 1;
            tries++;
            System.out.format("Try %d -> Got a %d\n", tries,cnum);
            if (cnum==7)break;
        }
        System.out.println("Game Over");
        cnum=tries=0;
        
        while(cnum!=7){
            cnum = (int)(Math.random() * 20) + 1;
            tries++;
            System.out.format("Try %d -> Got a %d\n", tries,cnum);
        }
        System.out.println("Game Over");
        cnum=tries=0;
        
        do{
            cnum = (int)(Math.random() * 20) + 1;
            tries++;
            System.out.format("Try %d -> Got a %d\n", tries,cnum);
        }while(cnum !=7);
        
        
    }
    
}

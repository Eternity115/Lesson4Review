import BreezySwing.Format;
public class PopulationGrowth {

    public static void main(String[] args) {
        /*
        Barrie has 140,000 people
        What will it be in 100 years at a 3% growth rate every decade (10 years)?
        */
        double pop=140000;
        double growth;
        System.out.print(Format.justify('r', "YEAR", 6)); //align left l/r/c, display thing, width
        System.out.print(Format.justify('c', "POPULATION", 20)); 
        System.out.print(Format.justify('c', "GROWTH", 20)); 
        System.out.println(Format.justify('c', " NEW POPULATION", 20)); 
        for (int year = 2018; year <= 2118; year+=10) {
            System.out.print(Format.justify('r', year, 6));
            System.out.print(Format.justify('c', pop, 20,0)); //align left l/r/c, display thing, width, decimal places
            growth = (pop* 0.03); //cast to int
            System.out.print(Format.justify('c', growth, 20,0)); 
            pop+=growth;
            System.out.println(Format.justify('c', pop, 20,0)); //don't need extra parameter for ints
        }
        
        
    }
    
}

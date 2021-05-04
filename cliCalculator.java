import java.io.Console;

public class cliCalculator{
    public static void main(String[] args) {
        
        Console cons = System.console();

        while(true){

            String str1 = cons.readLine("Enter number 1 : ");
            String str2 = cons.readLine("Enter number 2 : ");
    
            double no1 = Double.parseDouble(str1);
            double no2 = Double.parseDouble(str2);
    
            String options = cons.readLine("Additon - 1 || Substraction - 2 || Multiplication - 3 || Division - 4 : ");
    
            double answer = 0.0;
            
            if (options.equals("1")) 
            answer = no1+no2;
    
            if (options.equals("2")) 
            answer = no1-no2;
    
            if (options.equals("3")) 
            answer = no1*no2;
    
            if (options.equals("4")) 
            answer = no1/no2;
            
            System.out.println(answer);
            
            String action = cons.readLine("continue - 1 || exit - 0 : ");

            if (action.equals("0"))
            System.exit(0);

        }

    }
}
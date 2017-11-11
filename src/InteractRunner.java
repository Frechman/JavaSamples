import java.util.Scanner;

/**
    Класс для запуска калькулятора. Поддерживает ввод пользователя.
*/
public class InteractRunner{
    private final static String EXIT = "no";

    public static void main(String[] args) {
        try (Scanner reader = new Scanner(System.in)) {
            Calculator calc = new Calculator();
            String userChoise = "no";
            String saveResult = "no";
            while(EXIT.equals(userChoise)){

                System.out.println("Enter first arg : ");
                String first = reader.next();

                System.out.println("Enter second arg : ");
                String second = reader.next();

                System.out.println("Enter operation: \"-\" or \"+\" or \"*\" or \"/\" : ");
                String operation = reader.next();

                // выбор операций с числами
                switch(operation){
                case "+":
                    calc.add(Integer.valueOf(first), Integer.valueOf(second));
                    break;
                case "-":
                    calc.diff(Integer.valueOf(first), Integer.valueOf(second));
                    break;
                case "*":
                    calc.mult(Integer.valueOf(first), Integer.valueOf(second));
                    break;
                case "/":
                    calc.div(Integer.valueOf(first), Integer.valueOf(second));
                    break;
                }
                System.out.println("Result : " + calc.getResult());

                System.out.println("Do you save result and continue calculating? yes/no");
                saveResult = reader.next();
                if (EXIT.equals(saveResult)){
                    calc.cleanResult();
                    System.out.println("Would you like to exit? yes/no");
                    userChoise = reader.next();             
                } // иначе продолжаем с сохранением результата                  
            }
        }           
    }   
}
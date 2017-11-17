import java.util.Scanner;

/**
 * Класс для запуска калькулятора.
 * Поддерживает ввод пользователя.
 */
public class InteractRunner {
    private final static String EXIT = "no";

    public static void main(String[] args) {
        try (Scanner reader = new Scanner(System.in)) {
            Calculator calc = new Calculator();
            String userChoise = "no";
            while (EXIT.equals(userChoise)) {

                System.out.println("Enter first arg : ");
                String first = reader.next();

                System.out.println("Enter second arg : ");
                String second = reader.next();

                System.out.println("Enter operation: \"-\" or \"+\" or \"*\" or \"/\" : ");
                String operation = reader.next();

                calc.calculating(Integer.valueOf(first), Integer.valueOf(second), operation);

                System.out.println("Result : " + calc.getResult());

                System.out.println("Do you save result and continue calculating? yes/no");
                userChoise = reader.next();
                if (EXIT.equals(userChoise)) {
                    calc.cleanResult();
                    System.out.println("Would you like to exit? yes/no");
                    userChoise = reader.next();
                } // иначе продолжаем не очищая результат
            }
        }
    }

    /**
     Метод запрашивает у пользователя ввод.
     */
    /* private String userInput(){
        String userNumber;
        try(Scanner scan = new Scanner(System.in)){
            userNumber = scan.next();
        }
        return userNumber;
    } */


    /**
     Сохранение результата
     */
    /* public boolean isSaveResult(String userChoise){
        private saveResult = false;
        System.out.println("Do you save result ? yes/no");
        try(Scanner scan = new Scanner(System.in)){
            String = 
            if(EXIT.equals(userChoise)){
                
            }
            
        }
        
        return true;
    } */
}
/**
    Класс реализует калькулятор.
*/
public class Calculator{
    /**
        Результат вычисления.
    */
    private int result;

    /**
        Суммируем аргументы.
        @param params Аргументы суммирования.
    */
    public void add(int ... params){
        for (Integer param : params){
            this.result += param;
        }
    }

    /**
        Суммируем аргументы.
        @param params Аргументы суммирования.
    */
    public void diff(int ... params){
        if(this.result != 0 ){      
            for (Integer param : params){
                this.result -= param;
            }
        } else {
            int tempResult = params[0];
            for(int i = 1; i < params.length; i++){
                tempResult -= params[i];
            }
            this.result = tempResult;
        }
    }

    /**
        Умножение аргументов.
        @param params Аргументы умножения.
    */
    public void mult(int ... params){
        if (this.result == 0){
            this.result = 1;
        }
        for (Integer param : params){
            this.result *= param;
        }
    }

    /**
        Деление аргументов.
        @param params Аргументы умножения.
    */
    public void div(int ... params){    
        try{
            if(this.result != 0){
                for (Integer param : params){
                    this.result /= param;
                }
            } else {
                int tempResult = params[0];
                    for(int i = 1; i < params.length; i++){
                        tempResult /= params[i];
                    }
                    this.result = tempResult;
            }
        } catch (Exception ArithmeticException){
            System.out.println("Деление на нуль запрещено! / Divide by zero!");
            cleanResult();
        }
    }

    /**
        Получить результат.
        @return результат вычисления.
    */
    public int getResult(){
        return this.result;
    }

    /**
        Сохранить/задать результат.
        @return результат вычисления.
    */
    public void setResult(int userResult){
        this.result = userResult;
    }
    /**
        Очистить результат вычисления.
    */
    public void cleanResult(){
        this.result = 0;
    }
}
package Calculator;

public class StateAnswer extends State {
    void clear(Context context) {
        context.state = new StateX();
        context.state.clear(context);
    }

    void digit(Context context, char key) {
        context.state = new StateX();
        context.state.digit(context,key);
    }

    void arifm(Context context, char key) {
        context.state = new StateAction();
        context.state.arifm(context,key);
    }

    void equal(Context context) {
        int answer = 0;
        switch (context.o){
            case '+' : answer = context.x + context.y;
                break;
            case '-' : answer = context.x - context.y;
                break;
            case '*' : answer = context.x * context.y;
                break;
            case '/' : answer = context.x / context.y;
                break;
        }
        context.x = answer;
    }
}

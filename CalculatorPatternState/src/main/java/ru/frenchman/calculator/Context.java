package ru.frenchman.calculator;

public class Context {
    int x;
    int y;
    char o;
    State state;

    public Context() {
        state = new StateX();
        state.clear(this);
    }

    public void press(char key) {

        switch (key) {
            case 'c':
            case 'C':
                state.clear(this);
                break;
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                state.digit(this, key);
                break;
            case '+':
            case '-':
            case '*':
            case '/':
                state.arifm(this, key);
                break;
            case '=':
                state.equal(this);
            default:
                break;
        }
    }


    public int run(String keys) { //"C2+3="
        for (char key : keys.toCharArray()) {
            press(key);
        }
        return x;
    }

    @Override
    public String toString() {
        return "x = " + x + " y = " + y + " op = " + o + " state = " + state.getClass().getName();
    }
}

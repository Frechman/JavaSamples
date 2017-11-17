class Calculate {
    public static void main(String[] args) {
        System.out.println("Calculate....");

        int first = Integer.valueOf(args[0]);
        int second = Integer.valueOf(args[1]);

        int summ = first + second;
        int diff = first - second;
        int mult = first * second;
        double devideFirstOnSecond = first / second;
        double devideSecondOnFirst = second / first;
        double powFirst = first * first;
        double powSecond = second * second;

        System.out.println("summ = " + summ);
        System.out.println("diff = " + diff);
        System.out.println("mult = " + mult);
        System.out.println("devideFirstOnSecond = " + devideFirstOnSecond);
        System.out.println("devideSecondOnFirst = " + devideSecondOnFirst);
        System.out.println("powFirst = " + powFirst);
        System.out.println("powSecond = " + powSecond);

        int result = powFirstOnSecond(first, second);
        System.out.println("„исло " + first + " в степени " + second + " равно = " + result);
        result = powerFirstToSecond(second, first);
        System.out.println("„исло " + second + " в степени " + first + " равно = " + result);

    }

    public static int powerFirstToSecond(int first, int second) {
        int result = 1;
        for (int i = 0; i < second; i++)
            result *= first;
        return result;
    }

    public static int powFirstOnSecond(int first, int second) {
        if (second == 1) return first;
        else
            return first *= powFirstOnSecond(first, second - 1);
    }
}
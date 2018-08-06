package ru.frechman.exercises.stepikAlt;

import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;

public class FunctionTask {

    public static void main(String[] args) {
        combine();
    }

    public static void combine() {
        IntUnaryOperator mult2 = num -> num * 2;
        IntUnaryOperator add3 = num -> num + 3;

        IntUnaryOperator combinedOperator = add3.compose(mult2.andThen(add3)).andThen(mult2);
        int result = combinedOperator.applyAsInt(5);
        System.out.println(result);
    }

    public static IntPredicate disjunctAll(List<IntPredicate> predicates) {
        return predicates.stream().reduce(IntPredicate::or).get();
    }

}

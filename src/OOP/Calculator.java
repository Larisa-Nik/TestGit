package OOP;

public class Calculator {
    public static void main(String [] args) {
        Calculator calculator = new Calculator(); // створюємо обьект калькулятор
        //все зробити за допомогою методів шо є знизу
        //на приклад - знайти сумму з 2 і 3
        int sum = calculator.plus(2, 3); // використовуємо метод plus(int a, int b) щоб знайти суму
        System.out.println("sum2_3 = " + sum);

                //найти суму чисел 1, 2, 3, 4, 5, 6, 7, 8, 9
        sum = calculator.plus(sum,4);
        System.out.println("sum = " + sum);
        sum= calculator.plus(sum,5);
        System.out.println("sum = " + sum);
        sum=calculator.plus(sum,6);
        System.out.println("sum = " + sum);
        sum=calculator.plus(sum,7);
        System.out.println("sum = " + sum);
        sum=calculator.plus(sum,8);
        System.out.println("sum = " + sum);
        sum=calculator.plus(sum,9);
        System.out.println("sum = " + sum);



        //найти мінімум з чисел 1, 2, 3, 4, 5, 6, 7, 8, 9
        int min=calculator.min(1,2);
        System.out.println("min = " + min);
        min=calculator.min(min,3);
        System.out.println("min = " + min);
        min=calculator.min(min,4);
        System.out.println("min = " + min);
        min=calculator.min(min,5);
        System.out.println("min = " + min);
        min=calculator.min(min,6);
        System.out.println("min = " + min);
        min=calculator.min(min,7);
        System.out.println("min = " + min);
        min=calculator.min(min,8);
        System.out.println("min = " + min);
        min=calculator.min(min,9);
        System.out.println("min = " + min);

        //найти максимум з чисел 1, 2, 3, 4, 5, 6, 7, 8, 9
        int max=calculator.max(1,2);
        System.out.println("max = " + max);
        max=calculator.max(max,3);
        System.out.println("max = " + max);
        max=calculator.max(max,4);
        System.out.println("max = " + max);
        max=calculator.max(max,5);
        System.out.println("max = " + max);
        max=calculator.max(max,6);
        System.out.println("max = " + max);
        max=calculator.max(max,7);
        System.out.println("max = " + max);
        max=calculator.max(max,8);
        System.out.println("max = " + max);
        max=calculator.max(max,9);
        System.out.println("max = " + max);

        //відняти від суми 2 і 10 мінімум з 5 і 12
        sum=calculator.plus(2,10);
        min=calculator.min(5,12);
        int minus=calculator.minus(sum,min);
        System.out.println("minus = " + minus);
        //помножити різницю 12 і 7 на суму 3, 4, 5
        minus=calculator.minus(12,7);
        sum=calculator.plus(3,4);
        sum=calculator.plus(sum,5);
        int multiply=calculator.multiply(minus,sum);
        System.out.println("multiply = " + multiply);

        //помножити результат множення 12 і 7 на мінімальне з 2,3,4 і 5,6,7
        multiply=calculator.multiply(12,7);
        min=calculator.min(2,3);
        min=calculator.min(min,4);
        int min1=calculator.min(5,6);
        min1=calculator.min(min1,7);
        min=calculator.min(min,min1);
        multiply=calculator.multiply(multiply,min);
        System.out.println("multiply = " + multiply);



    }

    private int min(int a, int b) {
        if (a >= b) {
            return b;
        } else {
            return a;
        }
    }

    private int max(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }

    private int plus(int a, int b) {
        return a + b;
    }

    private int minus(int a, int b) {
        return a - b;
    }

    private int multiply(int a, int b) {
        return a * b;
    }


}

package sample02;

/**
 * Calculation
 */
public class Calculation {

    public void calc() {
        for (int i = 1; i <= 9; i++) calc(i);
    }

    public void calc(int value) {
        System.out.println("***** [" + value + "] *****");
                
        for (int j = 1; j <= 9; j++) System.out.println(value + " * " + j + " = " + value * j);
    }
}
package sample03;

/**
 * Calculation
 */
public class Calculation {

    public void calc() {
        for (int i = 1; i <= 9; i++) calc(i);
    }

    public void calc(int param) {
        System.out.println(getTitle(param));
                
        for (int i = 1; i <= 9; i++) {
            System.out.println(getContent(param, i));
        }
    }

    public String getTitle(int param) {
        return "***** [" + param + "] *****";
    }

    public String getContent(int i, int j) {
        return i + " * " + j + " = " + i * j;
    }
}
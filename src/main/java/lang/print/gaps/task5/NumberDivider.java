package lang.print.gaps.task5;

public class NumberDivider {
    void divide(int toBeDivided) {
        float result = (float) toBeDivided / 5;
        System.out.println(result);
    }

    public static void main(String[] args) {
        NumberDivider divider = new NumberDivider();
        divider.divide(19);
    }
}

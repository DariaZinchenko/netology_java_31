public class Mile {
    public static void main (String[] args) {
        int amountInKopecks = 253043;
        int coefficient = 20*100;
        int miles = calculateMiles(amountInKopecks, coefficient);
        System.out.println("Стоимость билета = " + amountInKopecks);
        System.out.println("Начисленные мили = " + miles);
    }

    public static int calculateMiles (int amountInKopecks, int coefficient) {
        return amountInKopecks/coefficient;
    }
}

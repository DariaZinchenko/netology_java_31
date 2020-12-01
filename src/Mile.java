public class Mile {
    public static void main (String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000; //цена указывается в копейках
        int miles = service.calculate(price);
        System.out.println(miles);
    }
}

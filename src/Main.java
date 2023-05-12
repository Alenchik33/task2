public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightKg = 98;
        double heightInMeters = 1.87;
        int result = service.calculate(weightKg, heightInMeters);
        System.out.println("Ваш индекс массы тела:" + result);
    }
}

public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        double mass = 65.0;
        double height = 1.65;
        double bmi = service.calculate(mass, height);

        System.out.println("Индекс массы тела: " + bmi);
    }
}
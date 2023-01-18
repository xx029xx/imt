public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        double m = 65.0;
        double h = 1.65;
        double bmi = service.calculate(m, h);

        System.out.println("Индекс массы тела: " + bmi);
    }
}
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double Growth = 1.87;
        double weight = 98;
        int BMI = service.calculate(Growth, weight); // должно получиться 500
        System.out.println(BMI);
    }
}
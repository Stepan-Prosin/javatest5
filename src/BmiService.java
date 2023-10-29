public class BmiService {
    public int calculate(double meters, double kg) {
        int index = (int) (kg / Math.pow(meters, 2));
        return index;
    }
}

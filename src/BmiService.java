public class BmiService {
    public  int calculate(double meters, double Kg) {

        int index = (int)(Kg / Math.pow(meters,2));

        return index;
    }
}

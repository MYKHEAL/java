package ArithmeticOperation;
public class Addition extends ArithmeticOperation{
    public Addition(double... digits) {
        super(digits);
    }
    @Override
    public double operations() {
        if (operands.length == 0) return 0;
        double result = operands[0];
        for(int count = 0; count < operands.length; count++){
            result += operands[count];
        }
        return result;
    }
}
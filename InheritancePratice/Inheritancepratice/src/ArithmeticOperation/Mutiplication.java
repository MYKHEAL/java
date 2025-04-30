package ArithmeticOperation;
public class Mutiplication extends ArithmeticOperation{
    public Mutiplication(int num, int denom) {
        super(num, denom);
    }

    @Override
    public double operations() {
        if(operands.length == 0)return 0;
        double result = operands[0];
        for(int count = 1; count < operands.length; count++){
            result *= operands[count];
        }
        return result;
    }
}
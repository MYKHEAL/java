package ArithmeticOperation;
public class Division extends ArithmeticOperation {
    public Division(double ... digits) {
        super(digits);
    }

    @Override
    public double operations(){
        if(operands.length == 0)return 0;
        double result = operands[0];
        for(int count = 1; count < operands.length; count++){

            result /= operands[count];
        }
        return result;
    }
}
package ArithmeticOperation;
public class RaisetoPower extends ArithmeticOperation {
    public RaisetoPower(int num, int denom) {
        super(num, denom);
    }

    @Override
    public double operations() {
        if (operands.length == 0) return 0;
        double nume = operands[0];
        double denom = operands[1];
        if (operands.length == 2) {
            return Math.pow(nume, denom);
        }
        return 0;

    }
}
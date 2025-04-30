package ArithmeticOperation;
public abstract class ArithmeticOperation{
    protected double[] operands;
    public ArithmeticOperation(double ... digits){
    this.operands = digits;

    }

    public abstract double operations();

    public double[] getOperands(){
        return operands;
    }

}
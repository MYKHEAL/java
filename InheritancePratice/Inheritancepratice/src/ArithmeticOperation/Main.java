package ArithmeticOperation;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        ArithmeticOperation add = new Addition(1, 3, 4, 5, 6, 7, 8, 9, 5, 6, 7);
        System.out.println("for addition:" + add.operations());


        ArithmeticOperation minus = new Subtraction(100,50);
        System.out.printf("subtraction: %.2f\n", minus.operations());

        ArithmeticOperation multiply = new Mutiplication(150000, 2);
        System.out.printf("multiplication: %.2f\n", multiply.operations());


        ArithmeticOperation divide = new Division(10, 2);
        System.out.printf("division: %.2f\n", divide.operations());
    }
}
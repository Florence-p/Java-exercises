package Inheritance.MultiLevel;

public class CalcMain {
    public static void main(String[] args){
        Calculator calc = new Calculator();
        AdvCalc advCalc = new AdvCalc();
        int n1 = calc.add(4, 5);
        int n2 = calc.sub(3, 3);
        int n3 = advCalc.mult(3,3);
        int n4 = advCalc.div(6,2);
        System.out.println(n1 + " " + n2 + " " + n3 + " " + n4);
    }
}

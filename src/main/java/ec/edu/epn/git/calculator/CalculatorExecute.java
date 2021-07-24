package ec.edu.epn.git.calculator;

public class CalculatorExecute {
    public static void  main(String[] args){
        System.out.println("Ejecución de la Calculadora");

        Calculator c= new Calculator();
        int addition= c.addition(5,6);
        System.out.println("c.addition(5,6)"+addition);

        int subtraction= c.subtraccion(8,6);
        System.out.println("c.subtraccion(8,6)"+subtraction);
    }
}

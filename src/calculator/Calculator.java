/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author User
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    
    public int add(int i, int j) {
        return i + j;
    }
    
    public int sub(int i, int j) {
        return i - j;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Calculator calculate = new Calculator();
        System.out.println("Addition(5 + 5): " + calculate.add(5, 5));
        System.out.println("Substraction(5 - 5): " + calculate.add(5, 5));
    }
    
}

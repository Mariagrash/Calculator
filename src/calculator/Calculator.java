
package calculator;

import calculator.*;
        
public class Calculator {

    public static void main(String[] args) {
        Sum c = new Sum();
        Difference d = new Difference();
        Product e = new Product();
        Quotient f = new Quotient();
        Input g = new Input();
        double elias = g.grasya();
        double grace = g.grasya();
        
        
        System.out.println(c.addition(elias, grace));
        System.out.println(d.subtraction(elias, grace));
        System.out.println(e.multiply(elias, grace));
        System.out.println(f.division(elias, grace));
        
    }
    
}

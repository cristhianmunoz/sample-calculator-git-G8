package ec.edu.epn.git.calculator;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(value=Parameterized.class)
public class CalculatorParametersTest {
    private int a,b,expected;

    @Parameterized.Parameters
    public static Iterable<Object[]> parameters(){
        List<Object[]> objects= new ArrayList<Object[]>();
        objects.add(new Object[]{2,4,6});
        objects.add(new Object[]{9,8,17});
        objects.add(new Object[]{7,5,12});
        objects.add(new Object[]{6,4,10});
        objects.add(new Object[]{6,8,14});
        objects.add(new Object[]{6,11,17});
        return objects;
    }

    public CalculatorParametersTest(int a, int b, int expected){
        this.a=a;
        this.b=b;
        this.expected=expected;
    }

    @Test
    public void given_parameters_when_add_then_ok(){
        Calculator c=new Calculator();
        int actual= c.addition(a,b);
        assertEquals(expected,actual);
    }


}

package testMaven;

import org.testng.Assert;
import org.testng.annotations.Test;

public class sum2 {

@Test
public void sum1(){
	System.out.println("the sum method");
int a=10;
int b=20;
	Assert.assertEquals(a+b, 30);
}


@Test
public void sub(){
	System.out.println("the sub method");
int a=10;
int b=20;
	Assert.assertEquals(b-a, 10);

}
@Test
public void mul(){
	System.out.println("the mul method");
int a=10;
int b=20;
	Assert.assertEquals(a*b, 200);
}

}

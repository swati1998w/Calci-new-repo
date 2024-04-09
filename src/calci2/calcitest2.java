package calci2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calcitest2 {

	@Test
    public void calTest() {
    	assertEquals(31, calculator.add(11, 20));
    }
	
    @Test
    public void calTestSub() {
    	assertEquals(30, calculator.sub(50, 20));
    }
    
    @Test
    public void calTestMul() {
    	assertEquals(30, calculator.mul(6, 5));
    }
    
    @Test
    public void calTestDiv() {
    	assertEquals(6, calculator.div(30, 5));
    }

	

}



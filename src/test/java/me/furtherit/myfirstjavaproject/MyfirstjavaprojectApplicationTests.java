package me.furtherit.myfirstjavaproject;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyfirstjavaprojectApplicationTests {

	@Test
	void contextLoads() {
		int var1 = 3;
        int var2 = 3;
       
        assert(var1 == var2);
    
	}
	
	@Test
	void prueba1(){
        assert(true);
    
	}


}

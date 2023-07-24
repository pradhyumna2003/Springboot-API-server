package com.apispringappdb.apispringappdb;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class ApispringappdbApplicationTests {

	@Value("${db_url}")
    private String dburl;
	


	

	@Test
	void testApplicatiion(){
		int i=0;
		assertEquals(0, i, 0, "hell0");
	}

	@Test
	void mockTest(){
		int i=0;
		assertEquals(0, i, 0, "hell0");
	}

}

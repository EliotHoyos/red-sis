package pe.com.red.sis.red_sis;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class RedSisApplicationTests {

	@Test
	void contextLoads() {
	}

}

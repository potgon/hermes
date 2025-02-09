package dev.potgon.Hermes;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest(classes = HermesApplication.class)
class HermesApplicationTests {

	@Test
	void contextLoads() {
	}

}

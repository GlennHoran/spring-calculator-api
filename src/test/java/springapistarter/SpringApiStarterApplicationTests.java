package springapistarter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringApiStarterApplicationTests {

	@Test
	public void testSum() {

		CalculatorController c  = new CalculatorController();
		int num1 = 3;
		int num2 = 6;

		assertThat(num1+num2)
				.isEqualTo(c.add(num1, num2));
	}

}

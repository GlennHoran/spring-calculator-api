package springapistarter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    private static final String template = "Hello, %s!";


    @RequestMapping("/")
    public String helloWorld() {
        return "Hello World";
    }

    @RequestMapping("/sum")
    public int add(@RequestParam(value="num1") int num1, @RequestParam(value="num2") int num2) {
        return num1+num2;
    }
}
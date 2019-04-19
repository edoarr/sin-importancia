package hello;
//EJEMPLO 1
//import java.util.concurrent.atomic.AtomicLong;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//@RestController
//public class GreetingController {
//
//    private static final String template = "Hola, %s!";
//    private final AtomicLong counter = new AtomicLong(); 
//    @RequestMapping("/greeting")
//    public Greeting greeting(@RequestParam(value="name", defaultValue="Perro") String name) {
//        return new Greeting(counter.incrementAndGet(),
//                            String.format(template, name));
//    }    
//}

//EJEMPLO 2
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

//Esta bandera significa que la clase está lista para ser usada por Spring
@RestController
public class HelloController{
	
	@RequestMapping("/")
	public String index() {
		return "Saludos de las botas de Spring, perros";
	}
	
	
	
}















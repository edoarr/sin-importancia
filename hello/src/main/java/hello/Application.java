package hello;
/*EJEMPLO 1

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
*/

/*EJEMPLO 2
 */
import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application{
	
	public static void main(String[] args) {
		//run()lanza la aplicación
		SpringApplication.run(Application.class, args);
	}//fin main
	
	
	//El método CommandLineRunner() fue marcado como Bean
	//esto se ejecuta en la puesta en marcha. Recupera todos los beans creados 
	//por tu aplicación o que se agregaron automáticamente gracias a Spring Boot.
	//Los ordena y los imprime.
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			System.out.println("Vamos a inspeccionar los frijoles proporcionados por las botas de Spring");
			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for(String beanName : beanNames) {
				System.out.println(beanName);
			}//fin for
		};//fin cosa rara
	}//fin CommandLineRunner
	
}//fin clase Application










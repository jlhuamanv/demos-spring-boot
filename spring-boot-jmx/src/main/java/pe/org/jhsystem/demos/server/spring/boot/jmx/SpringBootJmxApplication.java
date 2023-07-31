package pe.org.jhsystem.demos.server.spring.boot.jmx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
@EnableMBeanExport
public class SpringBootJmxApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJmxApplication.class, args);
	}

}

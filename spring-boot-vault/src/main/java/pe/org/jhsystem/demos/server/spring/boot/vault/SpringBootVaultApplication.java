package pe.org.jhsystem.demos.server.spring.boot.vault;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import pe.org.jhsystem.demos.server.spring.boot.vault.config.MyConfiguration;

@SpringBootApplication
@EnableConfigurationProperties(MyConfiguration.class)
public class SpringBootVaultApplication implements CommandLineRunner {

	private final MyConfiguration configuration;
	
	public SpringBootVaultApplication(MyConfiguration configuration) {
		this.configuration = configuration;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootVaultApplication.class, args);
	}
	
	@Override
	public void run(String... args) {

		Logger logger = LoggerFactory.getLogger(SpringBootVaultApplication.class);

		logger.info("----------------------------------------");
		logger.info("Configuration properties");
		logger.info("   example.username is {}", configuration.getUsername());
		logger.info("   example.password is {}", configuration.getPassword());
		logger.info("----------------------------------------");
	}

}

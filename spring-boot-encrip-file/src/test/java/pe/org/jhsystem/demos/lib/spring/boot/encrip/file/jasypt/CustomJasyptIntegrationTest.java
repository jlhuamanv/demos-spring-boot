package pe.org.jhsystem.demos.lib.spring.boot.encrip.file.jasypt;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

import pe.org.jhsystem.demos.lib.spring.boot.encrip.file.SpringBootEncripFileApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootEncripFileApplication.class)
public class CustomJasyptIntegrationTest {

    @Autowired
    ApplicationContext appCtx;

    @Test
    public void whenConfiguredExcryptorUsed_ReturnCustomEncryptor() {
        Environment environment = appCtx.getBean(Environment.class);
        System.out.println(environment.getProperty("encryptedv2.property"));
        assertEquals("Password@3", environment.getProperty("encryptedv3.property"));
    }
	
}

package pe.org.jhsystem.demos.lib.spring.boot.encrip.file.jasypt;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import pe.org.jhsystem.demos.lib.spring.boot.encrip.file.simple.PropertyServiceForJasyptSimple;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JasyptSimpleIntegrationTest {

    @Autowired
    ApplicationContext appCtx;

    @Test
    public void whenDecryptedPasswordNeeded_GetFromService() {
        System.setProperty("jasypt.encryptor.password", "password");
        System.out.println("Llego acá ...");
        PropertyServiceForJasyptSimple service = appCtx.getBean(PropertyServiceForJasyptSimple.class);
        assertEquals("Password@2", service.getProperty());
    }
	
}

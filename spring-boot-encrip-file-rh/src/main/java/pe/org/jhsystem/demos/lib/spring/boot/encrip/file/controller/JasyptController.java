package pe.org.jhsystem.demos.lib.spring.boot.encrip.file.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JasyptController {

    @Value("${spring.datasource.username}")
    private String username;
    
    @Value("${spring.datasource.password}")
    private String password;
    
    @GetMapping("/getValorOriginal")
    public String sendDecryptedValue() {
        return "Username value: " + username + "- Password " + password;
    }
	
}

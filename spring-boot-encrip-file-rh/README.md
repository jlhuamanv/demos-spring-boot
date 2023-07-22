# spring-boot-encrip-file-rh
Una manera muy sencilla de encriptar y luego mostrar los valores originales.

https://access.redhat.com/documentation/es-es/red_hat_fuse/7.9/html/deploying_into_spring_boot/how-to-use-encrypted-property-placeholders-sping-boot#master-password-encrypted-property-placeholders-spring-boot

Los valores a encriptar deben colocarse dentro de DEC(), ejemplo:
spring.datasource.username=DEC(root)
spring.datasource.password=DEC(Password@1)

Comandos:

Encriptar:

mvn jasypt:encrypt -Djasypt.encryptor.password=mypassword

Desencriptar:

mvn jasypt:decrypt -Djasypt.encryptor.password=mypassword

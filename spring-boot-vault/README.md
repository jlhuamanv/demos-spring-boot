# spring-boot-vault
Uso de un servidor de gestion de claves.

https://spring.io/guides/gs/vault-config/

Esta primera version se trabaja con la instalacion local de Hashicorp/Vault

$ vault server --dev --dev-root-token-id="00000000-0000-0000-0000-000000000000"

Se debe de configurar en el path (windows) los parametros de ejecucion del server

$ export export VAULT_TOKEN="00000000-0000-0000-0000-000000000000"
$ export VAULT_ADDR="http://127.0.0.1:8200"

Para registrar/configurar de acuerdo al formato key-value:

$ export export VAULT_TOKEN="00000000-0000-0000-0000-000000000000"
$ export VAULT_ADDR="http://127.0.0.1:8200"

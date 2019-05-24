# ProjetoArquitetural
## Comandos:

 - maven:mvn spring-boot:run


 docker start mongodb
 http://localhost:27017/
 https://medium.com/dockerbr/mongodb-no-docker-dd3b72c7efb7

## Rabbit:
docker run -d -p 16672:15672 -p 5672:5672 -p 25676:25676 rabbitmq:3-management

 - Filas do rabbit: http://localhost:16672/#/queues
 - Swagger: http://localhost:8080/swagger-ui.html
 - Docker: https://www.digitalocean.com/community/tutorials/como-instalar-e-usar-o-docker-no-ubuntu-18-04-pt

## Módulos e Portas
 - Controle de coleta: 8081
 - Controle de Frete: 8082
 - Controle de Faturamento: 8083
 - Controle de Frota: 8084
 - Controle de Logística: 8085
 - Controle de expedição : 8086
 - Controle de Sac: 8087
 - Integrador: 7000

 # Json encomenda:
`{
   "dataHoraRecebimento":"2019-03-20T11:50:15.379Z",
   "destinatario":{
      "bairro":"Centro",
      "celular":"19 99999-9999",
      "cep":"13480-001",
      "cidade":"Limeira",
      "email":"teste@teste.com",
      "logradouro":"R: Tiradentes",
      "nome":"Teste",
      "numero":"123",
      "telefone":""
   },
   "frete":{
      "existeCargaRetorno":true,
      "prioridadeEnvio":"NORMAL",
      "tipoCarga":"GRANEL",
      "pesoKg":"100"
   },
   "nomeOperador":"Fulano",
   "observacao":"",
   "remetente":{
      "bairro":"Centro",
      "celular":"19 98888-8888",
      "cep":"13481-000",
      "cidade":"Campinas",
      "email":"teste2@teste.com",
      "logradouro":"Av: Amoreiras",
      "nome":"João de teste",
      "numero":"123",
      "telefone":"19 3444-4444"
   }
}`


## Comando do mongoDB
docker
- docker-compose up --build  (docker exec -it projetoarquitetural_mongodb_1 mongo)
- Mongo: docker run -d --name mongodb -p 27017:27017 mongo
- docker exec -it mongodb mongo

banco
 - show dbs
 - use controledelogistica
 - db.encomenda.find() (lista documentos)
 - db.encomenda.remove({}) (remove todos documentos)


## KeyCloak
docker run -d -p 9001:8080 keycloak


sudo docker pull keycloak
docker run -d -p 9001:8080 jboss/keycloak


 docker rmi $(docker images -q -f "dangling=true")

 docker run -d --name keycloak_postgres postgres

## Configuração para Debug

 No docker compose acrescentar `-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005` a linha ficará assim : `JAVA_OPTS=-Xmx256m -Xms128m -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005 -Dspring.profiles.active=docker-compose`

 Depois na IDE criar uma configuração remota usando a porta indicada na configuração acima

 obter token:

 curl -X POST http://localhost:9090/auth/realms/logistica/protocol/openid-connect/token -d "grant_type=password&username=teste&password=teste&client_id=logisticaauth"

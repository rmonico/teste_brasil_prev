# Teste do Monico


## Executando o projeto

Para rodar localmente:

`mvn spring-boot:run` (sem docker, já sobe uma instância embarcada do Mongo)


## Escolha das ferramentas

- Java: usando a versão mais recente (java 14). Já trabalhei com Java 12 (usava na Serasa), não deve ter mudado muita coisa, ao final do projeto dou uma olhada nas novidades e vejo se preciso mudar alguma coisa.

- Gestor de dependências: Maven, por ter maior familiaridade do que com Gradle. Embora ache o segundo mais fácil (e mais legível).

- Persistência: Por questões de familiaridade vou usar o MongoDB. E para facilitar o deploy vou usar uma versão embarcada.

## Projeto

### Inicialização

Comecei criando o `pom.xml` do projeto. Apenas precisei mudar a versão do Java para 14, adicionar o parent pom do spring-boot e a dependência do spring-boot-starter-tests.

Criei o .gitignore rapidamente para as ferramentas que vou usar no projeto usando <https://gitignore.io>. Embora completamente opcional deixei um arquivo de licença no repositório. Criei pelo <https://choosealicense.com>. Escolhi a Apache License 2.0 pois obriga que qualquer uso dos fontes seja creditado.

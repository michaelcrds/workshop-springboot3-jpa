# Visão Geral do Projeto

Este projeto de estudo tem como objetivo desenvolver um Web Service REST utilizando as tecnologias Spring Boot, JPA/Hibernate e o banco de dados relacional PostgreSQL.

## Modelo Conceitual

![image](https://user-images.githubusercontent.com/61437530/218339191-5254b218-7fd0-4736-b99c-3102c6deb9f6.png)


## Tecnologias

- Java 17
- Spring Boot
- JPA/Hibernate
- Maven
- PostgreSQL



## Clonando o Repositório

Antes de iniciar as alterações no código, é necessário clonar o repositório para o seu computador. Para isso, é importante primeiro criar uma cópia do repositório em seu GitHub. Para fazer isso, basta acessar a página do repositório e clicar no botão "fork", aguardar alguns minutos e, em seguida, clicar em "clone or download" e copiar a URL do repositório. Em seguida, você pode clonar o repositório para o seu computador. Para clonar o repositório, você precisará usar o Git Bash e digitar o seguinte comando, substituindo a URL pelo link copiado anteriormente:

```
git clone <url-do-repositorio>
```



## Importando o Projeto

Para importar o projeto como um novo projeto Maven, você precisará seguir os seguintes passos:

1. Abra o seu IDE (ex: Eclipse, IntelliJ, etc.)
2. Clique em "File" ou "Arquivo" e selecione "Import" ou "Importar".
3. Selecione "Maven" ou "Projeto Maven" e clique em "Next" ou "Próximo".
4. Selecione "Existing Maven Projects" ou "Projetos Maven Existentes" e clique em "Next" ou "Próximo".
5. Clique em "Browse" ou "Procurar" e selecione a pasta do projeto clonado.
6. Verifique se o projeto está selecionado na lista e clique em "Finish" ou "Concluir".

Agora o projeto deverá ser importado e estará pronto para ser modificado e executado.



## Iniciando Aplicação

Para executar a aplicação como uma aplicação Spring Boot, você precisará seguir os seguintes passos:

1. Localize o arquivo .java principal da aplicação, que se encontra em um pacote chamado "com.michaelcardoso.workshop".
2. Clique com o botão direito do mouse sobre o arquivo e selecione "Run As" ou "Executar como".
3. Selecione "Spring Boot App" ou "Aplicação Spring Boot".

Agora a aplicação deve ser iniciada e estará disponível na URL ("[http://localhost:8080](http://localhost:8080/)").



## Acessando o banco de dados

Agora com a aplicação rodando você pode acessar o banco de dados seguindo o caminho ("[http://localhost:8080/h2-console](http://localhost:8080/h2-console/)") no seu browser. 
Use as chaves de autenticação abaixo para acessar o console:



![image](https://user-images.githubusercontent.com/61437530/218336448-51414142-f04b-40da-9933-49d78c3f4ef9.png)

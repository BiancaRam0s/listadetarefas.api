# 📝 Lista de Tarefas — Java e Spring Boot

Este projeto consiste em uma **aplicação de gerenciamento de tarefas** desenvolvida em Java com Spring Boot, permitindo cadastrar, consultar, atualizar, concluir e excluir tarefas.

A aplicação conta com uma **API REST**, que disponibiliza os dados em formato JSON, e uma interface web desenvolvida com Thymeleaf, possibilitando o gerenciamento das tarefas diretamente pelo navegador.

O projeto utiliza o banco de dados H2 em memória para armazenar as informações durante a execução da aplicação.

---

## 📊 Funcionalidades da Aplicação

- Cadastro de novas tarefas;
- Listagem das tarefas cadastradas;
- Consulta de tarefas por identificador (ID) pela API;
- Atualização da descrição e do status das tarefas;
- Marcação de tarefas como concluídas ou pendentes;
- Exclusão de tarefas;
- Interface web para gerenciamento das tarefas;
- API REST para operações CRUD;
- Consulta dos dados por meio do console do banco H2.

---

## 🎯 Objetivo do Projeto

Este projeto foi desenvolvido como atividade acadêmica, com foco em:

- Aplicação dos conceitos de programação com Java;
- Desenvolvimento de APIs REST utilizando Spring Boot;
- Compreensão da arquitetura em camadas: Controller, Service, Repository e Entity;
- Persistência e gerenciamento de dados com Spring Data JPA e H2 Database;
- Desenvolvimento de interfaces web com Thymeleaf;
- Testes de requisições HTTP e operações CRUD;
- Aplicação de conceitos de Engenharia de Software na construção de sistemas.

---

## 📁 Estrutura do Repositório

```text
/lista-de-tarefas
│
├── src/
│   ├── main/
│   │   ├── java/                 # Código-fonte Java
│   │   └── resources/
│   │       ├── application.properties  # Configurações
│   │       └── templates/        # Páginas HTML com Thymeleaf
│   └── test/                     # Testes automatizados
├── pom.xml                       # Dependências e configuração Maven
├── mvnw                          # Maven Wrapper
├── mvnw.cmd                      # Maven Wrapper para Windows
└── README.md                     # Documentação do projeto
```

---

## 🛠 Tecnologias Utilizadas

- **Java** — linguagem de programação;
- **Spring Boot** — desenvolvimento da aplicação;
- **Spring Web** — criação dos endpoints REST;
- **Spring Data JPA** — persistência e acesso aos dados;
- **H2 Database** — banco de dados relacional em memória;
- **Thymeleaf** — criação da interface web;
- **Bootstrap 5** — estilização da interface;
- **Maven** — gerenciamento de dependências e compilação;
- **YARC** — testes visuais das requisições da API REST;
- **GitHub** — versionamento e documentação do projeto.

---

## 🔌 Endpoints da API REST

A API disponibiliza operações para o gerenciamento das tarefas por meio de requisições HTTP.

| Método | Endpoint | Funcionalidade |
|---|---|---|
| GET | `/api/tarefas` | Listar tarefas |
| GET | `/api/tarefas/{id}` | Consultar uma tarefa |
| POST | `/api/tarefas` | Cadastrar tarefa |
| PUT | `/api/tarefas/{id}` | Atualizar tarefa |
| DELETE | `/api/tarefas/{id}` | Excluir tarefa |

---

## 🌐 Acesso à Aplicação

Com a aplicação em execução local, os principais endereços são:

- **Interface web:** `http://localhost:8080/tarefas`
- **API REST:** `http://localhost:8080/api/tarefas`
- **Console do banco H2:** `http://localhost:8080/h2-console`

---

## 🎥 Demonstração em Vídeo

[▶️ Clique aqui para assistir ao vídeo](https://youtu.be/7bdjtYTOIRE)

**Observação:** Ao abrir o vídeo, a qualidade pode estar configurada automaticamente em uma resolução baixa. Para assistir com melhor qualidade, clique na engrenagem ⚙️ do YouTube, selecione **Qualidade** e escolha **1080p**, se disponível.

---

## 📌 Autoria

**Bianca Ramos**

Projeto desenvolvido para fins acadêmicos. <br>

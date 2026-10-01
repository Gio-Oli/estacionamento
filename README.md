# 🚗 Sistema de Gerenciamento de Estacionamento

Sistema web desenvolvido para **gerenciamento de vagas em um estacionamento**, permitindo organizar informações sobre veículos e facilitar o controle das vagas disponíveis.

O projeto foi desenvolvido com foco em aprendizado e aplicação prática de conceitos de **desenvolvimento web com Java e Spring Boot**, utilizando uma arquitetura organizada em camadas.

## 📌 Sobre o projeto

O **Sistema de Gerenciamento de Estacionamento** tem como objetivo facilitar o controle de veículos e vagas dentro de um estacionamento.

A aplicação permite realizar operações relacionadas ao cadastro e gerenciamento dos veículos, além de disponibilizar uma interface web para interação com o sistema.

O projeto também foi desenvolvido como uma forma de colocar em prática conceitos de programação orientada a objetos, desenvolvimento web, organização de código e integração entre diferentes partes de uma aplicação.

## 🎯 Objetivos

* 🚘 Gerenciar os veículos do estacionamento;
* 🅿️ Controlar as vagas disponíveis;
* 📝 Realizar o cadastro de veículos;
* 🔎 Consultar informações cadastradas;
* ✏️ Alterar informações dos registros;
* 🗑️ Excluir registros;
* 🌐 Disponibilizar uma interface web simples e intuitiva;
* 📚 Praticar conceitos de desenvolvimento com Java e Spring Boot.

## ⚙️ Tecnologias utilizadas

* ☕ **Java**
* 🌱 **Spring Boot**
* 🖥️ **Thymeleaf**
* 🌐 **HTML**
* 🎨 **CSS**
* 🗄️ **Banco de Dados**
* 📦 **Maven**

## 🏗️ Estrutura do projeto

O projeto utiliza uma organização baseada na separação de responsabilidades:

```text
src/
└── main/
    ├── java/
    │   └── br.gov.sp.etec.estacionamento/
    │       ├── controller/
    │       ├── entity/
    │       ├── model/
    │       └── service/
    │
    └── resources/
        ├── templates/
        └── static/
```

### 📂 Controller

Responsável por receber as requisições realizadas pelo usuário e direcioná-las para as funcionalidades correspondentes do sistema.

### 📂 Entity

Representa as entidades utilizadas pela aplicação e seus respectivos dados.

### 📂 Model

Contém os modelos utilizados durante o funcionamento da aplicação.

### 📂 Service

Responsável pelas regras e operações da aplicação, mantendo a lógica do sistema organizada.

### 📂 Templates

Contém as páginas HTML utilizadas na interface do sistema através do **Thymeleaf**.

## 🚘 Funcionalidades

O sistema possui funcionalidades voltadas ao gerenciamento do estacionamento, como:

* Cadastro de veículos;
* Gerenciamento de vagas;
* Consulta de veículos;
* Alteração de registros;
* Exclusão de registros;
* Controle das informações do estacionamento;
* Interface web para utilização do sistema.

## 🖥️ Interface

A aplicação possui uma interface web desenvolvida com **HTML, CSS e Thymeleaf**, permitindo que o usuário interaja com as funcionalidades do sistema através do navegador.

## 🚀 Como executar o projeto

### 1. Clone o repositório

```bash
git clone https://github.com/Gio-Oli/estacionamento.git
```

### 2. Acesse a pasta

```bash
cd estacionamento
```

### 3. Abra o projeto

Abra o projeto em uma IDE compatível com Java, como:

* IntelliJ IDEA
* Eclipse
* Visual Studio Code

### 4. Configure o banco de dados

Verifique o arquivo de configuração da aplicação e configure as informações necessárias para conexão com o banco de dados.

### 5. Execute o projeto

Execute a classe principal da aplicação Spring Boot.

Após iniciar o servidor, acesse a aplicação pelo navegador utilizando a porta configurada no projeto.

## 📚 Conceitos praticados

Durante o desenvolvimento do projeto foram trabalhados conceitos como:

* Programação Orientada a Objetos;
* Java;
* Spring Boot;
* Spring MVC;
* Thymeleaf;
* CRUD;
* Arquitetura em camadas;
* Controllers;
* Services;
* Entities;
* Models;
* Integração com banco de dados;
* Requisições HTTP;
* Desenvolvimento de interfaces web.

## 🔮 Melhorias futuras

Algumas funcionalidades que podem ser implementadas futuramente:

* 🔐 Sistema de login e autenticação;
* 📊 Dashboard com informações do estacionamento;
* 🅿️ Visualização gráfica das vagas;
* 🔎 Sistema de pesquisa e filtros;
* 📱 Melhor adaptação para dispositivos móveis;
* 🕐 Registro detalhado de entrada e saída;
* 💰 Cálculo automático do valor do estacionamento;
* 📈 Geração de relatórios;
* 👤 Gerenciamento de usuários.

## 👨‍💻 Desenvolvedor

Projeto desenvolvido por **Gio-Oli** como parte dos estudos e práticas de desenvolvimento de sistemas.

## 🔗 Repositório

[GitHub — estacionamento](https://github.com/Gio-Oli/estacionamento?utm_source=chatgpt.com)

---

⭐ **Gostou do projeto? Deixe uma estrela no repositório!**

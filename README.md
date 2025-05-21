## 📄 `README.md`

```markdown
# Sistema de Gerenciamento - Projeto Java CRUD

Este projeto é um sistema básico de cadastro (CRUD) desenvolvido em Java, com conexão ao banco de dados MySQL utilizando JDBC. Ideal para fins de aprendizado e prática de conceitos fundamentais de programação e banco de dados.

---

## Tecnologias Utilizadas

- Java 17 (ou versão compatível)
- JDBC (MySQL Connector/J)
- MySQL (via XAMPP)
- Visual Studio Code
- Estrutura sem Maven (build manual)

---

## Estrutura do Projeto

sistema/
├── lib/
│   └── mysql-connector-j-8.x.x.jar
├── src/
│   ├── controller/
│   ├── database/
│   │   └── Conexao.java
│   ├── model/
│   └── view/
│       ├── App.java
│       └── login.java
├── bin/
├── .vscode/
└── README.md

## ⚙️ Configuração Inicial

1. **Instale o XAMPP** e ative o MySQL.
2. **Crie um banco de dados no phpMyAdmin** (ex: `sistema`).
3. **Baixe o [MySQL Connector/J](https://dev.mysql.com/downloads/connector/j/)**.
4. Coloque o `.jar` em `lib/` e adicione-o ao classpath no VS Code:
   - Vá em `Project Settings → Libraries → Add JARs`.


## Funcionalidades planejadas

* [x] Conexão com banco de dados
* [ ] Interface de login
* [ ] Cadastro de usuários
* [ ] Listagem de registros
* [ ] Atualização e exclusão de dados

## Autor

Desenvolvido por Samuel Filipe.

---

## 📜 Licença

Este projeto é de uso livre para fins de estudo e aprendizado.


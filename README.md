# 🐞 Mantis - Testes Automatizados

Este projeto implementa testes automatizados para a aplicação **Mantis Bug Tracker**, utilizando Java com Cucumber,
Selenium WebDriver e JUnit. A automação cobre cenários principais como login e gerenciamento de tarefas.

## 📁 Estrutura do Projeto

```
Mantis/
├── drivers/                    # WebDrivers para execução (Chrome, Firefox)
├── src/
│   └── test/
│       ├── java/
│       │   ├── pages/          # Page Objects
│       │   ├── steps/          # Steps do Cucumber
│       │   ├── support/        # Suporte (DriverFactory, Config, Hooks)
│       │   └── runner/         # Runner de testes
│       └── resources/
│           ├── features/       # Arquivos .feature do Cucumber
│           └── media/          # Recursos de apoio (ex: imagens)
├── .env                        # Variáveis de ambiente
├── pom.xml                     # Gerenciador de dependências Maven
└── README.md                   # Este arquivo
```

## 🚀 Tecnologias Utilizadas

- **Java 11+**
- **Selenium WebDriver**
- **Cucumber**
- **JUnit**
- **Maven**
- **ChromeDriver / GeckoDriver**

## ⚙️ Configuração

1. **Pré-requisitos**:
   - Java 11 ou superior instalado
   - Maven instalado
   - Chrome e/ou Firefox instalado

2. **Clone o repositório**:
   ```bash
   git clone https://seurepositorio.com/Mantis.git
   cd Mantis
   ```

3. **Instale as dependências**:
   ```bash
   mvn clean install
   ```

4. **Configure o arquivo `.env`** (se necessário):
   Defina variáveis como URL do sistema, usuário de teste, etc.

## 🧪 Execução dos Testes

Para executar todos os testes via terminal:

```bash
mvn test
```

Ou utilizando a sua IDE (como IntelliJ ou Eclipse), execute a classe:

```
src/test/java/runner/RunTest.java
```

## 📝 Funcionalidades Testadas

- Login com credenciais válidas e inválidas
- Criação e gerenciamento de tarefas
- Upload de imagens em tarefas

## 📄 Features

Os cenários de teste são escritos com a linguagem Gherkin e estão localizados em:

- `src/test/resources/features/login.feature`
- `src/test/resources/features/tarefa.feature`

## 🧰 Utilitários

- **Hooks**: Executam ações e manipula o selenium
- **DriverFactory**: Centraliza o controle do WebDriver
- **Config.java**: Armazena configurações e parâmetros globais

## 📌 Observações

- Verifique se os drivers estão atualizados e compatíveis com a versão do navegador.
- A aplicação Mantis precisa estar rodando e acessível para os testes funcionarem corretamente.

## 📄 .env

- As variaveis de ambiente devem ser configuradas corretamente.


- **EXEMPLO:**


- `BROWSER = chrome`
- `BASE_URL = https://mantis-prova.base2.com.br/`
- `USUARIO = nome.usuario`
- `SENHA = password`
- `MEDIA_PATH = C:\Projetos\Mantis\src\test\resources\media\`
- `HEADLESS = 0`

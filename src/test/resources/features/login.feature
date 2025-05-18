#language: pt
@login
@smoke
Funcionalidade: Login do usuario

  Como um usuario do sistema
  Quero informar meu nome de usuario, senha e configurar opcoes de sessao
  Para que eu possa acessar o sistema de forma segura e personalizada

  Cenario: Realizar login com credenciais validas e sem marcar nenhuma opcao
    Dado que estou na pagina inicial de login
    Quando eu preencho o nome de usuario com "usuario.valido"
    E clico no botao Entrar
    E eu preencho a senha com "senha.valida"
    E clico no botao Entrar
    Entao devo ser autenticado com sucesso

  Cenario: Tentar login sem informar o nome de usuario
    Dado que estou na pagina inicial de login
    Quando eu deixo o campo de nome de usuario vazio
    E clico no botao Entrar
    Entao devo ver uma mensagem de erro na pagina de login

  Cenario: Tentar login sem informar a senha
    Dado que estou na pagina inicial de login
    Quando eu preencho o nome de usuario com "usuario.valido"
    E clico no botao Entrar
    E deixo o campo de senha vazio
    E clico no botao Entrar
    Entao devo ver uma mensagem de erro na pagina de login

  Cenario: Tentar login com usuario inexistente
    Dado que estou na pagina inicial de login
    Quando eu preencho o nome de usuario com "usuario.inexistente"
    E clico no botao Entrar
    E eu preencho a senha com "qualquerSenha"
    E clico no botao Entrar
    Entao devo ver uma mensagem de erro na pagina de login

  Cenario: Tentar login com senha incorreta
    Dado que estou na pagina inicial de login
    Quando eu preencho o nome de usuario com "usuario.valido"
    E clico no botao Entrar
    E eu preencho a senha com "senha_incorreta"
    E clico no botao Entrar
    Entao devo ver uma mensagem de erro na pagina de login

  Cenario: Tentar login com usuario bloqueado
    Dado que estou na pagina inicial de login
    Quando eu preencho o nome de usuario com "usuario.bloqueado"
    E clico no botao Entrar
    E eu preencho a senha com "qualquerSenha"
    E clico no botao Entrar
    Entao devo ver uma mensagem de erro na pagina de login
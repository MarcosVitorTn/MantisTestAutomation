#language: pt
@tarefa
@smoke
Funcionalidade: Submissao de relatorio de bug
  Como um usuario
  Quero preencher e enviar o formulario de relatorio de bug
  Para reportar falhas ou melhorias no sistema

  Cenario: Envio com sucesso
    Dado que estou na pagina de relatorio de bug
    E seleciono a categoria "[Todos os Projetos] nova tarefa"
    E seleciono a frequencia "sempre"
    E seleciono a gravidade "grande"
    E seleciono a prioridade "alta"
    E preencho o campo Resumo com "Erro ao salvar item"
    E preencho o campo Descricao com "O sistema retorna erro 500 ao salvar"
    Quando envio o formulario
    Entao devo ver uma mensagem de sucesso

  Cenario: Envio com todos os campos preenchidos
    Dado que estou na pagina de relatorio de bug
    E seleciono a categoria "[Todos os Projetos] nova tarefa"
    E seleciono a frequencia "sempre"
    E seleciono a gravidade "grande"
    E seleciono a prioridade "alta"
    E seleciono para expandir selecionar perfil
    E preencho o campo Plataforma com "Web"
    E preencho o campo SO com "Windows"
    E preencho o campo Versao SO com "11"
    E preencho o campo Resumo com "Erro ao salvar item"
    E preencho o campo Descricao com "O sistema retorna erro 500 ao salvar"
    E preencho o campo Passos para Reproduzir com "Passo 1: preencher os campos \nPasso 2: Enviar formulario \nPasso 3: observar mensagem de erro"
    E preencho o campo Informacoes Adicionais com "Erro ficticio em prol de automacao de teste"
    E preencho o campo Aplicar Marcadores com "Teste,Automatizado,WEB"
    E faco o upload de um arquivo no campo Enviar arquivos
    E seleciono "privado" no campo visibilidade
    E marco o checkbox Continuar Relatando
    Quando envio o formulario
    Entao devo ver uma mensagem de sucesso
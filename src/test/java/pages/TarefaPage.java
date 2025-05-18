package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Config;
import support.Hooks;


public class TarefaPage extends BasePage {

    private support.Hooks hooks;

    public TarefaPage(WebDriver driver){
        super(driver);
        this.hooks = new Hooks(driver);
    }
    private String mensagemSucesso = "Operação realizada com sucesso.";
    private String baseUrl = "https://mantis-prova.base2.com.br/bug_report_page.php";
    private By comboCategoria = By.id("category_id");
    private By comboFrequencia = By.id("reproducibility");
    private By comboGravidade = By.id("severity");
    private By comboPrioridade = By.id("priority");
    private By inputPlataforma = By.id("platform");
    private By inputSO = By.id("os");
    private By inputVersaoSO = By.id("os_build");
    private By inputResumo = By.id("summary");
    private By inputDescricao = By.id("description");
    private By inputPassos = By.id("steps_to_reproduce");
    private By inputMarcadores = By.id("tag_string");
    private By uploadFile = By.cssSelector("input[type='file']");
    private By form = By.id("report_bug_form");
    private By inputInformacoes = By.id("additional_info");
    private String path = Config.getMediaPath()+"imagem-teste.jpg";
    private By botaoExpandir = By.id("profile_closed_link");
    private By radioVisibilidade;
    private By checkContinuar = By.xpath("//span[contains(text(),'selecione para criar mais tarefas')]");
    private By isExpandido = By.id("profile_closed");


    public void carregar_pagina_criar_tarefa() {
        hooks.ir_ate_pagina(baseUrl);
    }


    public void selecionar_categoria(String opcao) {
        hooks.selecionar_opcao_combobox(comboCategoria,opcao);
    }

    public void selecionar_frequencia(String opcao) {
        hooks.selecionar_opcao_combobox(comboFrequencia, opcao);
    }

    public void selecionar_gravidade(String opcao) {
        hooks.selecionar_opcao_combobox(comboGravidade,opcao);
    }

    public void selecionar_prioridade(String opcao) {
        hooks.selecionar_opcao_combobox(comboPrioridade,opcao);
    }

    public void preencher_campo_resumo(String valor) {
        hooks.preencher_campo(inputResumo, valor);
    }

    public void enviar_formulario_cadastro_tarefa() {
        hooks.enviar_formulario(form);
    }

    public void preencher_campo_descricao(String valor) {
        hooks.preencher_campo(inputDescricao, valor);
    }

    public void validar_mensagem_sucesso() {
        hooks.verificar_mensagem_de_sucesso(mensagemSucesso);
    }

    public void preencher_campo_plataforma(String valor) {
        hooks.preencher_campo(inputPlataforma, valor);
    }

    public void preencher_campo_so(String valor) {
        hooks.preencher_campo(inputSO, valor);
    }

    public void preencher_campo_versao_so(String valor) {
        hooks.preencher_campo(inputVersaoSO, valor);
    }

    public void preencher_campo_passos(String valor) {
        hooks.preencher_campo(inputPassos, valor);
    }

    public void preencher_campo_informacoes_adicionais(String valor) {
        hooks.preencher_campo(inputInformacoes, valor);
    }

    public void preencher_campo_marcadores(String valor) {
        hooks.preencher_campo(inputMarcadores, valor);
    }

    public void realizar_upload_arquivo() {
        hooks.realizer_upload_arquivo(uploadFile, path);
    }

    public void expandir_selecionar_perfil() {
        if (driver.findElement(isExpandido).getAttribute("style").contains("display: block")) {
            hooks.clickar_no_elemento(botaoExpandir);
        }
    }

    public void selecionar_visibilidade(String valor) {
        radioVisibilidade = By.xpath("//span[contains(text(),'"+valor+"')]");
        hooks.clickar_no_elemento(radioVisibilidade);
    }

    public void marcar_checkbox_continuar_relatando() {
        hooks.clickar_no_elemento(checkContinuar);
    }
}


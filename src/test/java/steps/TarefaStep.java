package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.TarefaPage;
import support.DriverFactory;


public class TarefaStep {

    private TarefaPage tarefaPage;
    private WebDriver driver;
    private LoginPage loginPage;

    @Before
    public void setUp() {
        driver = DriverFactory.getDriver();
        loginPage = new LoginPage(driver);
        tarefaPage = new TarefaPage(driver);
    }

    @After
    public void tearDown() {
        driver.quit();
    }



    @Dado("que estou na pagina de relatorio de bug")
    public void que_estou_na_pagina_de_relatorio_de_bug() {
        loginPage.realizar_login();
        tarefaPage.carregar_pagina_criar_tarefa();
    }
    @Dado("seleciono a categoria {string}")
    public void seleciono_a_categoria(String opcao) {
        tarefaPage.selecionar_categoria(opcao);
    }
    @Dado("seleciono a frequencia {string}")
    public void seleciono_a_frequencia(String opcao) {
        tarefaPage.selecionar_frequencia(opcao);
    }
    @Dado("seleciono a gravidade {string}")
    public void seleciono_a_gravidade(String opcao) {
        tarefaPage.selecionar_gravidade(opcao);
    }
    @Dado("seleciono a prioridade {string}")
    public void seleciono_a_prioridade(String opcao) {
        tarefaPage.selecionar_prioridade(opcao);
    }
    @Dado("preencho o campo Resumo com {string}")
    public void preencho_o_campo_resumo_com(String valor) {
        tarefaPage.preencher_campo_resumo(valor);
    }
    @Dado("preencho o campo Descricao com {string}")
    public void preencho_o_campo_descricao_com(String valor) {
        tarefaPage.preencher_campo_descricao(valor);
    }
    @Quando("envio o formulario")
    public void envio_o_formulario() {
        tarefaPage.enviar_formulario_cadastro_tarefa();

    }
    @Entao("devo ver uma mensagem de sucesso")
    public void devo_ver_uma_mensagem_de_sucesso() {
        tarefaPage.validar_mensagem_sucesso();

    }
    @Dado("preencho o campo Plataforma com {string}")
    public void preencho_o_campo_plataforma_com(String valor) {
        tarefaPage.preencher_campo_plataforma(valor);
    }
    @Dado("preencho o campo SO com {string}")
    public void preencho_o_campo_so_com(String valor) {
        tarefaPage.preencher_campo_so(valor);
    }
    @Dado("preencho o campo Versao SO com {string}")
    public void preencho_o_campo_versao_so_com(String valor) {
        tarefaPage.preencher_campo_versao_so(valor);
    }
    @Dado("preencho o campo Passos para Reproduzir com {string}")
    public void preencho_o_campo_passos_para_reproduzir_com(String valor) {
        tarefaPage.preencher_campo_passos(valor);
    }
    @Dado("preencho o campo Informacoes Adicionais com {string}")
    public void preencho_o_campo_informacoes_adicionais_com(String valor) {
        tarefaPage.preencher_campo_informacoes_adicionais(valor);
    }
    @Dado("preencho o campo Aplicar Marcadores com {string}")
    public void preencho_o_campo_aplicar_marcadores_com(String valor) {
        tarefaPage.preencher_campo_marcadores(valor);

    }
    @Dado("faco o upload de um arquivo no campo Enviar arquivos")
    public void faco_o_upload_de_um_arquivo_no_campo() {
        tarefaPage.realizar_upload_arquivo();
    }
    @Dado("seleciono para expandir selecionar perfil")
    public  void seleciono_para_expandir_selecionar_perfil(){
        tarefaPage.expandir_selecionar_perfil();
    }
    @Dado("seleciono {string} no campo visibilidade")
    public void seleciono_no_campo_visibilidade(String valor) {
        tarefaPage.selecionar_visibilidade(valor);

    }
    @Dado("marco o checkbox Continuar Relatando")
    public void marco_o_campo() {
        tarefaPage.marcar_checkbox_continuar_relatando();
    }


    }

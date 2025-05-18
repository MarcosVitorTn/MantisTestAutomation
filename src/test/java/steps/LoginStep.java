package steps;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import support.Config;
import support.DriverFactory;

public class LoginStep{

    private LoginPage loginPage;

    @Before
    public void setUp() {
        WebDriver driver = DriverFactory.getDriver();
        loginPage = new LoginPage(driver);
    }

    @After
    public void tearDown() {
        DriverFactory.quitDriver();
    }

    @Dado("que estou na pagina inicial de login")
    public void que_estou_na_pagina_inicial_de_login() {
        loginPage.ir_para_pagina_de_login();
}
    @Quando("eu preencho o nome de usuario com {string}")
    public void eu_preencho_o_nome_de_usuario_com(String usuario) {
        if (usuario.equals("usuario.valido")){
            loginPage.preencher_campo_de_nome_de_usuario(Config.getUsername());
        }else {
            loginPage.preencher_campo_de_nome_de_usuario(usuario);
        }
}
    @Quando("clico no botao Entrar")
    public void clico_no_botao() {
        loginPage.clicar_no_botao_entrar();
}
    @Quando("eu preencho a senha com {string}")
    public void eu_preencho_a_senha_com(String senha) {
        if (senha.equals("senha.valida")){
            loginPage.preencher_campo_senha(Config.getPassword());
        }else {
            loginPage.preencher_campo_senha(senha);
        }
}
    @Quando("eu deixo o campo de nome de usuario vazio")
    public void eu_deixo_o_campo_de_nome_de_usuario_vazio() {
        loginPage.deixar_campo_usuario_vazio();
}
    @Quando("deixo o campo de senha vazio")
    public void deixo_o_campo_de_senha_vazio() {
        loginPage.deixar_campo_senha_vazio();
    }
    @Entao("devo ser autenticado com sucesso")
    public void devo_ser_autenticado_com_sucesso() {
        loginPage.verificar_login_com_sucesso(Config.getUsername());
}
    @Entao("devo ver uma mensagem de erro na pagina de login")
    public void devo_ver_uma_mensagem_de_erro_na_pagina_de_login() {
        loginPage.verificar_erro_no_login();
    }

}

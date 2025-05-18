package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Config;
import support.Hooks;

public class LoginPage extends  BasePage{

    private support.Hooks hooks;


    public LoginPage(WebDriver driver){
        super(driver);
        this.hooks = new Hooks(driver);
    }

    private String urlLogin = "https://mantis-prova.base2.com.br/login_page.php";
    private By inputUsername = By.id("username");
    private By inputPassword = By.id("password");
    private By buttonEntrar = By.xpath("//input[@type='submit'][@value='Entrar']");
    String urlMyView = "/my_view_page.php";
    String mensagemErro = "Sua conta pode estar desativada ou bloqueada ou o nome de usuário e a senha que você digitou não estão corretos.";


    public void realizar_login(){
        ir_para_pagina_de_login();
        preencher_campo_de_nome_de_usuario(Config.getUsername());
        clicar_no_botao_entrar();
        preencher_campo_senha(Config.getPassword());
        clicar_no_botao_entrar();
        verificar_login_com_sucesso(Config.getUsername());
    }


    public void ir_para_pagina_de_login() {
        hooks.ir_ate_pagina(urlLogin);
    }

    public void preencher_campo_de_nome_de_usuario(String usuario) {
        hooks.preencher_campo(inputUsername, usuario);
    }

    public void clicar_no_botao_entrar() {
        hooks.clickar_no_elemento(buttonEntrar);
    }

    public void preencher_campo_senha(String senha) {
        hooks.preencher_campo(inputPassword, senha);
    }

    public void deixar_campo_usuario_vazio() {
        hooks.preencher_campo(inputUsername, "");
    }

    public void deixar_campo_senha_vazio() {
        hooks.preencher_campo(inputPassword,"");
    }

    public void verificar_login_com_sucesso(String username) {
        hooks.verificar_url(urlMyView);
        hooks.verificar_texto_na_pagina(username);
    }

    public void verificar_erro_no_login() {
        hooks.verificar_mensagem_de_erro(mensagemErro);
    }
}

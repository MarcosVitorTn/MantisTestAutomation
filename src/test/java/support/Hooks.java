package support;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Hooks {

    private WebDriver driver;
    private WebDriverWait wait;
    private By mensagemErro = By.xpath("//div[contains(@class, 'alert-danger')]");
    private By mensagemSucesso = By.xpath("//div[contains(@class, 'alert-success')]");

    public Hooks(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }


    public void ir_ate_pagina(String url){
        driver.get(url);
        wait.until(ExpectedConditions.urlContains(url));
    }
    public void clickar_no_elemento(By element){
        driver.findElement(element).click();
    }
    public void preencher_campo(By element, String valor){
        driver.findElement(element).sendKeys(valor);
    }
    public void selecionar_opcao_combobox(By element, String opcao){
        WebElement combobox = driver.findElement(element);
        Select select = new Select(combobox);
        select.selectByVisibleText(opcao);
    }
    public void enviar_formulario(By element){
        driver.findElement(element).submit();
    }
    public void verificar_mensagem_de_erro(String mensagem) {
        Assert.assertTrue("A mensagem de erro não foi encontrada.",driver.findElement(mensagemErro).isDisplayed());
        if (!mensagem.isEmpty()){
            Assert.assertTrue("O texto ('"+mensagem+"') não foi encontrado na mensagem de sucesso.",driver.getPageSource().contains(mensagem));
        }
    }
    public void verificar_mensagem_de_sucesso(String mensagem) {
        Assert.assertTrue("A mensagem de sucesso não foi encontrada.",driver.findElement(mensagemSucesso).isDisplayed());
        if (!mensagem.isEmpty()){
            Assert.assertTrue("O texto ('"+mensagem+"') não foi encontrado na mensagem de sucesso.",driver.getPageSource().contains(mensagem));
        }
    }
    public void verificar_elemento_visivel(By element){
        Assert.assertTrue("O elemento não pode ser visto.",driver.findElement(element).isDisplayed());
    }

    public void verificar_texto_na_pagina(String texto){
        Assert.assertTrue("O texto ('"+texto+"') não foi encontrado na pagina.",driver.getPageSource().contains(texto));
    }
    public void verificar_url(String url){
        wait.until(ExpectedConditions.urlContains(url));
    }
    public  void realizer_upload_arquivo(By element, String path){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement inputUpload = wait.until(ExpectedConditions.presenceOfElementLocated(element));
        inputUpload.sendKeys(path);
    }
}

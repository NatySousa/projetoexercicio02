package tests;

import static org.junit.Assert.assertEquals;

import java.io.File;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CadastroDeProdutosTest {

	// fun��o de teste para cadastrar produto com sucesso
	@Test
	public void testCadastroDeProdutoComSucesso() {

		// executando o driver do googlechrome
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver\\chromedriver.exe");

		// Abrindo o navegador (google chrome)
		WebDriver driver = new ChromeDriver();

		// maximizar o navegador
		driver.manage().window().maximize();

		// acessar a p�gina web do sistema que ser� testada
		driver.get("http://exercteste01-001-site1.gtempurl.com/Home/Exercicio05");

		// preencher o nome do produto
		driver.findElement(By.xpath("//*[@id=\"nome\"]")).sendKeys("Notebook Dell");

		// preencher o pre�o do produto
		driver.findElement(By.xpath("//*[@id=\"preco\"]")).sendKeys("3500");

		// preencher a quantidade do produto
		driver.findElement(By.xpath("//*[@id=\"quantidade\"]")).sendKeys("10");

		// clicar no bot�o de cadastrar produto
		driver.findElement(By.xpath("//*[@id=\"btnCadastro\"]")).click();

		// capturar a mensagem obtida no sistema
		String mensagem = driver.findElement(By.xpath("//*[@id=\"mensagem\"]")).getText();

		// comparando se a mensagem obtida do sistema � "Produto cadastrado com
		// sucesso."
		assertEquals(mensagem, "Produto cadastrado com sucesso.");


		// fechar o navegador
		driver.close();
		driver.quit();

	}

}

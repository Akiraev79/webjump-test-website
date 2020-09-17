## Teste WebJump - Descrevendo como executar o projeto

Configurações utilizadas no teste
O.S: Mac OSX High Sierra (10.13)
ferramentas: Java 8, Selenium-api, JUnit
Navegador: Firefox

Instalando o Java 8

a) Fazer download em da JDK versão 1.8 no link https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html escolhendo conforme o seu sistema operacional.

Instalando o GeckoDriver (Firefox)

a) Fazer o download do ChromeDriver https://github.com/mozilla/geckodriver/releases verificar a versão do seu sistema operacional
b) Salve o arquivo na pasta que preferir, porem devera colocar este caminho na classe DriverFactory do projeto alterando esta linha : 			System.setProperty("webdriver.gecko.driver", "/caminho do driver/geckodriver");

Execução dos Testes

execute o classe TesteSuite com JUnit
# Demonstração de Testes de Mutação

Este repositório contem um pequeno exercício sobre testes de mutação. Para mais detalhes sobre o assunto, consulte o nosso [artigo didático](https://engsoftmoderna.info/artigos/testes-mutacao.html).

**Passo 1:** Analise a seguinte classe Java:

[Cliente.java](https://github.com/mtov/demo-mutacao/blob/main/src/main/java/com/example/Cliente.java)

**Passo 2:**  Analise também o teste de unidade dessa classe:

[ClienteTest.java](https://github.com/mtov/demo-mutacao/blob/main/src/test/java/com/example/ClienteTest.java)

**Passo 3:**  Confira também a saída gerada pela ferramenta [Pitest](https://pitest.org/) quando executada no programa formado pela classe e teste mostrados anteriormente.

[Relatório Gerado pelo Pitest](https://github.com/mtov/demo-mutacao/blob/main/target/pit-reports/index.html)

Como esse relatório está em HTML, você não consegue visualizá-lo diretamente no site do GitHub. Portanto, é melhor fazer um clone do repositório para sua máquina local.

Quando conseguir abrir o relatório em um browser, você vai ver que foram gerados quatro mutantes, sendo que dois foram mortos (linhas com fundo verde), um sobreviveu (primeira linha com fundo vermelho) e o último mutante não foi coberto pelo teste.


**Passo 4:**  Então, modifique o teste de unidade, acrescentando mais dois comandos `assert`, de forma que ele mate todos os quatro mutantes.

Após modificar o teste, você deverá rodar o Pitest de novo. Para isso, execute o seguinte comando:

`mvn test-compile org.pitest:pitest-maven:mutationCoverage`

Importante, para rodar o comando acima você vai precisar de ter instalado: [JDK](https://www.oracle.com/br/java/technologies/downloads/) e [Maven](download).

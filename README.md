# Demonstração de Testes de Mutação

Este repositório contem um pequeno exercício sobre testes de mutação. Para mais detalhes sobre o assunto, consulte o nosso [artigo didático](https://engsoftmoderna.info/artigos/testes-mutacao.html).

1. Analise a seguinte classe Java:

[Cliente.java]([https://github.com/mtov/demo-mutacao/blob/main/src/main/java/com/example/Cliente.java)

2. Analise também o teste de unidade dessa classe:

[ClienteTest.java](https://github.com/mtov/demo-mutacao/blob/main/src/test/java/com/example/ClienteTest.java)

3. Veja também a saída gerada, em HTML, pela ferramenta [Pitest](https://pitest.org/) quando executada no programa formado pela classe e teste mostrados anteriormente.

[Relatório Gerado pelo Pitest](https://github.com/mtov/demo-mutacao/blob/main/target/pit-reports/index.html)

Observe que esse relatório descreve que foram gerados quatro mutantes, sendo que dois foram mortos (linhas com fundo verde), um sobreviveu (primeira linha com fundo vermelho) e o último mutante não foi coberto pelo teste.

4. Então, **modifique o teste de unidade, acrescentando mais dois comandos assert, de forma que ele mate todos os quatro mutantes.**

Após modificar o teste, você deverá rodar o Pitest de novo. Para isso, execute o seguinte comando:

`mvn test-compile org.pitest:pitest-maven:mutationCoverage`

Importante, para rodar o comando acima você vai precisar de ter instalado: [JDK](https://www.oracle.com/br/java/technologies/downloads/) e [Maven](download).

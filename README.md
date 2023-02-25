# Demonstração de Testes de Mutação

Este repositório contem um pequeno exercício prático sobre testes de mutação. Para mais detalhes sobre esse tipo de teste, consulte o nosso [artigo didático](https://engsoftmoderna.info/artigos/testes-mutacao.html) sobre o tema.

## Pré-requisitos:

* Primeiro, clone este repositório para sua máquina local.
* Você vai precisar de ter instalado localmente duas ferramentas: [JDK](https://www.oracle.com/br/java/technologies/downloads/) e [Maven](download).

## Entendimento do Sistema

**Passo 1:** Analise a seguinte classe Java:

[Cliente.java](./src/main/java/com/example/Cliente.java)

**Passo 2:**  Analise também o teste de unidade dessa classe:

[ClienteTest.java](./src/test/java/com/example/ClienteTest.java)

**Passo 3:**  Por fim, confira a saída gerada pela ferramenta [Pitest](https://pitest.org/) quando executada no programa formado pela classe e teste mostrados anteriormente.

[Relatório de Saída do Pitest](./target/pit-reports/index.html)

Como esse relatório está em HTML, você não consegue visualizá-lo diretamente no GitHub. Portanto, é melhor abrir o relatório usando o browser local de sua máquina.

Feito isso, observe que foram gerados quatro mutantes, sendo que dois foram mortos (linhas com fundo verde), um sobreviveu (primeira linha com fundo vermelho) e o último mutante não foi coberto pelo teste.

## Tarefa Prática:

Modifique o teste de unidade, acrescentando mais dois comandos `assert`, de forma que ele mate todos os quatro mutantes.

Após modificar o teste, você deverá rodar o Pitest de novo. Para isso, execute o seguinte comando:

`mvn test-compile org.pitest:pitest-maven:mutationCoverage`

Para conferir o resultado, abra o novo relatório gerado pelo Pitest e confira se, de fato, todos os mutantes foram mortos.

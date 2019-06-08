# Projetos-ENG-3-P1-P2
<h10>Nomes:Walter Tavares da Silva Neto//Weslley Luis da Rosa//Gustavo Henrique Almeida
</h10>
<h1>
Trabalho P2
</h1>
Fomos designados para fazer o exercicio 1.2 da prova P2, a seguir segue o enunciado..<br>
"Exercício 1.2. Crie um arquivo que possua a quantidade de inteiros negativos, positivos e de zeros da matriz A e da matriz B. Ver exercício 1. "
<br>
Escolhemos utilizar Master and Worker para realizar esse exercicios por entendermos ser o jeito mais facil de completa-lo.
Primeiramente tentamos determinar o tamanho do vetor abrindo ele no excel, no entanto isso acabou nao dando certo.
após uma pesquisa resolvemos criar uma lista de uma lista e utilizamos o BufferedReader para ler o arquivo que continha as Matrizes,
apos isso utilizamos o  try catch para prevenir o sistema de erros e o System.currentTimeMillis para cronometrarmos o tempo de execução.
Na classe worker utilizamos metodos para percorrermos as matrizes A e B que estavam nos arquivos fornecidos pelo professor e determinarmos a quantidade de numeros Negativos, Positivos e Zeros das matrizes.
Constatamos atraves do tempo de execução que apartir de um determinado numero de workers o aumento de sua quantidade nao afeta o desempenho e em alguns casos até piora.

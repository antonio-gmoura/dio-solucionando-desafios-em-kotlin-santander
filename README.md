## Digital Innovation One

## Bootcamp: Mobile Developer

## Módulo: Solucionando Desafios em Kotlin

Nesse desafio de codificação você irá praticar através do desenvolvimento de algoritmos os conceitos de pensamento computacional apresentados nas aulas e exercícios anteriores.



## 1 / 5 - Teste de Seleção 1

** Básico		** Princípios Básicos

------

#### Desafio

Leia 4 valores inteiros A, B, C e D. Com base nisso, se o valor de B for maior do que de C e se D for maior do que A, e a soma de C com D for maior que a soma de A e B e se tanto C quanto D forem positivos e, ainda, se a variável A for par, escreva a mensagem **"Valores aceitos"**, senão escrever **"Valores nao aceitos"**.

#### Entrada

Quatro números inteiros A, B, C e D.

#### Saída

Imprima a mensagem corretamente esperada pela validação dos valores.

| Exemplo de Entrada | Exemplo de Saída    |
| ------------------ | ------------------- |
| 5 6 7 8            | Valores nao aceitos |
| 2 3 2 6            | Valores aceitos     |



## 2 / 5 - Fibonacci Fácil

** Básico		** Princípios Básicos

------

#### Desafio

A seguinte sequência de números 0 1 1 2 3 5 8 13 21... é conhecida como série de Fibonacci. Nessa sequência, cada número, depois dos 2 primeiros, é igual à soma dos 2 anteriores. Escreva um algoritmo que leia um inteiro N (N < 46) e mostre os N primeiros números dessa série.

#### Entrada

O arquivo de entrada contém um valor inteiro N (0 < N < 46).

#### Saída

Os valores devem ser mostrados na mesma linha, separados por um espaço em branco. Não deve haver espaço após o último valor.

| Exemplo de Entrada | Exemplo de Saída |
| ------------------ | ---------------- |
| 5                  | 0 1 1 2 3        |



## 3 / 5 - Análise de Números

** Básico		** Princípios Básicos

------

#### Desafio

Você deve fazer a leitura de 5 valores inteiros. Em seguida mostre quantos valores informados são pares, quantos valores informados são ímpares, quantos valores informados são positivos e quantos valores informados são negativos.

#### Entrada

Você receberá 5 valores inteiros.

#### Saída

Exiba a mensagem conforme o exemplo de saída abaixo, sendo uma mensagem por linha e não esquecendo o final de linha após cada uma.

 

| Exemplo de Entrada | Exemplo de Saída                                             |
| ------------------ | ------------------------------------------------------------ |
| -5 0 -3 -4 12      | 3 valor(es) par(es) 2 valor(es) impar(es) 1 valor(es) positivo(s) 3 valor(es) negativo |



## 4 / 5 - Triângulo

** Básico		** Princípios Básicos

------

#### Desafio

Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. Em caso positivo, calcule o perímetro do triângulo e apresente a mensagem:

Perimetro = XX.X

Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem

Area = XX.X

#### Entrada

A entrada contém três valores reais.

#### Saída

O resultado deve ser apresentado com uma casa decimal.

| Exemplo de Entrada | Exemplo de Saída |
| ------------------ | ---------------- |
| 6.0 4.0 2.0        | Area = 10.0      |
| 6.0 4.0 2.1 		 | Perimetro = 12.1 |



## 5 / 5 - A Corrida de Tartarugas

** Básico		** Princípios Básicos

------

#### Desafio

A corrida de tartarugas é um esporte que cresceu muito nos últimos anos, fazendo com que vários competidores se dediquem a capturar tartarugas rápidas, e treina-las para faturar milhões em corridas pelo mundo. Porém a tarefa de capturar tartarugas não é uma tarefa muito fácil, pois quase todos esses répteis são bem lentos. Cada tartaruga é classificada em um nível dependendo de sua velocidade:


Nível 1: Se a velocidade é menor que 10 cm/h .
Nível 2: Se a velocidade é maior ou igual a 10 cm/h e menor que 20 cm/h .
Nível 3: Se a velocidade é maior ou igual a 20 cm/h .

Sua tarefa é identificar qual o nível de velocidade da tartaruga mais veloz de um grupo.

#### Entrada

A entrada consiste de múltiplos casos de teste, e cada um consiste em duas linhas: A primeira linha contém um inteiro **L** (1 ≤ **L** ≤ 500) representando o número de tartarugas do grupo, e a segunda linha contém **L** inteiros **Vi** (1 ≤ **Vi** ≤ 50) representando as velocidades de cada tartaruga do grupo.

#### Saída

Para cada caso de teste, imprima uma única linha indicando o nível de velocidade da tartaruga mais veloz do grupo.

 

| Exemplo de Entrada                    | Exemplo de Saída |
| ------------------------------------- | ---------------- |
| 10<br />10 10 10 10 15 18 20 15 11 10 | 3                |
| 10 <br />1 5 2 9 5 5 8 4 4 3          | 1                |
| 10<br />19 9 1 4 5 8 6 11 9 7         | 2                |
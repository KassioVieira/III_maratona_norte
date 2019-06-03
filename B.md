Como todos tem uma quantidade definida de quanto comem por porção eu adicionei esses valores em um array organizado pela mesma
ordem de entrada de dados
```java
  int convidados[] = { 300, 1500, 600, 1000, 150 };
```

Feito isso defino duas variáveis uma receberá o valor total e outra receberá a quantidade de porções de cada um.
 
Com isso utilizo um laço de repetição que vai de i = 0 a i < 5, dentro do laço, recebo o valor que representa a quantidade de
porções de cada convidado e em seguida faça a seguinte operação matemática.
 
 ```total = quantidade_por_porção_do_convidado * porções_do_convidado ```
 
 reprentada pelo seguinte trecho de código:
 ```java
  total += convidados[i] * aux;
 ``` 
 
 utilizo o índice **i** para buscar no array de convidados a quantidade que o convidado come por porção e então multiplico pela
 quantidade de porções que ele comeu, quando o índice chega na ultima posição tenho o total geral. Com isso basta somar a quantidade
 da anfitriã ao total geral.

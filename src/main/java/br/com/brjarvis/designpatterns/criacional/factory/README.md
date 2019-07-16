## Factory Method Pattern

Este é um dos principais padrões de design que é usado pesadamente não apenas no JDK, mas também em várias estruturas de código aberto, como Spring, Struts e Apache, juntamente com o Decorator Design Pattern em Java. 

Padrão de projeto de fábrica é baseado no conceito orientado a objeto de encapsulamento . 

O método de fábrica é usado para criar um objeto diferente da fábrica, muitas vezes referenciado como Item e encapsula o código de criação. 

Então, em vez de ter código de criação de objeto no lado do cliente, encapsulamos o método Factory em Java . 

Um dos melhores exemplos de padrão de fábrica em Java é o BorderFactory Class of Swing API.  




### Quando usar o padrão de design de fábrica em Java

* Os métodos Static Factory são comuns em estruturas nas quais o código da biblioteca precisa criar objetos de tipos que podem ser subclassificados por aplicativos que usam a estrutura.        

* Alguns ou todos os produtos concretos podem ser criados de várias maneiras, ou queremos deixar em aberto a opção de que no futuro possa haver novas formas de criar o produto concreto.

* O método de fábrica é usado quando os produtos não precisam saber como são criados.

* Podemos usar o padrão de fábrica, onde temos que criar um objeto de qualquer uma das sub-classes, dependendo dos dados fornecidos




-----
Este padrão se enquadra como:
- [Padrão criacional](https://github.com/araujoit/design_patterns#criacional);
- [Padrão de classe](https://github.com/araujoit/design_patterns#padr%C3%B5es-de-classe);
-----

#### Diagrama:
[![FactoryMethod](https://www.tutorialspoint.com/design_pattern/images/factory_pattern_uml_diagram.jpg)](https://www.tutorialspoint.com/design_pattern/images/factory_pattern_uml_diagram.jpg)




Referências
-----
[https://www.tutorialspoint.com/listtutorial/What-is-Factory-Method-Design-Pattern-in-Java/3786](https://www.tutorialspoint.com/listtutorial/What-is-Factory-Method-Design-Pattern-in-Java/3786)
[https://javarevisited.blogspot.com/2011/12/factory-design-pattern-java-example.html](https://javarevisited.blogspot.com/2011/12/factory-design-pattern-java-example.html)
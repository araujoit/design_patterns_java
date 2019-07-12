## Chain of Responsibility Pattern

Como o nome sugere, o Chain of Responsibility Pattern (padrão de cadeia de responsabilidade) cria uma cadeia de objetos receptores para uma solicitação. 

Esse padrão separa remetente e destinatário de uma solicitação com base no tipo de solicitação. 

Nesse padrão, normalmente cada receptor contém referência a outro receptor. 
Se um objeto não puder manipular a solicitação, ele passará o mesmo para o próximo receptor e assim por diante.


-----
Este padrão se enquadra como:
- [Padrão comportamental](https://github.com/araujoit/design_patterns#comportamental);
- [Padrão de objetos](https://github.com/araujoit/design_patterns#padr%C3%B5es-de-objetos);
-----

#### Diagrama:
[![ChainOfResponsibility](https://www.tutorialspoint.com/design_pattern/images/chain_pattern_uml_diagram.jpg)](https://www.tutorialspoint.com/design_pattern/images/chain_pattern_uml_diagram.jpg)


Referências:
-----

[https://www.tutorialspoint.com/design_pattern/chain_of_responsibility_pattern.htm](https://www.tutorialspoint.com/design_pattern/chain_of_responsibility_pattern.htm)
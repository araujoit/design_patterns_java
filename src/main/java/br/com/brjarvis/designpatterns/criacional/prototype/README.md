## Prototype Pattern

Padrão de protótipo refere-se à criação de objetos duplicados, mantendo o desempenho em mente. 

Esse tipo de padrão de design vem em padrão de criação, pois esse padrão fornece uma das melhores maneiras de criar um objeto.

Esse padrão envolve a implementação de uma interface de protótipo que informa para criar um clone do objeto atual. 

Esse padrão é usado quando a criação do objeto é diretamente cara. 

Por exemplo, um objeto deve ser criado após uma operação de banco de dados dispendiosa. 

Podemos armazenar em cache o objeto, retorna seu clone na próxima solicitação e atualiza o banco de dados como e quando necessário, reduzindo assim as chamadas do banco de dados.




-----
Este padrão se enquadra como:
- [Padrão criacional](https://github.com/araujoit/design_patterns#criacional);
-----




#### Diagrama:
[![Builder](https://www.tutorialspoint.com/design_pattern/images/prototype_pattern_uml_diagram.jpg)



Referências
----
* [Prototype](https://www.tutorialspoint.com/design_pattern/prototype_pattern.htm)


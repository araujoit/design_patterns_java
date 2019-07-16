
# Design Patterns
Este repositório tem como finalidade apresentar e implementar os padrões de projeto de software, também conhecidos como **Design Patterns**


Lista de padrões “**Gof**” organizados nas suas famílias:

## [Criacional](https://github.com/araujoit/design_patterns/tree/master/src/main/java/br/com/brjarvis/designpatterns/criacional)
* **[Singleton](https://github.com/araujoit/design_patterns/tree/master/src/main/java/br/com/brjarvis/designpatterns/criacional/singleton)**: assegura que somente um objeto de uma determinada classe seja criado em todo o projeto;
* **[Abstract Factory](https://github.com/araujoit/design_patterns/tree/master/src/main/java/br/com/brjarvis/designpatterns/criacional/abstractfactory)**: permite que um cliente crie famílias de objetos sem especificar suas classes concretas;
* **[Builder](https://github.com/araujoit/design_patterns/tree/master/src/main/java/br/com/brjarvis/designpatterns/criacional/builder)**: encapsular a construção de um produto e permitir que ele seja construído em etapas;
* **[Prototype](https://github.com/araujoit/design_patterns/tree/master/src/main/java/br/com/brjarvis/designpatterns/criacional/prototype)**: permite você criar novas instancias simplesmente copiando instancias existentes;
* **[Factory Method](https://github.com/araujoit/design_patterns/tree/master/src/main/java/br/com/brjarvis/designpatterns/criacional/factory)**: as subclasses decidem quais classes concretas serão criadas.

## [Estrutural](https://github.com/araujoit/design_patterns/tree/master/src/main/java/br/com/brjarvis/designpatterns/estrutural)
* **[Decorator](https://github.com/araujoit/design_patterns/tree/master/src/main/java/br/com/brjarvis/designpatterns/estrutural/decorator)**: envelopa um objeto para fornecer novos comportamentos;
* **[Proxy](https://github.com/araujoit/design_patterns/tree/master/src/main/java/br/com/brjarvis/designpatterns/estrutural/proxy)**: envelopa um objeto para controlar o acesso a ele;
* **[FlyWeigth](https://github.com/araujoit/design_patterns/tree/master/src/main/java/br/com/brjarvis/designpatterns/estrutural/flyweigth)**: uma instancia de uma classe pode ser usada para fornecer muitas “instancias virtuais”;
* **[Facade](https://github.com/araujoit/design_patterns/tree/master/src/main/java/br/com/brjarvis/designpatterns/estrutural/facade)**: simplifica a interface de um conjunto de classes;
* **[Composite](https://github.com/araujoit/design_patterns/tree/master/src/main/java/br/com/brjarvis/designpatterns/estrutural/composite)**: Os clientes tratam as coleções de objetos e os objetos individuais de maneira uniforme;
* **[Bridge](https://github.com/araujoit/design_patterns/tree/master/src/main/java/br/com/brjarvis/designpatterns/estrutural/bridge)**: permite criar uma ponte para variar não apenas a sua implementação, como também as suas abstrações;
* **[Adapter](https://github.com/araujoit/design_patterns/tree/master/src/main/java/br/com/brjarvis/designpatterns/estrutural/adapter)**: envelopa um objeto e fornece a ele uma interface diferente;

## [Comportamental](https://github.com/araujoit/design_patterns/tree/master/src/main/java/br/com/brjarvis/designpatterns/comportamental)
* **[Template Method](https://github.com/araujoit/design_patterns/tree/master/src/main/java/br/com/brjarvis/designpatterns/comportamental/templatemethod)**: As subclasses decidem como implementar os passos de um algoritimo;
* **[Visitor](https://github.com/araujoit/design_patterns/tree/master/src/main/java/br/com/brjarvis/designpatterns/comportamental/visitor)**: permite acrescentar novos recursos a um composto de objetos e o encapsulamento não é importante;
* **[Command](https://github.com/araujoit/design_patterns/tree/master/src/main/java/br/com/brjarvis/designpatterns/comportamental/command)**: encapsula uma solicitação como um objeto;
* **[Strategy](https://github.com/araujoit/design_patterns/tree/master/src/main/java/br/com/brjarvis/designpatterns/comportamental/strategy)**: encapsula comportamentos intercambiáveis e usa a delegação para decidir qual deles será usado;
* **[Chain of Responsibility](https://github.com/araujoit/design_patterns/tree/master/src/main/java/br/com/brjarvis/designpatterns/comportamental/chain)**: permite dar a mais de um objeto a oportunidade de processar uma solicitação;
* **[Iterator](https://github.com/araujoit/design_patterns/tree/master/src/main/java/br/com/brjarvis/designpatterns/comportamental/iterator)**: fornece uma maneira de acessar seqüencialmente uma coleção de objetos sem expor a sua implementação;
* **[Mediator](https://github.com/araujoit/design_patterns/tree/master/src/main/java/br/com/brjarvis/designpatterns/comportamental/mediator)**: centraliza operações complexas de comunicação e controle entre objetos relacionados;
* **[Memento](https://github.com/araujoit/design_patterns/tree/master/src/main/java/br/com/brjarvis/designpatterns/comportamental/memento)**: permite restaurar um objeto a um dos seus estados prévios, por exemplo, quando o usuário seleciona um “desfazer”;
* **[Interpreter](https://github.com/araujoit/design_patterns/tree/master/src/main/java/br/com/brjarvis/designpatterns/comportamental/interpreter)**: permite construir um intérprete para uma linguagem;
* **[State](https://github.com/araujoit/design_patterns/tree/master/src/main/java/br/com/brjarvis/designpatterns/comportamental/state)**: encapsula comportamentos baseados em estados e usa a delegação para alternar comportamentos;
* **[Observer](https://github.com/araujoit/design_patterns/tree/master/src/main/java/br/com/brjarvis/designpatterns/comportamental/observer)**: permite notificar outros objetos quando ocorre uma mudança de estado.

Os padrões freqüentemente são classificados com base num segundo atributo, se lidam ou não com classes ou objetos.

## Padrões de classe
Descrevem como as relações entre classes são definidas através da hereditariedade. As relações, nos padrões de classe, são estabelecidas no momento da compilação.
* [Factory Method](https://github.com/araujoit/design_patterns/tree/master/src/main/java/br/com/brjarvis/designpatterns/criacional/factory)
* [Adapter](https://github.com/araujoit/design_patterns/tree/master/src/main/java/br/com/brjarvis/designpatterns/estrutural/adapter)
* [Template Method](https://github.com/araujoit/design_patterns/tree/master/src/main/java/br/com/brjarvis/designpatterns/comportamental/templatemethod)
* [Interpreter](https://github.com/araujoit/design_patterns/tree/master/src/main/java/br/com/brjarvis/designpatterns/comportamental/interpreter)

## Padrões de objetos
Descrevem os relacionamentos entre objetos e são definidos primariamente por composição. Os relacionamentos nos padrões de objetos normalmente são criados durante a execução e são muito mais dinâmicos e flexíveis.
* [Template Method](https://github.com/araujoit/design_patterns/tree/master/src/main/java/br/com/brjarvis/designpatterns/comportamental/templatemethod)
* [Visitor](https://github.com/araujoit/design_patterns/tree/master/src/main/java/br/com/brjarvis/designpatterns/comportamental/visitor)
* [Command](https://github.com/araujoit/design_patterns/tree/master/src/main/java/br/com/brjarvis/designpatterns/comportamental/command)
* [Strategy](https://github.com/araujoit/design_patterns/tree/master/src/main/java/br/com/brjarvis/designpatterns/comportamental/strategy)
* [Chain of Responsibility](https://github.com/araujoit/design_patterns/tree/master/src/main/java/br/com/brjarvis/designpatterns/comportamental/chain)
* [Iterator](https://github.com/araujoit/design_patterns/tree/master/src/main/java/br/com/brjarvis/designpatterns/comportamental/iterator)
* [Mediator](https://github.com/araujoit/design_patterns/tree/master/src/main/java/br/com/brjarvis/designpatterns/comportamental/mediator)
* [Memento](https://github.com/araujoit/design_patterns/tree/master/src/main/java/br/com/brjarvis/designpatterns/comportamental/memento)
* [Interpreter](https://github.com/araujoit/design_patterns/tree/master/src/main/java/br/com/brjarvis/designpatterns/comportamental/interpreter)
* [State](https://github.com/araujoit/design_patterns/tree/master/src/main/java/br/com/brjarvis/designpatterns/comportamental/state)
* [Observer](https://github.com/araujoit/design_patterns/tree/master/src/main/java/br/com/brjarvis/designpatterns/comportamental/observer)

___

#### Fontes
- [Devmedia](https://www.devmedia.com.br/design-patterns-padroes-gof/16781)

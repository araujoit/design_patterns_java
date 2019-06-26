
# Design Patterns
Este repositório tem como finalidade apresentar e implementar os padrões de projeto de software, também conhecidos como **Design Patterns**


Lista de padrões “**Gof**” organizados nas suas famílias:

## Criacional
* **Singleton**: assegura que somente um objeto de uma determinada classe seja criado em todo o projeto;
* **Abstract Factory**: permite que um cliente crie famílias de objetos sem especificar suas classes concretas;
* **Builder**: encapsular a construção de um produto e permitir que ele seja construído em etapas;
* **Prototype**: permite você criar novas instancias simplesmente copiando instancias existentes;
* **Factory Method**: as subclasses decidem quais classes concretas serão criadas.

## Estrutural
* **Decorator**: envelopa um objeto para fornecer novos comportamentos;
* **Proxy**: envelopa um objeto para controlar o acesso a ele;
* **FlyWeigth**: uma instancia de uma classe pode ser usada para fornecer muitas “instancias virtuais”;
* **Facade**: simplifica a interface de um conjunto de classes;
* **Composite**: Os clientes tratam as coleções de objetos e os objetos individuais de maneira uniforme;
* **Bridge**: permite criar uma ponte para variar não apenas a sua implementação, como também as suas abstrações;
* **Adapter**: envelopa um objeto e fornece a ele uma interface diferente;

## Comportamental
* **Template Method**: As subclasses decidem como implementar os passos de um algoritimo;
* **Visitor**: permite acrescentar novos recursos a um composto de objetos e o encapsulamento não é importante;
* **Command**: encapsula uma solicitação como um objeto;
* **Strategy**: encapsula comportamentos intercambiáveis e usa a delegação para decidir qual deles será usado;
* **Chair of Responsability**: permite dar a mais de um objeto a oportunidade de processar uma solicitação;
* **Iterator**: fornece uma maneira de acessar seqüencialmente uma coleção de objetos sem expor a sua implementação;
* **Mediator**: centraliza operações complexas de comunicação e controle entre objetos relacionados;
* **Memento**: permite restaurar um objeto a um dos seus estados prévios, por exemplo, quando o usuário seleciona um “desfazer”;
* **Interpreter**: permite construir um intérprete para uma linguagem;
* **State**: encapsula comportamentos baseados em estados e usa a delegação para alternar comportamentos;
* **Observer**: permite notificar outros objetos quando ocorre uma mudança de estado.

Os padrões freqüentemente são classificados com base num segundo atributo, se lidam ou não com classes ou objetos.

## Padrões de classe
Descrevem como as relações entre classes são definidas através da hereditariedade. As relações, nos padrões de classe, são estabelecidas no momento da compilação.
* Factory Method;
* Adapter;
* Template Method;
* Interpreter.

## Padrões de objetos
Descrevem os relacionamentos entre objetos e são definidos primariamente por composição. Os relacionamentos nos padrões de objetos normalmente são criados durante a execução e são muito mais dinâmicos e flexíveis.
* Template Method;
* Mediator;
* Iterator;
* Visitor;
* Memento;
* Interpreter;
* Strategy;
* Command;
* Chair of Responsability;
* Observer;
* State

___

#### Fontes
- [Devmedia](https://www.devmedia.com.br/design-patterns-padroes-gof/16781)

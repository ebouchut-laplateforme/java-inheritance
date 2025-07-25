# Java Inheritance - Lab

## Description

In this lab, we practice **Java Inheritance** to discover out how to:  
 
- A [subclass inherits from its mother class](src/main/java/com/ericbouchut/inheritance/SingleLevelInheritance.java)
- Create a [class inheritance hierarchy](src/main/java/com/ericbouchut/inheritance/HierarchicalInheritance.java)
  ```mermaid
  classDiagram
      class GrandFather {
          ~ grandFather()
      }
      class Father {
          ~ father()
      }
      class Son {
          ~ son()
      }
      
      GrandFather <|-- Father
      Father      <|-- Son
  ``` 
- Define [code contract with an `Interface`](src/main/java/com/ericbouchut/inheritance/MultipleLevelInheritance.java)
- [Implement this contract (`Interface`) in a class using `implements`](src/main/java/com/ericbouchut/inheritance/MultipleLevelInheritance.java)
- [Abstract Class](src/main/java/com/ericbouchut/inheritance/HybridInheritance.java)



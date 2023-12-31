# Design Patterns in java
## Strategy Pattern in Java

This project demonstrates the Strategy Pattern in Java. The Strategy Pattern is a behavioral design pattern that defines a family of algorithms, encapsulates each algorithm, and makes them interchangeable. It lets the client choose the algorithm at runtime.

### Overview

The project consists of the following components:

- **Context**: The class that uses a strategy. It has a reference to a strategy object and can switch between different strategies.

- **Strategy**: An interface or abstract class that defines the family of algorithms. Concrete strategies implement this interface.

- **Concrete Strategies**: Classes that implement the Strategy interface. They provide specific implementations of the algorithm.


## Observer Pattern in java

### Overview

The Observer Pattern is a behavioral design pattern where an object, known as the subject, maintains a list of its dependents, known as observers, that are notified of any changes in the subject's state.

#### Components

- **Subject**: The class that maintains a list of observers and notifies them of state changes.
- **Observer**: The interface or abstract class that defines the method(s) to be called when the subject's state changes.
- **ConcreteSubject**: The class that extends or implements the Subject, and its state changes trigger notifications to observers.
- **ConcreteObserver**: The class that implements the Observer interface and is notified when the subject's state changes.


## Usage

1. Clone the repository:

   ```bash
   git clone https://github.com/nikks95/design-patterns-java.git
   cd strategy-pattern
   make run
   make clean
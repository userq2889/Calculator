# Calculator Application

This is a simple calculator application built in Java. It provides basic arithmetic operations such as addition, subtraction, multiplication, and division.

## Features

- Addition of two numbers
- Subtraction of two numbers
- Multiplication of two numbers
- Division of two numbers

## Project Structure

```
calculator-app
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── calculator
│   │   │           ├── Calculator.java
│   │   │           └── App.java
│   │   └── resources
│   └── test
│       └── java
│           └── com
│               └── calculator
│                   └── CalculatorTest.java
├── pom.xml
└── README.md
```

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed on your machine.
- Maven installed for building the project.

### Building the Project

To build the project, navigate to the project directory and run the following command:

```
mvn clean install
```

### Running the Application

After building the project, you can run the application using the following command:

```
mvn exec:java -Dexec.mainClass="com.calculator.App"
```

## Running Tests

To run the unit tests for the Calculator class, use the following command:

```
mvn test
```

## Author

Your Name

## License

This project is licensed under the MIT License.
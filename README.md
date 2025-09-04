# Calculator Application

A simple Java calculator application with a Swing-based graphical user interface (GUI) for basic arithmetic operations.

## Features
- Addition, subtraction, multiplication, and division
- Input validation (only numbers allowed)
- Error handling for invalid input and division by zero
- Clear button to reset inputs and result
- Unit tests using JUnit

## Requirements
- Java 8 or higher
- Maven

## How to Build

1. Open a terminal in the project directory.
2. Run:
   ```sh
   mvn clean compile
   ```

## How to Run

### Using Maven
```
mvn exec:java -Dexec.mainClass="com.calculator.CalculatorUI"
```

### Using the JAR file
1. Package the project:
   ```sh
   mvn clean package
   ```
2. Run the JAR:
   ```sh
   java -jar target/calculator-app-1.0-SNAPSHOT.jar
   ```

## How to Test
```
mvn test
```

## How to Push to GitHub
1. Make sure your repo is connected:
   ```sh
   git remote -v
   ```
2. Add, commit, and push:
   ```sh
   git add .
   git commit -m "Your message"
   git push -u origin main
   ```

## Project Structure
```
calculator-app/
├── pom.xml
├── README.md
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/calculator/
│   │   │       ├── App.java
│   │   │       ├── Calculator.java
│   │   │       └── CalculatorUI.java
│   └── test/
│       └── java/
│           └── com/calculator/
│               └── CalculatorTest.java
└── target/
```

## License
MIT


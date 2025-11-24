# 🎓 CodeSoft Internship

This repository contains a collection of Java projects completed as part of the **CodeSoft Internship Program**.  
Each project demonstrates key programming concepts, ranging from basic logic and loops to OOP, file handling, GUI development, and working with external APIs.

---

## 📁 Project List

### 🎮 Number Guessing Game
The **Number Guessing Game** is a simple and interactive Java console application where the player attempts to guess a randomly generated number within a limited number of attempts.

This project demonstrates core Java concepts such as loops, conditionals, random number generation, and user input handling — making it a great beginner-level logic-based program.

**🕹️ How the Game Works:**

- The computer randomly selects a number between **1 and 100**
- The user gets **5 attempts** to guess the correct number
- After each guess, the program provides feedback:
  - `"Too high!"`
  - `"Too low!"`
  - `"Congratulations! You guessed it!"`
- If the user guesses correctly or runs out of attempts, the round ends
- The player can choose whether to **play again or exit**

**✨ Features:**

✔ Random number generation  
✔ Attempt tracking  
✔ User-friendly hints and messages  
✔ Replay option (yes/no prompt)  
✔ Input validation for smooth gameplay

**🧠 Concepts Demonstrated:**

| Concept | Used in Project |
|--------|------------------|
| `Scanner` | To take user input |
| `Random` class | To generate random numbers |
| Loops (`while`) | For repeated gameplay |
| Conditionals (`if-else`) | To compare guesses and give feedback |
| Boolean logic | To control replay and game flow |

---

### 📘 Student Grade Calculator
The **Student Grade Calculator** is a simple Java-based console application that collects a student's marks for multiple subjects and automatically calculates their total marks, average percentage, and final grade.

This project focuses on core Java fundamentals such as user input handling, loops, conditionals, and basic arithmetic operations.

**🧮 How It Works:**

1. The user enters the **number of subjects**
2. The program prompts the user to input marks for each subject (out of 100)
3. The program calculates:
   - ✔ Total Marks  
   - ✔ Average Percentage  
   - ✔ Letter Grade based on the final percentage
4. The user receives a formatted result summary

**🏷️ Grading Criteria:**

| Percentage | Grade |
|-----------|-------|
| ≥ 90%     | A+    |
| 80–89%    | A     |
| 70–79%    | B     |
| 60–69%    | C     |
| 50–59%    | D     |
| Below 50% | Fail  |

**✨Features:**

✔ Takes dynamic subject count  
✔ Validates input (marks must be between 0–100)  
✔ Displays total, percentage, and grade  
✔ Beginner-friendly logic 

**🧠 Concepts Used:**

| Concept | Applied |
|--------|---------|
| `Scanner` | Taking user input |
| Loops (`for`) | Inputting marks and summing values |
| Conditional Statements (`if-else`) | Grade assignment |
| Type Casting | Accurate percentage calculation |
| Input Validation | Preventing invalid marks | 

---

### 🏧 ATM Interface
The **ATM Interface** project is a console-based banking simulation built using Java and Object-Oriented Programming (OOP) principles. The program allows users to interact with a virtual ATM and perform basic banking operations such as depositing money, withdrawing funds, and checking account balance.

**💼 Features:**

✔ Deposit money into the account  
✔ Withdraw money (with insufficient balance validation)  
✔ Check current account balance  
✔ Menu-driven user interface  
✔ Clean and modular structure using classes and methods  

**🧠 Concepts Demonstrated:**

| Concept | Usage |
|--------|-------|
| Object-Oriented Programming | `BankAccount` and `ATM` classes |
| Encapsulation | Private balance variable with controlled access |
| Methods | `deposit()`, `withdraw()`, `checkBalance()` |
| Conditionals | Validate balance before withdrawal |
| Loops | Menu-driven program flow |
| Input Handling | `Scanner` for user interaction |

**🗂 Class Structure:**

| Class Name | Responsibility |
|------------|---------------|
| `BankAccount` | Stores and manages user account balance |
| `ATM` | Handles user interaction and menu navigation |

---

### 💱 Currency Converter
This Java-based Currency Converter fetches **live foreign exchange rates** using a public REST API and allows users to convert an amount from **INR (Indian Rupees)** to multiple international currencies.

This project demonstrates handling web API calls in Java, JSON data parsing, error handling, and designing an interactive console-based application.

**🔗 API Used:**

The application retrieves real-time exchange rates from:
`https://api.exchangerate-api.com/v4/latest/INR`

**✨ Features:**

✔ Fetches live currency conversion rates  
✔ Converts INR → USD / EUR / GBP / JPY / AUD (extendable)  
✔ Menu-based console navigation  
✔ Input validation and friendly messages  
✔ Handles API failure gracefully

**🧰 Technologies Used:**

| Component | Purpose |
|----------|---------|
| `HttpURLConnection` | Fetching real-time data via HTTP GET request |
| `org.json` Library | Parsing JSON response from the API |
| `Scanner` | User input and interaction |
| Try–Catch Exception Handling | Network failure and input safety |

**🧠 Concepts Learned:**

- Working with Web APIs in Java  
- Parsing JSON data  
- HTTP networking  
- Loop-based user menus  
- Error handling and input validation
  
---

### 🏫 Student Management System — GUI (Java Swing)
The **Student Management System (GUI Version)** is a Java-based desktop application built using **Swing** and **Object-Oriented Programming**. It allows users to manage student records interactively with a graphical interface rather than a console.

This project demonstrates GUI development, event handling, serialization, CRUD operations, and data persistence in Java.

**✨ Features:**

✔ Add new student records  
✔ Update existing student details  
✔ Search student by roll number  
✔ Remove student records  
✔ View all students in a table interface  
✔ Automatic data saving using serialization  
✔ Double-click row load feature  
✔ Delete row using keyboard **Delete key**

**🧠 Concepts Demonstrated:**

| Concept | Applied In |
|--------|------------|
| Java Swing | GUI (JFrame, JTable, JButton, JTextField) |
| OOP | Separate `Student`, `StudentManagementSystem`, and GUI class |
| Serialization | Persistent saving of student records |
| JTable + TableModel | Displaying student data dynamically |
| Event Listeners | Button actions & row interactions |
| Exception Handling | Input and file safety |

**📂 Class Structure:**

| Class Name | Purpose |
|------------|---------|
| `Student` | Represents a student object (name, roll, grade) |
| `StudentManagementSystem` | Handles storage, search, update, and persistence |
| `StudentManagementGUI` | Main user interface implementation |


---

## 🧠 Concepts Covered

- Variables, Data Types & User Input  
- Loops & Conditional Statements  
- Methods & Modular Programming  
- Exception Handling  
- Object-Oriented Programming (Encapsulation, Classes, Objects)  
- File Handling & Serialization  
- External JSON Parsing (`org.json`)  
- Swing GUI Development  

---

## 🛠️ Technologies Used

| Technology | Purpose |
|-----------|---------|
| Java 8+ | Main programming language |
| IntelliJ IDEA | Development environment |
| Swing | GUI Development |
| `java.net.HttpURLConnection` | API calls |
| `org.json` | JSON parsing |

---

## 🚀 How to Run

1. Clone the repository:
   ```sh
   git clone https://github.com/<Ashif2601>/<Codesoft>

# 🏦 Kotak Bank Management System

A **Console-Based Banking Application** developed in **Java** using **Object-Oriented Programming (OOP)** concepts. This project simulates real-world banking operations such as account creation, deposits, withdrawals, fund transfers, balance inquiries, and transaction history while implementing exception handling and clean project architecture.

---

## 📌 Project Overview

The **Kotak Bank Management System** is a Java console application designed to demonstrate core Java concepts through a real-world banking system.

It provides secure banking operations with proper validations, custom exception handling, and modular programming using packages and classes.

This project is suitable for:
- Java Beginners
- OOP Practice
- Mini/Major Project
- Resume & GitHub Portfolio

---

# ✨ Features

### 👤 Account Management
- Create New Account
- View Account Details
- Search Account
- Delete Account

### 💰 Banking Operations
- Deposit Money
- Withdraw Money
- Transfer Money
- Check Balance

### 📜 Transaction Management
- Transaction History
- Mini Statement

### 🔒 Validations
- Duplicate Account Checking
- Insufficient Balance Validation
- Invalid Amount Validation
- Account Not Found Validation

### ⚠ Exception Handling
- InsufficientBalanceException
- InvalidAmountException
- AccountNotFoundException
- InvalidAccountException
- Custom User Exceptions

---

# 🛠 Technologies Used

| Technology | Description |
|------------|-------------|
| Java | Core Programming Language |
| OOP | Object-Oriented Programming |
| Collections | ArrayList |
| Exception Handling | Custom Exceptions |
| IntelliJ IDEA | IDE |
| Git | Version Control |
| GitHub | Repository Hosting |

---

# 📂 Project Structure

```
KotakBankApplication
│
├── model
│     ├── Account.java
│     ├── Transaction.java
│
├── service
│     ├── BankService.java
│
├── exception
│     ├── InsufficientBalanceException.java
│     ├── InvalidAmountException.java
│     ├── AccountNotFoundException.java
│
├── util
│     ├── AccountGenerator.java
│
├── main
│     ├── Main.java
│
└── README.md
```

---

# 🚀 How to Run

### Clone Repository

```bash
git clone https://github.com/yourusername/KotakBankApplication.git
```

---

### Open Project

Open the project using:

- IntelliJ IDEA
- Eclipse
- VS Code (Java Extension)

---

### Compile

```bash
javac *.java
```

---

### Run

```bash
java Main
```

---

# 📷 Console Menu

```
========================================
        KOTAK BANK APPLICATION
========================================

1. Create Account
2. Deposit Money
3. Withdraw Money
4. Transfer Money
5. Check Balance
6. Transaction History
7. View Account Details
8. Delete Account
9. Exit

Enter your choice:
```

---

# 💻 Sample Output

```
=====================================
WELCOME TO KOTAK BANK
=====================================

1.Create Account
2.Deposit
3.Withdraw
4.Transfer
5.Check Balance
6.Transaction History
7.Exit

Enter Choice : 1

Enter Customer Name : Charan Teja

Enter Initial Deposit : 5000

------------------------------------
Account Created Successfully
------------------------------------

Account Number : 1001001

Customer Name : Charan Teja

Balance : ₹5000.00
```

---

## Deposit

```
Enter Account Number : 1001001

Enter Deposit Amount : 2000

------------------------------------
Deposit Successful
------------------------------------

Current Balance : ₹7000.00
```

---

## Withdraw

```
Enter Account Number : 1001001

Enter Withdraw Amount : 1000

------------------------------------
Withdrawal Successful
------------------------------------

Current Balance : ₹6000.00
```

---

## Transfer

```
Sender Account : 1001001

Receiver Account : 1001002

Transfer Amount : 1500

------------------------------------
Transfer Successful
------------------------------------

Sender Balance : ₹4500.00

Receiver Balance : ₹8500.00
```

---

## Balance Enquiry

```
Enter Account Number : 1001001

------------------------------------

Available Balance

₹4500.00
```

---

## Transaction History

```
------------------------------------
Transaction History
------------------------------------

Deposit      ₹5000

Deposit      ₹2000

Withdraw     ₹1000

Transfer     ₹1500
```

---

## Exception Example

```
Enter Withdraw Amount : 9000

Exception :

InsufficientBalanceException

Insufficient Balance!

Available Balance : ₹4500
```

---

# 🎯 Java Concepts Used

- Classes & Objects
- Constructors
- Encapsulation
- Inheritance
- Polymorphism
- Method Overloading
- Packages
- Exception Handling
- Custom Exceptions
- Collections (ArrayList)
- Loops
- Conditional Statements
- Scanner Class
- Static Members
- Object-Oriented Design

---

# 📖 Learning Outcomes

After completing this project, you will understand:

- Java OOP Concepts
- Real-Time Banking Workflow
- Exception Handling
- Modular Programming
- Collections Framework
- Git & GitHub
- Console-Based Application Development
- Clean Code Practices

---

# 📈 Future Enhancements

- Login Authentication
- Admin Dashboard
- JDBC Database Integration
- MySQL Support
- File Handling
- Interest Calculation
- ATM Simulation
- Loan Management
- Fixed Deposit Module
- GUI using Java Swing/JavaFX
- Spring Boot REST API

---

# 👨‍💻 Author

**Charan Teja**

Java Full Stack Developer

---

# ⭐ Support

If you found this project useful, don't forget to ⭐ **Star** this repository and share your feedback.

---

## 📄 License

This project is developed for educational and learning purposes.

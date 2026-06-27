# 🏧 ATM Interface in Java

> Developed as part of my Java Development and Problem-Solving Journey under Decodelabs Internship.

## 📌 Project Overview

The ATM Interface is a console-based Java application that simulates real-world banking operations using Object-Oriented Programming principles. The application allows users to deposit money, withdraw funds, and check account balance through a menu-driven interface while ensuring proper input validation and secure transaction processing.

The project focuses on designing a resilient and maintainable system by separating user interaction from business logic and encapsulating account data.

---

## 🎯 Objective

To transition from procedural programming to Object-Oriented System Design by building an ATM system that is secure, reliable, and capable of processing financial transactions with proper validations and error handling.

---

## ✨ Features

* Deposit Money
* Withdraw Money
* Check Account Balance
* Menu-Driven Interface
* Input Validation
* Insufficient Balance Handling
* Invalid Amount Validation
* Exception Handling
* Continuous Transaction Loop Until Exit

---

## 🛠️ Technologies & Concepts Used

* Java
* Classes and Objects
* Encapsulation
* Constructors
* Methods
* Composition (HAS-A Relationship)
* Scanner Class
* Loops (`do-while`, `while`)
* Conditional Statements (`if-else`, `switch`)
* Exception Handling (`try-catch`)
* Input Validation

---

## 🏗️ System Architecture

User
↓
ATM Interface
↓
BankAccount Object
↓
Business Logic
↓
Transaction Processing
↓
Display Result

---

## 📦 Class Design

### BankAccount Class

**Responsibilities**

* Maintain account balance
* Deposit money
* Withdraw money
* Return current balance

### ATM Class

**Responsibilities**

* Display menu
* Take user input
* Validate choices and amounts
* Invoke BankAccount methods
* Display transaction messages

---

## 🔒 OOP Principles Implemented

### Encapsulation

The account balance is declared as private and can only be modified through methods such as `deposit()` and `withdraw()`.

### Composition (HAS-A Relationship)

An ATM object maintains a reference to a BankAccount object to perform transactions.

### Separation of Concerns

* ATM Class → User Interaction
* BankAccount Class → Business Logic and Data Management

---

## 🚀 Learning Outcomes

This project strengthened my understanding of:

* Object-Oriented Programming
* Class Design and Responsibilities
* Encapsulation and Data Hiding
* Composition Relationships
* Menu-Driven Application Development
* Exception Handling
* Input Validation
* Designing Maintainable and Failure-Resistant Systems
* Thinking Beyond Procedural Programming

---

## 👩‍💻 Author

**Sakshi Khandelwal**

BCA Student | Java Developer | DSA Learner | Building Projects and Strengthening Problem-Solving Skills 🚀

# Payment System

## Overview

Payment System is a Java-based console application developed to demonstrate Object-Oriented Programming (OOP) concepts through a real-world payment processing workflow.

The application supports multiple payment methods including Credit Card, Debit Card, UPI, and Net Banking. It validates payment requests, generates unique payment IDs, processes transactions, and updates transaction status accordingly.

This project focuses on clean architecture, code reusability, abstraction, and extensibility.

---

## Project Status

Current Version: v1.0

Status: Functional and Completed for Core Java OOP Demonstration

---

## Implemented Features

### Payment Processing

* Credit Card Payment Processing
* Debit Card Payment Processing
* UPI Payment Processing
* Net Banking Payment Processing

### Payment Management

* Automatic Payment ID Generation
* Payment Amount Validation
* Payment Status Tracking
* Payment Type Tracking

### Object-Oriented Design

* Interface Implementation
* Abstract Class Usage
* Inheritance
* Polymorphism
* Encapsulation
* Enum-Based Status and Type Management

### Code Quality

* Modular Class Design
* Reusable Payment Processing Architecture
* Extensible Structure for Future Payment Methods

---

## Features Currently Working

| Feature               | Status      |
| --------------------- | ----------- |
| Payment Creation      | Implemented |
| Payment Validation    | Implemented |
| Credit Card Payments  | Implemented |
| Debit Card Payments   | Implemented |
| UPI Payments          | Implemented |
| Net Banking Payments  | Implemented |
| Payment Status Update | Implemented |
| Payment ID Generation | Implemented |
| OOP Architecture      | Implemented |

---

## Future Scope

The following features are planned for future versions and are currently not implemented:

| Feature                             | Status  |
| ----------------------------------- | ------- |
| MySQL Database Integration          | Pending |
| Spring Boot REST APIs               | Pending |
| Transaction History Storage         | Pending |
| User Authentication & Authorization | Pending |
| Payment Reports                     | Pending |
| Logging Framework Integration       | Pending |
| Exception Handling Framework        | Pending |
| JUnit Test Cases                    | Pending |
| Payment Gateway Integration         | Pending |
| Admin Dashboard                     | Pending |

---

## Technologies Used

* Java
* Object-Oriented Programming
* IntelliJ IDEA
* Git
* GitHub

---

## Project Structure

```text
src/
│
├── Main.java
├── Payment.java
├── PaymentProcessor.java
├── PaymentMethod.java
├── PaymentIdGenerator.java
│
├── CreditCardPayment.java
├── DebitCardPayment.java
├── UpiPayment.java
├── NetBankingPayment.java
│
├── PaymentType.java
└── PaymentStatus.java
```

---

## System Architecture

```text
                 PaymentProcessor
                      Interface
                           ▲
                           │
                    PaymentMethod
                    Abstract Class
                           ▲
        ┌──────────────────┼──────────────────┐
        │                  │                  │
 CreditCardPayment  DebitCardPayment   UpiPayment
                                               │
                                               │
                                     NetBankingPayment
```

---

## OOP Concepts Demonstrated

### Encapsulation

Transaction details are stored within the Payment class and accessed through controlled methods.

### Abstraction

The PaymentMethod abstract class provides shared functionality while hiding implementation details.

### Inheritance

Payment-specific classes inherit common behavior from the PaymentMethod base class.

### Polymorphism

Different payment methods are accessed through the common PaymentProcessor interface.

### Interface

The PaymentProcessor interface defines the contract for all payment implementations.

### Enums

PaymentStatus and PaymentType provide type-safe status and payment categorization.

---

## Sample Console Output

### UPI Payment

```text
Processing UPI Payment

Payment Id : 1001
Amount : 5000.0
Status : SUCCESS
Type : UPI
```

### Credit Card Payment

```text
Processing Credit Card Payment

Payment Id : 1002
Amount : 5000.0
Status : SUCCESS
Type : CREDIT_CARD
```

### Debit Card Payment

```text
Processing Debit Card Payment

Payment Id : 1003
Amount : 5000.0
Status : SUCCESS
Type : DEBIT_CARD
```

### Net Banking Payment

```text
Processing Net Banking Payment

Payment Id : 1004
Amount : 5000.0
Status : SUCCESS
Type : NET_BANKING
```

### Invalid Payment

```text
Invalid Amount
Payment Failed
```

---

## How to Run

Clone the repository:

```bash
git clone https://github.com/PritiiiiMali/paymentsystem.git
```

Navigate to the project directory:

```bash
cd paymentsystem
```

Compile the project:

```bash
javac *.java
```

Run the application:

```bash
java Main
```

---

## Skills Demonstrated

* Core Java
* Object-Oriented Programming
* Interfaces
* Abstract Classes
* Inheritance
* Polymorphism
* Encapsulation
* Enums
* Static Methods
* Validation Logic
* Software Design Principles
* Git Version Control

---

## Author

Priti Mali

- GitHub: https://github.com/PritiiiiMali
- LinkedIn: https://www.linkedin.com/in/priti-mali-845b501a7/

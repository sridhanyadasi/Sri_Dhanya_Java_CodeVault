# Inheritance – Banking Examples in Java

## 1. Introduction

This package contains practical Java inheritance examples based on banking and customer-related scenarios.

It demonstrates how inheritance can be used to represent different types of bank accounts and customer relationships by reusing common properties and methods.

## 2. Topics Covered

### 2.1 Account Holder and Bank Account Inheritance

This example demonstrates inheritance using AccountHolder, SavingsAccount and CurrentAccount classes.

- `AccountHolder` – Parent class containing common account holder details.
- `SavingsAccount` – Child class representing a savings account.
- `CurrentAccount` – Child class representing a current account.
- `TestAccountHolder` – Executes and tests the account holder inheritance example.

**Flowchart:**

```text id="g8m2vd"
                ┌──────────────────────┐
                │    AccountHolder     │
                │                      │
                │  Common Details      │
                │  Common Methods      │
                └──────────┬───────────┘
                           │
                 ┌─────────┴─────────┐
                 │                   │
                 ↓                   ↓
       ┌──────────────────┐  ┌──────────────────┐
       │  SavingsAccount  │  │  CurrentAccount  │
       │                  │  │                  │
       │ Savings Features │  │ Current Features │
       └──────────────────┘  └──────────────────┘
```

This demonstrates **hierarchical inheritance**, where multiple child classes inherit from one parent class.

### 2.2 Customer and Loan Applicant

This example demonstrates inheritance using Customer and LoanApplicant classes.

- `Customer` – Contains customer-related details.
- `LoanApplicant` – Represents a customer applying for a loan.
- `TestLoan` – Executes and tests the loan applicant inheritance example.

**Flowchart:**

```text id="p5k9xc"
       ┌──────────────────────┐
       │       Customer       │
       │                      │
       │  Customer Details    │
       │  Common Methods      │
       └──────────┬───────────┘
                  │
                  ↓
       ┌──────────────────────┐
       │    LoanApplicant     │
       │                      │
       │  Loan-related Data   │
       │  Loan-related Methods│
       └──────────────────────┘
```

This demonstrates a parent-child relationship using a banking-related scenario.

## 3. Important Concepts

| Concept | Description |
|---|---|
| Parent Class | Provides common properties and methods |
| Child Class | Inherits functionality from a parent class |
| Hierarchical Inheritance | Multiple child classes inherit from one parent |
| Code Reusability | Reusing common account or customer details |
| Real-World Modeling | Representing banking relationships through classes |

## 4. Learning Outcomes

After completing this package, we can:

- Understand inheritance through banking examples.
- Create parent and child classes for banking scenarios.
- Implement hierarchical inheritance.
- Reuse common account holder details.
- Understand different account types through inheritance.
- Represent customer and loan applicant relationships.
- Execute and test banking-related inheritance programs.

## 5. Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Eclipse IDE

## 6. Conclusion

This package demonstrates how inheritance can be applied to banking-related applications. It helps understand code reusability and class relationships through account holder, savings account, current account and loan applicant examples.

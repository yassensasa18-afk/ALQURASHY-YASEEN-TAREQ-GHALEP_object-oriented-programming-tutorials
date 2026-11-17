# Object-Oriented Programming (Java) – Lab Tutorials Portfolio

> **Assignment 1 (Individual, 20%)** – Consolidated GitHub repository of all OOP lab tutorials (Week 1 – Week 10)

![Java](https://img.shields.io/badge/Java-17%2B-orange?logo=openjdk)
![GitHub Codespaces](https://img.shields.io/badge/GitHub-Codespaces-181717?logo=github)
![License](https://img.shields.io/badge/License-MIT-blue)

---

## 👤 Student Information

| Field | Details |
|---|---|
| **Student Name** | Alqurashy Yaseen Tareq Ghalep |
| **Student ID** | 202501010638 |
| **Programme** | Bachelor of Information Technology (BIT) |
| **Class Code** | BIT1123 |
| **University** | City University Malaysia – Faculty of Information Technology |

## 📚 Course Information

| Field | Details |
|---|---|
| **Course** | DIT1113 / BIT1123 / BISE2093 – Object Oriented Programming (Java) |
| **Assessment** | Assignment 1 – Individual (20%) |
| **Lecturer** | Sir Nazmirul Izzad Bin Nassir |
| **Semester** | 202609 |

### Brief Course Description

This course introduces the fundamentals of **Object-Oriented Programming (OOP)** using Java. It covers classes and objects, constructors, methods, encapsulation, inheritance, polymorphism, abstraction, collections (`ArrayList`), file handling, and building simple graphical user interfaces with Java Swing. Students also practise industry tools such as **Git**, **GitHub** and **GitHub Codespaces** for version control and project organisation.

---

## 🗂️ Repository Structure

```
ALQURASHY-YASEEN-TAREQ-GHALEP_object-oriented-programming-tutorials/
│
├── README.md
├── myreport.pdf                  # Self-reflective report
├── LICENSE
├── .gitignore
│
├── tutorial_1/                   # Week 1 & Week 2
│   ├── week_1/
│   │   ├── HelloWorld.java
│   │   └── StudentGrade.java
│   └── week_2/
│       ├── Main.java
│       └── Student.java
├── tutorial_2/                   # Week 3 – 4
│   ├── Main.java
│   ├── Person.java
│   ├── Student.java
│   └── Lecturer.java
├── tutorial_3/                   # Week 5
│   ├── Main.java
│   ├── Student.java
│   └── documentation.txt
├── tutorial_4/                   # Week 6
│   ├── Main.java
│   ├── Employee.java
│   └── Lecturer.java
├── tutorial_5/                   # Week 7
│   ├── Main.java
│   └── Appliances.java
├── tutorial_6/                   # Week 8 – 9
│   ├── Main.java
│   └── task.txt
└── tutorial_7/                   # Week 10
    ├── Questions.java
    └── QuizBattleGUI.java
```

---

## 📝 Tutorial Summary (Week 1 – 10)

| Tutorial | Week | Topic | OOP Concept(s) Practised |
|---|---|---|---|
| **Tutorial 1** | Week 1 | Getting started with GitHub Codespaces – `HelloWorld` & `StudentGrade` | Java syntax, `Scanner` input, `if-else` selection, Git basics |
| **Tutorial 1** | Week 2 | Coding in Java – `Student` class with `displayInfo()`, `study()`, `takeExam()` | Classes, objects, attributes, constructors, methods |
| **Tutorial 2** | Week 3 – 4 | University people: `Person`, `Student`, `Lecturer` | Inheritance (`extends`, `super`), method overriding, polymorphism |
| **Tutorial 3** | Week 5 | Student Information System | Encapsulation – `private` fields, getters & setters |
| **Tutorial 4** | Week 6 | Employee and Lecturer | Inheritance with `protected` members, extending a class with new attributes |
| **Tutorial 5** | Week 7 | Smart Home Appliance Management System | Abstraction – `abstract` class & `abstract` method, polymorphism |
| **Tutorial 6** | Week 8 – 9 | To-Do List desktop application | `ArrayList`, loops, file writing/reading (`BufferedWriter`, `BufferedReader`), exception handling |
| **Tutorial 7** | Week 10 | Programming Quiz Battle (GUI) | Java Swing (`JFrame`, `JLabel`, `JButton`), event handling (`ActionListener`), interfaces |

### Expected Outputs (sample)

<details>
<summary><b>Tutorial 2 – Week 3-4</b></summary>

```
I am a person.
I am a student.
I am a lecturer.
```
</details>

<details>
<summary><b>Tutorial 3 – Week 5</b></summary>

```
Student ID : CU12345
Name       : Ali
CGPA       : 3.75
Programme: BIT
```
</details>

<details>
<summary><b>Tutorial 4 – Week 6</b></summary>

```
Employee ID : L100
Name        : Dr Ahmad
Subject     : Java Programming
Department  : Faculty of Information Technology
```
</details>

<details>
<summary><b>Tutorial 5 – Week 7</b></summary>

```
Brand : LG
Power ON
Washing clothes...
Power OFF

Brand : Panasonic
Power ON
Store food & beverages...
Power OFF
```
</details>

<details>
<summary><b>Tutorial 6 – Week 8-9</b></summary>

```
===== ADD TASKS =====
Enter Task 1: drink some more water
Enter Task 2: walking at the park
Enter Task 3: eat healthy snack

===== TASK LIST =====
1. drink some more water
2. walking at the park
3. eat healthy snack

Tasks saved successfully.

===== TASKS LOADED FROM FILE =====
drink some more water
walking at the park
eat healthy snack
```
</details>

<details>
<summary><b>Tutorial 7 – Week 10</b></summary>

A Swing window titled **"Programming Quiz Battle"** asks *"Which keyword creates an object?"* with two buttons (`new` / `class`). Clicking the correct answer shows **"Correct! You defeated the Code Boss!"**, otherwise **"Wrong! Try Again!"**.
</details>

---

## 🛠️ Technologies Used

- **Java (JDK 17+)** – programming language
- **Java Swing** – graphical user interface (Tutorial 7)
- **Git** – version control (`git add`, `git commit`, `git push`)
- **GitHub** – remote repository hosting
- **GitHub Codespaces / Visual Studio Code** – cloud development environment

---

## ▶️ How to Run the Projects

**Option 1 – GitHub Codespaces**

1. Open this repository on GitHub → click **`<> Code`** → **Codespaces** → **Create codespace on main**.
2. In the terminal, go into a tutorial folder, compile and run:

```bash
cd tutorial_3            # change to any tutorial folder
javac *.java             # compile all Java files in the folder
java Main                # run the program
```

**Option 2 – Local machine**

```bash
git clone https://github.com/yassensasa18-afk/ALQURASHY-YASEEN-TAREQ-GHALEP_object-oriented-programming-tutorials.git
cd ALQURASHY-YASEEN-TAREQ-GHALEP_object-oriented-programming-tutorials
code .                   # open in VS Code (optional)
```

| Folder | Compile | Run |
|---|---|---|
| `tutorial_1/week_1` | `javac *.java` | `java HelloWorld` / `java StudentGrade` |
| `tutorial_1/week_2` | `javac *.java` | `java Main` |
| `tutorial_2` – `tutorial_6` | `javac *.java` | `java Main` |
| `tutorial_7` | `javac *.java` | `java QuizBattleGUI` |

> ⚠️ **Note:** Tutorial 7 is a Swing GUI application, so it needs a desktop environment. Run it on a local machine (a Codespaces terminal has no screen to display the window).

---

## 💭 Reflection Summary

Completing these tutorials helped me move from writing simple Java programs to designing programs with classes and objects. I learned the four main pillars of OOP – **encapsulation, inheritance, polymorphism and abstraction** – and then applied them in practical systems such as a student information system, a smart home appliance system, a to-do list that saves to a file, and a GUI quiz game. I also learned how to use Git and GitHub to organise and track my work, which is an important industry skill. The full reflection, including the challenges I faced and how I solved them, is in **[`myreport.pdf`](myreport.pdf)**.

---

<p align="center">© 2026 Alqurashy Yaseen Tareq Ghalep · City University Malaysia · Licensed under the MIT License</p>

<!-- 
https://github.com/lifeparticle/Markdown-Cheatsheet
https://youtu.be/eVGEea7adDM?si=cz1Fbqxr9VgioIEh
-->

# Calculator App

<b>Table of Content</b>
- [Summary](#summary)
- [How the Program Works](#how-the-program-works)
- [Console Output Example](#console-output-testing-example)
- [New Concepts](#new-concepts)
- [Maintainers](#maintainers)


## Summary
This app implements an advanced calculator using object-oriented programming principles in Java.
The calculator supports basic arithmetic operations, memory functionality, and advanced mathematical
operations such as exponentiation and square root. The program is designed using interfaces, inheritance,
abstraction, and generics to demonstrate modular and reusable code design.
## How the Program Works
1. Basic Operations
- Defined in the BasicMath interface:

    - Addition
    - Subtraction
    - Multiplication
    - Division

    These operations are implemented in the abstract Calculator class.
2. Advanced Operations
- Extends MemoryCalc and implements AdvanceMath:

    - Square root operation
    - Power (exponentiation)
    - Custom display precision (0–10 decimal places)
3. Calculator
- Stores values such as currentValue, previousValue, and inputValue
- Implements all basic math operations
- Provides a default display format
- Serves as the base class for all calculators
4. Memory Functionality (MemoryCalc)
- Extends Calculator and adds:

    - Memory storage (memoryValue)
    - Memory operations:
      - Clear memory 
      - Add to memory 
      - Subtract from memory 
      - Retrieve memory value
## Console Output Testing Example
```
Calculator is on
Calculator cleared
Calculator precision is 4 decimal places.
       0.0000
+     10.2200
=============
      10.2200

      10.2200
-      2.2200
=============
       8.0000

Memory Add            8.0000
       8.0000
*     10.0000
=============
      80.0000

Memory Subtract     -72.0000
      80.0000
/      2.0000
=============
      40.0000

Calculator precision is 4 decimal places.
      40.0000
^      2.0000
=============
   1,600.0000

√  1,600.0000
=============
      40.0000

Using memory value
      40.0000
+    -72.0000
=============
     -32.0000

Memory Cleared        0.0000

Calculator cleared

```
## New Concepts
- Generics < N extends Number >

    - Allows the calculator to accept different numeric types (e.g., Integer, Double) 
    while maintaining flexibility.

- Interfaces

    - BasicMath and AdvanceMath define required behaviors
    - Promote abstraction and enforce method implementation
- Inheritance

    - MemoryCalc extends Calculator
    - AdvanceCalc extends MemoryCalc
    - Enables code reuse and hierarchical design
- Method Overriding

    - AdvanceCalc overrides display methods to support custom precision
    - Demonstrates polymorphism
- Abstraction

    - Calculator is an abstract class
    - Hides implementation details while exposing essential functionality
## Maintainers
[@suna2km](https://github.com/suna2km) Suna Aregay                                                                                                                        
[Back to Top](#calculator-app)
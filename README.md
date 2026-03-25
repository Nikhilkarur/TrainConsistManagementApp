# Train Consist Management App

Console-based Java application to demonstrate core data structures through railway consist management use cases.

## Branching Strategy
- `main`: stable baseline
- `develop`: integration branch
- `feature1/uc1` to `feature6/uc6`: one branch per use case

## How to Run
1. Compile from project root:
   `javac -d out src/*.java`
2. Run a class:
   `java -cp out UC1InitializeTrain`

Use the class name matching the use case branch you are on.

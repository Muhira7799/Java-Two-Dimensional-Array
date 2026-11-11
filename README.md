# Java Two-Dimensional Array Example

A small Java program that uses a 2D array of strings to build three full names with titles.

## What It Demonstrates

- Declaring and initializing a two-dimensional array (`String[][]`)
- Reading elements with two indexes: `array[row][column]`
- Building text by joining elements with `+`

## The Array

```java
String[][] names = {
    {"Mr. ", "Mrs. ", "Miss. "},        // row 0: titles
    {"John ", "Marry ", "Jolie "},       // row 1: first names
    {"Mutabazi", "Murekatete", "Mutoni"} // row 2: last names
};
```

| | Column 0 | Column 1 | Column 2 |
|---|----------|----------|----------|
| **Row 0** (titles) | Mr. | Mrs. | Miss. |
| **Row 1** (first names) | John | Marry | Jolie |
| **Row 2** (last names) | Mutabazi | Murekatete | Mutoni |

## How It Works

Each name is built by taking the same column from all three rows:

```java
System.out.println(names[0][0] + names[1][0] + names[2][0]);
```

The title and first name end with a space inside the strings, so the parts join into a normal-looking name.

## Output

```
Mr. John Mutabazi
Mrs. Marry Murekatete
Miss. Jolie Mutoni
```

## Requirements

- Java Development Kit (JDK) 8 or higher

## Getting Started

```bash
git clone https://github.com/<your-username>/<your-repo-name>.git
cd <your-repo-name>
javac Double_Arrays.java
java Double_Arrays
```

## Project Structure

```
.
├── Double_Arrays.java
└── README.md
```

## Next Steps

- Use a loop over the columns instead of three separate `println` lines
- Remove the trailing spaces from the strings and add the spaces in the code instead
- Print the whole table with nested `for` loops

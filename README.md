# Coding Kata

<hr/>

### <u>[Roman Numerals Kata](https://codingdojo.org/kata/RomanNumerals/)</u>

Create a method to converting numbers to numerals and a method to convert numerals to numbers. The Romans wrote numbers using letters, such as I, V, X, L, C, D, M.

#### Key Points
- Validating numerals in both methods
- Handling subtraction rule exceptions
- Parse numerals LTR or RTL

<br/>

#### Example Tests

| Test Case | Input  | Expected Output  |
|-----------|--------|------------------|
| Test1     |        | throws Exception |
| Test2     | I      | 1                |
| Test3     | II     | 2                |
| Test4     | III    | 3                |
| Test5     | IV     | 4                |
| Test6     | XIX    | 19               |
| Test7     | XLVIII | 48               |
| Test8     | DLV    | 555              |
| Test9     | CM     | 900              |
| Test10    | MMM    | 3000             |

<br/>

#### Class Diagram
![img_1.png](img_1.png)

<br/>

### <u>[Bowling Game Kata](https://codingdojo.org/kata/Bowling/)</u>

Create a program, which, given a valid sequence of rolls for one line of American Ten-Pin Bowling, produces the total score for the game.

#### Key Points
- Handling bonus scoring
- Lookahead for score when bowler throws striker or spare

<br/>

#### Example Tests

| Test Case | Input                           | Expected Output |
|-----------|---------------------------------|-----------------|
| Test1     | X X X X X X X X X X X X         | 300             |
| Test2     | 9- 9- 9- 9- 9- 9- 9- 9- 9- 9-   | 90              |
| Test3     | 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5 | 150             |

<br/>

#### Class Diagram
![img_2.png](img_2.png)


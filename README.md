# BMI-Calculator

This is a BMI calculator that takes the input of height and weight of the user and returns your BMI along with a message of what weight class you fall into (e.g. underweight). It also takes the user's gender but this has no bearing on the result and was included as a requirement.

![image](https://github.com/HaldenLF/BMI-Calculator/assets/165461117/4fdc7b39-b9ce-4322-96f2-310a5953b0c1)

## Features
- **Height and Weight Input**: Users can input their height and weight.
- **BMI Calculation**: The application calculates the BMI based on the input values.
- **Weight Class Message**: The application returns a message indicating the user's weight class (e.g., underweight, normal weight, overweight, etc.).
- **Gender Input**: Users can input their gender, although it does not affect the BMI calculation.

## Installation
1. Clone the repository:
    ```sh
    git clone https://github.com/HaldenLF/BMI-Calculator.git
    ```
2. Navigate to the project directory:
    ```sh
    cd BMI-Calculator
    ```
3. Install the required dependencies:
    ```sh
    pip install -r requirements.txt
    ```

## Usage
1. Run the main script to start the BMI calculator:
    ```sh
    python bmi_calculator.py
    ```
2. Follow the on-screen instructions to input your height, weight, and gender.
3. The application will display your BMI and the corresponding weight class message.

## Example
```sh
python bmi_calculator.py

> Input your height: 170 (in cm)
> Input your weight: 70 (in kg)
> Input your gender: Male

Output

> Your BMI is 24.2
> You are in the normal weight range.
```

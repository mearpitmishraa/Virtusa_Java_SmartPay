SmartPay Utility Bill Generator

Introduction-
This project is a simple Java-based utility billing system that calculates electricity or water bills based on units consume. It uses slab-based pricing and generates a digital receipt for each customer.

Working Mechanism-
The program takes customer input such as name and metar reading (previous and current). It calculates the units consume and applies different pricing slabs:
First 100 units → ₹1/unit
Next 200 units → ₹2/unit
Above 300 units → ₹5/unit
After calculating the base amount, it adds 18% tax and prints a formatted receipt.

Important Code Explanation-
Interface (Billable) is used to define a method calculateTotal()
Class UtilityBill implements this interface and contains billing logic
Slab calculation is done using conditional statements (if-else)
Scanner class is used for user input
String formatting is used to display amounts neatly
Loop allows multiple users until "Exit" is entered

Logic Used-
Units consumed = Current reading − Last reading
Apply slab-wise billing calculation
Add 18% tax on total amount
Validate input (current reading should not be less than previous)
Generate receipt for each user

Output-
Displays a digital receipt with:
Customer name
Units consumed
Tax amount
Final bill amount
Handles multiple users until exit

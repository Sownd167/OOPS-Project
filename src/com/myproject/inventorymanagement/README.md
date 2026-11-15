INVENTORY MANAGEMENT SYSTEM

Language used: JAVA
1. This project focuses on Inventory Management to store, update, view and remove the stock details.
2. The stocks are used using **HashMap** which has time complexity of O(n) -> worst case and O(1) -> best case.
3. Basic OOP concepts Classes and objects are used, where we have separate classes for each functionality to reduce the dependency, also handled the exceptions using try-catch.
4. The flow of the program is depicted below.

* Main.java -> Start point of the program, the user will be given various options to add the stock, update the existing stock, view the stock and remove the stock.
* Productdetails.java -> A separate class which stores the attributes of the object with getters and setters.
* ProductStorage.java -> A class which creates the HashMap object and it calls the respective classes to do the operations.
* AddingNewProduct.java -> A class to add the new stocks to the HashMap object it will get the product details using command line and will create the object using Productdetails.java
* ViewTheProduct.java -> A class which helps to view either all the stocks or a specific stock as per user's input.
*  

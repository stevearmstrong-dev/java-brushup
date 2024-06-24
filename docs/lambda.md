By a lambda expression (or just "a lambda"), we mean a function that isn't bound to its name (an anonymous function) but can be assigned to a variable.

The most general form of a lambda expression looks like this: (parameters) -> { body };. Here, the part before -> is the list of parameters (like in methods), and the part after that is the body that can return a value. The brackets { } are required only for multi-line lambda expressions.

Sometimes, lambdas don't have parameters or return values or even both. Even if a lambda doesn't have a value to return, it has a body that does some useful actions (e.g. prints or saves something).

Another important thing — like a regular Java object, a lambda expression always has a special type. There are a lot of types presented in the Java Standard Library, two of them are: Function and BiFunction. Both of the classes are located in the java.util.function package among others.

Although Java provides a lot of ways to write lambda expressions, you always need to choose the shortest and most readable way to do this.
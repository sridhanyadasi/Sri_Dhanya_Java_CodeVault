/*4. Write a Java program that demonstrates the use of packages. Create two classes:
a. `MainClass` in a package named ‘com.te.mainpackage’.
b. `MyPackageClass` in a package named `com.te.mypackage`.
`MyPackageClass` should contain a method `display()` that prints "Hello from
MyPackageClass". In `MainClass`, import `MyPackageClass` and call the `display()` method
to print the message.
Instructions: - Create a package named `com.te.mypackage`. - Inside the package, create a
Java class named `MyPackageClass` with a method `display()` that prints &quot;Hello from
MyPackageClass&quot;. - Create another Java class named `MainClass` in the
‘com.te.mainpackage’. - Inside `MainClass`, import `MyPackageClass` from the
`com.te.mypackage` package. - Call the `display()` method of `MyPackageClass` from
`MainClass` to print the message.
Note: - Ensure that both classes are in separate files. - Compile and run `MainClass` to verify
the output.*/



package com.te.myPackage;

public class MyPackageClass {
	
	public void display() {
		System.out.println("Hello form MyPackageClass");
	}

}

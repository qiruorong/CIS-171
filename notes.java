// HelloWorld code
Public class Helloworld { //file name
  public static void main(String[] args) { //like "def" in python
    System.out.printLn("HelloWorld!"); //print Line
    System.out.print("HelloWorld!"); //doesn't print on new line
    System.out.printLn("Sky is 'blue' and \"life\" is {beautiful}"); //Sky is 'blue' and "life" is {beautiful}
    System.out.printLn("Sky is blue and \tlife is beautiful"); //tab
    System.out.printLn("Sky is blue and \"life is beautiful"); //need a backslash to print whatever signal after it
    System.out.printLn("Sky is blue and \nlife is beautiful"); //new line
  }
}


// Computer binary
// 8 bit = 1 byte
// 1024 byte = 1 KiloByte, MegaByte, GigaByte, TeraByte, PetaByte, ExaByte, ZettaByte, YottaByte

// 0=0, 1=1, 2=10, 3=11, 4=100, 5=10
// divide the number by 2, until you got 0/1, and put each remain from bottom to top

// hexadecimal number
// 0-9, A-F

// octal number
// 0-7

// Class name: ThisIsMyVariable
// Variable name: thisIsMyVariable (cp


Public class Figure2 {
  public static void main(String[] args) {
    drawX;
    drawDiamond;
  }
  public static void drawDiamond() {
    System.out.printLn("    /\\  ");
    System.out.printLn("   /  \\ ");
    System.out.printLn("   \\  / ");
    System.out.printLn("    \\/  ");
  }
  Public static vois drawX() {
    System.out.printLn("   \\  / ");
    System.out.printLn("    \\/  ");
    System.out.printLn("     /\\ ");
    System.out.printLn("    /  \\ ");
  }
}

/// int, double, char, boolean(True/False)
System.out.println(5/3); // 1
System.out.println(5.0/3); // 1.666667
System.out.println(5%3); //2 (modulo operator return reminder)
System.out.println(4%10); //4 (the original num)


// for loop
for (int line=1; line<=5; line++) { //11 22 33 44 55 in each line
  for (int i=1; i<=5; i++) {
    System.out.print(line); //use print to print in a line (correspond with second line code)
  }
  System.out.println( ); //use println to print in a new line (correspond with first line code)
}
for (int line=1; line<=3; line++) { //12345, 12345, 12345 in each line
  for (int j=5; i>=1; j--) {
    System.out.println(line);
  }


for (int k=1; k<=3; k++) {  //000111222333444555666777888999 三行
    for (int i=0; i<=9; i++) {
      for (int j=1; j<=3; j++) {
        System.out.print(i);
      }
    }
System.out.println();
}
  

for (int line = 1; line <= 6; line++) {  //123456斜着diagonal
  for (int j = 0; j <= 6 - line; j++) {
    System.out.print(" ");
  }
  System.out.println(line);
}

// public static final int LINE = 6, 可以把下面一行的6 替换成LINE
for (int line = 1; line <= 6; line++) { // 1 22 333 444 555靠右
    for (int j = 0; j <= 7-line; j++) {
        System.out.print(" ");
    }
    for (int i = 1; i <= line; i++) {
        System.out.print(line);
    }
    System.out.println();
}


// number = number*2
number *= 2
// print x
System.out.println("X = " + X)


// 输入公式 
public class Rectangle {
  public static void main(String[] args) {
      double length = 1;
      double width = 2;
      rectangle(length, width);
  }
  public static void rectangle(double length, double width) {
      System.out.println("area = " + length * width);
      System.out.println("parameter = " + length*2 + width*2);
    }
}

! use Math.PI for 3.1415926
! use Math.pow (radius, 2) for square of radius

if using a parameter that is not given an number but a calculation based on given num, use double x = a*b*c under line#112


//method overloading: line#138
can define multiple method with same name as long as they don't have same num or not same type
for example:
public class Rectangle {
  public static void main(String[] args) {
    double length = 1;
    double width = 2;
    rectangle(length, width);
  }
  public static void rectangle(double length, double width) {
    System.out.println("area = " + length * width);
    System.out.println("parameter = " + length*2 + width*2);
  }
  public static void rectangle(double length, double width) {
    double width = 4; ////!!!!!!!!!!!!! THIS STEP IS METHOD OVERLOADING
    System.out.println("area = " + length * width);
    System.out.println("parameter = " + length*2 + width*2);
  }
}


// void: don''t return any value, so if:
return X 
// have to change public static void into:
public static double X or whatever data type you have
// for example:
public class printRectangle {
  public static void main(String[] args) {
    double length = 3;
    double width = 3.5;
    System.out.println("Area = " + rectangle(length, width));
  }

  public static double rectangle(double length, double width) { // same as #112
    double res = length * width;
    return res;
  }
}

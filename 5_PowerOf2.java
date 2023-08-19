METHOD 1: // return value n, can input 0
public class PowerOf2 {
    public static void main(String[] args) {
        int n = printPowersOf2(3);
    }
    public static int printPowersOf2(int n) {
        for (int i = 0; i <= n; i++) {
            int result = (int) Math.pow(2, i); //cast double to int
            System.out.print(result + " ");
        }
        return n;
    }
}


METHOD 2: // no return, cannot input 0
public class PowerOf2 {
    public static void main(String[] args) {
        printPowersOf2(3);
    }
    public static void printPowersOf2(int n) {
        for (int i = 0; i <= n; i++) {
            int result = (int) Math.pow(2, i); //cast double to int
            System.out.print(result + " ");
        }
    }
}




NOTES:
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


//method overloading: 
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

  public static double rectangle(double length, double width) { // same as #56
    double res = length * width; // or return = length * width to replace #77&78
    return res;
  }
}


//adding from 1-100
public class CalculateSum {
    public static void main(String[] args) {
        int n = calculateSum(100);
        System.out.println("Sum = " + n);
    }
    public static int calculateSum(int n) {
        int sum = 0; // initialize sum = 0
        for (int i = 1; i <= n; i++) { // or sum = n * (n+1)/2.0
            sum += i; // or sum = sum + 1
        }
        return sum;
    }
}


// index number
public class StringObject {
  public static void main (String[] args) {
    String s = "Hello there";
    System.out.println(s.chatAt(0)); // print out H
    for (int i=0; i<s; i++) // note not the = sign here
      // for (int i=0; i<=s.length()-1; i++)
      System.out.println(s.chatAt(i)); // print each 字母 in each line
    System.out.println("\n" + s.indexOf("l")); // print 2
    System.out.println(s.replace ("l", "y")); //print Heyyo there
    System.out.println(s.toUpperCase); 
    System.out.println(s.toLowerCase);

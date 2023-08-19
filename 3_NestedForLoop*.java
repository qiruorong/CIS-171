public class NestedForLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}




NOTES:
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
  

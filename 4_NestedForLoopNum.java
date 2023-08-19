public class NestedForLoopNum {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}




NOTES:
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

/* Problem from: https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&category=24&problem=3242&mosmsg=Submission+received+with+ID+22285234 */

import java.util.Scanner;

public class Main {
	
  static int fzero(int n, int b) {
	  int r = 0;
	  int sum = -1;
	  while (r == 0) {
		  sum++;
		  r = n % b;
		  n = n / b;
	  }
	  return sum;
  }
  
  static int solution(int n) {
    int result = 0;

    for (int i = 2; i <= n/2; i++) {
	    result += fzero(n, i);
    }
    return result + 1;
  }
	
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
  
    while (scanner.hasNext()){
	  String input = scanner.nextLine();
	  int n = Integer.valueOf(input);
      if (n != 0) {
	    System.out.println(n + " " + solution(n));
      }
      else {
    	  break;
      }
    }
    
    scanner.close();
  }
}

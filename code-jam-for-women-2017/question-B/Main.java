import java.util.*;
import java.io.*;

public class Main {
	
  public static void main(String[] args) throws IOException {
	//InputStream inputStream = new FileInputStream("B-small-practice.in");
	InputStream inputStream = new FileInputStream("B-large-practice.in");
	BufferedWriter writer = new BufferedWriter(new FileWriter("results.txt"));
	Scanner in = new Scanner(new BufferedReader(new InputStreamReader(inputStream)));  
	
    //Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt();
    for (int i = 1; i <= t; ++i) {
      int n = in.nextInt();
      double[] array = new double[2 * n];
      
      for (int j = 0; j < 2 * n; j++) {
    	  	array[j] = in.nextDouble();
      }
      
      Arrays.sort(array);
      double result = 1;
      
      for (int j = 0; j < n; j++) {
    	  	result *= 1 - (array[j] * array[2 * n - 1 - j]);
      }
      String r = String.format("Case #%d: %.6f\n", i, result);
      //System.out.printf("Case #%d: %.6f", i, result);
      writer.append(r);
    }
    writer.close();
  }
  
}
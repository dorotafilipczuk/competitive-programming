import java.util.*;
import java.io.*;

class Pair {
	public int first;
	public int second;
	
	public Pair(int first, int second) {
		this.first = first;
		this.second = second;
	}
	@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + first;
        result = prime * result + second;
        return result;
    }
    @Override
	public boolean equals(Object obj) {
		Pair p = (Pair) obj;
		return (this.first == p.first && this.second == p.second);
	}
}

public class Main {
	
  public static void main(String[] args) throws IOException {
	//InputStream inputStream = new FileInputStream("A-small-practice.in");
	InputStream inputStream = new FileInputStream("A-large-practice.in");
	BufferedWriter writer = new BufferedWriter(new FileWriter("results.txt"));
    //Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(inputStream)));
    int t = in.nextInt();
    for (int i = 1; i <= t; ++i) {
      int f = in.nextInt();
      int s = in.nextInt();
      Set<Pair> set = new HashSet<Pair>();
  
      int[] arr = new int[s];
      for (int j = 0; j < s; j++) {
    	  	arr[j] = 0;
      }
      
      for (int j = 0; j < f; j++) {
    	  	int p1 = in.nextInt();
    	  	int p2 = in.nextInt();
    	  	Pair pair = new Pair(p1, p2);
    	  	if (!set.contains(pair)) {
	    	  	if (p1 != p2) {
	    	  		arr[p1 - 1]++;
	    	  		arr[p2 - 1]++;
	    	  	}
	    	  	else {
	    	  		arr[p1 - 1]++;
	    	  	}
	    	  	set.add(pair);
    	  	}
      }
      
      int max = 0;
      for (int j = 0; j < s; j++) {
    	  	if (arr[j] > max) {
    	  		max = arr[j];
    	  	}
      }
      
      //System.out.println("Case #" + i + ": " + max);
      writer.append("Case #" + i + ": " + max + "\n");
    }
    writer.close();
  }
  
}
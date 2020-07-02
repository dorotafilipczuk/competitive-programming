class Solution {
  public int reverse(int x) {
    int result = 0;
    List<Integer> list = new ArrayList<Integer>();
    while (x != 0) {
        list.add(x % 10);
        x /= 10;
    }
    int digits = list.size();
    for (int i = 0; i < digits; i++) {
      if ((Math.pow(10, digits - 1 - i) * list.get(i) > Integer.MAX_VALUE)
          || (Math.pow(10, digits - 1 - i) * list.get(i) <
          Integer.MIN_VALUE) || (result + (Math.pow(10, digits - 1 - i) *
          list.get(i)) > Integer.MAX_VALUE) || (result + (Math.pow(10,
          digits - 1 - i) * list.get(i)) < Integer.MIN_VALUE)) {
        return 0;
      }
      else {
        System.out.print(result + " ");
        result += Math.pow(10, digits - 1 - i) * list.get(i);
      }
    }
    if (x < 0) {
      result *= (-1);
    }
    return result;
  }
}

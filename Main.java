class Main {
  public static void main(String[] args) {
    // Declare an array

    int[] arr1 = new int[10];
    // Defaults to all 0s
    System.out.println("The array has " + arr1.length + " slots");

    for (int i = 0; i < arr1.length; i++) {
      System.out.println(arr1[i]);
    }

    arr1[1] = 50;
    arr1[arr1.length - 1] = 100;
    arr1[0] = arr1[1] + arr1[9];
    arr1[1] = 25;
    arr1[1]++;
    arr1[9]--;

    System.out.println("===============================");
    for (int i = 0; i < arr1.length; i++) {
      System.out.println(arr1[i]);
    }
    System.out.println("===============================");

    for (int i = 0; i < arr1.length; i++) {
      arr1[i] = i;
    }

    for (int i = 0; i < arr1.length; i++) {
      System.out.println(arr1[i]);
    }
    System.out.println("===============================");
    // Declare and initialze an array
    int[] arr2 = { 4, 5, 6, 7, 8, 9, 10, 11 };
    for (int i = 0; i < arr2.length; i++) {
      System.out.println(arr2[i]);
    }

  }
}
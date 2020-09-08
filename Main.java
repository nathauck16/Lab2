class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");
   
   double blue = 0.24;
   double green = 0.16;
   double orange = 0.20;
   double red = 0.13;
   double yellow = 0.14;

   int avgQtyPerBag = 55;
   int numOfBags = 10;
   int totalM = avgQtyPerBag * numOfBags;


   System.out.println("Total number of M&M's we have is " + totalM + "!");
  
    double blueTot = blue * totalM;
    double greenTot = green * totalM;
    double orangeTot = orange * totalM;
    double redTot = red * totalM;
    double yellowTot = yellow * totalM;

    System.out.pringln("blue total:" + blueTot);
    System.out.pringln("green total:" + greenTot);
    System.out.pringln();
    System.out.pringln();
    System.out.pringln();

  }
}
class Main {
  public static void main(String[] args) {

    System.out.println("M&M Color Counts");

   //color percentages per 10 candy bags
   double blue = 0.24;
   double brown = 0.13;
   double green = 0.16;
   double orange = 0.20;
   double red = 0.13;
   double yellow = 0.14;

    //M&M total calculations
   int avgQtyPerBag = 55;
   int numOfBags = 10;
   int totalM = avgQtyPerBag * numOfBags;

    //cplor total calculations
    double blueTot = blue * totalM;
    double brownTot = brown * totalM;
    double greenTot = green * totalM;
    double orangeTot = orange * totalM;
    double redTot = red * totalM;
    double yellowTot = yellow * totalM;

    //sum of M&M's
    double sumM = blueTot + brownTot + greenTot + orangeTot + redTot + yellowTot;


    //testing the code
    
   System.out.println("Total number of M&M's we have is " + totalM + "!");
  
    System.out.println("blue total: " + blueTot);
    System.out.println("brown total: " + brownTot);
    System.out.println("green total: " + greenTot);
    System.out.println("orange total: " + orangeTot);
    System.out.println("red total: " + redTot);
    System.out.println("yellow total: " + yellowTot);

    System.out.println("M&M sum: " +sumM);

    if (blue > brown && green > orange)
     System.out.println("Blue over Brown and Green over Orange");

    if (brown <= red)
     System.out.println("Brown is less than or equal to Red");

    if (sumM == totalM)
     System.out.println("Numbers match");
  }
}
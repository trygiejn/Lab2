class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");
    int numMM; // this declares the number of whole m & m's
    double numBlue; /* this declares the percentage of blue m & m's of the whole */ 
    double numBrown;/* this declares the percentage of brown m & m's of the whole */ 
    double numGreen;/* this declares the percentage of green m & m's of the whole */ 
    double numOrange;/* this declares the percentage of orange m & m's of the whole */ 
    double numRed;/* this declares the percentage of red m & m's of the whole */ 
    double numYellow;/* this declares the percentage of yellow m & m's of the whole */ 

    numMM = 55*11;
    numBlue = numMM*.24;
    numBrown = numMM*.13;
    numGreen = numMM*.16;
    numOrange = numMM*.2;
    numRed = numMM*.13;
    numYellow = numMM*.14;

    System.out.println("blue: " + numBlue);
    System.out.println("brown: " + numBrown);
    System.out.println("green: " + numGreen);
    System.out.println("orange: " + numOrange);
    System.out.println("red: " + numRed);
    System.out.println("yellow: " + numYellow);

    double totalMM; /* I set this number as a double in case the values added up to a decimal, this way I can see if it's wrong */
    totalMM = numBlue+numBrown+numGreen+numOrange+numRed+numYellow;
    System.out.println("sum: " + totalMM);

    if (numBlue > numBrown && numRed > numOrange) {
      System.out.println("Blue over Brown and Red over Orange"); 
      }
    if (numBrown <= numGreen) {
      System.out.println("Brown is less than or equal to Green");
      }
    if (totalMM == numMM) {
      System.out.println("Numbers Match");
      }
  }
}
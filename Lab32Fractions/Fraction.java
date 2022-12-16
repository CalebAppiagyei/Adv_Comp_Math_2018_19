//********************479017*************************//
//
//4   Name: Caleb Appiagyei
//7
//9   Date: 4/9/19
//0   
//1   Period: Period 3
//7
//    Lab Title: Lab 32 FractionPart2(Class) 
//
//***************************************************//

// This class file will contain methods that reduce a fraction by its GCF,
// Multiply a fraction by a single integer, change the fraction by division,
// change the fraction to a String, and put the negative symbol on the numerator

public class Fraction
{
   private int numerator;
   private int denominator;
 
   
     // Create your constructors
   public Fraction ( int numer, int denom ) {
      numerator = numer;
      denominator = denom;
      if ( denominator == 0 ) {
         System.out.print ( " Unfortunately this is not a fraction. " );
      }
   }
   public Fraction () {
      numerator = 0;
      denominator = 0; 
   }
   public Fraction ( int numer ) {
      numerator = numer;
      denominator = 1;
   }
     // Create a method to reduce the fraction
   public Fraction reduce(){
      int factor = 1, gcf = 0, numer = numerator, denom = denominator;
      if ( numerator < 0 && denominator < 0 ) {
         numer = numerator * -1;
         denom = denominator * -1;
      }
      while ( factor < numer || factor < denom ){
         factor++;
      
          // Find the GCF          
         if ( numer % factor == 0 && denom % factor == 0) 
            gcf = factor;
      }
      if ( gcf == 0 ) {
         numerator = numerator;
         denominator = denominator;
      }
      else {
         numer = numerator / gcf;
         denom = denominator / gcf;
      }
      return new Fraction(numer, denom).negativeFraction();
   }
     // Create a method to multiply the fraction
   public Fraction multiply ( int mult ) {
      int numer = numerator * mult;
      return new Fraction (numer, denominator).reduce();
   }
     // Create a NEW method to multiply the fraction by another fraction
   public Fraction multiply ( Fraction fraction ) {
      Fraction f = fraction;
      int numer = numerator * f.numerator;
      int denom = denominator * f.denominator;
      return new Fraction(numer, denom).reduce();
   }
     // Create a method to divide the fraction
   public Fraction divide ( int div ) {
      int denom = denominator * div;
      return new Fraction (numerator, denom).reduce();
   }
     // Create a NEW method to divide the fraction by another fraction
   public Fraction divide ( Fraction fraction ){
      Fraction f = fraction;
      int numer = numerator * f.denominator;
      int denom = denominator * f.numerator;
      return new Fraction (numer, denom).reduce();
   }
     // Create a method that will turn the fraction into a string
   public String toString (){
      Fraction f = new Fraction(numerator, denominator);
      if ( f.numerator == 0 ) {
         return (" " + 0);
      }
      else if ( f.denominator == 1 ) {
         return (" " + numerator);
      }
      else if ( f.denominator == -1 ){
         return (" " + -f.numerator);
      }
      else{
      return (" " + f.numerator + "/" + f.denominator);
      }
   }
     // Create a method to adjust the fraction
   public Fraction negativeFraction (){
   
      if ( denominator < 0 && numerator >= 0 ){
         denominator = denominator * -1;
         numerator = numerator * -1;
      } 
      if ( denominator < 0 && numerator < 0 ) {
         denominator = denominator * -1;
         numerator = numerator * -1;
      }
      return new Fraction(numerator, denominator); 
   }
     // Create a NEW method to add the original fraction to another fraction
   public Fraction add (Fraction f){
      int numer = numerator, denom = denominator; 
      int numer2 = f.numerator, denom2 = f.denominator;
      numer = (numer * denom2) + (numer2 * denom);
      denom = (denom * denom2);
      return new Fraction ( numer, denom ).reduce(); 
   }
     // Create a NEW method to subtract the original fraction to another fraction
   public Fraction subtract (Fraction f){
      int numer = numerator, denom = denominator; 
      int numer2 = f.numerator, denom2 = f.denominator;
      if ( numer2 != 0 ){
      numer = (numer2 * denom) - (numer * denom2);
      denom = (denom * denom2);
      }
      return new Fraction ( numer, denom ).reduce(); 
   }
     // Create a NEW method to find the decimal form of the original fraction
   public double getValue () {
      double dec = (double)
      numerator / denominator;
      return dec;
   }
}

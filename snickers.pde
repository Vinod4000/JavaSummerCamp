double snickerPriceSeng = 0.85;
double snickerPriceNY = 0.97;
double poundUK = 3500;
double conversionRateUS = 1.27;
double conversionRateSeng = 585;
double salesTaxNY = 0.12;
double salesTaxNJ = 0.15;
double salesTaxSeng = 0.27;

double dollarUS = poundUK * conversionRateUS;

double numberSnic = dollarUS / (snickerPriceNY * (salesTaxNY + 1));

if (numberSnic > 2300) {
  double snicLeft = numberSnic - 2300;
  double moneyLeft = snicLeft * snickerPriceNY * (salesTaxNY + 1);
  double moneyLeftSeng = moneyLeft * conversionRateSeng;
  double numberSnicSeng = moneyLeftSeng / (snickerPriceSeng * (salesTaxSeng + 1));
  numberSnic = 2300;
  
  numberSnic = numberSnicSeng + numberSnic;
  println ("Number of Snickers brought from Senegal: " + numberSnicSeng);
  println ("Total number of snickers bought is: " + numberSnic);
} else {
  println (numberSnic);
}

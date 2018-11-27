package com.skrzymo;

public class Main {

    public static void main(String[] args) {
	    MegaBytesConverter.printMegaBytesAndKiloBytes(1032);

	    System.out.println("\nBarking Dog");
	    System.out.println(BarkingDog.bark(true,1));
        System.out.println(BarkingDog.bark(false,2));
        System.out.println(BarkingDog.bark(true,8));
        System.out.println(BarkingDog.bark(true,-1));

        System.out.println("\nLeap Year");
        System.out.println(LeapYear.isLeapYear(-1600));
        System.out.println(LeapYear.isLeapYear(1600));
        System.out.println(LeapYear.isLeapYear(2017));
        System.out.println(LeapYear.isLeapYear(2000));

        System.out.println("\nDecimal Comparator");
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756,-3.175));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.175,3.176));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.0,3.0));

        System.out.println("\nEqual Sum Checker");
        System.out.println(EqualSumChecker.hasEqualSum(1,1,1));
        System.out.println(EqualSumChecker.hasEqualSum(1,1,2));
        System.out.println(EqualSumChecker.hasEqualSum(1,-1,0));

        System.out.println("\nTeen Number Checker");
        System.out.println(TeenNumberChecker.hasTeen(9,99,19));
        System.out.println(TeenNumberChecker.hasTeen(23,15,42));
        System.out.println(TeenNumberChecker.hasTeen(22,23,34));

        System.out.println("\nArea Calculator");
        System.out.println(AreaCalculator.area(5.0));
        System.out.println(AreaCalculator.area(-1));
        System.out.println(AreaCalculator.area(5.0,4.0));
        System.out.println(AreaCalculator.area(-1.0,4.0));

        System.out.println("\nMinutes To Years And Days Calculator");
        MinutesToYearsDaysCalculator.printYearsAndDays(525600);
        MinutesToYearsDaysCalculator.printYearsAndDays(1051200);
        MinutesToYearsDaysCalculator.printYearsAndDays(561600);

        System.out.println("\nEquality Printer");
        IntEqualityPrinter.printEqual(1,1,1);
        IntEqualityPrinter.printEqual(1,1,2);
        IntEqualityPrinter.printEqual(-1,-1,-1);
        IntEqualityPrinter.printEqual(1,2,3);

        System.out.println("\nPlaying Cat");
        System.out.println(PlayingCat.isCatPlaying(true,10));
        System.out.println(PlayingCat.isCatPlaying(false,36));
        System.out.println(PlayingCat.isCatPlaying(false,35));

        System.out.println("\nNumber In Word");
        NumberInWord.printNumberInWord(0);
        NumberInWord.printNumberInWord(1);
        NumberInWord.printNumberInWord(2);

        System.out.println("\nNumber Of Days In Month");
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1,2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2,2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2,2018));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(-1,2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1,-2020));

        System.out.println("\nSum Odd");
        System.out.println(SumOddRange.sumOdd(1,100));
        System.out.println(SumOddRange.sumOdd(-1,100));
        System.out.println(SumOddRange.sumOdd(100,100));
        System.out.println(SumOddRange.sumOdd(100,-100));
        System.out.println(SumOddRange.sumOdd(100,1000));

        System.out.println("\nNumber Palindrome");
        System.out.println(NumberPalindrome.isPalindrome(1221));
        System.out.println(NumberPalindrome.isPalindrome(-1221));
        System.out.println(NumberPalindrome.isPalindrome(12212));
        System.out.println(NumberPalindrome.isPalindrome(12321));

        System.out.println("\nFirst And Last Digit Sum");
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(252));
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(257));
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(0));
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(5));
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(-10));

        System.out.println("\nEven Digit Sum");
        System.out.println(EvenDigitSum.getEvenDigitSum(123456789));
        System.out.println(EvenDigitSum.getEvenDigitSum(252));
        System.out.println(EvenDigitSum.getEvenDigitSum(-22));

        System.out.println("\nShared Digit");
        System.out.println(SharedDigit.hasSharedDigit(12,23));
        System.out.println(SharedDigit.hasSharedDigit(9,99));
        System.out.println(SharedDigit.hasSharedDigit(15,55));
        System.out.println(SharedDigit.hasSharedDigit(12,34));

        System.out.println("\nLast Digit Checker");
        System.out.println(LastDigitChecker.hasSameLastDigit(41,22,71));
        System.out.println(LastDigitChecker.hasSameLastDigit(23,32,42));
        System.out.println(LastDigitChecker.hasSameLastDigit(9,99,999));
        System.out.println(LastDigitChecker.hasSameLastDigit(16,97,998));

        System.out.println("\nGreatest Common Divisor");
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(25,15));
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(12,30));
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(9,18));
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(81,153));

        System.out.println("\nAll Factors");
        FactorPrinter.printFactors(6);
        FactorPrinter.printFactors(32);
        FactorPrinter.printFactors(10);
        FactorPrinter.printFactors(-1);

        System.out.println("\nPerfect Number");
        System.out.println(PerfectNumber.isPerfectNumber(6));
        System.out.println(PerfectNumber.isPerfectNumber(28));
        System.out.println(PerfectNumber.isPerfectNumber(5));
        System.out.println(PerfectNumber.isPerfectNumber(-1));

        System.out.println("\nNumber To Words");
        System.out.println(NumberToWords.reverse(-121));
        System.out.println(NumberToWords.reverse(1212));
        System.out.println(NumberToWords.reverse(1234));
        System.out.println(NumberToWords.reverse(100));
        System.out.println(NumberToWords.getDigitCount(0));
        System.out.println(NumberToWords.getDigitCount(123));
        System.out.println(NumberToWords.getDigitCount(-12));
        System.out.println(NumberToWords.getDigitCount(5200));
        System.out.println("123");
        NumberToWords.numberToWords(123);
        System.out.println("1010");
        NumberToWords.numberToWords(1010);
        System.out.println("1000");
        NumberToWords.numberToWords(1000);
        System.out.println("-12");
        NumberToWords.numberToWords(-12);

        System.out.println("\nFlour Pack Problem");
        System.out.println(FlourPacker.canPack(1,0,4));
        System.out.println(FlourPacker.canPack(1,0,5));
        System.out.println(FlourPacker.canPack(0,5,4));
        System.out.println(FlourPacker.canPack(2,2,12));
        System.out.println(FlourPacker.canPack(-3,2,12));

        System.out.println("\nLargest Prime");
        System.out.println(LargestPrime.getLargestPrime(21));
        System.out.println(LargestPrime.getLargestPrime(217));
        System.out.println(LargestPrime.getLargestPrime(0));
        System.out.println(LargestPrime.getLargestPrime(45));
        System.out.println(LargestPrime.getLargestPrime(-1));

        System.out.println("\nDiagonal Star");
        DiagonalStar.printSquareStar(5);
        DiagonalStar.printSquareStar(8);
    }
}

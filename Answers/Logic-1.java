// Answers to the logic-1 questions
// If need help, contact me on snap or discord
// Snap: Randomleavi
// Discord: Ryker#0824

public boolean cigarParty(int cigars, boolean isWeekend) {
  if(isWeekend)
		return (cigars >= 40);
	return (cigars >= 40 && cigars <= 60);
}



public int dateFashion(int you, int date) {
  if(you <= 2 || date <= 2)
		return 0;
	if(you >= 8 || date >= 8)
		return 2;
	return 1;
}



public boolean squirrelPlay(int temp, boolean isSummer) {
  if(isSummer)
		return (temp >= 60 && temp <= 100);
	return (temp >= 60 && temp <= 90);
}



public int caughtSpeeding(int speed, boolean isBirthday) {
  if(isBirthday)
		speed -= 5; //  diff limit is higher now
	if(speed <= 60)
		return 0;
	else if(speed <= 80)
		return 1;
	else
		return 2;
}



public int sortaSum(int a, int b) {
  int sum = a + b;
	if(sum >= 10 && sum <= 19)
		return 20;
	return sum;
}



public String alarmClock(int day, boolean vacation) {
  if(vacation)
	{
		if(day == 0 || day == 6)
			return "off";
		return "10:00";
	}
	else
	{
		if(day == 0 || day == 6)
			return "10:00";
		return "7:00";
	}
}



public boolean love6(int a, int b) {
  if(a == 6 || b == 6)
		return true;
	return ((a + b) == 6|| Math.abs(a - b) == 6);
}



public boolean in1To10(int n, boolean outsideMode) {
  if(outsideMode)
		return (n <= 1 || n >= 10);
	return (n >= 1 && n <= 10);
}



public boolean specialEleven(int n) {
   if(n%11==0 || n%11==1)
   return true;
  else 
   return false;
}



public boolean more20(int n) {
    if(n%20==1 || n%20==2)
   return true;
  else
   return false;
}



public boolean old35(int n) {
   if(n%3==0 && n%5==0)
   return false;
  else if(n%3==0 || n%5==0)
   return true;
  else
   return false;
}



public boolean less20(int n) {
   int k =0;
  if(n%20==18 || n%20==19)
    return true;
   else 
    return false;
}



public boolean nearTen(int num) {
   if(num%10==2 || num%10==9||num%10==8||num%10==1||num%10==0)
   return true;
  else
   return false;
}



public int teenSum(int a, int b) {
   if(a>=13 && a<=19 || b>=13 && b<=19)
   return 19;
  else
   return a+b;
}



public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
  if(isMorning && isMom && !isAsleep)
   return true;
  else if(!isAsleep && !isMorning)
   return true;
  else
   return false;
}



public int teaParty(int tea, int candy) {
   if(tea<5 || candy <5)
   return 0;
  if(tea>= candy*2|| candy>= tea*2)
   return 2;
  else if(tea >= 5 && candy >=5)
   return 1;
  else
   return 0;
}



public String fizzString(String str) {
  if(str.substring(0,1).equals("f") && str.substring(str.length()-1,str.length()).equals("b"))
   return "FizzBuzz";
  else if(str.substring(0,1).equals("f"))
   return "Fizz";
  else if(str.substring(str.length()-1,str.length()).equals("b"))
   return "Buzz";
  else
   return str;
}



public String fizzString2(int n) {
   if(n%3==0 && n%5==0)
   return "FizzBuzz!";
  else if(n%3==0)
   return "Fizz!";
  else if(n%5==0)
   return "Buzz!";
  else
   return n+"!";
}



public boolean twoAsOne(int a, int b, int c) {
   if(a+b==c || b+c==a || a+c==b)
   return true;
  else
   return false;
}



public boolean inOrder(int a, int b, int c, boolean bOk) {
   if(bOk && c>b)
   return true;
  else if(!bOk && b>a && c>b)
   return true;
  else
   return false;
}



public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
   if(equalOk && b>=a && c>=b)
   return true;
  else if(!equalOk && b>a && c>b)
   return true;
  else
   return false;
}



public boolean lastDigit(int a, int b, int c) {
   if(a%10==b%10 ||a%10==c%10||b%10==c%10)
   return true;
  else
   return false;
}



public boolean lessBy10(int a, int b, int c) {
   if(Math.abs(a - b) >= 10 || Math.abs(b - c) >= 10 || Math.abs(a - c) >= 10)
   return true;
  else
   return false;
}



public int withoutDoubles(int die1, int die2, boolean noDoubles) {
   if(noDoubles && die1==die2){
   die1++;
   if(die1>=7){
    die1 = 1;
    return die1+die2;
    }
   else
    return die1+die2;
   }
   else
    return die1+die2;
}



public int maxMod5(int a, int b) {
  if(a == b)
		return 0;
	if(a % 5 == b % 5)
		return (a < b) ? a : b;
	return (a > b) ? a : b;
}



public int redTicket(int a, int b, int c) {
  if(a == b && b == c)
	{
		if(a == 2)
			return 10;
		return 5;
	}
	if(a != b && a !=c)
		return 1;
	return 0;
}



public int greenTicket(int a, int b, int c) {
  if(a == b)
	{
		if(b == c)
			return 20;
		return 10;
	}
	if(a == c || b == c)
		return 10;
	return 0;
}



public int blueTicket(int a, int b, int c) {
  int ab = a + b;
	int bc = b + c;
	int ca = c + a;
	if(ab == 10 || bc == 10 || ca == 10)
		return 10;
	if(ab == bc + 10 || ab == ca + 10)
		return 5;
	return 0;
}



public boolean shareDigit(int a, int b) {
  int aDigit = a%10;
	int bDigit = b%10;
	a /= 10;
	b /= 10;
	return (a == b || a == bDigit || aDigit == b || aDigit == bDigit);
}



public int sumLimit(int a, int b) {
  String first = String.valueOf(a);
  int plus = ( a + b );
  String second = String.valueOf(plus);
  if ( first.length() == second.length() )
   return plus;
  else return a;
}

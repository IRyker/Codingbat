// All in order - just copy paste them to make your job quick
// Each project is seperated with spaces - look at the method name to make sure you are copying the right one.
// Example - for the first one only copy "return ("Hello " + name + '!');" and paste it.

public String helloName(String name) {
  return ("Hello " + name + '!');
}



public String makeAbba(String a, String b) {
  return (a+b+b+a);
}



public String makeTags(String tag, String word) {
  return ('<' + tag + '>' + word + '<' + '/' + tag + '>');
}



public String makeOutWord(String out, String word) {
  return (out.substring(0, 2) + word + out.substring(2, 4));
}



public String extraEnd(String str) {
  int len = str.length();
	String temp = str.substring(len-2, len);
	return (temp + temp + temp);
}



public String firstTwo(String str) {
  if(str.length() >= 3)
		return str.substring(0, 2);
	return str;
}



public String firstHalf(String str)
{
	return str.substring(0, str.length()/2);
}



public String withoutEnd(String str) {
  return str.substring(1, str.length()-1);
}



public String comboString(String a, String b) {
  if(a.length() >= b.length())
		return b+a+b;
	return a+b+a;
}



public String nonStart(String a, String b) {
  return (a.substring(1) + b.substring(1));
}



public String left2(String str) {
  return (str.substring(2) + str.substring(0, 2));
}



public String right2(String str) {
  int len = str.length()-2;
	return (str.substring(len) + str.substring(0, len));
}



public String theEnd(String str, boolean front) {
  if(front)
		return str.substring(0, 1);
	return str.substring(str.length()-1);
}



public String withouEnd2(String str) {
  int len = str.length();
	if(len >= 3)
		return str.substring(1, len-1);
	return "";
}



public String middleTwo(String str) {
  int half = str.length()/2-1;
	return str.substring(half, half+2);
}



public boolean endsLy(String str) {
  int len = str.length();
	if(len >= 2)
		return (str.substring(str.length()-2).equals("ly"));
	return false;
}



public String nTwice(String str, int n) {
  return (str.substring(0, n) + str.substring(str.length()-n));
}



public String twoChar(String str, int index) {
  if(index <= str.length()-2 && index >= 0)
		return str.substring(index, index+2);
	return str.substring(0, 2);
}



public String middleThree(String str) {
  int len = str.length()/2;
	return str.substring(len-1,len+2);
}



public boolean hasBad(String str) {
  int len = str.length();
	if(len == 3 && str.equals("bad"))
		return true;
	else if(len >= 4)
	{
		if(str.substring(0, 3).equals("bad"))
			return true;
		return str.substring(1, 4).equals("bad");
	}
	else
		return false;
}



public String atFirst(String str) {
  int len = str.length();
	if(len >= 2)
		return str.substring(0, 2);
	else if(len == 1)
		return (str.charAt(0)+"@");
	else
		return "@@";
}



public String lastChars(String a, String b) {
  int lenB = b.length();
	String combStr = "";
	combStr += (a.length() >= 1) ? a.charAt(0) : '@';
	combStr += (lenB >= 1) ? b.charAt(lenB-1) : '@';
	return combStr;
}



public String conCat(String a, String b) {
  int lenA = a.length();
	int lenB = b.length();
	if(lenA >= 1 && lenB >= 1)
	{
		if(a.charAt(lenA-1) == b.charAt(0))
			return (a + b.substring(1));
		else
			return (a + b);
	}
	return (a + b);
}



public String lastTwo(String str) {
  int len = str.length();
	if(len >= 2)
		return str.substring(0, len-2)+str.charAt(len-1)+str.charAt(len-2);
	else
		return str;
}



public String seeColor(String str) {
  int len = str.length();
	if(len >= 4)
	{
		if(str.substring(0, 4).equals("blue"))
			return "blue";
		else if(str.substring(0, 3).equals("red"))
			return "red";
		else
			return "";
	}
	else if(len == 3)
	{
		if(str.substring(0, 3).equals("red"))
			return "red";
		else
			return "";
	}
	else
		return "";
}



public boolean frontAgain(String str) {
  int len = str.length();
	if(len >= 2)
		return str.substring(0, 2).equals(str.substring(len-2, len));
	else
		return false;
}



public String minCat(String a, String b) {
  int lenA = a.length();
	int lenB = b.length();
	if(lenA >= lenB)
		return (a.substring(lenA-lenB) + b);
	else
		return (a + b.substring(lenB-lenA));
}



public String extraFront(String str) {
  String temp;
	if(str.length() >= 3)
		temp = str.substring(0, 2);
	else
		temp = str;
	return (temp + temp + temp);
}



public String without2(String str) {
  int len = str.length();
	if(len >= 2)
	{
		if(str.substring(0,2).equals(str.substring(len-2, len)))
			return str.substring(2);
		else
			return str;
	}
	else
		return str;
}



public String deFront(String str) {
  int len = str.length();
	if(len >= 2)
	{
		StringBuilder stbuild = new StringBuilder(len);
		if(str.charAt(0) == 'a')
			stbuild.append('a');
		if(str.charAt(1) == 'b')
			stbuild.append('b');
		stbuild.append(str.substring(2));
		return stbuild.toString();
	}
	else if(len == 1 && str.charAt(0) == 'a')
		return "a";
	else
		return "";
}



public String startWord(String str, String word) {
  int lenStr = str.length();
	int lenWord = word.length();
	String temp;
	if(lenStr >= lenWord)
	{
		temp = str.substring(1, lenWord);
		if(word.substring(1).equals(temp))
			return (str.charAt(0)+temp);
		else
			return "";
	}
	else
		return "";
}



public String withoutX(String str) {
  int len = str.length();
	if(len >= 2)
	{
		char ch = str.charAt(0);
		StringBuilder stbuild = new StringBuilder(len);
		if(ch != 'x')
			stbuild.append(ch);
		stbuild.append(str.substring(1, len-1));
		ch = str.charAt(len-1);
		if(ch != 'x')
			stbuild.append(ch);
		return stbuild.toString();
	}
	else if(len == 1 && str.charAt(0) == 'x')
		return "";
	else
		return str;
}

import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayGround {


	public static void main(String[] args) {

//		PlayGround.test();
//		PlayGround.sorting();
//		PlayGround.multiply("hello");
	}

	public static void test(){
		String str =  "/deeplink-rest-api/redirect.do?ssoTicket=SSO_TICKET&redirect=%2Fgeneral-info%2Fwhentostop%3FSYS";
		String str1 = "?/deeplink/redirect";
		String replacedStr = str.replace("%3S","%3DS");

		String[] strs = str1.split("\\?");
//		if (strs.length !=0){
//			System.out.println(strs[0]);
//		}
//		if(strs[0].isEmpty()){
//			System.out.println("zero");
//		}
		System.out.println(strs.length);
		System.out.println(strs[0]);
//		System.out.println(strs[1]);
//		System.out.println(strs.length);

		String a = "hello";

		System.out.println(a.substring(1));
		System.out.println(a.charAt(0));
	}

	public void reverse(String string){
		if(string.length() < 2){
			System.out.println(string);
		}
		System.out.println(string.substring(1));
	}

	public static void sorting(){
		// Create a list of strings
//		ArrayList<String> al = new ArrayList<String>();
//		al.add("Geeks For Geeks");
//		al.add("Friends");
//		al.add("Dear");
//		al.add("Is");
//		al.add("Superb");

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(80);
		al.add(20);
		al.add(40);

    /* Collections.sort method is sorting the
    elements of ArrayList in ascending order. */
		Collections.sort(al, Collections.reverseOrder());

		// Let us print the sorted list
		System.out.println("List after the use of" +
				" Collection.sort() :\n" + al);
	}


	public static void izettle() {
		int m = 2;
		ArrayList<String> strings = new ArrayList<String>();
		ArrayList<Integer> finalList = new ArrayList<Integer>();
		strings.add("Indian Street Food,hospitality,100:83:80");
		strings.add("Barrels,hospitality,94:120:76");
		strings.add("Prime burger,hospitality,34:80:22");
		strings.add("Pippi longstockings socks,fashion,60:200:89");


		for (String string : strings) {
			int x = PlayGround.cp(PlayGround.outputStrList(string));
			finalList.add(x);
			System.out.println(x);
		}
		Collections.sort(finalList);
		System.out.println(finalList);
	}

	public static String[] outputStrList(String ip){
		String[] list1 = ip.split(",");
		String[] list2 = list1[2].split(":");
		return list2;
	}

	public static int cp(String[] ip){
		return Integer.parseInt(ip[0]) + (Integer.parseInt(ip[1]) - Integer.parseInt(ip[2]));

	}

	@Test
	private void testingTime(){
		System.out.println(ZonedDateTime.now().toString());
	}

	@Test
	public void substringCheck() {
//		System.out.println(testSubstring("hell1o"));
		System.out.println(isIsogram("hello"));
	}

	private String testSubstring(String str){

		Pattern.compile("[0-9]");
		if(str.matches(".*\\d+.*")){
			System.out.println("contains digit");
		}
		for (int i=1; i < str.length(); i++) {
			String subS = str.substring(i);
			char charC = str.charAt(i-1);
			if(subS.indexOf(charC) != -1)
			{
				System.out.println(i);
			}
		}

		return null;

	}
	@Test
	public void FixedTests() {
		assertEquals(true, isIsogram("Dermatoglyphics"));
		assertEquals(true, isIsogram("isogram"));
		assertEquals(false,isIsogram("moose"));
		assertEquals(false,isIsogram("isIsogram"));
		assertEquals(false,isIsogram("aba"));
		assertEquals(false,isIsogram("moOse"));
		assertEquals(true,isIsogram("thumbscrewjapingly"));
		assertEquals(true,isIsogram(""));
	}

	private boolean  isIsogram(String str) {
		// ...
		if(str.isEmpty()){
			return true;
		}
		Pattern p = Pattern.compile("[0-9]");
		if(p.matcher(str).find() || str.length() > 26){
			return false;
		}

		for (int i=1; i < str.length(); i++) {
			String subS = str.toLowerCase().substring(i);
			char charC = str.charAt(i-1);
			if(subS.indexOf(charC) != -1){
				return false;
			}
		}
		return true;
	}

}

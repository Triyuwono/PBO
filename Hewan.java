package javaapplication1;

public class Hewan{
	String mata, mulut, telinga, ekor;
	Integer kaki;

	String bermain(String m){
		return m;
	}

	String makan(String k){
		return k;
	}

	Boolean tidur(Boolean t){
		boolean value = true;
		String output = Boolean.toString(value);
		System.out.println(output);
	}
}
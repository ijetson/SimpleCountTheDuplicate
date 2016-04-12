package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class CountTheDuplicate {

	public static void main(String[] args) {
		int itr = 0;
		String nums = "12232304989034582308230842874102987489475208372384";
		HashSet<String> numSet = new HashSet<String>();
		List<String> numList = new ArrayList<String>();
		char numChar[] = nums.toCharArray();

		for (char string : numChar) {
			numList.add(String.valueOf(string));
		}

		for (String c : numList) {
			itr = Collections.frequency(numList, c);
			numSet.add(toStringValue(itr, c));
		}
		numList.clear();
		for (String c : numSet) {
			numList.add(c);
		}
		Collections.sort(numList);
		for (String c : numList) {
			System.out.println(c);
		}
	}

	static String toStringValue(int itr, String sc) {
		StringBuffer buff = new StringBuffer();
		buff.append(sc);
		buff.append("[");
		buff.append(itr);
		buff.append("]");
		return buff.toString();

	}

}

package session5.assignment4;

import java.util.ArrayList;
import java.util.Iterator;

public class StringSplit {

	public static void main(String[] args) {

		String line = "Hadoop is open source frame work , Hadoop is good framework for handling big data";

		// Problem first
		String[] lineArray = line.split(" ");

		for (String temp : lineArray)
			System.out.println(temp);

		// problem second
		int count = 0;
		for (int i = 0; i < lineArray.length; i++) {
			if (lineArray[i].equals("Hadoop"))
				count++;
		}
		System.out.println("number of occurances of Hadoop = " + count);

		// problem third
		String newLine = line.replaceAll(",", " ");
		System.out.println(newLine);

		// problem fourth
		ArrayList<String> al = new ArrayList<String>();
		for (int i = 0; i < lineArray.length; i++) {
			al.add(lineArray[i]);
		}

		Iterator it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}

	}

}
package JavaPrograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class WordSearch {
	static Scanner sc = new Scanner(System.in);
	public static String fileRead() throws IOException {
		File f = new File("/home/admin106/Desktop/wordlist.txt");
		String str = "";
		String[] words = null;
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			str = br.readLine();
			while (br.readLine() != null) {
				str = str + br.readLine();
			}
			words = str.split(",");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		words = Utility.insertionSortStr(words, 0, words.length - 1);
		for (String s : words) {
			System.out.print(s + " ");
		}
		int key = Utility.stringBinarySearch(words, 0, words.length- 1,"ab");
		if (key != -1) {
			return "String present in file";
		} else {
			return "String not present in file";
		}

	}

		
public static void main(String[] args) throws IOException {
		fileRead();
    }
}

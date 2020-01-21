package JavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Utility {
	public Boolean isLeapYear(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return true;
		}
		return false;
	}

	public static int getDistance(int x, int y) {
		int distance = (int) Math.sqrt((Math.pow(x, x) + Math.pow(y, y)));
		System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + distance);
		return distance;
	}

	public String isAnagram(String string1, String string2) {
		boolean status;
		List<String> list = new ArrayList<String>();
		list.add(string1);
		list.add(string2);
		;
		if (string1.length() != string2.length()) {
			status = false;
		} else {
			/*
			 * Stream<Object>array=list.stream().map(s->s.toLowerCase().toCharArray());
			 * System.out.println(array);
			 */
			char[] array = string1.toLowerCase().toCharArray();
			char[] array1 = string2.toLowerCase().toCharArray();

			Arrays.sort(array);
			Arrays.sort(array1);
			status = Arrays.equals(array, array1);

		}
		if (status) {
			return string1 + " and " + string2 + " are anagram";
		} else {
			return string1 + " and " + string2 + " are not anagram";
		}
	}

	public boolean isPrime(int no) {
		for (int i = 2; i < no; i++) {
			if (no % i == 0) {
				return true;
			}
		}
		return false;
	}

	public int CelsiusToFahrenheit(int t) {
		int temperature = (t * 9 / 5) + 32;
		// System.out.println(t + "Celsius= " + temperature + "F");
		return temperature;
	}

	/**
	 * @param t temp in fahrenheit
	 */
	public int FahrenheitToCelsius(int t) {
		int temperature = ((t - 32) * 5) / 9;
		System.out.println(t + "F= " + temperature + "C");
		return temperature;
	}

	public int[] toBinary(int no) {
		if (no < 0) {
			throw new IllegalArgumentException("Enter Only positive decimal number");
		}
		int number = no;
		int[] arr = new int[30];
		int index = 0;
		while (no > 0) {
			arr[index++] = no % 2;
			no = no / 2;
		}
		// System.out.println("Binary of "+number+" is ");
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		return arr;

	}

	public int[] bubbleSortInt(int[] arr, int start, int end) {

		for (int i = 0; i <= arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.print("BubbleSort array ");
		for (int no : arr) {
			System.out.print(no + " ");
		}
		System.out.println();
		return arr;
	}

	public String[] bubbleSortStr(String[] arr, int start, int end) {

		for (int i = 0; i <= arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j].hashCode() > arr[j + 1].hashCode()) {
					String temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("Bubblesort string ");
		for (String s : arr) {
			System.out.print(s + " ");
		}
		System.out.println();
		return arr;
	}

	static int stringBinarySearch(String[] arr, int start, int last, String key) {
		while (start <= last) {
			int mid = start + (last - start) / 2;
			if (arr[mid].hashCode() == key.hashCode()) {
				return mid;
			}
			if (arr[mid].hashCode() < key.hashCode()) {
				return stringBinarySearch(arr, mid + 1, last, key);
			} else {
				return stringBinarySearch(arr, start, mid - 1, key);
			}
		}
		return -1;
	}

	public static String[] insertionSortStr(String[] arr, int start, int end) {

		for (int i = 1; i <= end; i++)
			for (int j = i - 1; j >= 0; j--) {
				if (arr[j].hashCode() > arr[j + 1].hashCode()) {
					String temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		System.out.println("Insertion sort String ");
		for (String s : arr) {
			System.out.print(s + " ");
		}
		System.out.println();

		return arr;
	}

	public int integerBinarySearch(int[] arr, int start, int last, int val) {

		while (start <= last) {
			int mid = start + (last - start) / 2;
			if (arr[mid] == val) {
				return mid;
			}
			if (val < arr[mid]) {
				return integerBinarySearch(arr, start, mid - 1, val);
			} else {
				return integerBinarySearch(arr, mid + 1, last, val);
			}
		}

		return -1;
	}

	public static int[] insertionSortInt(int[] arr, int start, int end) {

		for (int i = 1; i <= end; i++)
			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		System.out.println("Insertion sort array ");
		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
		return arr;

	}

	public static int toDecimal(int[] arr) {
		int dec = 0;
		int j = 7;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				dec = dec + (int) Math.pow(2, j);
			}
			j--;
		}
		return dec;
	}

	public int nibbleSwap(int[] arr) {
		int i = 0, j = 4;
		while (i < 4) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j++;
		}
		int no = Utility.toDecimal(arr);
		//System.out.println("\nDecimal no after nibbleswaping is " + no);
		return no;
	}
}
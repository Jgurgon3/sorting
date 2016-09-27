package sorting;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String a = in.nextLine();

		String[] b = sToArray(a);
		selectionSort(b);

		String[] c = sToArray(a);
		quickSort(c);
		
		String[] d = sToArray(a);
		mergeSort(d);
		
		String[] e = sToArray(a);
		heapSort(e);
		
		in.close();

	}

	private static void heapSort(String[] e) {
		long startTimeQS = System.nanoTime();
		Heap.sort(e);
		long endTimeQS = System.nanoTime();
		Quick.sort(e);
		double durationQS = ((double) endTimeQS - (double) startTimeQS);
		show(e);
		System.out.println("Heap Sort ran in " + durationQS / 1000000 + " milliseconds");

	}

	private static void mergeSort(String[] d) {
		long startTimeQS = System.nanoTime();
		Merge.sort(d);
		long endTimeQS = System.nanoTime();
		Quick.sort(d);
		double durationQS = ((double) endTimeQS - (double) startTimeQS);
		show(d);
		System.out.println("Merge Sort ran in " + durationQS / 1000000 + " milliseconds");

	}

	private static void quickSort(String[] c) {
		long startTimeQS = System.nanoTime();
		Quick.sort(c);
		long endTimeQS = System.nanoTime();
		Quick.sort(c);
		double durationQS = ((double) endTimeQS - (double) startTimeQS);
		show(c);
		System.out.println("Quick Sort ran in " + durationQS / 1000000 + " milliseconds");

	}

	private static void selectionSort(String[] b) {
		long startTimeSS = System.nanoTime();
		Selection.sort(b);
		long endTimeSS = System.nanoTime();
		double durationSS = ((double) endTimeSS - (double) startTimeSS);
		show(b);
		System.out.println("Selection Sort ran in " + durationSS / 1000000 + " milliseconds");

	}

	private static void show(Comparable[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");

		}
		System.out.println();
	}

	private static String[] sToArray(String a) {
		a = a.replace(" ", "");
		String[] b = new String[a.length()];

		for (int i = 0; i < a.length(); i++) {
			b[i] = String.valueOf(a.charAt(i));
			
		}
		return new HashSet<String>(Arrays.asList(b)).toArray(new String[0]);
	}

}

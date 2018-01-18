package study;

import java.util.ArrayList;

public class study {
	public static void main(String[] args) {
		// int[] a = new int[2];
		// int[] b = new int[] {1,8,3,4};
		// System.out.println(max(b));
		// int[][] aa = new int[3][4];
		// int[][] bb = {{8},{9}};
		// System.out.println(bb[0][0]);
		// bb[0][0] = 1;
		// System.out.println(bb[0][0]);
		// int[][] is = {{1,2},{2,3}};
		// System.out.println(twoArr(is)[1]);
		// Random random = new Random();
		// System.out.println(random.nextInt(100));
		// int a =0;
		/*
		 * ArrayList<Integer> list = shuixianhua(); System.out.println(list.toString());
		 * char x = 24464; char r = 30591; System.out.println(x + "" + r);
		 */
		// ArrMaopao(arr);
		// printArr(arr);
		int[] arr = new int[] { 1, 3, 5, 8, 78, 99 };
		int searchArr = SearchArr(arr, 1);
		
	}

	/*
	 * 选择排序数组
	 */
	static void ArrPaixu(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}

	/*
	 * 选择排序数组
	 */
	static int SearchArr(int[] arr, int query) {
		int min = 0, max = arr.length - 1, middle = 0;
		while (min <= max) {
			middle = (max + min) / 2;
			if (query > arr[middle]) {
				min = middle + 1;
			} else if (query < arr[middle]) {
				max = middle - 1;
			} else {
				return middle;
			}
		}
		return -1;
	}

	/*
	 * 冒泡排序数组
	 */
	static void ArrMaopao(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	/*
	 * 逆序数组
	 */
	static void ArrNixu(int[] arr) {
		int temp = 0;
		for (int min = 0, max = arr.length - 1; min < max; min++, max--) {
			temp = arr[max];
			arr[max] = arr[min];
			arr[min] = temp;
		}
	}

	/*
	 * 打印数组
	 */
	static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	/*
	 * 求最大值
	 */
	static int max(int[] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}

		}
		return max;
	}

	/*
	 * 求数组每个item之和
	 */
	static int[] twoArr(int[][] tarr) {

		int[] sum = new int[tarr.length];

		for (int i = 0; i < tarr.length; i++) {
			for (int j = 0; j < tarr[i].length; j++) {
				sum[i] += tarr[i][j];
			}
		}
		return sum;
	}

	/*
	 * 求水仙花数
	 */
	static ArrayList<Integer> shuixianhua() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 100; i < 1000; i++) {
			int bai = i / 100;
			int shi = i / 10 % 10;
			int ge = i % 10;
			if (i == bai * bai * bai + shi * shi * shi + ge * ge * ge) {
				list.add(i);
			}

		}
		return list;
	}

}

package com.yedam.dev;

public class ArrayExample2 {

	public static void main(String[] args) {
		System.out.println(getLargeValue(10, 20, 30));

		System.out.println(getLargeValue(new int[] { 3, 6, 2, 9, 10, 20 }));
		getLargeValue(new int[] { 3, 6, 2, 9, 10 });
		String result = getString("Hello", "World");
		System.out.println(result);
		String[] ary = { "Lee", "Kim", "Park", "Choi", "Han" };
		System.out.println(getString(ary));

		int[] intAry = { 1, 2, 3, 4 }; // 배열을 쓸 경우에는 그냥 적으면 된다.
		int[] intAry2 = new int[5]; // 배열의 크기만 설정, 따로 값을 지정하지 않을시 값은 0으로 설정되어있음
		intAry2 = new int[] { 1, 2, 3, 4 }; // 위의 내용에 값을 적을시 new int[]필수 없을시 오류발생

		int[][] intAry3 = new int[3][3];// 배열안에 정수가 아닌 배열을 넣을경우, 2차원배열 표 모양 생각하기, new int [][] 행 열
		intAry3[0] = new int[] { 1, 2, 3};
		intAry3[1] = new int[] { 4, 5, 6};
		intAry3[2] = new int[] { 7, 8, 9};

		for (int i = 0; i < intAry3.length; i++) {
			for (int j = 0; j < intAry3.length; j++) {
				System.out.print(intAry3[i][j] + " ");

			}
			
		
		
		
			System.out.println();
		}
	}

	public static String getString(String[] strAry) {
		String result = "";
		for (int i = 0; i < strAry.length; i++) {
			result += strAry[i] + " - ";

		}
		return result;
	}

	public static String getString(String str1, String str2) {
		return str1 + " - " + str2;

	}

	public static int getLargeValue(int[] ary) { // -> getLargeValue의 모든int 값을 ary로 인식하겠다
		int maxValue = Integer.MIN_VALUE;
		for (int i = 0; i < ary.length; i++) {
			if (ary[i] >= maxValue)
				maxValue = ary[i];

		}
		return maxValue;
		// return 은 간단하게 for 문 괄호 밖에 적어야함, 조건 중 가장 큰 괄호 안에
		// 가장 작은 수 찾기시 MIN_VALUE->MAX_VALUE로 설정후 찾기 부등호 표시 확인
	}

	// getLargeValue두개의 갑 중 큰 값을 반환해줌
	// int maxValue = Integer.MIN_VALUE;->가장 작은 수 ,3가지 이상 적용시 사용
	public static int getLargeValue(int a, int b, int c) {
		int maxValue = Integer.MIN_VALUE;
		if (a >= maxValue)
			maxValue = a;
		if (b >= maxValue)
			maxValue = b;
		if (c >= maxValue)
			maxValue = c;
		return maxValue;
	}
}

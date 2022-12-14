package edu.kh.array2.ex;

import java.util.Arrays;

public class Array2Example {
	
	/* 2차원 배열
	 * 
	 * - 자료형이 같은 1차원 배열을 묶음으로 다루는 것
	 * -> 행, 열 개념 추가
	 * 
	 */

	public void ex1() {
		// 2차원 배열 선언
		
		int arr[][];
		// int 2차원 배열을 참조하는 변수 선언
		// == int arr[][]
		// == int[] arr[]
		// note ! (참조형 == 참조 변수 == 레퍼런스 변수 == 레퍼런스)
		
		// 2차원 배열 할당
		// -> new 자료형 [행크기][열크기]
		
		arr = new int[2][3];
		// heap 영역에 int 2차원 배열 2행 3열 공간 할당
		
		// 2차우너 배열 초기화 
		// 1) 행, 열 인덱스를 이용해서 직접 초기화
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		
		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;
		
		// 2) 2중 for문을 이용한 초기화 
		
		// 배열 요소 초기화에 사용할 변수
		int num = 10;
		
		// * 배열 길이
		// -> 배열명.length는 변수가 직접 참조하고 있는 배열의 길이를 반환 
		
		
		System.out.println(arr.length); // == 2
		// arr이 참조하고 있는 2차원 배열의 행의 길이
		
	
		System.out.println(arr[0].length); // == 3 (열 길이)
		// arr[0] 행이 참조하고 있는 1차원 배열(열)의 길이
		 
		for(int row = 0 ; row < arr.length; row++) {
			for (int column = 0; column < arr[row].length; column++) {
				
				arr[row][column] = num;
				num += 10; //10씩 증가 
				
			}
		}
		
		//출력
		// Arrays.toString은 참조하고 있는 1차열 배열값을 문자열로 반환 
	
		System.out.println(Arrays.deepToString(arr));
		
		// Arrays.deepToString(배열명_
		// - 참조하고 있는 배열의 데이터가 나오는 부분까지 파고들어가서
		// 모든 값을 문자열로 반환 
			
	}
	
	public void ex2() {
		
		// 2차원 배열 선언과 동시에 초기화 
		
		// 3행 3열짜리 정수형 2차원 배열 선언과 동시에 
		// 1~9까지 초기화
		
		int arr[][] = { {1, 2, 3}, 
						{4, 5, 6}, 
						{7, 8, 9}
					   };
		
		System.out.println(Arrays.deepToString(arr));
		System.out.println("============================");
		// 행별로 합 출력
		for(int row = 0; row<arr.length; row++) {
			int sum = 0;
			for(int col = 0; col < arr[row].length; col++) {
				sum += arr[row][col];//현재 행의 모든 열 값을 누적
			}
			System.out.printf("%d행의 합 : %d\n", row, sum);
		}
		System.out.println("============================");
		// 열별로 합 출력
		// -> 열부터 지정 후 각 행의 값을 누적
		for(int col = 0; col<arr[0].length; col++) {
			int sum = 0;
			for(int row = 0; row < arr.length; row++) {
				sum += arr[row][col];
				
			}
			System.out.printf("%d열의 합 : %d\n", col, sum);
		}
		
		System.out.println("============================");
		//전체 합 출력
		int sum = 0;
		for(int row = 0; row<arr.length; row++) {
			for(int col = 0; col < arr[row].length; col++) {
				sum += arr[row][col];
				
			}
		}
		System.out.printf("전체의 합 : %d\n", sum);
	}
	
	public void ex3() {
		
		char[][] arr = new char[4][];
		// char 2 차원 배열 생성 시 행 부분만 작성
		
		arr[0] = new char[3]; // 0행에 3열짜리 1차원 배열을 생성하여 주소값 저장
		arr[1] = new char[4]; // 1행에 4열짜리 1차원 배열을 생성하여 주소값 저장
		arr[2] = new char[5]; // 2행에 5열짜리 1차원 배열을 생성하여 주소값 저장
		arr[3] = new char[2]; // 3행에 2열짜리 1차원 배열을 생성하여 주소값 저장
		
		char ch = 'a';
		for(int row = 0; row < arr.length; row++) { //행
			for(int col = 0; col < arr[row].length; col++) { //열
				arr[row][col]=ch++;
			}
		}
		System.out.println(Arrays.deepToString(arr));
	}
}

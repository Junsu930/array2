package edu.kh.array2.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Array2Practice {
	
	public void practice1() {
		
		/* 3행 3열짜리 문자열 배열을 선언 및 할당하고
		 * 인덱스 0행 0열부터 2행 2열까지 차례대로 접근하여 (0, 0)과 같은 형식으로 출력
		 */
		
		String arr[][] = new String[3][3];
		
		for(int r = 0; r< arr.length; r++) {
			for(int c = 0; c<arr[r].length; c++) {
			
				System.out.print("(" + r + ", " + c + ")");
			}
			System.out.println();
		}
	}
	
	public void practice2() {
		
		/* 4행 4열짜리 정수형 배열 선언 및 할당하고 
		 * 1) 1~16까지 값을 차례대로 저장
		 * 2) 저장된 값들을 차례대로 출력
		 */
		
		int arr[][] = new int[4][4]; //선언 및 할당
		int i = 1;
		for(int r = 0; r< arr.length; r++) {
			for(int c = 0; c<arr[r].length; c++) {
				arr[r][c]= i;
				i++;
				System.out.print(arr[r][c] + " ");
			}
			System.out.println();
		}
	}

	public void practice3() {
		int arr[][] = new int[4][4]; //선언 및 할당
		int i = 16;
		for(int r = 0; r< arr.length; r++) {
			for(int c = 0; c<arr[r].length; c++) {
				arr[r][c]= i;
				i--;
				System.out.print(arr[r][c] + " ");
			}
			System.out.println();
		}
	}
	
	public void practice4() {
		
		int arr[][] = new int [4][4];
		
		for(int r = 0 ; r < arr.length; r++) {
			for(int c = 0; c< arr[r].length; c++) {
				if ( r < 3 && c <3 ) {
					arr[r][c] = (int)(Math.random()*10+1); //랜덤 정수
				} 
				if (c == 3) { //3열의 경우 합으로 처리
					arr[r][c] = arr[r][0] + arr[r][1] + arr[r][2] ; 
					
				}
				if (r == 3) { //3행의 경우 전부 합으로 처리
					arr[r][c] = arr[0][c] + arr[1][c] + arr[2][c] ; 
					
				}
			}
		}
		
		//출력문 작성
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		/*
		 * 사용자에게 행과 열 입력 받는다 (1~10 사이)
		 * 이차원 배열 안에는 영어 대문자가 랜덤 출력
		 */
		System.out.print("행 크기 :");
		int r = sc.nextInt();
		System.out.print("열 크기 :");
		int c = sc.nextInt();
		
		while(r>10 || r < 1 || c > 10 || c <1) {
			System.out.println("1~10까지 입력하세요");
			System.out.print("행 크기 :");
			r = sc.nextInt();
			System.out.print("열 크기 :");
			c = sc.nextInt();
			
		}//1~10까지 행열 받기
		
		char arr[][] = new char [r][c];
		// 선언 및 초기화
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				while(arr[i][j]<65) {
				arr[i][j] = (char)(Math.random()*90+1);//랜덤으로 65~90까지 유니코드 만든다
				}
			}
		}

		//출력
		for(int i = 0; i < arr.length; i++) {
			for (int j = 0 ; j <arr[i].length; j++ ) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
		
	public void practice6() {
		Scanner sc =new Scanner(System.in);
		char alpha = 'a';//'a'를 위한 변수
		System.out.print("행의 크기 : ");
		int row = sc.nextInt();
		int col = 0;
		char arr[][] = new char[row][];
		
		for(int c = 0; c<row; c++) {
			System.out.print(c + "행의 열의 크기 : ");
			col = sc.nextInt();
			arr[c] = new char [col];
			//가변행렬 선언
		}
		
		
		for (int i = 0; i<arr.length; i++) {
			for (int j = 0; j<arr[i].length; j++) {
				arr[i][j] = alpha;
				alpha++;
				
				System.out.print(arr[i][j] + " ");
			}
		System.out.println(); //출력
		}
	}
}


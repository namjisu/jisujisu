//2018204017 남지수

package jisu;

import java.util.Scanner;

public class jeesoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			
			//반복문 계속해서 실행
			
		Scanner in = new Scanner(System.in);
		
		System.out.print("제품 가격 입력 (1~10000) : ");
		int price = in.nextInt();
		
		if(price==0) {
			//조건문 : price 값에 0을 입력하면 반복문을 빠져나옴.
			System.out.print("프로그램 종료......");
			break;
		}	
		
		System.out.print("지불 금액 입력 (1~10000) : ");
		int pay = in.nextInt();
		
		int less = pay - price; //잔액값을 입력받는 변수.
		
		int a=less/5000,
				b=less%5000;
		// a는 5000원 개수 b는 잔액에서 5000원을 뺀 나머지
		
		int c,d,e,f;
		
		System.out.printf("- 5000원 : %d개\n", a);
		a=b/1000; 
		b=b%1000;
		// a는 1000원 개수 b는 원래 b값에서 a*1000을 뺸 나머지가 됨.
		System.out.printf("- 1000원 : %d개\n", a);
		a=b/500;
		b=b%500;
		// 같은 방식으로 동일하게 진행.
		System.out.printf("- 500원 : %d개\n", a);
		a=b/100;
		b=b%100;
		System.out.printf("- 100원 : %d개\n", a);
		a=b/50;
		b=b%50;
		
		c=b/10; b=b%10;
		d=b/5; b=b%5;
		
		System.out.printf("- 50원 : %d개, 10원 : %d개, 5원  : %d개, 1원 : %d개\n",a,c,d,b);

		System.out.print("===========================\n");
		
		
	}

}
}

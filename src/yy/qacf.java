package yy;

import java.util.Scanner;

public class qacf {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t;
		int max=0 , min = 0;//初始化最大值最小值为0；
		int m, n;//m,n记录最大值最小值的位置
		Scanner input = new Scanner(System.in);//创建input对象
		int[] a = new int[5];//声明并创建了一个一维数组a,并分配了5个元素
		for (int i = 0; i < a.length; i++) {
			a[i] = input.nextInt();
			max = a[0];//将第一个值定义为最大值
			m = 0;
			min = a[0];//将第一个值定义为最小值
			n = 0;
			if (max <= a[i])
				max = a[i]; //取出最大值
			if (min >= a[i])
				min = a[i];//取出最小值
 
		}
 
		for (int i = 0; i < a.length; i++) {
			if (max == a[i]) {
				m = i; //获取最大值位置
			}
			if (min == a[i]) {
				n = i;//获取最小值位置
			}//将最大值与第一个元素互换，最小值与最后一个元素互换
			t = a[0];
			a[0] = max;
			max = t;
			t = a[a.length - 1];
			a[a.length - 1] = min;
			min = t;
		}
		for (int i = 0; i < a.length; i++) {
 
			System.out.println(a[i]);//输出数组
 
		}
	}
 
}
package yy;

import java.util.Scanner;

public class qacf {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t;
		int max=0 , min = 0;//��ʼ�����ֵ��СֵΪ0��
		int m, n;//m,n��¼���ֵ��Сֵ��λ��
		Scanner input = new Scanner(System.in);//����input����
		int[] a = new int[5];//������������һ��һά����a,��������5��Ԫ��
		for (int i = 0; i < a.length; i++) {
			a[i] = input.nextInt();
			max = a[0];//����һ��ֵ����Ϊ���ֵ
			m = 0;
			min = a[0];//����һ��ֵ����Ϊ��Сֵ
			n = 0;
			if (max <= a[i])
				max = a[i]; //ȡ�����ֵ
			if (min >= a[i])
				min = a[i];//ȡ����Сֵ
 
		}
 
		for (int i = 0; i < a.length; i++) {
			if (max == a[i]) {
				m = i; //��ȡ���ֵλ��
			}
			if (min == a[i]) {
				n = i;//��ȡ��Сֵλ��
			}//�����ֵ���һ��Ԫ�ػ�������Сֵ�����һ��Ԫ�ػ���
			t = a[0];
			a[0] = max;
			max = t;
			t = a[a.length - 1];
			a[a.length - 1] = min;
			min = t;
		}
		for (int i = 0; i < a.length; i++) {
 
			System.out.println(a[i]);//�������
 
		}
	}
 
}
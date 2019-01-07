package cn.edu.bjut.nlp.cn.gui.util;

import org.junit.Test;



public class Quickly {
	int a[]={4,7,88,6,88,99,100,0,99,23,22};
	int getMiddle(int a[],int start,int end){
		int temp = a[start];
		int i =start;
		int j = end;
		while(i<j){
			while(a[j]>=temp&&i<j){j--;}
			a[i]=a[j];
			while(a[i]<=temp&&i<j){
				i++;
			}
			a[j]=a[i];
		}
		a[i]=temp;
		return i;
	}
	public void quickSort(int a[],int start,int end){
		if (start < end) {
			
			int t =getMiddle(a, start, end);
			quickSort(a,start, t-1);
			quickSort(a, t+1, end);
		}
		/*int temp = a[start];
		
		if(start<i-1){
			
			quickSort(a,start, i-1);
		}
		if(i+1<end){
			System.out.println(i);
			quickSort(a, i+1, end);
		}*/
	}
	void printt(int a[]){
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
	@Test
	public void xx(){
		quickSort(a,0,a.length-1);
		printt(a);
	}
}

package com.wipro.par;

public class GenerateSeriesFindNth {

	public static int genSeries(int n1,int n2,int n3,int n4) {
		
		int cd1 = n2 -n1;
		int cd2 = n3-n2;
		int output = n1;
		System.out.print(n1+", ");
		for(int i=1;i<n4;i++) {
			if(i%2==1) {
				output = output + cd1;
			}
			else
				output = output + cd2;
			System.out.print(output+", ");
		}
		return output;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = GenerateSeriesFindNth.genSeries(1,3,6,10);
		System.out.println(res);
	}

}

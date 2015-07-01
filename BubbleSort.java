package general;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		Integer[] data = { 2, 0, 15, 7, 4, 2, 1 };
		

		while (true) {
			int x=0;
			for (int i=0;i<data.length-1;i++) {
				if(data[i]>data[i+1]){
					int swap=data[i];
					data[i]=data[i+1];
					data[i+1]=swap;
					x=1;
				}				
			}
			if(x==0){
				break;
			}
		}
		System.out.println(Arrays.toString(data));
	}

}

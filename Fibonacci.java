package Fibonacci;
//斐波那契较大数据实现 在循环200次非递归算法的实现
import java.math.BigInteger;

public  class Fibonacci{
	//of方法实现斐波那契
	public static BigInteger of(int n){
		BigInteger arr[] = new BigInteger[n+1];
	    arr[0]=BigInteger.valueOf(0);
	    arr[1]=BigInteger.valueOf(1);
	    for(int i=2;i<=n;i++){
	      arr[i] = arr[i-1].add(arr[i-2]);
	    }
	    return arr[n];
	  }

	public static void main(String[] args) {
		
		for(int i=1;i<=200;i++){
		      System.out.println("Fibonacci.of("+i+ ")"+ " == "+ Fibonacci.of(i));
		    }

	}

}

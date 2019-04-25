斐波那契数列

斐波那契数列的实现在包package Fibonacci下。

1.因为输出数据大，采用数据格式：BigInteger。
2.实现斐波那契数列静态方法是of()；
	采用非递归方式；
	输入参数int:循环次数 输出参数：BigInteger；
	使用一维数组存储；
	每次调用前两个数的值。
3.在主函数中Fibonacci.of();直接调用静态方法。
public  class Fibonacci{
	
	public static BigInteger of(int n){
	//创建一个BigInteger数组
		BigInteger arr[] = new BigInteger[n+1];
	
	    arr[0]=BigInteger.valueOf(0);
	    arr[1]=BigInteger.valueOf(1);
	    for(int i=2;i<=n;i++){
	      arr[i] = arr[i-1].add(arr[i-2]);//调用BigInteger的加法方法
	    }
	    return arr[n];
	  }

	public static void main(String[] args) {
		//从第一次循环到第200次
		for(int i=1;i<=200;i++){
		      System.out.println("Fibonacci.of("+i+ ")"+ " == "+ Fibonacci.of(i));
		    }
	}
}

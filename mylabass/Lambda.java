package com.cg.mylabass;

import java.util.function.BiFunction;

public class Lambda 
{
	public static void main(String[] args)
	{
 
		BiFunction<Integer,Integer,Integer> maxFunction1=(x,y)->(x*y);//bifunction
		System.out.println(maxFunction1.apply(4,2));
 
 
 
		BiFunction<Double,Double,Double> pow=(a,b)->(Math.pow(a,a*b));
		System.out.println(pow.apply(2.0, 3.0));
 
 
 
		BiFunction<Integer,Integer,Integer> pow2=(a,b)->//Bifunction
		{
			int s1=a,s2=0;
			for(int i=1;i<=b;i++)
			{
				s1=s1*b;
			}
			return s2=s1*a;        
		};
		System.out.println(pow2.apply(2, 3));
 
 
		/*BiFunction<Integer,Integer,Integer> pow1=(a,b)->
		{
			int s1=a,s2=b,s3;
			s3=s1*s2;
			for(int i=1;i<=s3;i++)
			{
				s1=s1*s1;
			}
			return s1;
		};
		System.out.println(pow1.apply(2, 3));*/
 
	}
 
}
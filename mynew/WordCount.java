package com.cg.mynew;

public class WordCount {

	public static void main(String[] args) {
		String str="There was a farmer had a dog and ei ei o";
		int count=0;
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' '&& ch[i+1]!=' ')
			{
				count++;
			}
		}
		System.out.println(count+1);

	}

}

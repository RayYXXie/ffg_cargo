package org.entry;

import org.junit.Test;

public class Test1 
{
	
	@Test
    public void test1(){
    	System.out.println("this is test1");
    	String str1 = "abc";
    	String str2 = "bcd";
    	if(!str1.equals(str2)){
    		System.out.println("str1 ������str2");
    	}else{
    		System.out.println("str1 ����str2");
    	}
    	
    }
	
	
	@Test
    public void test2(){
    	System.out.println("this is test2");
    	int a = 100;
    	int b = 99;
    	if(a > b){
    		System.out.println("a���� b");
    	}else if(a == b){
    		System.out.println("a���� b");
    	}else{
    		System.out.println("aС��b");
    	}
    	
    }
	
	@Test
    public void test3(){
    	System.out.println("this is test3");
    	int a = 1;
    	int b = 5;
    	while(a<=b){
    		System.out.println("a="+a);
    		a++;
    	}
    	
    }
}
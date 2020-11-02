package com.example.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 *
 * @author MikeW
 */



public class Main {

	static int i = 1;

  public static void main(String[] args) throws Exception{
	  	Thread t1 = new Thread();
	  	Thread t2= new Thread();
	  	//t2.setPriority(Thread.MAX_PRIORITY);
	  	System.out.println(t1.equals(t2));
	  	
  }
  public void m(int i) {
	  i +=2;
  }
}

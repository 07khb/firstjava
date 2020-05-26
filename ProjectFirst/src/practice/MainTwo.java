package practice;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MainTwo {
	public static void main(String []args){
		System.out.println("$$$$$$$$$$$$$$");
        System.out.println("나에게 행운을~!~!");
        System.out.println("$$$$$$$$$$$$$$");
        
        Scanner sc=new Scanner(System.in);
        int play_count=sc.nextInt();
        
        for(int i=1; i<=play_count; i++){
            System.out.println(i+"번째 행운♥: "+making_lottonumber()+ "\t");
        }
    }
    
    static String making_lottonumber(){
        Set<Integer>set = new HashSet<Integer>();
        
        while(set.size() != 6){
            set.add((int)(Math.random() * 45 + 1));
        }
        
        // 정렬
        List<Integer> list = new ArrayList<Integer>(set);
        Collections.sort(list);
         
        return list.toString();
    }
    
	} 


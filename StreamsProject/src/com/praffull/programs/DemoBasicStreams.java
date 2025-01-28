package com.praffull.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DemoBasicStreams {
	public static void main(String[] args) {
		ArrayList<String> cri = new ArrayList<>();
        
        cri.add("Steve Smith");
        cri.add("Joe Root");
        cri.add("Kane Williamson");
        cri.add("AB de Villiers");
        cri.add("Jos Buttler");
        cri.add("Kumar Sangakkara");
        cri.add("Brian Lara");
        cri.add("Joe Root");
        cri.add("Jacques Kallis");
        cri.add("Jos Buttler");
        cri.add("Chris Gayle");
        cri.add("Glenn McGrath");
        //System.out.println(cri);
        
        cri.stream().forEach(nm->System.out.println(nm));
        System.out.println("----------------");
        cri.stream()
        .filter(nm->nm.startsWith("Jo"))
        .forEach(t->System.out.println(t));
        System.out.println("---------------");
        
        List<String> res=cri.stream()
        .filter(nm->nm.length()<=12)
        .collect(Collectors.toList());
        System.out.println(res);
        System.out.println("---------------");
        res=cri.stream()
        		.map(nm->nm.substring(0,3))
        		.collect(Collectors.toList());
        System.out.println(res);
        res=cri.stream()
        		.map(nm->nm.toUpperCase())
        		.collect(Collectors.toList());
        System.out.println(res);
        System.out.println("----------------");
        long cnt=cri.stream().filter(nm->nm.startsWith("J")).count();
        System.out.println(cnt);
        System.out.println("------------");
        res=cri.stream().distinct().toList();
        System.out.println(res);
        System.out.println("------------");
        cri.stream().limit(3).forEach(t->System.out.println(t));
        System.out.println("--------------");
        cri.stream().skip(5).limit(2).forEach(t->System.out.println(t));
        
		
	}

}

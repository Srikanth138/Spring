package com.nt.bean;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.aspectj.lang.JoinPoint;

public class Aspect {
	@SuppressWarnings("resource")
	public void advice(JoinPoint jp,Object obj) throws IOException {
		System.out.println("additional concern");  
        System.out.println("Method Signature: "  + jp.getSignature());  
        System.out.println("Result in advice: "+obj.hashCode());
       
        String f="e:/cb.txt";
    	FileOutputStream fs=new FileOutputStream(f);
    	DataOutputStream ds=new DataOutputStream(fs);
    	
    	FileWriter fw=new FileWriter(f);
    	
        if(obj.equals(1)) {
        	fw.append("ssss");
        	ds.write(1);
        	ds.write('s');
        	ds.size();
        }
        else {
        	ds.write(0);
        	ds.write('f');
        	
        }
        //System.out.println("Date class : "+d);
        System.out.println("end of after returning advice...");  
		
	}

}

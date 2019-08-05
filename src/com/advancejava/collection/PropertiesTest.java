package com.advancejava.collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesTest {
/*Properties : in our program if anything which changes frequently (like User-name,password,
 * email,mobile etc) are not recommended Hard-code in java program because if there is any change to
 * reflect that change we recompilations , re-build , and re-deploy application are required even some
 * times server restart also required which creates a bit business impact to the client to the client  
 *                 we can overcome this problem by using property files such types of variable thing
 *  we have to configure in the property file, from that property file we have to read java program 
 *  and we can use those properties.
 *  
 *  The main advantage of this approach is, ,if there is a change in  properties file to reflect 
 *  that change just re-deployment is enough which won;t any business impact to the client 
 *  
 *  we can use java properties object to hold properties which are coming from properties files 
 * 
 * 
 * Methods : 
 * getProperty(String pName) : To getProperty -return string
 * setProperty(String pName,String pValue) : To setProperty -return string
 * propertyNames : it return all property names present in property object-return Enumeration
 * 
 * void load(InputStream is) : To load properties from properties into java property object
 * void store(outputStream os , String comment) : To store properties from java properties object
 * into properties file
 * 
 * 
 */
	
	public static void main(String arg[]) throws Exception {
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("propetriesfilepath");
		p.load(fis);
		System.out.println(p);
		String s=p.getProperty("pr");
		System.out.println(s);
		p.setProperty("key", "value");
		FileOutputStream fos=new  FileOutputStream("propetriesfilepath");
		p.store(fos, "properties updated ");
		
	}
	
	
	
	
	
	
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviceProvider;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author OLASEUN
 */
public class trial2 {
    public static void main(String [] args) throws FileNotFoundException
    {
        int count= 0;
        int count1= 0;
        int count2= 0;
        int count3= 0;
        int count4=0;
        Scanner s = new Scanner(new File("C:/Users/OLASEUN/Downloads/PhoneNumbers.txt"));
     
        HashMap <String,String> sp = new HashMap<String,String>();
        while(s.hasNextLine())
        {
            sp.put("sp",s.nextLine()); 
            
           
             for(String nineMobile: sp.values() ){
              
               String k= "0809";
               String l= "0817";
               String m = "0818";
               String n= "0909";
               String o= "0908";
               //k
                 if (nineMobile.startsWith(k) ){
                  //System.out.println(nineMobile); 
                   
                      count++;
                 }
                 
                 //l
                 if (nineMobile.startsWith(l) ){
                   // System.out.println(nineMobile); 
                    
                    // System.out.println(count++);
                    count++;
                 }
                 //m
                if (nineMobile.startsWith(m) ){
                   // System.out.println(nineMobile); 
                    
                     //System.out.println(count++);
                    count++;
                 }
                
                //n
                if (nineMobile.startsWith(n) ){
                    //System.out.println(nineMobile); 
                    
                     //System.out.println(count++);
                     count++;
                 }
                //o
                if (nineMobile.startsWith(o) ){
                    //System.out.println(nineMobile); 
                    
                     //System.out.println(count++);
                    count++;
                 }
                
             }
                 
              
             
        }//end of 9mobile
        
        //start of MTN
        
         Scanner t = new Scanner(new File("C:/Users/OLASEUN/Downloads/PhoneNumbers.txt"));
         HashMap <String,String> sp1 = new HashMap<String,String>();
          while(t.hasNextLine())
          {
             sp1.put("sp1",t.nextLine()); 
             
             for(String MTN: sp1.values() )
             {
                 String m1= "0703";
                 String m2="0706";
                 String m3= "0803";
                 String m4= "0806";
                 String m5= "0810";
                 String m6= "0813";
                 String m7= "0814";
                 String m8= "0816";
                 String m9= "0903";
                 String m10= "0906";
                 String m11= "0913";
                 String m12="0916";
                 String m13="07025";
                 String m14="07026";
                 String m15="0704";
                 
                  if (MTN.startsWith(m1) ){
                  //System.out.println(nineMobile); 
                   
                      count1++;
                 }
                  if (MTN.startsWith(m2) ){
                  //System.out.println(nineMobile); 
                   
                      count1++;
                 }
                  if (MTN.startsWith(m3) ){
                  //System.out.println(nineMobile); 
                   
                      count1++;
                 }
                  if (MTN.startsWith(m4) ){
                  //System.out.println(nineMobile); 
                   
                      count1++;
                 }
                  if (MTN.startsWith(m5) ){
                  //System.out.println(nineMobile); 
                   
                      count1++;
                 }
                  if (MTN.startsWith(m6) ){
                  //System.out.println(nineMobile); 
                   
                      count1++;
                 }
                  if (MTN.startsWith(m7) ){
                  //System.out.println(nineMobile); 
                   
                      count1++;
                 }
                  if (MTN.startsWith(m8) ){
                  //System.out.println(nineMobile); 
                   
                      count1++;
                 }
                  if (MTN.startsWith(m9) ){
                  //System.out.println(nineMobile); 
                   
                      count1++;
                 }
                  if (MTN.startsWith(m10) ){
                  //System.out.println(nineMobile); 
                   
                      count1++;
                 }
                  if (MTN.startsWith(m11) ){
                  //System.out.println(nineMobile); 
                   
                      count1++;
                 }
                  if (MTN.startsWith(m12) ){
                  //System.out.println(nineMobile); 
                   
                      count1++;
                 }
                  if (MTN.startsWith(m13) ){
                  //System.out.println(nineMobile); 
                   
                      count1++;
                 }
                  if (MTN.startsWith(m14) ){
                  //System.out.println(nineMobile); 
                   
                      count1++;
                 }
                  if (MTN.startsWith(m15) ){
                  //System.out.println(nineMobile); 
                   
                      count1++;
                 }
             }
          }//end of MTN
          
          //start of AIRTEL
           Scanner u = new Scanner(new File("C:/Users/OLASEUN/Downloads/PhoneNumbers.txt"));
            HashMap <String,String> sp2 = new HashMap<String,String>();
                while(u.hasNextLine()){
                  sp2.put("sp2",u.nextLine());   
                   for(String AIRTEL: sp2.values() ){
                       
                       String a1="0701";
                       String a2="0708";
                       String a3="0802";
                       String a4="0808";
                       String a5="0812";
                       String a6="0901";
                       String a7="0902";
                       String a8="0904";
                       String a9="0907";
                       String a10="0912";
                       
                     if (AIRTEL.startsWith(a1) ){
                  //System.out.println(nineMobile); 
                   
                      count2++;
                 }
                     if (AIRTEL.startsWith(a2) ){
                  //System.out.println(nineMobile); 
                   
                      count2++;
                 }
                       if (AIRTEL.startsWith(a3) ){
                  //System.out.println(nineMobile); 
                   
                      count2++;
                 }
                         if (AIRTEL.startsWith(a4) ){
                  //System.out.println(nineMobile); 
                   
                      count2++;
                 }
                           if (AIRTEL.startsWith(a5) ){
                  //System.out.println(nineMobile); 
                   
                      count2++;
                 }
                             if (AIRTEL.startsWith(a6) ){
                  //System.out.println(nineMobile); 
                   
                      count2++;
                 }
                               if (AIRTEL.startsWith(a7) ){
                  //System.out.println(nineMobile); 
                   
                      count2++;
                 }
                                 if (AIRTEL.startsWith(a8) ){
                  //System.out.println(nineMobile); 
                   
                      count2++;
                 }
                                   if (AIRTEL.startsWith(a9) ){
                  //System.out.println(nineMobile); 
                   
                      count2++;
                 }
                                     if (AIRTEL.startsWith(a10) ){
                  //System.out.println(nineMobile); 
                   
                      count2++;
                 }
                   } 
                    
                }//end of AIRTEL
          
        //START of GLOBACOM
        
        Scanner v = new Scanner(new File("C:/Users/OLASEUN/Downloads/PhoneNumbers.txt"));
        HashMap <String,String> sp3 = new HashMap<String,String>();
        while(v.hasNextLine()){
        sp3.put("sp3",v.nextLine());
           for(String GLO: sp3.values() ){
             String g1="0705";
             String g2="0805";
             String g3="0807";
             String g4="0811";
             String g5="0815";
             String g6="0905";
             String g7="0915";
             
                if (GLO.startsWith(g1) ){
                  //System.out.println(nineMobile); 
                   
                      count3++;
                 } 
                  if (GLO.startsWith(g2) ){
                  //System.out.println(nineMobile); 
                   
                      count3++;
                 }
                    if (GLO.startsWith(g3) ){
                  //System.out.println(nineMobile); 
                   
                      count3++;
                 }
                      if (GLO.startsWith(g4) ){
                  //System.out.println(nineMobile); 
                   
                      count3++;
                 } 
                        if (GLO.startsWith(g5) ){
                  //System.out.println(nineMobile); 
                   
                      count3++;
                 }
                          if (GLO.startsWith(g6) ){
                  //System.out.println(nineMobile); 
                   
                      count3++;
                 } 
                            if (GLO.startsWith(g7) ){
                  //System.out.println(nineMobile); 
                   
                      count3++;
                 } 
           }
        }//End of GLOBACOM
        
        //start of MTEL
          Scanner x = new Scanner(new File("C:/Users/OLASEUN/Downloads/PhoneNumbers.txt"));
          HashMap <String,String> sp4 = new HashMap<String,String>();
           while(x.hasNextLine()){
               sp4.put("sp4",x.nextLine());
               for(String MTEL: sp4.values() ){
                   String mt= "0804";
                    if (MTEL.startsWith(mt) ){
                  //System.out.println(nineMobile); 
                   
                      count4++;
                 } 
               }
               
           }//END of MTEL
          
        
       System.out.println("Total 9Mobile numbers:"+count); 
        System.out.println("Total MTN numbers:"+count1);
        System.out.println("Total Airtel numbers:"+count2);
        System.out.println("Total Globacom numbers:"+count3);
        System.out.println("Total MTEL numbers:"+count4);
    }


}

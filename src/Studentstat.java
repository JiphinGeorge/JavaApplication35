/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Studentstat {
 int rollno;
 String name;
 static String college ="ITS";
 
 static void change()
 {
     college = "BBDIT";
 } 
 Studentstat(int r , String n){
 
      rollno = r;
      name = n;
 }
 void display(){
 
      System.out.println(rollno+" "+name+" "+college);
 }
 public static void main(StringVowels args[]){
 
      change();
      Studentstat s1 = new Studentstat(111,"Diya");
      Studentstat s2 = new Studentstat(112,"sayooj");
      Studentstat s3 = new Studentstat(113,"Rahul");
      s1.display();
      s2.display();
      s3.display();
      
 }
 
}
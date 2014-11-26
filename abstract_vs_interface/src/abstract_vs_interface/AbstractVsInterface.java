/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_vs_interface;

import abs.AbClass;
import inf.Iface;
import pojo.Apple;
import pojo.ApplePro;
import pojo.ConcretClass;

/**
 *
 * @author isalman
 */
public class AbstractVsInterface {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      ConcretClass cc = new ConcretClass();
      cc.ccMethod();          //own method
      cc.absMethod();         //overridden abstract class method
      cc.absNormalMethod();   //inherited abstract class method
      cc.ifaceMethod();       //implemented interface method
      
      if(cc instanceof AbClass){
         System.out.println("cc is an instanceof AbClass");
      }
      if(cc instanceof Iface){
         System.out.println("cc is an instanceof Iface");
      }
      if(cc instanceof ConcretClass){
         System.out.println("cc is an instanceof ConcretClass");
      }
      
      System.out.println("\n************abstract class block**************\n");
      //AbClass ac = new AbClass(); //not possible
      AbClass ac = new ConcretClass();
      //ac.ccMethod();          //own method //reference ac can not hold any ConcretClass class methods
      ac.absMethod();         //overridden abstract class method //reference ac can only hold any properties which are inherited or overridden from that abstract class at ConcretClass 
      ac.absNormalMethod();   //inherited abstract class method //reference ac can only hold any properties which are inherited or overridden from that abstract class at ConcretClass
      //ac.ifaceMethod();       //implemented interface method //reference ac can not hold any ConcretClass class methods which are implemented from other interfaces
      
      if(ac instanceof AbClass){
         System.out.println("ac is an instanceof AbClass");
      }
      if(ac instanceof Iface){
         System.out.println("ac is an instanceof Iface");
      }
      if(ac instanceof ConcretClass){
         System.out.println("ac is an instanceof ConcretClass");
      }
      
      System.out.println("\n************interface ref block**************\n");
      //Iface iface = new Iface();  //not possible
      Iface iface = new ConcretClass();
      //iface.ccMethod();          //not possible
      //iface.absMethod();         //not possible
      //iface.absNormalMethod();   //not possible
      iface.ifaceMethod();       //only implemented interface method can be call by interface reference
      
      if(iface instanceof AbClass){
         System.out.println("iface is an instanceof AbClass");
      }
      if(iface instanceof Iface){
         System.out.println("iface is an instanceof Iface");
      }
      if(iface instanceof ConcretClass){
         System.out.println("iface is an instanceof ConcretClass");
      }
      
      System.out.println("\n************Apple ApplePro block**************\n");
      Apple apple = new Apple();
      ApplePro applePro = new ApplePro();
      
      if(apple instanceof Apple){
         System.out.println("apple is an instanceof Apple");
      }
      if(apple instanceof ApplePro){
         System.out.println("apple is an instanceof ApplePro");
      } else {
         System.out.println("no, apple is not an instanceof ApplePro");
      }
      if(applePro instanceof Apple){
         System.out.println("applePro is an instanceof Apple");
      }
      if(applePro instanceof ApplePro){
         System.out.println("applePro is an instanceof ApplePro");
      }
              
   }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import abs.AbClass;
import inf.Iface;


/**
 *
 * @author isalman
 */
public class ConcretClass extends AbClass implements Iface {

   @Override
   public void absMethod() {
      System.out.println("AbClass.absMethod() : called by overridden in ConcretClass");
   }

   @Override
   public void ifaceMethod() {
      System.out.println("ConcretClass.ifaceMethod() : called implemented from Iface interface");
   }
   
   public void ccMethod(){
      System.out.println("ConcretClass.ccMethod() : called");
   }
   
}

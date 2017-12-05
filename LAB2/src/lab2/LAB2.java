/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Raymond Oniel's
 */
public class LAB2 {
public static int ages[] = {20, 45, 47, 38, 35, 67, 18, 34};
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
           for(int i=0;i<ages.length;i++){
               System.out.println("ages"+ages[i]);
           }
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<ages.length; i++){
               System.out.println(ages[i]-18); 
            }
            }
        });
        Thread t3=new Thread(new Runnable() {
            @Override
            public void run() {
               for(int i=0;i<ages.length;i++){
                   int f=(ages[i]-18)/5+1;
                   System.out.println(f);
               } 
            }
        });
        t1.start();
        try{
            t1.join();
        }catch(InterruptedException iex){
        }catch (Exception ex){
                
        
        }
        t2.start();
        t3.start();
        
    }
}
        /*}*/
        /*t1.start();
        t2.start();
        t3.start();*/
        
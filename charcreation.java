import hsa.*;
import java.awt.*;
public class charcreation{
  public static void main(String [] arg){
    Console con = new Console(38,174);
    
    //gamebackground
    con.setColor(new Color(99,99,99));
    con.fillRect(0,0,10000,10000);
    
    //game boarder
    con.setColor(new Color(125,118,113));
    con.fillRect(400,90,600,600);
    con.setColor(new Color(213,213,213));
    con.drawRect(400,90,550,600);
    con.drawRect(400,90,500,600);
    con.drawRect(400,90,450,600);
    con.drawRect(400,90,400,600);
    con.drawRect(400,90,350,600);
    con.drawRect(400,90,300,600);
    con.drawRect(400,90,250,600);
    con.drawRect(400,90,200,600);
    con.drawRect(400,90,150,600);
    con.drawRect(400,90,100,600);
    con.drawRect(400,90,50,600);
    con.drawRect(400,90,600,550);
    con.drawRect(400,90,600,500);
    con.drawRect(400,90,600,450);
    con.drawRect(400,90,600,400);
    con.drawRect(400,90,600,350);
    con.drawRect(400,90,600,300);
    con.drawRect(400,90,600,250);
    con.drawRect(400,90,600,200);
    con.drawRect(400,90,600,150);
    con.drawRect(400,90,600,100);
    con.drawRect(400,90,600,50);
    
    //character border
    con.setColor(new Color(0,0,0));
    con.drawRect(700,390,50,50);
    
    //forward
    con.setColor(new Color(93,55,28));
    con.fillOval(710,392,8,8);
    con.fillOval(732,392,8,8);
    con.setColor(new Color(249,207,178));
    con.fillOval(705,395,40,40);
    con.setColor(new Color(0,0,0));
    con.fillOval(715,405,6,6);
    con.fillOval(728,405,6,6);
    
    
    con.setColor(new Color(93,55,28));
    con.fillOval(610,292,8,8);
    con.fillOval(632,292,8,8);
    con.setColor(new Color(249,207,178));
    con.fillOval(605,295,40,40);
    con.setColor(new Color(0,0,0));
    con.fillOval(615,305,6,6);
    con.fillOval(628,305,6,6);
  }
}
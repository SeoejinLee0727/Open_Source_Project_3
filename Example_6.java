/*Example_6*/

import java.util.Scanner;

class CircleEx {
   private double x, y;
   private int radius;
   public CircleEx(double x, double y, int radius) {
      this.x = x; //x, y, radius 초기화
      this.y =y;
      this.radius = radius;
   }
   public void show() {
      System.out.println("(" + x + "," + y + ")"+ radius);
   }
   public int getRadius() {
      return radius;
   }
}

public class Example_6 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner scanner = new Scanner(System.in);
      
      CircleEx c[] = new CircleEx[3]; 
      int max=0; 
      for(int i=0; i < c.length; i ++) {
         System.out.print("x, y, radius >>");
         double x = scanner.nextDouble(); // x값 
         double y = scanner.nextDouble(); // y값
         int radius = scanner.nextInt(); // radius
         c[i] = new CircleEx(x, y, radius); // Circle 객체 생성
      }
      
      for(int i=0; i<c.length; i++) 
         if(max < c[i].getRadius())
            max = c[i].getRadius();
      
      for(int i=0; i<c.length; i++)
         if(max == c[i].getRadius()) {
            System.out.print("가장 면적인 큰 원은 ");
            c[i].show();
            
         }
      
      scanner.close();
   }

}
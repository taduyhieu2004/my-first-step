package hinhchunhat;

public class HinhChuNhat {
    private int width;
    private int length;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }




    public void setLength(int length) {
        this.length = length;
    }
//   public void handle(){
//        int a=getWidth();
//        int b=getLength();
//        System.out.println("S = "+a*b);
//        System.out.println(("C="+(a+b)*2));
//   }
   protected int handleS(){
        return getWidth()*getLength();

   }
   protected int handleC(){
        return (getLength()+getWidth())*2;
   }
}

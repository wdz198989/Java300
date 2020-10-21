package 构造方法测试;


/**
 * @Author : WuDazhong
 * @Date :2020/10/17 9:41
 * @Description :
 */
 class Animal {
  public void move(){
      System.out.println("动物可移动");
  }

}

class Dog extends Animal{
     public  void move(){
         System.out.println("狗可以跑和走");
     }

     public  void bark(){
         System.out.println("狗可以叫");
     }
}





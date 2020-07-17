package 枚举类的用法;


public enum Season4 implements Show {
    //1.提供当前枚举类的对象，多个对象之间使用","隔开,末尾使用";"结束
    //系统默认使用public static final修饰
    SPRING("春天","鸟语花香"){
        //每个枚举对象分别来实现该方法
        @Override
        public void show() {
            System.out.println("春天是一个鸟语花香的季节！");
        }
    },
    SUMMER("夏天","夏日炎炎"){
        @Override
        public void show() {
            System.out.println("夏天是一个夏日炎炎的季节！");
        }
    },
    AUTUMN("秋天","秋高气爽"){
        @Override
        public void show() {
            System.out.println("秋天是一个秋高气爽的季节！");
        }
    },
    WINNER("冬天","寒风瑟瑟"){
        @Override
        public void show() {
            System.out.println("冬天是一个寒风瑟瑟的季节！");
        }
    };

    //2.声明Season对象的属性，又因为枚举类对象的属性不应允许被改动, 所以应该使用 private final修饰
    private final String seasonName;
    private final String seasonDesc;

    //3.枚举类的构造器只能使用 private 权限修饰符
    // 私有化构造器是为了保证不能在类的外部创建其对象，否则就不能确定对象的个数
    private Season4(String seasonName, String seasonDesc){
        this.seasonName=seasonName;
        this.seasonDesc=seasonDesc;
    }

    //其他需求：获取枚举类对象的属性
    //只需要提供属性的get方法即可，但是不能提供set方法，而且也不允许提供set方法，因为枚举类是不可变的常量类，不能被修改
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }
}


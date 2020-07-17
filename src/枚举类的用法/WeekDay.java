package 枚举类的用法;

//枚举类对switch的语句的影响
// Java1.5新增enum关键字的同时，也扩大了switch的语句使用范围。
// Java1.5之前，switch中的值只能是简单数据类型，比如int、byte、short、char,
// 有了枚举类型之后，就可以使用枚举类的对象了。同时在switch表达式中使用enum定义的枚举类的对象作为表达式时,
// case子句可以直接使用枚举对象的名字, 无需添加枚举类作为限定。
// 这样一来，程序的控制选择就变得更加的方便，看下面的例子：
public enum WeekDay {
    // 定义一周七天的枚举类型
    Monday,Tuesday, Wednesday ,Thursday,Friday,Saturday,Sunday;
}

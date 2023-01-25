# static
  ## static
### 成员变量
 - 在类中修饰类的属性,所有类的实例都被赋值(被static修饰变量共享所有实例，静态区的内容是共享的)
 - 有一点需要注意的是，static修饰的变量快捷键不会为其添加自动的方法(需要手动的增加方法)
 - 存放在静态区，加载类的时候就分配了内存

*被类所有的对象共享，不属于对象，属于类，随着类的加载而加载，优先于对象存在*

---
### 修饰方法

- 多用在测试类中和工具类
- javaBean类中很少使用
总结：
  - 静态方法中只能访问静态
  - 非静态方法可以访问所有
  - **静态方法中没有this关键字**

# 继承

java 中提供一个extends 关键字，通过这个关键字我们可以让一个类和另一个类建立起继承关系，我们暂且叫他子类和父类
子类可以拓展父类的方法

## 使用场景

- 当类与类之间存在相同的内容，并且满足子类是父类的一种，就可以考虑使用继承来优化代码

## 继承中的成员变量和方法 

`什么是虚方法表`

- 虚方法是
 >- 非private
 >- 非final
 >- 非static方法
 
继承的时候把父的虚方法继承过来然后添加上自己的虚方法变成子类自己的虚方法表，如果发生了方法重写，就会发生方法覆盖

**注意点：**

只有虚方法表中的方法才能被重写

也就是说static和private修饰的方法不能被重写


## 继承中

- 父类中的构造方法不能被子类继承（因为如果继承的话构造方法和类名字完全一致这个规则冲突） 
- 子类中所有的构造方法默认先访问父类中的无参构造再执行自己
    >- 子类在初始化的时候，有可能使用到父类中的数据，如果父类没有初始化完成，子类将无法使用父类的数据
    >- 子类初始化之前，一定要调用父类构造方法先完成父类数据空间的初始化
- 子类构造方法的第一行语句默认都是`super()`,不写页存在，切必须是第一行
- 如果想调用父类的有参构造，必须手动写 `super()`进行调用

# this super
## this
- 通过 this可以调用本类的其他构造方法
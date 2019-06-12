##### ================================String(java.lang)======================================

###### 创建String对象

​	1.字面值的形式：会产生一个对象 存放在串池中，并且只产生一个对象[常用]

```java
	String s = "abc123";
```

​	2.通过构造方法创建：会产生两个对象，一个存放在串池中，一个存放在堆空间中

```java
	String s1 = new String("abcd");
```

###### 常用方法

###### 	提示：加*的重点掌握。自己尝试着去翻api

​	* length(): 返回字符串的长度 。

​		注意：length获取数组的长度

```java
int[] a = new int[5];
//a.length 获取a数组的长度
String s = "abc";
s.length();   //获取字符串的长度
```

- *String trim():去掉字符串前后的空格
-  String[] split(String str)：根据传入的字符串str   将本身字符串拆分 	
- *String toUpperCase()：将字符串转换大写，得到转换成大写后的字符串
- *String toLowerCase() : 将字符串转换小写，得到转换成小写后的字符串
- *boolean endWith(String str)：判断字符串是否以传入的参数str结尾
- char   charAt(int index) ：
- char[]  toCharArray()：
- *int indexOf(String str)：
- ​         int indexOf(String str,int fromindex):
- *int lastIndexOf(String str):
-  boolean contains(String str): 
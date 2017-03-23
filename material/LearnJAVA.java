import java.util.Scanner;
/**ha
ha
ha
ah
aha
ha
*/
import java.util.Arrays;
//导入java.util.Arrays;
import java.util.Arrays;

public class HelloWorld {
    
    public static void main(String[] args) {
        
        // 定义一个整型数组，长度为10
		int[] nums = new int[10];
        
        //通过循环给数组赋值
		for (int i = 0; i < nums.length; i++) {
            // 产生10以内的随机数
			int x =Math.random();
            
			nums[i] = x;// 为元素赋值
		}
        
		// 使用foreach循环输出数组中的元素
		for (int j=0:nums) {
			System.out.print(num[j] + " ");
		}
	}
}
/*
public class HelloWorld {
    public static void main(String[] args) {
		// 创建一个空的StringBuilder对象
		StringBuilder str = new StringBuilder();
        
		// 追加字符串
		str.append("jaewkjldfxmopzdm");
		
        // 从后往前每隔三位插入逗号
		for(int i=1,n=0;(i+n)<str.length();i+=3)
        {   
           str.insert(i+n,",");
           n++;
        }
        
		
        // 将StringBuilder对象转换为String对象并输出
		System.out.print(str.toString());
		System.out.println();
	}
}
*/
/*
public class HelloWorld {
    public static void main(String[] args) {
		// 定义一个字符串
		String s = "aljlkdsflkjsadjfklhasdkjlflkajdflwoiudsafhaasdasd";
        
        // 出现次数
		int num = 0;
        
         // 循环遍历每个字符，判断是否是字符 a ，如果是，累加次数
		for (int i=0;i<s.length();i++)
		{
            // 获取每个字符，判断是否是字符a
			if (s.charAt(i)=='a'){
                // 累加统计次数
				num++; 
			}
		}
		System.out.println("字符a出现的次数：" + num);
	}
}



public class HelloWorld {
    public static void main(String[] args) {
        // Java文件名
		String fileName = "HelloWorld.java"; 
        // 邮箱
		String email = "laurenyang@imooc.com";
		
		// 判断.java文件名是否正确：合法的文件名应该以.java结尾
        /*
        参考步骤：
        1、获取文件名中最后一次出现"."号的位置
        2、根据"."号的位置，获取文件的后缀
        3、判断"."号位置及文件后缀名
        *//*
        //获取文件名中最后一次出现"."号的位置
		int index = fileName.lastIndexOf(".");
        
        // 获取文件的后缀
		String prefix = fileName.substring(index+1);
		// 判断必须包含"."号，且不能出现在首位，同时后缀名为"java"
		if (index!=-1&&index!=0&&prefix.equals("java")){
			System.out.println("Java文件名正确");
		} else {
			System.out.println("Java文件名无效");
		}

        // 判断邮箱格式是否正确：合法的邮箱名中至少要包含"@", 并且"@"是在"."之前
         /*
        参考步骤：
        1、获取文件名中"@"符号的位置
        2、获取邮箱中"."号的位置
        3、判断必须包含"@"符号，且"@"必须在"."之前
        *//*
	    // 获取邮箱中"@"符号的位置
		int index2 = email.indexOf("@");
        
        // 获取邮箱中"."号的位置
		int index3 = email.indexOf('.');
        
		// 判断必须包含"@"符号，且"@"必须在"."之前
		if (index2 != -1 && index3 > index2){
			System.out.println("邮箱格式正确");
		} else {
			System.out.println("邮箱格式无效");
		}
	}
}
/*
public class HelloWorld {
    public static void main(String[] args) {
		String s1 = "imooc";
		String s2 = "imooc";
        String s3 = "I love " + s1;
        
        //定义字符串s3，保存“I love”和s1拼接后的内容
		 
		
        // 比较字符串s1和s2
		// imooc为常量字符串，多次出现时会被编译器优化，只创建一个对象
		System.out.println("s1和s2内存地址相同吗？" + (s1 == s2));
        
        //比较字符串s1和s3
		System.out.println("s1和s3内存地址相同吗？" + (s1 == s3)                );

		String s4 = "I love " + s1;
         //比较字符串s4和s3
        
		// s1是变量，s4在运行时才知道具体值，所以s3和s4是不同的对象
		System.out.println("s3和s4内存地址相同吗？" + (s4 == s3));
	}
}

public class HelloWorld {
    public static void main(String[] args) {
        
         // 创建对象，对象名为hello
    	HelloWorld hello = new HelloWorld();
        
        // 调用方法并将返回值保存在变量中
		int[] nums = hello.getArray(8);
        
        // 将数组转换为字符串并输出
		System.out.println(Arrays.toString(nums)); 
	}
*/
	/*
	 * 功能：创建指定长度的int型数组，并生成100以内随机数为数组中的每个元素赋值
	 * 定义一个带参带返回值的方法，通过参数传入数组的长度，返回赋值后的数组
	 */
/*
	public int[] getArray(int length) {
        // 定义指定长度的整型数组
		int[] nums = new int[length];
        
        // 循环遍历数组赋值
		for (int i=0;i<length;i++) {
            
			// 产生一个100以内的随机数，并赋值给数组的每个成员
		    nums[i]=(int)(Math.random()*100);
        
		}
		return nums; // 返回赋值后的数组
	}
}


*/

/*public class HelloWorld {
    
    // 定义静态变量，保存班级名称
	     static String className = "JAVA开发一班";

	public static void main(String[] args) {
        
		// 访问静态变量，输出班级名称
		System.out.println(HelloWorld.className);
	}
}

public class hello{

    public static void main(String[] args) {
        
		// 创建对象，对象名为hello
		hello hello1 = new hello();
		double c;
        // 调用方法，传入两门课程的成绩
		c=hello1.calcAvg(94, 81);
        System.out.println(c);
	}

	
	 * 功能：计算两门课程考试成绩的平均分并输出平均分
	 * 定义一个包含两个参数的方法，用来传入两门课程的成绩
	 
    public double calcAvg(int x,int y){
        double a;
        a=(x+y)/2.0;
        return a;
    }
}
*/


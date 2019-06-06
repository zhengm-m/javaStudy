
import java.util.Scanner;

public class AA {
    public static void main(String[] args) {
        //输入你的QQ号码
        System.out.println("请输入你的QQ号码");
        Scanner sc=new Scanner(System.in);
        String qq=sc.nextLine();

        //用正则表达式判断
        String Gz="[1-9][0-9]{5,14}";
        boolean a=qq.matches(Gz);

        //输出结果
        System.out.println("结果是："+a);
    }
}
import java.text.DecimalFormat;

public class La {
    public static void main(String[] args) {
        int a =20;
        double salary = 99.456647;

        System.out.println("a="+a);

        DecimalFormat df=new DecimalFormat("$0.##");
        System.out.println("My salary is : "+df.format(salary));


    }
}

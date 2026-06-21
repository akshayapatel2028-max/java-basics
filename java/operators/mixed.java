public class mixed {
    public static void main(String[] args){
        int a = 10;
        int b = 5;
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        
        int age = 20;
        System.out.println(age>15&&age<40);
        System.out.println(age>18||age<25);
        System.out.println(!(age>18));
        
        a+=5;
        System.out.println(a);
        b-=2;
        System.out.println(b);
        a*=2;
        System.out.println(a);
        b/=2;
        System.out.println(b);
        a%=3;
        System.out.println(a);
        
        System.out.println("a>b: " + (a > b));
        System.out.println("b<a: " + (b < a));
        System.out.println("a>=b: " + (a >= b));
        System.out.println("b<=a: " + (b <= a));
        System.out.println("a==b: " + (a == b));
        System.out.println("a!=b: " + (a != b));   
    }
}
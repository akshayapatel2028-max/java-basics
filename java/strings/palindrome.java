public class palindrome {
    public static void main(String[] args) {
        String name = "amma";
        String reverse = "";
        for(int i=name.length()-1;i>=0;i--)
        {
            reverse = reverse+name.charAt(i);
        }
        System.out.println(name.equals(reverse));
    }
    
}

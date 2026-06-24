public class countdigits {
    public static void main(String[]args){
        String str = "akshu2028";
        int count = 0;
        for(int i=0;i<str.length()-1;i++)
            {
                char ch = str.charAt(i);
                if(Character.isDigit(ch))
                    {
                count++;
                }
            } 
            System.out.println(count);
        }
    }     

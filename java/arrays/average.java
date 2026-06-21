public class average {
    public static void main(String[]args){
      int[] marks ={10,40,80,20};
      int sum = 0;
      for(int i = 1;i<marks.length;i++)
        {
          sum = sum+marks[i];
        }  
        int avg= sum/marks.length;
        System.out.println(avg);
    }
    
}

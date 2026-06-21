public class percentage {
    public static void main(String[]args){
        int marks = 483;
        int total = 500;
        double percentage = (double)marks/total*100;
        int overallmarks = (int) percentage;
        System.out.println("marks:"+marks);
        System.out.println("total:"+total);
        System.out.println("percentage:"+percentage);
        System.out.println("overallmarks:"+overallmarks);
    }
}
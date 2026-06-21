public class product {
    public static void main(String[]args) {
        int price = 999;
        double gst = price*0.666;
        int finalprice = (int)gst;
        System.out.println("price:"+price);
        System.out.println("gst:"+gst);
        System.out.println("finalprice:"+finalprice);
    }
}
public class Methodchanning {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        sb.append(" Sunny ").append(" satyam ");
        sb.reverse();
        sb.reverse();
        sb.insert(1, sb,4, 5);
        System.out.println(sb);
       
    }
}

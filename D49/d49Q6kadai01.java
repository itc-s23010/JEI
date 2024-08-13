//s23010
//引数を連結し表示
public class d49Q6kadai01 {
    public static void main(String[] arguments) {

        StringBuilder sb = new StringBuilder();
        for (String arg : arguments) {
            sb.append(arg);
        }        
        System.out.println(sb.toString());
    }
}

import java.util.Scanner;

public class hanoun {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        if (isvaild(s)) {

            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
    public static boolean isvaild(String s) {
        if(s.length()==0){
            return true;
        }
        return !s.contains("()")? false: isvaild(s.replace("()",""));
    }
}
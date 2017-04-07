package learn_class;

/**
 * Created by ADMIN on 26.03.2017.
 */
public class Task8 {
    public static void main(String[] args) {
        String s = "Hello worldhllwd";//rewrite
        int  h = 0, e = 0 , l = 0, o = 0, w = 0, r = 0, d = 0;
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
            if(s.charAt(i) == 'H' || s.charAt(i) == 'h') h++;
            if(s.charAt(i) == 'e') e++;
            if(s.charAt(i) == 'l') l++;
            if(s.charAt(i) == 'o') o++;
            if(s.charAt(i) == 'w') w++;
            if(s.charAt(i) == 'r') r++;
            if(s.charAt(i) == 'd') d++;
        }
        System.out.println("H is --> " + h);
        System.out.println("e is --> " + e);
        System.out.println("l is --> " + l);
        System.out.println("o is --> " + o);
        System.out.println("w is --> " + w);
        System.out.println("r is --> " + r);
        System.out.println("d is --> " + d);
    }
}

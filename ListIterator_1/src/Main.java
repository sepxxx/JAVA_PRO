import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        String s = "gog";
        List<Character> sList = new ArrayList<>();
        for (Character ch : s.toCharArray()) {
            sList.add(ch);
        }

        ListIterator<Character> i = sList.listIterator();
        ListIterator<Character> ri = sList.listIterator(sList.size());

        boolean isP = true;
        while(i.hasNext() && ri.hasPrevious() && isP) {
            if(i.next() != ri.previous())
                isP = false;
        }

        if(isP)
            System.out.println("YES");
        else
            System.out.println("NO");
    }

}
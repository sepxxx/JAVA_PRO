//Постройте частотный словарь букв русского (или английского) алфавита.
//Опустим проблему выбора и анализа корпуса языка, достаточно будет взять текст небольшой длины).

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        f_dictionary("Бамбук фывфыв йцуйцус12 2ЫЫЫЫЫ");
    }

    public static void f_dictionary(String text) {
        HashMap<Character, Integer> fd = new HashMap<>();
        for(char c:text.toCharArray()) {
            if((c>='a'&&c<='я') || (c>='A'&& c<='Я')) {
                if(Character.isUpperCase(c))
                    c = Character.toLowerCase(c);
                if(fd.containsKey(c)) {
                    int cur = fd.get(c);
                    fd.put(c, cur+1);
                } else {
                    fd.put(c, 1);
                }
            }
        }
        System.out.println(fd);
        System.out.println(fd.entrySet());
        System.out.println(fd.keySet());
        System.out.println(fd.values());
    }
}
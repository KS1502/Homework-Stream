import java.util.stream.Stream;

public class Homework2 {
    public static void main(String[] args) {
        String input = "aaa ffff aa bbbb a bb aaa gggggggggggggg";
        System.out.println(input.charAt(0));
        /* a */
    }

     long countWords(String input, String letter) {
     countWords("aaa ffff aa bbbb a bb aaa gggggggggggggg","a");
         Stream<String>countWords =Stream.of("aaa ffff aa bbbb a bb aaa gggggggggggggg");
         countWords.filter(s ->s.length()==4).forEach(s ->System.out.println(s));

        return countWords("aaa ffff aa bbbb a bb aaa gggggggggggggg","a");


     }

}
   /* Используя стримы написать метод, принимающий строку, состоящую из слов, разделенных пробелом и букву и
        возвращающий
        количество слов, начинающихся с этой буквы.
        long countWords (String input, String letter)

        пример: принимает "aaa ffff aa bbbb a bb aaa gggggggggggggg" и "a" -> возвращает 4 , т.к. слово,
        начинающееся на a встречается 4 раза */
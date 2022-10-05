import java.util.*;
public class Main {
    public static void main(String args[])
    {
        List<String> colorsUnmodifiable = List.of(
                "blue",
                "yellow"
        );
        colorsUnmodifiable.add("pink");
        List<String> colors=new ArrayList();
        colors.add("blue");
        colors.add("purple");
        System.out.println(colors);
        System.out.println(colors.contains("blue"));
        System.out.println(colors.contains("yellow"));

        for(String color : colors)
            System.out.println(color);
        colors.forEach(System.out::println);

        for(int i=0;i<colors.size();i++) {
            System.out.println(colors.get(i));
        }
    }
}

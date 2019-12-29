package plugin.string.repeat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * @author DingKai
 * @version 1.0
 */
public class RepeatListString {
    public static void main(String[] args) {
        String textString = "ab,ac,db,12,21,33,dk,ab,22,33,22,11,99,dk,dk1";

        RepeatListString rls = new RepeatListString();

        List<String> stringList = rls.stringToList(textString);

        List<String> repeat = rls.repeat(stringList);

        System.out.println(repeat);
    }

    private List<String> stringToList(String string){
        List<String> list;
        String[] split = string.split(",");
        list = Arrays.asList(split);
        return list;
    }

    private List<String> repeat(List<String> strings){
        HashSet<String> strings1 = new HashSet<>(strings);
        return new ArrayList<>(strings1);
    }
}

import java.awt.Color;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/**
    This program demonstrates a map that maps names to colors.
*/
public class MapDemo
{
    public static void main(String[] args)
    {
        Map <String, Color> favColors = new HashMap<>();
        favColors.put("Sreeram", Color.GREEN);  
        favColors.put("Kaitlyn", Color.BLUE);        
        favColors.put("Nimari", Color.BLACK);        
        Set<String> names = favColors.keySet();
        for (String name : names)
            System.out.println(favColors.get(name));
        System.out.println();
    }
}

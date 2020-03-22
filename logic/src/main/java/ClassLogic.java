import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ClassLogic {

  public static Map<Character, Integer> returnMapWithCountAllCharacters(String s) {
    Map<Character, Integer> map = new HashMap<>();

    for (Character c : s.toLowerCase().toCharArray()) {
      map.put(c, map.containsKey(c) ? (map.get(c) + 1) : 1);
    }
    return map;
  }

  public static String returnStringWithRemovedCharacters(String s) {
    Map<Character, Integer> map = returnMapWithCountAllCharacters(s);

    if (s.isEmpty()) {
      return null;
    }

    long max = map.values().stream().max(Comparator.naturalOrder()).get();

    List<Character> characters = map.entrySet().stream()
        .filter(v -> v.getValue() == max).map(Map.Entry::getKey)
        .collect(Collectors.toList());

    if (characters.size()>1){
      return s;
    }

    return s.replace(String.valueOf(characters.get(0)), "");
  }

}

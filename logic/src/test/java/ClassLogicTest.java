import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.assertj.core.api.Assertions.assertThat;

class ClassLogicTest {

  @Test
  void returnMapWithCountAllCharacters() {
    Map<Character, Integer> map = new HashMap<>();
    map.put('ф', 1);
    map.put('а', 1);
    map.put('м', 2);
    map.put('и', 3);
    map.put('л', 1);
    map.put('я', 2);

    String s = "Имя" + "Фамилия";

    Map<Character, Integer> expected = ClassLogic.returnMapWithCountAllCharacters(s);

    assertThat(map, is(expected));
    assertThat(map.size(), is(6));
  }

  @Test
  void returnStringWithRemovedCharacters() {

    String actual = ClassLogic.returnStringWithRemovedCharacters("Фамилия");
    String expected = "Фамля";

    assertThat(actual).isEqualTo(expected);
  }
}
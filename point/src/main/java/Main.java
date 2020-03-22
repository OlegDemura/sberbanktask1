import java.util.Map;

public class Main {

  public static void main(String[] args) {

    String first_name = ClassInputOutput.inputFirstName();
    String last_name = ClassInputOutput.inputLastName();

    Map<Character, Integer> map = ClassLogic
        .returnMapWithCountAllCharacters(first_name + last_name);

    ClassInputOutput.printMap(map);

    String stringWithReplaceCharacters = ClassLogic.returnStringWithRemovedCharacters(last_name);

    ClassInputOutput.printString(stringWithReplaceCharacters);

  }

}

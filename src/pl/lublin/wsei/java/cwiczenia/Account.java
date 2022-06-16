package pl.lublin.wsei.java.cwiczenia.mylib;

import static org.apache.commons.lang3.StringUtils.indexOf;

public class Account {
    private static String ukrAlphabet = "абвгдеєжзиіїйклмнопрстуфхцчшщьюя";
    private static String translitRepl[] = {"a","b","v","g","d","e","je","zh","z","y","i","ji", "j",
            "k","l","m","n","o","p","r","s","t","u","f","h","c",
            "ch","sh","shh","'","ju","ja"};

    public static String translit(String arg){
        var result = new StringBuilder();
        arg = (arg.toLowerCase());

        for (int index = 0; index < arg.length(); index++) {
            var orginalLetter  = String.valueOf(arg.charAt(index));
            if (ukrAlphabet.contains(orginalLetter)) {
                var translLatter = translitRepl[indexOf(ukrAlphabet, orginalLetter)];
                result.append(translLatter);
            } else {
                result.append(orginalLetter);
            }
        }
        return result.toString();
    }
}

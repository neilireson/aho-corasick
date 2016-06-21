package org.ahocorasick.text;

/**
 */
public abstract class AbstractCharacterConverter
        implements CharacterConverter {

    @Override
    public String convert(char[] chars) {
        StringBuilder newString = new StringBuilder();

        for (char c : chars) {
            char[] charArray = convert(c);
            newString.append(charArray);
        }

        return newString.toString();
    }
}

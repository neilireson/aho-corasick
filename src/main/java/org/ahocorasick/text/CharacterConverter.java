package org.ahocorasick.text;

import java.io.Serializable;

/**
 */
public interface CharacterConverter
        extends Serializable {
    String convert(char[] chars);

    char[] convert(char character);
}

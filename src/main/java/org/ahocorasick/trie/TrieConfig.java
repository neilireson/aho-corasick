package org.ahocorasick.trie;

import org.ahocorasick.text.CharacterConverter;

public class TrieConfig {

    private boolean allowOverlaps = true;

    private boolean onlyWholeWords = false;

    private boolean onlyWholeWordsWhiteSpaceSeparated = false;

    private boolean caseInsensitive = false;

    private boolean treatMultipleSpacesAsOneSpace = false;

    private boolean stopOnHit = false;

    private CharacterConverter characterConverter = null;

    public boolean isStopOnHit() { return stopOnHit; }

    public void setStopOnHit(boolean stopOnHit) { this.stopOnHit = stopOnHit; }

    public boolean isAllowOverlaps() {
        return allowOverlaps;
    }

    public void setAllowOverlaps(boolean allowOverlaps) {
        this.allowOverlaps = allowOverlaps;
    }

    public boolean isOnlyWholeWords() {
        return onlyWholeWords;
    }

    public void setOnlyWholeWords(boolean onlyWholeWords) {
        this.onlyWholeWords = onlyWholeWords;
    }

    public boolean isOnlyWholeWordsWhiteSpaceSeparated() { return onlyWholeWordsWhiteSpaceSeparated; }

    public void setOnlyWholeWordsWhiteSpaceSeparated(boolean onlyWholeWordsWhiteSpaceSeparated) {
        this.onlyWholeWordsWhiteSpaceSeparated = onlyWholeWordsWhiteSpaceSeparated;
    }

    public boolean isCaseInsensitive() {
        return caseInsensitive;
    }

    public void setCaseInsensitive(boolean caseInsensitive) {
        this.caseInsensitive = caseInsensitive;
    }

    public boolean isTreatMultipleSpacesAsOneSpace() {
        return treatMultipleSpacesAsOneSpace;
    }

    public void setTreatMultipleSpacesAsOneSpace(boolean treatMultipleSpacesAsOneSpace) {
        this.treatMultipleSpacesAsOneSpace = treatMultipleSpacesAsOneSpace;
    }

    public CharacterConverter getCharacterConverter() {
        return characterConverter;
    }

    public void setCharacterConverter(CharacterConverter characterConverter) {
        this.characterConverter = characterConverter;
    }
}

package auca.ac.rw;

import junit.Test;
import static junit.Assert.*;

public class AgeCategorizerTest {

    public void testCategories() {
        // Test baby category
        assertEquals("Baby Boy", AgeCategorizer.categorize(5, "male"));
        assertEquals("Baby Girl", AgeCategorizer.categorize(12, "female"));

        // Test teen category
        assertEquals("Teen Boy", AgeCategorizer.categorize(13, "male"));
        assertEquals("Teen Girl", AgeCategorizer.categorize(17, "female"));

        // Test adult category
        assertEquals("Gentleman", AgeCategorizer.categorize(18, "male"));
        assertEquals("Lady", AgeCategorizer.categorize(25, "female"));
    }

    public void testInvalidInputs() {
        // Invalid sex
        assertEquals("Invalid sex", AgeCategorizer.categorize(10, "robot"));
        assertEquals("Invalid sex", AgeCategorizer.categorize(20, ""));
        assertEquals("Invalid sex", AgeCategorizer.categorize(20, null));

        // Invalid age
        assertEquals("Invalid age", AgeCategorizer.categorize(-1, "male"));
    }
}
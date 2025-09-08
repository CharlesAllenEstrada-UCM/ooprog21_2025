public class FixDebugOne {
    /* This program displays a greeting */
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

/*
Bugs:
1. Wrong class name format → "FixDebug One" changed to "FixDebugOne" (no spaces allowed).
2. Typo in "System" → "Systm" corrected to "System".
3. Missing semicolon → added at the end of println statement.
4. Wrong main method header → "public static void Main(String args)" fixed to "public static void main(String[] args)".
5. Case sensitivity → "Main" must be lowercase "main" because Java requires it as the entry point.
6. Unclosed comment block → properly closed comment so code compiles.
*/

#Java 14:

1. Switch expression(enhanced) has been made permanent in java 14. [click for code](https://github.com/Abrar535/Core-Java-Learning/blob/master/Java%2013/src/SwitchEnhancements/SwitchEnhancements.java)
2. Pattern Matching for instanceof (Preview feature)
3. Better NullPointerExceptions 

        /*
        Example: 
        String name = jd.getBlog().getAuthor()
        // Before java 14
        //Stacktrace
        Exception in thread "main" java.lang.NullPointerException
            at NullPointerExample.main(NullPointerExample.java:5)
        // After java 14
        Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Blog.getAuthor()" because the return value of "Journaldev.getBlog()" is null
            at NullPointerExample.main(NullPointerExample.java:4)
            */
4. Records (Preview Feature)

5. Text Blocks (Preview Features)

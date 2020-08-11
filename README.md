#Java 8:

1. for each [here](https://github.com/Abrar535/Core-Java-Learning/blob/master/Java%208/src/main/Java8ForEachExample.java)
2. default and static methods in Interfaces
3. Functional Interfaces and Lambda Expressions(Functional Interface annotation)

   > lambda expressions are a means to create anonymous classes of functional interfaces easily. There are no runtime benefits of using lambda expressions, so we will use it cautiously.

4. Java Stream API

5. Java Time API

6. Iterator default method:
     >forEachRemaining(Consumer action) to perform the given action for each remaining element until all elements have been processed or the action throws an exception.
    
    Collection default method removeIf(Predicate filter) to remove all of the elements of this collection that satisfy the given predicate.
    
    Collection spliterator() method returning Spliterator instance that can be used to traverse elements sequentially or parallel.
    
    Map replaceAll(), compute(), merge() methods.
    
    Performance Improvement for HashMap class with Key Collisions

7. Concurrent Hash Maps: compute(),forEach(),forEachEntry()


#Java 9: 

1. Immutable List; 
2. Process Api improvements; 
3. Try With Resources Improvement
4. CompletableFuture API Improvements
5. Reactive Stream ApI
6. @Depricated api: forRemoval(),since()

#Java 10:
1. Time-Based Release Versioning
2. Local-Variable Type Inference
3. Parallel Full GC (garbage collector) for G1 (JEP 307)
4. Garbage-Collector Interface

#Java 11:

1. Java String Methods
2. Local-Variable Syntax for Lambda Parameters
3. Nested Based Access Control (used in java reflection)
4. Reading/Writing Strings to and from the Files

#Java 12:
1. Enhanced switch expression .
    >Java 12 has enhanced Switch expressions for Pattern matching.
    Introduced in JEP 325, as a preview language feature, the new Syntax is L ->.
    
        Following are some things to note about Switch Expressions:
        
        The new Syntax removes the need for break statement to prevent fallthroughs.
        Switch Expressions don’t fall through anymore.
        Furthermore, we can define multiple constants in the same label.
        default case is now compulsory in Switch Expressions.
        break is used in Switch Expressions to return values from a case itself.

2. File.mismatch method
    > This method returns the position of the first mismatch or -1L if there is no mismatch.
    
    > Two files can have a mismatch in the following scenarios:
    
    > If the bytes are not identical. In this case, the position of the first mismatching byte is returned.
    File sizes are not identical. In this case, the size of the smaller file is returned.

3. Compact Number Formatting
4. Teeing Collectors //not used
5. Java String new methods. 
    > indent(int n)
    , transform(func)
    , describeConstable()
6. Pattern Matching for instanceof (preview feature)

        /*
        //old way
        if (obj instanceof String) {
            String s = (String) obj;
            // use s in code from here
        }

        // new way
        
        if (obj instanceof String s) {
            // can use s directly here
        } 
        */

#Java 13:
1. Text block String (preview feature for java 13)
2. New Methods in String Class for Text Blocks (preview features)

    > formatted(Object… args)
    
    > stripIndent()
    
    >translateEscapes()

3. Switch Expressions Enhancements ("break" return has been replace with "yield" return)

#Java 14:

1. Switch expression(enhanced) has been made permanent in java 14. 
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


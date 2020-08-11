#Java 12:
1. Enhanced switch expression . [click for code](https://github.com/Abrar535/Core-Java-Learning/blob/master/Java%2012/src/EnhancedSwitchExpression/SwitchExpressions.java)
    >Java 12 has enhanced Switch expressions for Pattern matching.
    Introduced in JEP 325, as a preview language feature, the new Syntax is L ->.
    
        Following are some things to note about Switch Expressions:
        
        The new Syntax removes the need for break statement to prevent fallthroughs.
        Switch Expressions don’t fall through anymore.
        Furthermore, we can define multiple constants in the same label.
        default case is now compulsory in Switch Expressions.
        break is used in Switch Expressions to return values from a case itself.

2. File.mismatch method [click for code](https://github.com/Abrar535/Core-Java-Learning/blob/master/Java%2012/src/FileMismatch/FileMismatchMain.java)
    > This method returns the position of the first mismatch or -1L if there is no mismatch.
    
    > Two files can have a mismatch in the following scenarios:
    
    > If the bytes are not identical. In this case, the position of the first mismatching byte is returned.
    File sizes are not identical. In this case, the size of the smaller file is returned.

3. Compact Number Formatting [click for code](https://github.com/Abrar535/Core-Java-Learning/blob/master/Java%2012/src/CompacNumberFormat/CompactNumberFormat.java)
4. Teeing Collectors //not used
5. Java String new methods. 
    > indent(int n) [click for code](https://github.com/Abrar535/Core-Java-Learning/blob/master/Java%2012/src/JavStringMethods/Indent.java)
    , transform(func) [click for code](https://github.com/Abrar535/Core-Java-Learning/blob/master/Java%2012/src/JavStringMethods/Transform.java)
    , describeConstable() [click for code](https://github.com/Abrar535/Core-Java-Learning/blob/master/Java%2012/src/JavStringMethods/DescribeConstable.java)
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
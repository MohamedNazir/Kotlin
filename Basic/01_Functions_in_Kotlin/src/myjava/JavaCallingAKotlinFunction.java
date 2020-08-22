package myjava;

import mykotlin.*;

public class JavaCallingAKotlinFunction {

    public static void main(String[] args) {
        System.out.println(DisplayFunctions.greet("Nazir"));
        DefaultParameters.logMessage("I am calling this from Java");
        DefaultParameters.logMessage();
    }
}

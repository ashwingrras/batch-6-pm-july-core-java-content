package org.example.string_handling;

public class MemoryUsageComparison {
    private static final int OPERATIONS = 1000000; // Number of string modifications

    public static void main(String[] args) {
        // Memory usage before and after operations
        long memoryBefore;
        long memoryAfter;

        // Perform operations with StringBuffer
        System.gc(); // Request garbage collection
        memoryBefore = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        StringBuffer stringBuffer = new StringBuffer("Initial");
        for (int i = 0; i < OPERATIONS; i++) {
            stringBuffer.append("A");
            stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        }
        memoryAfter = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long stringBufferMemoryUsage = memoryAfter - memoryBefore;

        System.out.println("StringBuffer memory usage: " + stringBufferMemoryUsage + " bytes");

        // Perform operations with StringBuilder
        System.gc(); // Request garbage collection
        memoryBefore = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        StringBuilder stringBuilder = new StringBuilder("Initial");
        for (int i = 0; i < OPERATIONS; i++) {
            stringBuilder.append("A");
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
        memoryAfter = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long stringBuilderMemoryUsage = memoryAfter - memoryBefore;

        System.out.println("StringBuilder memory usage: " + stringBuilderMemoryUsage + " bytes");
    }
}


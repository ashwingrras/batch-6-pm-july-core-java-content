package org.example.generics.other_program;


// First generic interface
interface DataProcessor<T> {
    void processData(T data);
}

// Second generic interface
interface DataProvider<U> {
    U fetchData();
}

// Class implementing both interfaces
class DataManager<V> implements DataProcessor<V>, DataProvider<V> {
    private V data;

    @Override
    public void processData(V data) {
        System.out.println("Processing data: " + data);
        // Process the data here
    }

    @Override
    public V fetchData() {
        // Simulated data fetching operation
        System.out.println("Fetching data...");
        return data; // Return the fetched data
    }

    public void setData(V data) {
        this.data = data;
    }
}

public class GenericeInterfaceMultiExample {
    public static void main(String[] args) {
        // Create an instance of DataManager
        DataManager<String> dataManager = new DataManager<>();

        // Set some data
        dataManager.setData("Sample Data");

        // Process the data
        dataManager.processData(dataManager.fetchData());
    }
}


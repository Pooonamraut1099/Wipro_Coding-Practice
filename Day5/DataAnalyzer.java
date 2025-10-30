/*Generic Data Analysis using JAVA */

package Day5.PracticeSession;

import java.util.*;

public class DataAnalyzer<T extends Number & Comparable<T>> {
    private T[] data;  // Added: field to store the array

    // Added: constructor
    public DataAnalyzer(T[] data) {
        this.data = data;
    }

    // Added: method to calculate average
    public double calculateAverage() {
        double sum = 0.0;
        for (T value : data) {
            sum += value.doubleValue();
        }
        return sum / data.length;
    }

    // Added: method to find maximum
    public T findMaximum() {
        T max = data[0];
        for (T value : data) {
            if (value.compareTo(max) > 0) {
                max = value;
            }
        }
        return max;
    }

    public void dataSummary() {
        System.out.println("Data Summary:");
        System.out.println("Average: " + calculateAverage());
        System.out.println("Maximum: " + findMaximum());
    }

    public static void main(String[] args) {
        // Example with integers
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        
        int size = sc.nextInt();
        if(ch==1)
        {
            Integer[] integerData = new Integer[size];
            for(int i=0;i<size;i++)
            {
                integerData[i] = sc.nextInt();
            }
            DataAnalyzer<Integer> integerAnalyzer = new DataAnalyzer<>(integerData);
            integerAnalyzer.dataSummary();
        }
        else if(ch==2)
        {
            // Example with doubles
            Double[] doubleData = new Double[size];
            for(int i=0;i<size;i++)
            {
                doubleData[i] = sc.nextDouble();
            }
            
            DataAnalyzer<Double> doubleAnalyzer = new DataAnalyzer<>(doubleData);
            doubleAnalyzer.dataSummary();
        }
        else if(ch==3)
        {
            // Example with shorts
            Short[] shortData = new Short[size];
            for(int i=0;i<size;i++)
            {
                shortData[i] = sc.nextShort();
            }
            
            DataAnalyzer<Short> shortAnalyzer = new DataAnalyzer<>(shortData); // changed variable name
            shortAnalyzer.dataSummary();
        }
        else if(ch==4)
        {
            // Example with floats
            Float[] floatData = new Float[size];
            for(int i=0;i<size;i++)
            {
                floatData[i] = sc.nextFloat();
            }
            
            DataAnalyzer<Float> floatAnalyzer = new DataAnalyzer<>(floatData); // changed variable name
            floatAnalyzer.dataSummary();
        }
    }
}
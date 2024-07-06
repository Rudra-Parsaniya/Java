public class SortinginArray {
    public static void main(String[] args) {
        
        int a[] = { 5, 2, 9, 3, 4, 1, 8, 6, 7 };

for (int i = 0; i < a.length - 1; i++) {

// Find the minimum in the list[i..a.length-1]

int currentMin = a[i];

int currentMinIndex = i;

for (int j = i + 1; j < a.length; j++) {

if (currentMin > a[j]) {

currentMin = a[j];

currentMinIndex = j;

}

}  //Swap a[i] with a [currentMinIndex] if necessary

if (currentMinIndex != i) {

a[currentMinIndex] = a[i];

a[i] = currentMin;

} 

}

for(int temp: a) { 
     System.out.print(temp + ", ");

}
    }
}

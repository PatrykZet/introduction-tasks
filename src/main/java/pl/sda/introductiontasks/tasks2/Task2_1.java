package pl.sda.introductiontasks.tasks2;

/*
Create an array of length 10 and initialize with any integers.
Calculate sum of all numbers in this array and print it in the console.
 */

    public static void main(String[] args) {
 int [] array = {1,2,3,4,5,6,7,8,9,10};

 int suma = 0;

        for (int i = 0; i <= 9; i++){
            suma += array[i];
        }
        System.out.println(suma);
    }
}

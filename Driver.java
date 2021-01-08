public class Driver {

    public static void main(String[] args){
        // Factorial of 5
        int sum=1;

        for(int i=5; i > 0; i--){
            sum= sum * i;
        }
        System.out.println(sum);

        // Power maths
        int number = 10;
        int total=1;
        int exp =4;
        for (int i = 1; i <= exp; i++ ){
            total *= number;
        }
        System.out.println(total);

        // Linear stuff dealing with it and cool things happen
        int arr1[] = {12,24};
        int arr2[] = {13,48};
        int slope;

        slope = ((arr2[1]-arr1[1])/(arr2[0]-arr1[0]));
        System.out.println(slope);

        // Y intercept
        int intercept = slope*(-arr1[0])+arr1[1];
        System.out.println(intercept);

        // Linear equation
        System.out.println("y = " + slope + "x+(" + intercept + ')');


    }

}

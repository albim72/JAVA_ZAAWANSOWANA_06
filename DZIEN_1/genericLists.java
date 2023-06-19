public class Main {

    public static <E> void printArray(E[] inputArray){
        for(E element:inputArray){
            System.out.printf("%s ",element);
        }
        System.out.printf("\n");
    }
    public static void main(String[] args) {
        Integer[] intArray = {1,2,5,6,7,11,12,45};
        Double[] dblArray = {3.3,7.8,3.0,12.3,0.9,1.2,6.7};
        Character[] charArray = {'G','L','G','B','N','A','T'};

        System.out.printf("Tablica intArray zwiera: ");
        printArray(intArray);

        System.out.printf("Tablica dblArray zwiera: ");
        printArray(dblArray);

        System.out.printf("Tablica charArray zwiera: ");
        printArray(charArray);



    }
}

public class Main {
    public static void main(String[] args) {
        myArray();
    }

    public static void myArray()  {
        int count = 0;
        int a = 4; //параметр длины массива
        String[][] array = new String[a][a];
        if(array.length != 4) throw new MyArraySizeException("Массив не 4х4");
         for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = "1"; //переменная наполнения массива
                array[2][3] = "Слово";
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
         }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                try{
                    int b = Integer.parseInt(array[i][j]);
                    count += b;
                }
                catch (NumberFormatException e){
                    throw  new MyArrayDataException("В ячейке : " + i + "," + j +  " лежат неверные данные :" + array[i][j]  );
                }
            }
        }
        System.out.println(count + " Сумма всех эллементов массива");
    }
}

class  MyArraySizeException extends ArrayIndexOutOfBoundsException {
    public MyArraySizeException(String massage) {
        super(massage);
    }
}

    class  MyArrayDataException extends ArrayStoreException {
        public MyArrayDataException(String s) {
            super(s);
        }
    }
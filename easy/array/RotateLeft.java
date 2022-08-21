package easy.array;

public class RotateLeft {
    public static String[] rotateArray(String[] input1, int input2){

        //taking end index of the array
        int end = input1.length - 1;

        //running a loop upto rotation count
        for(int i=0;i<input2;i++){
            //taking out first element from the array
            String firstEle = input1[0];
            //running inner loop until length of the array
            for(int j=0;j<input1.length-1;j++){
                input1[j] = input1[j+1];   //shifting elements towards left one by one
            }
            //assigning first element at the end after inner loop ends
            input1[end] = firstEle;
        }
        //returning the rotated array
        return input1;
    }

    public static void main(String[] args) {
        String[] input1 = new String[]{ "a","b","c","d","e","f","g","h","i" };
        int input2 = 3;
        String[] temp = rotateArray(input1,input2);

        for(int i=0;i<temp.length;i++){
            System.out.print(temp[i]+" ");
        }
    }
}
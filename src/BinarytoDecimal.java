public class BinarytoDecimal {
    public static void main(String[] args) {

        String binaryString = "1110";
        //using inbuilt method
        int decimal = Integer.parseInt(binaryString, 2);
        System.out.println(decimal);
    }
}

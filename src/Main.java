public class Main {

    public static void main(String[] args) {
        ZeroArgument zeroArguments = () -> System.out.println("Hej");
        zeroArguments.show();

        OneArgument oneArgument = (str) -> System.out.println(str); // System.out::println
        oneArgument.show("Et arguments kald");

        TwoArguments twoArguments = (i1, i2) -> i1 + i2; // Integer::Sum
        int result = twoArguments.add(17, 18);
        System.out.println("Resultat af twoArgument kald: " + result);
    }
}
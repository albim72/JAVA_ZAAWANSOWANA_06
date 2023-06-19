public class Main {
    public static void main(String[] args) {

        System.out.println(FunctionDef.triple.apply((4)));
        System.out.println(FunctionDef.square.apply((4)));
        System.out.println(FunctionDef.compose(FunctionDef.triple,FunctionDef.square).apply(6));
    }
}

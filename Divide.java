public class Divide implements BinaryOperator {

    @Override
    public int operate(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        }

        return x / y;
    }
}

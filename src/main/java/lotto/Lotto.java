package lotto;

import java.util.List;

import static lotto.utility.StringUtil.*;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException(PRINT_ERR_NUMBER_INVALID_COUNT.getMessage());
        }
    }

    // TODO: 추가 기능 구현

    public List<Integer> getNumbers() {
        return this.numbers;
    }
}

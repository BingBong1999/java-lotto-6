package lotto;

import lotto.controller.*;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        BuyingController buyingController = new BuyingController();
        buyingController.handle();

        LottoNumberAddController lottoNumberAddController = new LottoNumberAddController();
        lottoNumberAddController.handle();

        WinningNumberController winningNumberController = new WinningNumberController();
        winningNumberController.handle();

        WinningBonusNumberController winningBonusNumberController = new WinningBonusNumberController();
        winningBonusNumberController.handle();

        WinningStatisticsController winningStatisticsController = new WinningStatisticsController();
        winningStatisticsController.handle();

        ProfitController profitController = new ProfitController();
        profitController.handle();
    }
}

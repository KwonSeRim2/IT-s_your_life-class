package test.D0421;

public class PaymentManager {


    public void process(Payment payment, int amount) {
        boolean pay = false;

        if (!payment.beforePay()) {
            System.out.println("[결제 실패: 준비 단계에서 중단]");
            return;
        } else {
            System.out.print("금액: ");
            pay = payment.pay(amount);
        }


        if (pay) {
            payment.approve();
            payment.cancel("테스트 취소");
            if (payment instanceof KakaoPay Kpay) {

                Kpay.sendNotification();
            } else {
                System.out.println("[알림 서비스 없음]");

            }
        } else {
            System.out.println("[결제 실패: 승인/취소 건너뜀]");
        }
        System.out.println();
    }

    public void printSummary(){
        System.out.println("✅ 결제 통계 요약");
    }
}

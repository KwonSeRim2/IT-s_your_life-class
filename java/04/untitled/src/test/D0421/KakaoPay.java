package test.D0421;

public class KakaoPay implements Payment {
    private int amount;
    boolean isAuthenticated = false;

    @Override
    public boolean pay(int amount) {
        if (amount >= 5000) {
            this.amount = amount;
            System.out.println("[카카오페이] " + amount + "원 결제 성공");
            Payment.log("결제 수단: [KakaoPay], 금액: " + amount + "원");
            return true;
        } else {
            System.out.println("[카카오페이] 결제 실패: 최소 결제 금액은 5000원입니다.");
            return false;
        }
    }

    @Override
    public void approve() {
        System.out.println("[카카오페이] 간편결제 승인 완료");
    }

    @Override
    public void cancel(String reason) {
        System.out.println("[카카오페이] 결제 취소됨 - 사유: " + reason);
    }

    public void sendNotification() {
        System.out.println("[카카오페이] 결제 알림이 전송되었습니다!");
    }

    @Override
    public boolean beforePay() {
        System.out.println("[카카오페이] 결제를 준비합니다...");
        if(!isAuthenticated){
            System.out.println("[카카오페이] 인증되지 않아 결제를 진행할 수 없습니다.");
            return false;
        }
        return true;
    }

    public void authenticate() {
        isAuthenticated = true;
        System.out.println("[카카오페이] 사용자 인증 완료!");
    }
}

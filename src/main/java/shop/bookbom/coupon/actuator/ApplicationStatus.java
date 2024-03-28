package shop.bookbom.coupon.actuator;

import org.springframework.stereotype.Component;

@Component
public final class ApplicationStatus {
    private boolean status = true;

    public void stopService() {
        this.status = false;
    }

    public boolean getStatus() {
        return status;
    }
}

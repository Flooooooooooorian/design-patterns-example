package Observer;

import java.util.concurrent.Flow;
import java.util.concurrent.Flow.Subscriber;

public class PhoneDisplay implements Subscriber<Integer> {

    private Flow.Subscription subscription;

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        System.out.println("onSubscribe: " + subscription);
        this.subscription = subscription;
        this.subscription.request(1);
    }

    @Override
    public void onNext(Integer item) {
        System.out.println("onNext: " + item);
        subscription.request(1);
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println("onError: " + throwable);
    }

    @Override
    public void onComplete() {
        System.out.println("complete");
    }
}

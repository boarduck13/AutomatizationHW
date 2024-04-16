import org.junit.Assert;
import org.junit.Test;
import ru.netology.service.CashbackHackService;

public class CashbackHackServiceTest {

    @Test
    public void
    testRemainLessThanBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 200;
        int expectedRemain = 800;

        int actualRemain = cashbackHackService.remain(amount);

        Assert.assertEquals(actualRemain, expectedRemain);
    }

    @Test
    public void testRemainZeroAmount() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 0;
        int expectedRemain = 1000;

        int actualRemain = cashbackHackService.remain(amount);

        Assert.assertEquals(actualRemain, expectedRemain);
    }

    @Test
    public void testRemainEqualToBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int expectedRemain = 0;

        int actualRemain = cashbackHackService.remain(amount);

        Assert.assertEquals(actualRemain, expectedRemain);
    }
}

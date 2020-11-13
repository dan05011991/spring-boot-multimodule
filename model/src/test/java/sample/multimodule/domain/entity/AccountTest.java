package sample.multimodule.domain.entity;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {

    @Test
    public void getId() {
        Account account = new Account();

        account.setId(1l);

        Assert.assertEquals(1l, account.getId().longValue());
    }
}
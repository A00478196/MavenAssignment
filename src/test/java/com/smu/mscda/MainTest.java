package com.smu.mscda;

import org.junit.Assert;
import org.junit.Test;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;

public class MainTest {
    @Test
    public void testCapitalization() {
        String input = "hello";
        String expected = "Hello";
        String result = StringUtils.capitalize(input);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testMD5Hex() {
        String input = "Test";
        String expected = "0cbc6611f5540bd0809a388dc95a615b";
        String result = DigestUtils.md5Hex(input);
        Assert.assertEquals(expected, result);
    }
}

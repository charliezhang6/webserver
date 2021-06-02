package connector;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import util.TestUtils;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class RequestTest {
    public static final String validRequest = "GET /index.html HTTP/1.1";
    @Test
    public void givenValidRequest_thenExtrackUri(){
        Request request= TestUtils.creatRequest(validRequest);
        Assert.assertEquals("/index.html",request.getRequestURI());
    }
}
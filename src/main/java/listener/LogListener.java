package listener;

import io.qameta.allure.Attachment;
import io.restassured.RestAssured;
import io.restassured.filter.log.LogDetail;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


/**
 * The type Log listener.
 */
public class LogListener implements ITestListener {
    private ByteArrayOutputStream request = new ByteArrayOutputStream();
    private ByteArrayOutputStream response = new ByteArrayOutputStream();

    private PrintStream requestVar = new PrintStream(request, true);
    private PrintStream responseVar = new PrintStream(response, true);


    public void onStart(final ITestContext iTestContext) {
        RestAssured.filters(new ResponseLoggingFilter(LogDetail.ALL, responseVar),
                new RequestLoggingFilter(LogDetail.ALL, requestVar));
    }

    public void onTestSuccess(final ITestResult iTestResult) {
        logRequest(request);
        logResponse(response);
    }

    public void onTestFailure(final ITestResult iTestResult) {

    }

    /**
     * Log request byte [ ].
     *
     * @param stream the stream
     * @return the byte [ ]
     */
    @Attachment(value = "request")
    public byte[] logRequest(final ByteArrayOutputStream stream) {
        return attach(stream);
    }

    /**
     * Log response byte [ ].
     *
     * @param stream the stream
     * @return the byte [ ]
     */
    @Attachment(value = "response")
    public byte[] logResponse(final ByteArrayOutputStream stream) {
        return attach(stream);
    }

    /**
     * Attach byte [ ].
     *
     * @param log the log
     * @return the byte [ ]
     */
    public byte[] attach(final ByteArrayOutputStream log) {
        final byte[] array = log.toByteArray();
        log.reset();
        return array;
    }

    public void onTestStart(final ITestResult iTestResult) {
    }

    public void onTestSkipped(final ITestResult iTestResult) {

    }

    public void onTestFailedButWithinSuccessPercentage(final ITestResult iTestResult) {

    }

    public void onFinish(final ITestContext iTestContext) {

    }
}

package listener;

import org.testng.ITestResult;
import org.testng.reporters.ExitCodeListener;


/**
 * The class Allure screen shooter.
 */
public class AllureScreenShooter extends ExitCodeListener {

    public void onTestFailure(ITestResult result) {
        super.onTestFailure(result);
        AllureHelpers.takeScreenshot();

    }
}

package JunitTest.pkg3;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({  LoginTest.class, LoginTest1.class,
		})
public class LoginAllTests {

}

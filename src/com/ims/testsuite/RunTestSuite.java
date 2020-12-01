package com.ims.testsuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({AdminLogin.class,AdminDashboard.class,AdminChangePassword.class})
public class RunTestSuite{
	
}
package model;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

/**
 * @author aidan - agdavidson
 * CIS175 - Spring 2024
 * Jan 24, 2024
 */
@Suite
@SelectClasses({ TestAddition.class, TestSubtraction.class })
public class AllTests {

}

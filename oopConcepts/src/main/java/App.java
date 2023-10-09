public class App {

  /*
  Create a class named App that has a main method.
a.  In this class instantiate an instance of each of your logger classes that implement the Logger interface.
b. Test both methods on both instances, passing in Strings of your choice.

   */

  public static void main(String[] args) {

    spaceLogImpl("changed message");
    asteriskLogImpl("changed message 2");


  }
  static void spaceLogImpl(String logMessage){
    SpacedLogger spacedLogger = new SpacedLogger();
    spacedLogger.log(logMessage);
    spacedLogger.error(logMessage);
  }
   static void asteriskLogImpl(String logMessage){
    AsteriskLogger asteriskLogger = new AsteriskLogger();
    asteriskLogger.log(logMessage);
    asteriskLogger.error(logMessage);
  }
}

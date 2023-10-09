public class SpacedLogger implements Logger {
   /*
  5. Implement the SpacedLogger methods:
Note:  The SpacedLogger should add a space or " " between each character of the String argument
 passed into its methods.

a. If the log method received “Hello” as an argument, it should print H e l l o
b. The error method should do the same, but with “ERROR:” preceding the spaced out input
 (i.e. ERROR: H e l l o)
   */

  @Override
  public void log(String log) {
    StringBuilder spacedLog = new StringBuilder();
    for (int i = 0; i < log.length(); i++) {
      spacedLog.append(log.charAt(i)).append(" ");
    }
    System.out.println(spacedLog);
  }

  @Override
  public void error(String error) {
    StringBuilder spacedError = new StringBuilder();
    for (int i = 0; i < error.length(); i++) {
      spacedError.append(error.charAt(i)).append(" ");
    }
    System.out.println("ERROR: " + spacedError);

  }

}

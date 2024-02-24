package proxypatterndemo;

public class Proxy implements Subject {
  private RealSubject realSubject;

  public Proxy(RealSubject realSubject) {
    this.realSubject = realSubject;
  }

  @Override
  public void request() {
    if (checkAccess()) {
      realSubject.request();
      logAccess();
    } else {
      System.out.println("Proxy: Access denied.");
    }
  }

  private boolean checkAccess() {
    System.out.println("Proxy: Checking access prior to firing a real request.");
    return true;
  }

  private void logAccess() {
    System.out.println("Proxy: Logging the time of request.");
  }
}


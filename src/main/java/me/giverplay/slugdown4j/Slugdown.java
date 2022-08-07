package me.giverplay.slugdown4j;

public final class Slugdown {

  private static int slugdownTime = 250;

  private Slugdown() {
    throw new UnsupportedOperationException("Cannot instantiate Slugdown!");
  }

  public static void slugdown(Runnable callback) {
    try {
      Thread.sleep(slugdownTime);
      callback.run();
    } catch (InterruptedException ignore) { }
  }

  public static void setSlugdownTime(int slugdownTime) {
    Slugdown.slugdownTime = slugdownTime;
  }

  public static int getSlugdownTime() {
    return slugdownTime;
  }
}

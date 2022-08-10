import org.junit.jupiter.api.Test;

import static slugdown4j.Slugdown.setSlugdownTime;
import static slugdown4j.Slugdown.getSlugdownTime;
import static slugdown4j.Slugdown.slugdown;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SlugdownTest {
  @Test
  public void slugdownTest() {
    System.out.printf("Default slugdown time: %dms%n", getSlugdownTime());

    final int newSlugdownTime = 1000;
    setSlugdownTime(newSlugdownTime);

    assertEquals(getSlugdownTime(), newSlugdownTime, "Failed to set slugdown time!");
    System.out.printf("Slugdown time set -> %dms%n", newSlugdownTime);

    final String[] names = {
      "Dinossauro", "Bigolar", "PedeMoleque", "Carrinho de Mao"
    };

    System.out.println("Starting down slugged iteration...");

    for (String name : names) {
      slugdown(() -> System.out.println(name));
    }

    slugdown(() -> System.out.println("Incredible! This is so slug!"));
  }
}

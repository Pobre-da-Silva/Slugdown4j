# Slugdown4j

## Introduction
In most of the developed countries nowadays,
[life expectancy is really generous](https://en.wikipedia.org/wiki/List_of_countries_by_life_expectancy).
The increase in life expectancy has been a trend for some time now.
Technological advancements in medicine and better food production
are just some of the reasons for it.
As scientific development is not showing any signs of slowing down,
our lives are most likely getting even longer in the next few years.
If life is so long,
we certainly have time to wait for some slow code!
Take it slow and enjoy your stay!
This is the purpose of **Slugdown**,
a library that **slugs down** your code.

## Usage
Common and very very very bad usage of Slugdown4j

```java
// Importing
import me.giverplay.slugdown4j.Slugdown;

// Set slugdown time
Slugdown.setSlugdownTime(250); // Time is millis

// Gets the current slugdown time
Slugdown.getSlugdownTime(); // Return the time in millis

// Slugdown your code!
Slugdown.slugdown(() -> Sytem.out.println("Hello mom!"));
```

Official Slugdown4j usage


```java
// Importing
import static me.giverplay.slugdown4j.Slugdown.getSlugdownTime;
import static me.giverplay.slugdown4j.Slugdown.setSlugdownTime;
import static me.giverplay.slugdown4j.Slugdown.slugdown;

// Like a giga
setSlugdownTime(250);

getSlugdownTime();

slugdown(() -> Sytem.out.println("Hello mom!"));
```

The file [SlugdownTest.java](/src/test/java/SlugdownTest.java) is a usage example of Slugdown4j.

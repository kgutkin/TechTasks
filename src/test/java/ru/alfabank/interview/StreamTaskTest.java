package ru.alfabank.interview;

import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StreamTaskTest {

    @Test
    public void testSample1() {
        String sample1 = "Мама мыла-мыла-мыла раму!";

        assertEquals(
                List.of("мыла",
                        "мама",
                        "раму"),
                StreamTask.getTop10FrequencyWord(sample1)
        );
    }

    @Test
    public void testSample2() {
        String sample2 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sodales consectetur purus at faucibus. Donec mi quam," +
                " tempor vel ipsum non, faucibus suscipit massa. Morbi lacinia velit blandit tincidunt efficitur. " +
                "Vestibulum eget metus imperdiet sapien laoreet faucibus. Nunc eget vehicula mauris, ac auctor lorem. " +
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer vel odio nec mi tempor dignissim.";

        assertEquals(
                List.of("consectetur",
                        "faucibus",
                        "ipsum",
                        "lorem",
                        "adipiscing",
                        "amet",
                        "dolor",
                        "eget",
                        "elit",
                        "mi"),
                StreamTask.getTop10FrequencyWord(sample2)
        );
    }
}

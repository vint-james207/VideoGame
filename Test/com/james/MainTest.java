package com.james;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jamesyburr on 5/25/16.
 */
public class MainTest {
    @Test
    public void testSaveAndLoad() {
        VideoGame testgame = new VideoGame ("TestName", "TestGenre", "TestCompany", "TestSystem", 2, 2000);
        Main.saveGame(testgame, "test.json");
        Main.loadGame("test.json");
    }
}
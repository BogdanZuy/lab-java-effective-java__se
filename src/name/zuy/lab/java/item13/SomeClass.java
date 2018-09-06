package name.zuy.lab.java.item13;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SomeClass {

    public static final String[] ACTIONS = {"IDLE", "WALK", "RUN", "JUMP"};

    private static final String[] PRIVATE_ABILITIES = {"PUNCH", "KICK", "FIRE"};

    public static final List<String> abilities = Collections.unmodifiableList(Arrays.asList(PRIVATE_ABILITIES));

    public static final String[] getAbilities() {
        return PRIVATE_ABILITIES.clone();
    }

}

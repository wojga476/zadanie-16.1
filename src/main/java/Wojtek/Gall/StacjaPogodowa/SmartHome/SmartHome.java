package Wojtek.Gall.StacjaPogodowa.SmartHome;

import org.springframework.stereotype.Component;

@Component
public class SmartHome {

    public SmartHome() {

        StacjaPogodowa stacjaPogodowa = new StacjaPogodowa();
        new SterownikGlosnika(stacjaPogodowa);
        new SterownikPieca(stacjaPogodowa);
        new SterownikRolet(stacjaPogodowa);
    }
}

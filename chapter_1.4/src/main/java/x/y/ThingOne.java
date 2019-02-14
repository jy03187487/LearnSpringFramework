package x.y;

import lombok.Getter;

@Getter
public class ThingOne {

    private ThingTwo thingTwo;
    private ThingThree thingThree;
    public ThingOne(ThingTwo thingTwo, ThingThree thingThree) {
        this.thingTwo = thingTwo;
        this.thingThree = thingThree;
    }
}

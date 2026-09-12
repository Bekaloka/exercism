public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        Lasagna lasagna = new Lasagna();
        return 40;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int minutes){
        Lasagna lasagna = new Lasagna();
        int expectedMinutes = lasagna.expectedMinutesInOven();
        int remainingMinutes = expectedMinutes -  minutes;
        return remainingMinutes;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers){
        int preparationTime = layers * 2;
        return preparationTime;
    }

    // TODO: define the 'totalTimeInMinutes()' method

    public int totalTimeInMinutes(int layers, int timeInOven){
        Lasagna lasagna = new Lasagna();
        int expectedTime = lasagna.expectedMinutesInOven();
        
        int preparationTime = lasagna.preparationTimeInMinutes(layers);
        int totalTime = timeInOven + preparationTime;
        return totalTime;
        
    }

}

public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        int production = speed * 221;
        if(speed >= 1 && speed <= 4){
            return production;
        }else if(speed >= 5 && speed <= 8){
            return production * 90 / 100.0;
        }else if(speed == 9){
            return production * 80 / 100.0;
        }else if(speed == 10){
            return production * 77 / 100.0;
        }
        else{
            return 0;
        }
    }

    public int workingItemsPerMinute(int speed) {
        int workingItems = (int) productionRatePerHour(speed);
        return workingItems / 60;
    }
}

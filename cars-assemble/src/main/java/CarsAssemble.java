public class CarsAssemble {

    public double productionRatePerHour(int speed) {

        switch(speed){
            case 0: return 0.0;
            case 1: return 1 * 221;
            case 2: return 2 * 221;
            case 3: return 3 * 221;
            case 4: return 4 * 221;
            case 5: return 0.9 * 5* 221;
            case 6: return  0.9 * 6* 221;
            case 7: return  0.9 * 7* 221;
            case 8: return  0.9 * 8* 221;
            case 9: return  0.8 * 9* 221;
            case 10: return  0.77 * 10* 221;
            default:  throw new UnsupportedOperationException("Please implement the AssemblyLine.productionRateperHour() method");

        }
    }

    public int workingItemsPerMinute(int speed) {

        switch(speed){
            case 0: return 0;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10: return (int)(productionRatePerHour(speed)/60);
            default:   throw new UnsupportedOperationException("Please implement the AssemblyLine.workingItemsPerMinute() method");

        }
    }
}

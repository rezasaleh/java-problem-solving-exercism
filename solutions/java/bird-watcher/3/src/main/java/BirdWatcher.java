
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return new int[]{0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        for(int day : birdsPerDay){
            if(day == 0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
       int sum = 0;
        for (int i = 0; i <= numberOfDays && i < birdsPerDay.length; i++) {
          sum += birdsPerDay[i];
        }return sum;
    }

    public int getBusyDays() {
        int counts =0;
        for(int busy : birdsPerDay){
            if(busy >= 5){
                counts ++;
            }
        }return counts;
    }
}

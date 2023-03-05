class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar>{

    public int numberVictories;
    public int distance = 0;
    
    public void drive() {
        this.distance += 10;
    }

    public int compareTo(ProductionRemoteControlCar car){
        if(this.numberVictories > car.numberVictories){
            return 1;
        }else if(this.numberVictories == car.numberVictories){
            return 0;
        }else{
            return -1;
        }
    }
    
    public int getDistanceTravelled() {
        return this.distance;
    }

    public int getNumberOfVictories() {
        return this.numberVictories;
    }

    public void setNumberOfVictories(int numberofVictories) {
        this.numberVictories = numberofVictories;
    }
}

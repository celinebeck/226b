public class Car extends Auto implements Vehicle{
    //attributi
    //costruttore

    public Car(String model, boolean statusMotion, boolean statusStationary,int km, Fuel fuel) {
        super(model, statusMotion, statusStationary,km,fuel);
    }

    //metodi
    public String costFuel(){
        if(super.getFuel() == Fuel.ELETRIC){
            return super.getModel() + "is electric. No fuel cost.";
        }
        float fluelcost = super.getKm() * 1.2f;
        return super.getModel() + "fuel cost for "+super.getKm()+"km : "+ fluelcost;
    }
    public String arriveStatus(){
        if(super.getKm()>0){
            return "Arrived at destination. Total km traveled: "+ super.getKm();
        }
        else{
            return "Is not arrived at destination.";
        }

    }
    //metodi base


    @Override
    public String toString() {
        return  getModel() + '\n' + isStatusMotion() +'\n'+ costFuel() + '\n' + arriveStatus() + '\n' + isStatusStationary();
    }
}
